package com.example.gerardo.randomnumberapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button btnMostrar= (Button) findViewById(R.id.btnmostrar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(20);
                Context context = getApplicationContext();
                String number = n + "number";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, number, duration);
                toast.show();
            }
        });



    }
}
