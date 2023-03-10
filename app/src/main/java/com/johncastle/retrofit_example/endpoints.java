package com.johncastle.retrofit_example;

import com.johncastle.retrofit_example.Objetos.FormularioRequest;
import com.johncastle.retrofit_example.Objetos.FormularioResponse;
import com.johncastle.retrofit_example.Objetos.UserRequest;
import com.johncastle.retrofit_example.Objetos.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface endpoints {
    @POST("api_post.php/")
    Call<FormularioResponse> endpointFormulario (@Body FormularioRequest formularioRequest);

    //el @POST es el endpoint que se concatenara
    //el objeto que recibe es el post que se mandara
    @POST("user_request.php/")
    Call<UserResponse> endpointUserRequest (@Body UserRequest userRequest);
}
