package com.muddzdev.pixelshot.demo;

import android.graphics.Color;
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
        TextView textView = new TextView(parent.getContext());
        textView.setTextSize(16);
        textView.setTextColor(Color.RED);
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return new DummyViewHolder(textView);
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

        DummyViewHolder(@NonNull TextView textView) {
            super(textView);
            this.textView = textView;

        }
    }

}
