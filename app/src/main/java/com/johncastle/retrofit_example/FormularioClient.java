package com.johncastle.retrofit_example;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FormularioClient {

    private static Retrofit getRetrofit(String urlBase) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(urlBase)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build();

        return retrofit;
    }

    public static FormularioEndpoint getUserService(String urlBase){
      FormularioEndpoint formularioEndpoint = getRetrofit(urlBase).create(FormularioEndpoint.class);
      return formularioEndpoint;
    }
}
