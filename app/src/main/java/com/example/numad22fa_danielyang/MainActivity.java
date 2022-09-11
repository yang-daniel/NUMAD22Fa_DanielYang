package com.example.numad22fa_danielyang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button about_me_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button about_me_btn = (Button)findViewById(R.id.about_me_button);

        about_me_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Daniel Yang // yang.dan@northeastern.edu", Toast.LENGTH_SHORT).show();
            }
        });
    }


}