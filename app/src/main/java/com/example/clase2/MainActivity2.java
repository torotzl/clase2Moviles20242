package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nombre, edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre = findViewById(R.id.textoUno);
        edad = findViewById(R.id.textoDos);

        Intent recibirDatos = getIntent();

        String name = recibirDatos.getStringExtra("Nombre");
        int age  = recibirDatos.getIntExtra("Edad",0);

        nombre.setText(name);
        edad.setText(age);
    }
}