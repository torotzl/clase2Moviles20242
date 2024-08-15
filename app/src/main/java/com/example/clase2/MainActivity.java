package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ingresarUsuario;
    TextView usuario;
    Button hola,mundo;

    String nombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ingresarUsuario = (EditText) findViewById(R.id.editarUsuario);
        usuario = (TextView) findViewById(R.id.txvUsuario);
        hola = findViewById(R.id.btnHola);
        mundo = findViewById(R.id.btnMundo);


        hola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usuario.setText("Presionaste el botón Hola");
                nombreUsuario= String.valueOf(ingresarUsuario.getText());

            }
        });

        mundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}