package com.example.easytutomusicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.HolderView> {

    List<String> listAlbum;
    LayoutInflater inflater;

    public ListAdapter(Context context, List<String> listAlbum) {
        this.listAlbum = listAlbum;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public HolderView onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_list,parent,false);
        return new HolderView(view);
    }

    @Override
    public void onBindViewHolder( HolderView holder, int position) {
        holder.textAlbum.setText(listAlbum.get(position));
    }

    @Override
    public int getItemCount() {
        return listAlbum.size();
    }

    public class HolderView extends RecyclerView.ViewHolder{
        TextView textAlbum;
        public HolderView( View itemView) {
            super(itemView);
            textAlbum = itemView.findViewById(R.id.album_title_text);
        }
    }
}
