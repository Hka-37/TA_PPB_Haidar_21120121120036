package com.example.easytutomusicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    ListAdapter listAdapter;


    ArrayList<String>listAlbum = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recycler_view);
        listAlbum = new ArrayList<>();

        for(int i=0;i<10;i++){
            listAlbum.add("Album"+i);
        }

        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        listAdapter = new ListAdapter(ListActivity.this,listAlbum);
        recyclerView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
    }

}