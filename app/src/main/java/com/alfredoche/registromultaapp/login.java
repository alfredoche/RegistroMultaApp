package com.alfredoche.registromultaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    Button Entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Entrar = (Button)findViewById(R.id.btnIniciar);
        Entrar.setOnClickListener (new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent Entrar = new Intent(login.this, MainActivity.class);
                startActivity(Entrar);

            }
        });

    }
}

