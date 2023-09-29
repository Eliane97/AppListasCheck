package com.example.applistascheck.Views;


import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.applistascheck.Models.ListaModel;
import com.example.applistascheck.R;
import com.example.applistascheck.ViewModels.ListaViewModel;

public class Lista extends AppCompatActivity {


    private ListaViewModel listaViewModel;
    private EditText titulo;
    private EditText fecha;
    private EditText descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        // Inicializa el ViewModel
        listaViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication())).get(ListaViewModel.class);

        // Para obtener los datos del ViewModel
        ListaModel listaModel = listaViewModel.getListaModel();
        // Puedes usar 'listaModel' como quieras en tu actividad
    }

    public void guardar(View view){
        //Guardar los datos usando el ViewModel

        //1 Vinculo las vistas con sus elementos correspondientes
        titulo = findViewById(R.id.etTitulo);
        fecha = findViewById(R.id.etFecha);
        descripcion = findViewById(R.id.etDescrip);

        // 2 parseo los datos para transformarlos de EditText a String por ej: para poder guardarlo en el ListaviewModel
        String tituloText = titulo.getText().toString();
        String fechaText = fecha.getText().toString();
        String descripcionText = descripcion.getText().toString();
        listaViewModel.guardarDatos(tituloText, fechaText, descripcionText);
        // Creo la intencion(evento) que va a pasar cuando toque el boton afectado al intent
        Intent i = new Intent(this, Listas.class);
        startActivity(i);
    }
}
