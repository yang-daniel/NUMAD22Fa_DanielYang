package com.example.numad22fa_danielyang;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LinkViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public TextView Url;

    public LinkViewHolder(@NonNull View linkView) {
        super(linkView);
        this.name = itemView.findViewById(R.id.name);
        this.Url = itemView.findViewById(R.id.Url);
    }
}
