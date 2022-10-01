package com.example.numad22fa_danielyang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class LinkCollectorActivity extends AppCompatActivity {

    RecyclerView linkRecyclerView;

    List<Link> linkList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_collector);

        //Instantiate the arraylist
        linkList = new ArrayList<>();

        linkList.add(new Link("name","url"));
        linkList.add(new Link("name","url"));
        linkList.add(new Link("name","url"));
        linkList.add(new Link("name","url"));

        linkRecyclerView = findViewById(R.id.link_recycler_view);

        linkRecyclerView.setHasFixedSize(true);

        linkRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        linkRecyclerView.setAdapter(new LinkAdapter(linkList, this));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

}