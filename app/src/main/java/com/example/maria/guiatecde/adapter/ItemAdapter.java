package com.example.maria.guiatecde.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maria.guiatecde.R;
import com.example.maria.guiatecde.models.Categoria;

import java.util.ArrayList;

/**
 * Created by Maria on 26/06/2016.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private ArrayList<Categoria> categorias;
    private int itemLayout;



    public ItemAdapter(ArrayList<Categoria> categorias, int itemLayout){
        this.categorias = categorias;
        this.itemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Categoria categoria = categorias.get(position);
        holder.itemNombre.setText(categoria.getNombre());

    }

    @Override
    public int getItemCount() {
        return categorias.size();
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


