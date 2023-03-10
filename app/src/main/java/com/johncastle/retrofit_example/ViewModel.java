package com.johncastle.retrofit_example;

import android.util.Log;
import android.widget.TextView;

import com.johncastle.retrofit_example.Objetos.FormularioRequest;
import com.johncastle.retrofit_example.Objetos.FormularioResponse;
import com.johncastle.retrofit_example.Objetos.UserRequest;
import com.johncastle.retrofit_example.Objetos.UserResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewModel {
    public ObservableField<String> response;
    String URL_BASE;
    ViewModel(String URL_BASE){
       this.URL_BASE=URL_BASE;
    }

    public FormularioRequest createFormularioRequest(){
        FormularioRequest formularioRequest = new FormularioRequest();
        formularioRequest.setCorreo_electronico("johncastle@example.com");
        formularioRequest.setPsw("123");
        return formularioRequest;
    }

    public UserRequest createUserRequest(){
        UserRequest userRequest = new UserRequest();
        userRequest.setCorreo_electronico("johncastle@example.com");
        userRequest.setPsw("123");
        return userRequest;
    }

    public void consumeFormularioAPI() {
        //Se crea el post
        FormularioRequest formularioRequest=createFormularioRequest();

        //se construye la url FINAL
        Call<FormularioResponse> ResponseFormularioCall = Model.getFinalURL(URL_BASE).endpointFormulario(formularioRequest);

        ResponseFormularioCall.enqueue(new Callback<FormularioResponse>() {
            @Override
            public void onResponse(Call<FormularioResponse> call, Response<FormularioResponse> response) {
                if(response.isSuccess()){
                    if(response.body().getStatusCode()==200){
                        Log.d("JOHN",response.body().getResults());
                        response.set(response.body().getResults());
                    }
                    else {
                        Log.d("JOHN",response.body().getResults());                    }
                }
                else{
                    Log.d("JOHN", "Bad response");
                }
            }

            @Override
            public void onFailure(Call<FormularioResponse> call, Throwable t) {
                Log.d("JOHN","onFailure");
            }
        });
    }


    public void consumeUserAPI() {
//POST
        UserRequest userRequest=createUserRequest();
        //URL base compuesto
        Call<UserResponse> userResponseCall = Model.getFinalURL(URL_BASE).endpointUserRequest(userRequest);

        userResponseCall.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if(response.isSuccess()){
                    if(response.body().getStatusCode()==200){
                        Log.d("JOHN",response.body().getResults());
                    }
                    else {
                        Log.d("JOHN",response.body().getResults());                    }
                }
                else{
                    Log.d("JOHN", "Bad response");
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                Log.d("JOHN","onFailure");
            }
        });
    }


}
