package com.example.numad22fa_danielyang;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*
    Defunct class now that logic has been moved to LinkCollectorActivity
 */
public class LinkViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public TextView Url;

    public LinkViewHolder(@NonNull View linkView) {
        super(linkView);
        this.name = itemView.findViewById(R.id.name);
        this.Url = itemView.findViewById(R.id.Url);
    }

    public TextView getName() {
        return name;
    }
    public TextView getUrl() {
        return Url;
    }
}
