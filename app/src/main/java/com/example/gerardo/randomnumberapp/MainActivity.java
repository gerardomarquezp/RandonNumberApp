package com.example.gerardo.randomnumberapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button btnMostrar= (Button) findViewById(R.id.btnmostrar);
        final ImageView imagen=(ImageView)  findViewById(R.id.imageView);
        final TextView numero=(TextView) findViewById(R.id.numero);


        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(3);
                String texto;

                Context context = getApplicationContext();
                String number = n + "numero";
                int duration = Toast.LENGTH_SHORT;
                numero.setText(n+1 + "numero");

                switch(n){
                    case 0: texto = "Uno";
                        imagen.setImageResource(R.drawable.uno);
                        break;
                    case 1: texto = "Dos";
                        imagen.setImageResource(R.drawable.dos);
                        break;
                    case 2: texto = "Tres";
                        imagen.setImageResource(R.drawable.tres);
                        break;
                }


                Toast toast = Toast.makeText(context, number, duration);
                toast.show();
            }
        });



    }
}
