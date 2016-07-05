package com.example.maria.guiatecde.models;

import android.util.Log;

import com.example.maria.guiatecde.util.BD_Conexion;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Maria on 26/06/2016.
 */
public class Categoria extends BD_Conexion {

    private int cat_id;
    private String c_nombre;
    private Date f_creacion;

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getC_nombre() {
        return c_nombre;
    }

    public void setC_nombre(String c_nombre) {
        this.c_nombre = c_nombre;
    }

    public Date getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(Date f_creacion) {
        this.f_creacion = f_creacion;
    }

    public static ArrayList<Categoria> getLista(){
        BD_Conexion bd = new BD_Conexion();

        ArrayList<Categoria> listac = new ArrayList<>();
        try{
            ResultSet resultSet = bd.select("SELECT cat_nombre FROM categorias");

            if(resultSet != null){
                while(resultSet.next()){
                    Categoria obj = new Categoria();
                    obj.setC_nombre(resultSet.getString(1));
                    listac.add(obj);
                    obj = null;
                }

            }
        }catch (Exception ex){
            ex.printStackTrace();

        }
        return listac;

    }
}
