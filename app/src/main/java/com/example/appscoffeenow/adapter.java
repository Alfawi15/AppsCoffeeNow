package com.example.appscoffeenow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class holder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView kopisusu, desckopsu,prckopsu;

    public holder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.imagekopisusu);
        desckopsu = itemView.findViewById(R.id.kopisusu);
        prckopsu = itemView.findViewById(R.id.prckopsu);
    }
}

public class adapter extends RecyclerView.Adapter<holder> {

    Context context;
    ArrayList<minuman> listminuman;

    public adapter(Order context, ArrayList<minuman> listminuman) {

        this.listminuman = listminuman;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.fragment_order,parent,false);

        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        minuman minuman = listminuman.get(position);
        holder.img.setImageResource(minuman.getImage());
        holder.kopisusu.setText(minuman.getNama());
        holder.desckopsu.setText(minuman.getDescripsi());
        holder.prckopsu.setText(""+minuman.getPrice());

    }

    @Override
    public int getItemCount() {



        return listminuman.size();
    }
}
