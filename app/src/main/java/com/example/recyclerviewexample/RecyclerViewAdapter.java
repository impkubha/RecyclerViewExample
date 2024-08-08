package com.example.recyclerviewexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Activity context;
    String[] name;
    String[] address;
    public RecyclerViewAdapter(Activity content, String[] name, String[] address){
        this.name=name;
        this.address=address;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View listItem= layoutInflater.inflate(R.layout.recyclerview_items,parent,false);
        ViewHolder viewHolder= new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        holder.txtAddress.setText(address[position]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtAddress;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.sName);
            txtAddress=itemView.findViewById(R.id.sAddress);
        }
    }
}




