package com.example.maria.guiatecde.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maria.guiatecde.R;
import com.example.maria.guiatecde.models.Categoria;
import com.example.maria.guiatecde.util.BD_Conexion;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by Maria on 26/06/2016.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

   // private ArrayList<Categoria> categorias;
   //private int itemLayout;

  // public class ItemAdapter extends ArrayAdapter<Categoria>  {


      // private Context context;
       private ArrayList<Categoria> listac;

       public ItemAdapter(int itemLayout, ArrayList<Categoria> listac){
          // super(context, 0, listac);
         //  this.context = context;
           this.listac = listac;
           this.listac = listac;
       }

   /* @Override
    public View getView(int posicion, View convertView, ViewGroup parent){
        final Categoria itemPosicion = this.listac.get(posicion);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.item_categoria, null);
        final View layout = convertView;

        TextView textView = (TextView) convertView.findViewById(R.id.txt_item);
        textView.setText(itemPosicion.getC_nombre());
        return convertView;
    }*/
//}




   /* public ItemAdapter(ArrayList<Categoria> listac, int itemLayout){
        this.lista = listac ;
        this.itemLayout = itemLayout;
    }*/

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
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

       //}
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



