package com.example.maria.guiatecde.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.maria.guiatecde.R;
import com.example.maria.guiatecde.models.Usuario;

import java.util.ArrayList;

/**
 * Created by Maria on 30/06/2016.
 */
public class UsuarioAdapter extends ArrayAdapter<Usuario> {

    private Context context;
    private ArrayList<Usuario> lista;

    public UsuarioAdapter(Context context, ArrayList<Usuario> lista){
        super(context, 0, lista);
        this.context = context;
        this.lista = lista;
    }

   /* @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final Usuario itemPosicion = this.lista.get(position);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.item_lista, null);
        final View layout = convertView;

        TextView textViewNombre = (TextView) convertView.findViewById(R.id.textView);
        TextView.setText(itemPosicion.getNombre());

        TextView textViewApellido = (TextView) convertView.findViewById(R.id.textView);
        TextView.setText(itemPosicion.getApellido());

        TextView textViewNickname = (TextView) convertView.findViewById(R.id.textView);
        TextView.setText(itemPosicion.getNickname());

        TextView textViewEmail = (TextView) convertView.findViewById(R.id.textView);
        TextView.setText(itemPosicion.getEmail());


    }*/


}
