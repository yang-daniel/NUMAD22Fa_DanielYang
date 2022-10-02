package com.example.numad22fa_danielyang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

/*
    This class is the page that shows all the names and Urls of the links
 */
public class LinkCollectorActivity extends AppCompatActivity {

    LinkCollectorApp lcApp = (LinkCollectorApp) this.getApplication();
    List<Link> linkList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_collector);
        linkList = lcApp.getLinkList();

        recyclerView = findViewById(R.id.link_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new LinkAdapter(linkList, this));

        // getting the string for the snackbar from the form
        try {
            Bundle bundle = getIntent().getExtras();
            String msg = bundle.getString("key1", "Default");
            if (msg != null) {
                Snackbar.make(recyclerView, msg, Snackbar.LENGTH_LONG).show();
            }
        } catch(Exception e) {
            System.out.println("First time loading or error.");
        }
    }

    public List<Link> getLinkList() {
        return linkList;
    }

    public void onLinkForm(View view) {
        Intent intent = new Intent(this, LinkFormActivity.class);
        startActivity(intent);
    }

    public void onLinkClick(View view) {
        try {
            EditText url = findViewById(R.id.url_input);
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url.getText().toString()));
            if (browserIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(browserIntent);
            }
        } catch (Exception e) {
            recyclerView = findViewById(R.id.link_recycler_view);
            Snackbar.make(recyclerView, "Error! Please remember to use https://", Snackbar.LENGTH_LONG).show();
        }
    }

}