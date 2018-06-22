package com.alfredoche.registromultaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registrarmulta extends AppCompatActivity {


    Button Guardar;
    Button Cancelar;
    private EditText Dni,Apellido,Monto,Placa,Tipo,Causa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarmulta);

        Guardar = (Button)findViewById(R.id.btnGuardar);
        Cancelar = (Button)findViewById(R.id.btnCancelar);

        Dni = (EditText)findViewById(R.id.txtDni);
        Apellido = (EditText)findViewById(R.id.txtApellido);
        Monto = (EditText)findViewById(R.id.txtMonto);
        Placa = (EditText)findViewById(R.id.txtPlaca);
        Tipo = (EditText)findViewById(R.id.txtTipo);
        Causa = (EditText)findViewById(R.id.txtCausa);


        Guardar.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Guardar = new Intent(registrarmulta.this, MainActivity.class);
                startActivity(Guardar);

            }
        });


        Cancelar.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Cancelar = new Intent(registrarmulta.this, MainActivity.class);
                startActivity(Cancelar);

            }
        });







    }
}
