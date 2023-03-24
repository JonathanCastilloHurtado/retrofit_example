package com.johncastle.retrofit_example.Objetos;

import com.google.gson.annotations.SerializedName;
public class AutenticarUsuarioResponse {
    @SerializedName("codigoResultado")
    private String codigoResultado;
    @SerializedName("message")
    private String message;

    public String getCodigoResultado() {
        return codigoResultado;
    }

    public void setCodigoResultado(String codigoResultado) {
        this.codigoResultado = codigoResultado;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
