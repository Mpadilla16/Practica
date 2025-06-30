package com.aluracurso.desafio.service;

public interface IconvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
