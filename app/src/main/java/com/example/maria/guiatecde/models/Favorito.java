package com.example.maria.guiatecde.models;

import java.util.Date;

/**
 * Created by Maria on 30/06/2016.
 */
public class Favorito {

    private int fav_id;
    private int cd_id;
    private String estado;
    private Date f_creacion;

    public int getFav_id() {
        return fav_id;
    }

    public void setFav_id(int fav_id) {
        this.fav_id = fav_id;
    }

    public int getCd_id() {
        return cd_id;
    }

    public void setCd_id(int cd_id) {
        this.cd_id = cd_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(Date f_creacion) {
        this.f_creacion = f_creacion;
    }
}
