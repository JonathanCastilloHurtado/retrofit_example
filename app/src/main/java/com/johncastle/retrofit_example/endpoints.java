package com.johncastle.retrofit_example;

import com.johncastle.retrofit_example.Objetos.LoginRequest;
import com.johncastle.retrofit_example.Objetos.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface endpoints {
    @POST("AutenticarUsuarioAppComercial_RS/")
    Call<LoginResponse> endpointLoginRequest (@Body LoginRequest loginRequest);
}
