package com.example.maria.guiatecde.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by Maria on 26/06/2016.
 */
public class BD_Conexion extends Default implements Runnable {

    private Connection conexion;
    private String host = "192.168.1.61";
    private String base = "guiatecde";
    private int puerto = 5432;
    private String usuario = "postgres";
    private String password = "postgres";
    private String url = "jdbc:postgresql://%s:%d/%s";

    public BD_Conexion(){
        super();
        this.url = String.format(this.url, this.host, this.puerto, this.base);

        //TODO Abrir conexion
        this.conectar();

        //TODO Cerrar conexion
        this.desconectar();

    }

    @Override
    public void run() {

        //TODO Conectar

        try{
            Class.forName("org.postgresql.Driver");
            this.conexion = DriverManager.getConnection(this.url, this.usuario, this.password);
      }catch (Exception e){
            this.mensaje = e.getMessage();
            this.estado = false;
        }
         }


    private void conectar(){
        Thread thread = new Thread(this);
        thread.start();
        try{
            thread.join();
        }catch (Exception e){
            this.mensaje = e.getMessage();
            this.estado = false;
        }
    }

    private void desconectar(){
        if(this.conexion != null){
            try{
                this.conexion.close();
            }catch (Exception e){
            }finally {
                this.conexion = null;
            }
        }
    }

    public ResultSet select (String query){
        this.conectar();
        ResultSet resultSet = null;
        try{
            resultSet = new BD_Ejecuta(this.conexion, query).execute().get();
        }catch (Exception e){
            this.mensaje = e.getMessage();
            this.estado = false;
        }

        return resultSet;
    }

    public ResultSet execute (String query){
        this.conectar();
        ResultSet resultSet = null;
        try{
            resultSet = new BD_Ejecuta(this.conexion, query).execute().get();
        }catch (Exception e){
            this.mensaje = e.getMessage();
            this.estado = false;
        }

        return resultSet;
    }

}
