package com.johncastle.retrofit_example;

import android.util.Log;

import com.johncastle.retrofit_example.Objetos.LoginRequest;
import com.johncastle.retrofit_example.Objetos.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewModel {
    String URL_BASE;
    ViewModel(String URL_BASE){
       this.URL_BASE=URL_BASE;
    }

    public LoginRequest createLoginRequest(){
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsuario("johncastle@example.com");
        loginRequest.setContrasena("123");
        return loginRequest;
    }

    public void consumeLoginAPI() {
//POST
        LoginRequest loginRequest=createLoginRequest();
        //URL base compuesto
        Call<LoginResponse> loginResponseCall = Model.getFinalURL(URL_BASE).endpointLoginRequest(loginRequest);

        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                //hay exito pero el ejecutarse retrofit
                if(response.isSuccess()){
                    //hay una respuesta de exito en el response del api
                    if(response.body().getAutenticarUsuarioResponse().getCodigoResultado().equals("1")){
                        String nombre=response.body().getProcessResponse().getNombre();
                        String apellidoPaterno=response.body().getProcessResponse().getApellidoPaterno();
                        String apellidoMaterno=response.body().getProcessResponse().getApellidoMaterno();
                        String curp=response.body().getProcessResponse().getCurp();
                        String nss=response.body().getProcessResponse().getNss();
                        String numConsar=response.body().getProcessResponse().getNumConsar();
                        String nomina=response.body().getProcessResponse().getNomina();

                        Log.d("JOHN",nombre+" "+apellidoMaterno+" "+apellidoPaterno+" "+curp+" "+nss+" "+numConsar++" "+nomina);
                    }
                    else{
                        Log.d("JOHN",response.body().getAutenticarUsuarioResponse().getMessage());
                    }

                }
                else{
                    Log.d("JOHN", "Bad response");
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.d("JOHN","onFailure");
            }
        });
    }


}
