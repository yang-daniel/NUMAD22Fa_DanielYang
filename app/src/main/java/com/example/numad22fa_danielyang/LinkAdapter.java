package com.example.numad22fa_danielyang;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


/**
 * This is a recyclerview adapter class, the purpose of this class is to act as a bridge between the
 * collection (arraylist) and the view (recyclerview). This class provides 3 methods that are
 * utilised for binding the data to the view. The explanation of each method is provided in comments
 * within the methods.
 */
public class LinkAdapter extends RecyclerView.Adapter<LinkAdapter.CustomViewHolder> {

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
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create an instance of the viewholder by passing it the layout inflated as view and no root.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_link, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        // sets the name of the link to the name textview of the viewholder.
        holder.link_name.setText(links.get(position).getName());
        // sets the url of the link to the url textview of the viewholder.
        holder.link_url.setText(links.get(position).getUrl());
    }

    @Override
    public int getItemCount() {
        // Returns the size of the recyclerview that is the list of the arraylist.
        return links.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView link_name;
        TextView link_url;

        ConstraintLayout linkCollectorMainPage;

        public CustomViewHolder(@NonNull View linkView) {
            super(linkView);

            link_name = linkView.findViewById(R.id.name);
            link_url = linkView.findViewById(R.id.Url);

            linkCollectorMainPage = linkView.findViewById(R.id.link_collector_main_page);
            link_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String website = link_url.getText().toString();
                    try {
                        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
                        context.startActivity(browse);
                    } catch (Exception e) {
                        System.out.println("Invalid URL");

                    }
                }
            });
        }
    }

}
