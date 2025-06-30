package com.aluracurso.desafio.principal;

import com.aluracurso.desafio.model.Datos;
import com.aluracurso.desafio.service.ConsumoAPI;
import com.aluracurso.desafio.service.ConvierteDatos;

import java.util.Date;

public class Principal {

    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public  void muestraElMenu(){
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);

        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);

    }
}
