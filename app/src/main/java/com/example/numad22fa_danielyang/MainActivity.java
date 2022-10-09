package com.example.numad22fa_danielyang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAboutMe(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }


    public void onClickyClicky(View view) {
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent);
    }

    public void onLinkCollector(View view) {
        Intent intent = new Intent(this, LinkCollectorActivity.class);
        startActivity(intent);
    }

    public void onPrimeDirective(View view) {
        Intent intent = new Intent(this, PrimeDirectiveActivity.class);
        startActivity(intent);
    }
}