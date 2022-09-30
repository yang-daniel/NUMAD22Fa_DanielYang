package com.example.numad22fa_danielyang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

        linkRecyclerView = findViewById(R.id.link_recycler_view);

//        linkRecyclerView.hasFixedSize(true);

        linkRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        linkRecyclerView.setAdapter(new LinkAdapter(linkList, this));

    }
}