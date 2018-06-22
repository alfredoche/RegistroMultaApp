package com.alfredoche.registromultaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Nuevo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nuevo = (Button)findViewById(R.id.btnNuevo);
        Nuevo.setOnClickListener (new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent Nuevo = new Intent(MainActivity.this, registrarmulta.class);
                startActivity(Nuevo);

            }
        });








    }
}
