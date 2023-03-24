package com.johncastle.retrofit_example.Objetos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    //EL @SerializedName se utiliza a manera de apuntador hacia el nombre del parametro en la respuesta,
    // puesto que si el nombre de la variable EJEMPLO: mAutenticarUsuarioResponse es diferente
    // al nombre del parametro del response (AutenticarUsuarioResponse) marcara null pointer puesto
    // que retrofit toma el nombre de la variable a primera instancia para ligarlo con los params del response
    @SerializedName("AutenticarUsuarioResponse")
    @Expose
    private AutenticarUsuarioResponse mAutenticarUsuarioResponse;
    @SerializedName("processResponse")
    @Expose
    private processResponse mProcessResponse;

    public processResponse getProcessResponse() {
        return mProcessResponse;
    }

    public void setProcessResponse(processResponse mProcessResponse) {
        this.mProcessResponse = mProcessResponse;
    }

    public AutenticarUsuarioResponse getAutenticarUsuarioResponse() {
        return mAutenticarUsuarioResponse;
    }

    public void setAutenticarUsuarioResponse(AutenticarUsuarioResponse autenticarUsuarioResponse) {
        this.mAutenticarUsuarioResponse = autenticarUsuarioResponse;
    }
}
