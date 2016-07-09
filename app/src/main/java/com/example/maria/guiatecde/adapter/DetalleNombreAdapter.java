package com.example.maria.guiatecde.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maria.guiatecde.R;
import com.example.maria.guiatecde.models.CategoriaDetalle;

import java.util.ArrayList;

/**
 * Created by Maria on 30/06/2016.
 */
public class DetalleNombreAdapter extends RecyclerView.Adapter<DetalleNombreAdapter.ViewHolder> {

    ArrayList<CategoriaDetalle> listaDetalleN;
    private int detalleNLayout;

    public DetalleNombreAdapter(ArrayList<CategoriaDetalle> cd_nombre, int nombreLayout){
        this.listaDetalleN = cd_nombre;
        this.detalleNLayout = nombreLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(detalleNLayout, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        CategoriaDetalle nombre = listaDetalleN.get(position);
        holder.itemDetalleN.setText(nombre.getCd_nombre());

    }

    @Override
    public int getItemCount() {
        return listaDetalleN.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView itemDetalleN;
        public ImageView itemImageN;

        public ViewHolder(View itemView){

            super(itemView);

            itemDetalleN = (TextView) itemView.findViewById(R.id.txt_detN);
            itemImageN = (ImageView) itemView.findViewById(R.id.img_detN);

        }

    }

}
