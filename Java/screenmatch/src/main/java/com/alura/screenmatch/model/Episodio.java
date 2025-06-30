package com.alura.screenmatch.model;

import java.time.LocalDate;

public class Episodio {

    private Integer temporada;

    private String titulo;

    private Integer numeroEpisodio;

    private Double evaluacion;

    private LocalDate fechaDeLanzamiento;

    public Episodio(Integer numero, DatosEpisodio d) {
        this.temporada = numero;
        this.titulo = d.titulo();
        this.numeroEpisodio = d.numeroEpisodio();

        // Manejo de evaluación
        try {
            this.evaluacion = Double.valueOf(d.evaluacion());
        } catch (NumberFormatException e) {
            this.evaluacion = 0.0;
        }

        // Manejo de fecha de lanzamiento
        try {
            this.fechaDeLanzamiento = LocalDate.parse(d.FechaDeLanzamiento());
        } catch (Exception e) {
            this.fechaDeLanzamiento = null; // o una fecha por defecto si prefieres
        }
    }


    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public Double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public LocalDate getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(LocalDate fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    @Override
    public String toString() {
        return
                "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", evaluacion=" + evaluacion +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento;
    }
}
