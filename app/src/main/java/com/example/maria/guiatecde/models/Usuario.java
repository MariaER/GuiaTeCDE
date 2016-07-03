package com.example.maria.guiatecde.models;

import com.example.maria.guiatecde.util.BD_Conexion;
import com.example.maria.guiatecde.util.Default;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Maria on 30/06/2016.
 */
public class Usuario extends Default{

    private int usuario_id;
    private String nombre;
    private String apellido;
    private String nickname;
    private String email;
    private Date f_creacion;

    public Usuario(){
        super();

        this.usuario_id = -1;
        this.nombre = "";

    }

    public ArrayList<Usuario> getLista(){
        BD_Conexion bd = new BD_Conexion();

        ArrayList<Usuario> lista = new ArrayList<>();
        try{
            ResultSet resultSet = bd.select("SELECT * FROM usuarios");
            if(resultSet != null){
                while(resultSet.next()){
                    Usuario obj = new Usuario();
                    obj.setUsuario_id(resultSet.getInt("id"));
                    obj.setNombre(resultSet.getString("Nombre"));
                    obj.setApellido(resultSet.getString("Apellido"));
                    obj.setNickname(resultSet.getString("Nickname"));
                    obj.setEmail(resultSet.getString("Email"));
                    lista.add(obj);
                    obj = null;
                }

            }
        }catch (Exception ex){
            this.mensaje = ex.getMessage();
            this.estado = false;
        }
        return lista;

    }


    public void guardar(){
        String comando ="";
        if(this.getUsuario_id() == -1){
            comando = String.format("INSERT INTO usuarios(nombre, apellido, nickname, email) VALUES('%s', '%s', '%s', '%s')",
                        this.getNombre(), this.getApellido(), this.getNickname(), this.getEmail());
        }else{
            comando = String.format("UPDATE usuarios SET nombre ='%s', apellido ='%s', nickname ='%s', email ='%s' WHERE id = %d ",
                    this.getNombre(), this.getApellido(), this.getNickname(), getEmail(), this.getUsuario_id());
        }
        BD_Conexion bd = new BD_Conexion();
        bd.execute(comando);
      // this.mensaje = bd.mensaje();
       //this.estado = bd.estado();
    }



    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getNickname() {return nickname;}

    public void setNickname(String nickname) {this.nickname = nickname;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public Date getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(Date f_creacion) {
        this.f_creacion = f_creacion;
    }
}
