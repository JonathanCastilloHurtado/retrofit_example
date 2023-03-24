package com.johncastle.retrofit_example.Objetos;

import com.google.gson.annotations.SerializedName;

public class processResponse {
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("apellidoPaterno")

    private String apellidoPaterno;
    @SerializedName("apellidoMaterno")

    private String apellidoMaterno;
    @SerializedName("curp")

    private String curp;
    @SerializedName("nss")

    private String nss;
    @SerializedName("numConsar")

    private String numConsar;
    @SerializedName("nomina")

    private String nomina;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNumConsar() {
        return numConsar;
    }

    public void setNumConsar(String numConsar) {
        this.numConsar = numConsar;
    }

    public String getNomina() {
        return nomina;
    }

    public void setNomina(String nomina) {
        this.nomina = nomina;
    }
}
