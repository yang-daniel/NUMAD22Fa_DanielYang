package com.example.numad22fa_danielyang;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicBoolean;

public class PrimeDirectiveActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Handler textHandler = new Handler();
    private final AtomicBoolean running = new AtomicBoolean(false);
    TextView statusText;
    int i = 3;
    int tempInt = i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_directive);
        statusText = findViewById(R.id.primeTextView);
    }

    public void runOnRunnableThread(View view) {
        runnableThread runnableThread = new runnableThread();
        new Thread(runnableThread).start();
    }

    public void stopOnRunnableThread(View view) {
        running.set(false);
    }

    public boolean isPrime(int num) {
        if (num<=1) return false;

        for (int i = 2; i <= num/2; i++) {
            if((num%i) == 0) return false;
        }
        return true;
    }

    //Back button listener
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if (running.get()){
            onTerminate("Do you want to terminate the search?");
        } else {
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }

    public void onTerminate(String alertMessage) {
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case DialogInterface.BUTTON_POSITIVE:
                        android.os.Process.killProcess(android.os.Process.myPid());
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(alertMessage)
                .setPositiveButton("Yes", dialogClickListener)
                .setNegativeButton("No", dialogClickListener).show();

    }
    //Class which implements the Runnable interface.
    class runnableThread implements Runnable {

        @Override
        public void run() {
            running.set(true);
                while (running.get()) {
                    //The handler changes the TextView running in the UI thread.
                    textHandler.post(new Runnable() {
                        @SuppressLint("SetTextI18n")
                        @Override
                        public void run() {
                            tempInt += 2;
                            if (isPrime(tempInt)) {
                                i = tempInt;
                                if (Math.random()*(500) < 10)
                                statusText.setText("Prime number: " + i);
                            } else {
                                i += 2;
                            }
                        }
                    });
                    Log.d(TAG, "Running on a different thread using Runnable Interface: " + i);
                    try {
                        Thread.sleep(5); //waits a second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        }
    }
}