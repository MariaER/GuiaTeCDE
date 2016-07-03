package com.example.maria.guiatecde.models;

import java.util.Date;

/**
 * Created by Maria on 30/06/2016.
 */
public class Comentario {

    private int comentario_id;
    private int cd_id;
    private int usuario_id;
    private int ranking;
    private String comentario;
    private Date f_creacion;

    public int getComentario_id() {return comentario_id;}

    public void setComentario_id(int comentario_id) {
        this.comentario_id = comentario_id;
    }

    public int getCd_id() {
        return cd_id;
    }

    public void setCd_id(int cd_id) {
        this.cd_id = cd_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(Date f_creacion) {
        this.f_creacion = f_creacion;
    }
}
