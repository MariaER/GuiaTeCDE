package com.example.maria.guiatecde.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maria.guiatecde.R;
import com.example.maria.guiatecde.models.Categoria_detalle;

import java.util.ArrayList;

/**
 * Created by Maria on 30/06/2016.
 */
public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.ViewHolder> {

    ArrayList<Categoria_detalle> cd_nombre;
    private int nombreLayout;

    public CategoriaAdapter(ArrayList<Categoria_detalle> cd_nombre, int nombreLayout){
        this.cd_nombre = cd_nombre;
        this.nombreLayout = nombreLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(nombreLayout, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Categoria_detalle nombre = cd_nombre.get(position);
        holder.itemNombre.setText(nombre.getNombre());

    }

    @Override
    public int getItemCount() {
        return cd_nombre.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView itemNombre;
        public ImageView itemImage;

        public ViewHolder(View itemView){

            super(itemView);

            itemNombre = (TextView) itemView.findViewById(R.id.txt_item);
            itemImage = (ImageView) itemView.findViewById(R.id.img_item);

        }

    }

}
