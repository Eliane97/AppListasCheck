package com.example.applistascheck.ViewModels;

import android.arch.lifecycle.ViewModel;

import com.example.applistascheck.Models.ListaModel;

   /*maneja la lógica de la actividad:*/
    public class ListaViewModel extends ViewModel {

        private ListaModel listaModel;

        public ListaViewModel() {
            // Inicializa listaModel en el constructor
            listaModel = new ListaModel("", "", "");
        }

        public void guardarDatos(String titulo, String fecha, String descripcion) {
            listaModel.setTitulo(titulo);
            listaModel.setFecha(fecha);
            listaModel.setDescripcion(descripcion);
        }

        public ListaModel getListaModel() {
            return listaModel;
        }

    }

