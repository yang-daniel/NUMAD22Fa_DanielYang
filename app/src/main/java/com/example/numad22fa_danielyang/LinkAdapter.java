package com.example.numad22fa_danielyang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


/**
 * This is a recyclerview adapter class, the purpose of this class is to act as a bridge between the
 * collection (arraylist) and the view (recyclerview). This class provides 3 methods that are
 * utilised for binding the data to the view. The explanation of each method is provided in comments
 * within the methods.
 */
public class LinkAdapter extends RecyclerView.Adapter<LinkViewHolder> {

    private final List<Link> links;
    private final Context context;

    /**
     * Creates a LinkAdapter with the provided arraylist of Link objects.
     *
     * @param links    arraylist of link object.
     * @param context   context of the activity used for inflating layout of the viewholder.
     */
    public LinkAdapter(List<Link> links, Context context) {
        this.links = links;
        this.context = context;
    }

    @NonNull
    @Override
    public LinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create an instance of the viewholder by passing it the layout inflated as view and no root.
        return new LinkViewHolder(LayoutInflater.from(context).inflate(R.layout.item_link, null));
    }

    @Override
    public void onBindViewHolder(@NonNull LinkViewHolder holder, int position) {
        // sets the name of the link to the name textview of the viewholder.
        holder.name.setText(links.get(position).getName());
        // sets the url of the link to the age textview of the viewholder.
        holder.Url.setText(links.get(position).getUrl());

        // set a click event on the whole itemView (every element of the recyclerview).
        holder.itemView.setOnClickListener(view -> {
            Toast.makeText(context, links.get(position).getName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        // Returns the size of the recyclerview that is the list of the arraylist.
        return links.size();
    }
}
