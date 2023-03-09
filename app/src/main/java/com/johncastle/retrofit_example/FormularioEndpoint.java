package com.johncastle.retrofit_example;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface FormularioEndpoint {
    @POST("api_post.php/")
    Call<FormularioResponse> saveUser (@Body FormularioRequest formularioRequest);
}
