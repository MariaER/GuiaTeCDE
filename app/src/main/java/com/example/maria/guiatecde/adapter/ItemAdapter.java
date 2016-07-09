package com.example.maria.guiatecde.adapter;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maria.guiatecde.R;
import com.example.maria.guiatecde.fragmentos.ListaNombresFrag;
import com.example.maria.guiatecde.models.Categoria;

import java.util.ArrayList;

/**
 * Created by Maria on 26/06/2016.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private ArrayList<Categoria> listac;
    private int itemLayout;

    public ItemAdapter(int itemLayout, ArrayList<Categoria> listac) {
        this.itemLayout = itemLayout;
        this.listac = listac;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(v);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Categoria categoria = listac.get(position);
        holder.itemNombre.setText(categoria.getC_nombre());

    }

    @Override
    public int getItemCount() {
        return listac.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView itemNombre;
        private ImageView itemImage;


        private ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            itemNombre = (TextView) itemView.findViewById(R.id.txt_item);
            itemImage = (ImageView) itemView.findViewById(R.id.img_item);

        }


        //TODO no se bien si dirigirme a la clase o un layout, o ambos
        @Override
        public void onClick(View v) {
            int posicion = getAdapterPosition();
             Intent intent = new Intent();

        }
    }

}



