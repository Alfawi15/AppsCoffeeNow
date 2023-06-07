package com.example.appscoffeenow;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Order extends Fragment {

    RecyclerView rminuman;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layutmanager;
    ArrayList<minuman> listminuman;

    void datadummy(){
    listminuman = new ArrayList<>();
    listminuman.add(new minuman("kopi susu","Expresso, dan susu steamed", 20000, R.drawable.kopisusu));
    listminuman.add(new minuman("Caramel Macchiato","Expresso, susu steamed dan Caramel", 27000, R.drawable.kopisusu));
    listminuman.add(new minuman("Americano ice","Expresso, dan air mineral", 15000, R.drawable.kopisusu));
    }
void data(){
        rminuman = rminuman.findViewById(R.id.order);
        adapter = new adapter(this,listminuman);
        rminuman.setLayoutManager(layutmanager);
        rminuman.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//      datadummy();data();
        return inflater.inflate(R.layout.fragment_order, container, false);
    }
}