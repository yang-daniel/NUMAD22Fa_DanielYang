package com.example.numad22fa_danielyang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button about_me_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Button about_me_btn = (Button)findViewById(R.id.about_me_button);
//
//        about_me_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, R.string.about_me, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
    public void onAboutMe(View view) {
        Intent intent = new Intent(this, aboutActivity.class);
        startActivity(intent);
    }


    public void onClickyClicky(View view) {
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent);
    }
}