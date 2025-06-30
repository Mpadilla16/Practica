package com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosEpisodio(
       @JsonAlias("Title") String titulo,

       @JsonAlias("Episode") int numeroEpisodio,

       @JsonAlias("Runtime") String duracion,

       @JsonAlias("Released") String FechaDeLanzamiento,

       @JsonAlias("imdbRating") String evaluacion
) {
}
