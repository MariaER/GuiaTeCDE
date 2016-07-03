package com.example.maria.guiatecde.models;

import android.support.v7.app.AppCompatActivity;

import com.example.maria.guiatecde.util.BD_Conexion;

import java.util.Date;

/**
 * Created by Maria on 26/06/2016.
 */
public class Categoria_detalle extends BD_Conexion {

    private int cd_id;
    private int cat_id;
    private String nombre;
    private String direccion;
    private String email;
    private String webpage;
    private String descripcion;
    private String observacion;
    private String latitudgps;
    private String longitudgps;
    private String facebook;
    private String twitter;
    private Date f_creacion;



    public int getCd_id() {
        return cd_id;
    }

    public void setCd_id(int cd_id) {
        this.cd_id = cd_id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getLatitudgps() {
        return latitudgps;
    }

    public void setLatitudgps(String latitudgps) {
        this.latitudgps = latitudgps;
    }

    public String getLongitudgps() {
        return longitudgps;
    }

    public void setLongitudgps(String longitudgps) {
        this.longitudgps = longitudgps;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Date getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(Date f_creacion) {
        this.f_creacion = f_creacion;
    }
}
