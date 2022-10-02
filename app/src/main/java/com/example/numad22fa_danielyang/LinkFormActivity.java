package com.example.numad22fa_danielyang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class LinkFormActivity extends AppCompatActivity {
    Button submitButton;
    Button cancelButton;
    EditText name;
    EditText Url;
    ConstraintLayout constraintLayout;
    List<Link> linkList;
    LinkCollectorApp lcApp = (LinkCollectorApp) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_form);

        submitButton = findViewById(R.id.link_submit);
        cancelButton = findViewById(R.id.link_cancel);
        name = findViewById(R.id.name_input);
        Url = findViewById(R.id.url_input);
        linkList = lcApp.getLinkList();

        constraintLayout = findViewById(R.id.link_form_page);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strName = name.getText().toString();
                String strUrl = Url.getText().toString();

                if (strName.length() == 0 || strUrl.length() == 0) {
                    Snackbar.make(constraintLayout, "Name/Url can't be empty!", Snackbar.LENGTH_LONG).show();
                } else {
                    Snackbar.make(view, "Submission successful!", Snackbar.LENGTH_LONG).show();
                    Bundle bundle = new Bundle();
                    bundle.putString("key1", "Submission successful!");
                    linkList.add(new Link(strName, strUrl));
                    Intent intent = new Intent(LinkFormActivity.this, LinkCollectorActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinkFormActivity.this, LinkCollectorActivity.class);
                startActivity(intent);
            }
        });
    }

}