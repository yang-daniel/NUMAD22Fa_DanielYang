package com.example.numad22fa_danielyang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GridActivity extends AppCompatActivity {

    String textDefault = "Pressed: " ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
    }

    public void onClick_btn_A(View view) {
        Button btn = (Button)findViewById(R.id.btn_A);
        TextView textView = findViewById(R.id.textView);
        String str = textDefault + btn.getText();
        textView.setText(str);
    }
    public void onClick_btn_B(View view) {
        Button btn = (Button)findViewById(R.id.btn_B);
        TextView textView = findViewById(R.id.textView);
        String str = textDefault + btn.getText();
        textView.setText(str);
    }
    public void onClick_btn_C(View view) {
        Button btn = (Button)findViewById(R.id.btn_C);
        TextView textView = findViewById(R.id.textView);
        String str = textDefault + btn.getText();
        textView.setText(str);
    }
    public void onClick_btn_D(View view) {
        Button btn= (Button)findViewById(R.id.btn_D);
        TextView textView = findViewById(R.id.textView);
        String str = textDefault + btn.getText();
        textView.setText(str);
    }
    public void onClick_btn_E(View view) {
        Button btn = (Button)findViewById(R.id.btn_E);
        TextView textView = findViewById(R.id.textView);
        String str = textDefault + btn.getText();
        textView.setText(str);
    }
    public void onClick_btn_F(View view) {
        Button btn = (Button)findViewById(R.id.btn_F);
        TextView textView = findViewById(R.id.textView);
        String str = textDefault + btn.getText();
        textView.setText(str);
    }
}