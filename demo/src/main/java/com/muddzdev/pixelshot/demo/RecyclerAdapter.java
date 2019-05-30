package com.muddzdev.pixelshot.demo;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DummyViewHolder> {


    @NonNull
    @Override
    public DummyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new DummyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DummyViewHolder holder, int position) {
        holder.textView.setText(String.format("Hello %d", position));
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    class DummyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public DummyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.title);
        }
    }
}
