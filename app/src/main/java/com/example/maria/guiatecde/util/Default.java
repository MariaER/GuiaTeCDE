package com.example.maria.guiatecde.util;

/**
 * Created by Maria on 30/06/2016.
 */
public class Default {

    protected String mensaje;
    protected boolean estado;

    public Default (){
        this.estado = true;
        this.mensaje = "";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
