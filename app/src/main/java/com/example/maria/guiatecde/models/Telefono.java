package com.example.maria.guiatecde.models;

/**
 * Created by Maria on 30/06/2016.
 */
public class Telefono {

    private int tel_id;
    private int cd_id;
    private String tel_numero;
    private String tel_tipo;

    public int getTel_id() {
        return tel_id;
    }

    public void setTel_id(int tel_id) {
        this.tel_id = tel_id;
    }

    public int getCd_id() {
        return cd_id;
    }

    public void setCd_id(int cd_id) {
        this.cd_id = cd_id;
    }

    public String getTel_numero() {
        return tel_numero;
    }

    public void setTel_numero(String tel_numero) {
        this.tel_numero = tel_numero;
    }

    public String getTel_tipo() {
        return tel_tipo;
    }

    public void setTel_tipo(String tel_tipo) {
        this.tel_tipo = tel_tipo;
    }
}
