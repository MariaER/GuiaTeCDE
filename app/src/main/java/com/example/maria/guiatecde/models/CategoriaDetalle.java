package com.example.maria.guiatecde.models;

import android.support.v7.app.AppCompatActivity;

import com.example.maria.guiatecde.util.BD_Conexion;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Maria on 26/06/2016.
 */
public class CategoriaDetalle extends BD_Conexion {

    private int cd_id;
    private int cat_id;
    private String cd_nombre;
    private String cd_direccion;
    private String cd_email;
    private String cd_webpage;
    private String cd_descripcion;
    private String cd_observacion;
    private String cd_latitudgps;
    private String cd_longitudgps;
    private String cd_facebook;
    private String cd_twitter;
    private Date cd_fcreacion;


    public int getCd_id() {return cd_id;}

    public void setCd_id(int cd_id) {this.cd_id = cd_id;}

    public int getCat_id() {return cat_id;}

    public void setCat_id(int cat_id) {this.cat_id = cat_id;}

    public String getCd_nombre() {return cd_nombre;}

    public void setCd_nombre(String cd_nombre) {this.cd_nombre = cd_nombre;}

    public String getCd_direccion() {return cd_direccion;}

    public void setCd_direccion(String cd_direccion) {this.cd_direccion = cd_direccion;}

    public String getCd_email() {return cd_email;}

    public void setCd_email(String cd_email) {this.cd_email = cd_email;}

    public String getCd_webpage() {return cd_webpage;}

    public void setCd_webpage(String cd_webpage) {this.cd_webpage = cd_webpage;}

    public String getCd_descripcion() {return cd_descripcion;}

    public void setCd_descripcion(String cd_descripcion) {this.cd_descripcion = cd_descripcion;}

    public String getCd_observacion() {return cd_observacion;}

    public void setCd_observacion(String cd_observacion) {this.cd_observacion = cd_observacion;}

    public String getCd_latitudgps() {return cd_latitudgps;}

    public void setCd_latitudgps(String cd_latitudgps) {this.cd_latitudgps = cd_latitudgps;}

    public String getCd_longitudgps() {return cd_longitudgps;}

    public void setCd_longitudgps(String cd_longitudgps) {this.cd_longitudgps = cd_longitudgps;}

    public String getCd_facebook() {return cd_facebook;}

    public void setCd_facebook(String cd_facebook) {this.cd_facebook = cd_facebook;}

    public String getCd_twitter() {return cd_twitter;}

    public void setCd_twitter(String cd_twitter) {this.cd_twitter = cd_twitter;}

    public Date getCd_fcreacion() {return cd_fcreacion;}

    public void setCd_fcreacion(Date cd_fcreacion) {this.cd_fcreacion = cd_fcreacion;}



    public static ArrayList<CategoriaDetalle> getListaDetalle(){
        BD_Conexion bd = new BD_Conexion();

        ArrayList<CategoriaDetalle> listaDetalleN = new ArrayList<>();
        try{
            ResultSet resultSet = bd.select("SELECT cd_nombre FROM cat_detalle WHERE cat_id ='%d");

            if(resultSet != null){
                while(resultSet.next()){
                    CategoriaDetalle obj = new CategoriaDetalle();
                    obj.setCd_nombre(resultSet.getString(1));
                    listaDetalleN.add(obj);
                    obj = null;
                }

            }
        }catch (Exception ex){
            ex.printStackTrace();

        }
        return listaDetalleN;

    }



}
