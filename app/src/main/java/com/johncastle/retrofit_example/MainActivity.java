package com.johncastle.retrofit_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String URL_FORMULARIOS="http://www.johncastle.com.mx/apis/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saveUser(createRequest());
    }
    public FormularioRequest createRequest(){
        FormularioRequest formularioRequest = new FormularioRequest();
        formularioRequest.setCorreo_electronico("johncastle@example.com");
        formularioRequest.setPsw("123");

        return formularioRequest;
    }

    public void saveUser(FormularioRequest formularioRequest) {
        Call<FormularioResponse> userResponseCall = FormularioClient.getUserService(URL_FORMULARIOS).saveUser(formularioRequest);
        userResponseCall.enqueue(new Callback<FormularioResponse>() {
            @Override
            public void onResponse(Call<FormularioResponse> call, Response<FormularioResponse> response) {
             if(response.isSuccess()){
                 if(response.body().getStatusCode()==200){
                     Toast.makeText(MainActivity.this,response.body().getResults(),Toast.LENGTH_LONG).show();
                 }
                 else {
                     Toast.makeText(MainActivity.this,response.body().getResults(),Toast.LENGTH_LONG).show();
                 }

                }
             else{
                 Toast.makeText(MainActivity.this,"Bad response",Toast.LENGTH_LONG).show();

             }

            }

            @Override
            public void onFailure(Call<FormularioResponse> call, Throwable t) {
                Log.d("JOHN","NOKYYY");
            }
        });
    }
}