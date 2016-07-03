package com.example.maria.guiatecde.util;

import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Maria on 30/06/2016.
 */
public class BD_Ejecuta extends AsyncTask<String, Void, ResultSet> {

    private Connection connection;
    private String query;

    public BD_Ejecuta(Connection connection, String query) {
        this.connection = connection;
        this.query = query;
    }

    @Override
    protected ResultSet doInBackground(String... params) {
        ResultSet resultSet = null;

        try{
            resultSet = connection.prepareStatement(query).executeQuery();

        }catch (Exception e){

        }finally {
            try {
                connection.close();
            } catch (Exception ex) {
            }
        }

        return resultSet;
    }
}
