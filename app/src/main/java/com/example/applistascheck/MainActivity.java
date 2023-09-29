package com.example.applistascheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.applistascheck.Views.Lista;
import com.example.applistascheck.Views.Listas;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irAcrearLista(View view) {
        // Crea un Intent para iniciar la segunda actividad
        Intent intent = new Intent(this, Lista.class);
        startActivity(intent);
    }
    public void irAleerLista(View view) {
        // Crea un Intent para iniciar la segunda actividad
        Intent intent = new Intent(this, Listas.class);
        startActivity(intent);
    }
}