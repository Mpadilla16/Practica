package com.alura.screenmatch.principal;

import com.alura.screenmatch.model.DatosEpisodio;
import com.alura.screenmatch.model.DatosSeries;
import com.alura.screenmatch.model.DatosTemporadas;
import com.alura.screenmatch.model.Episodio;
import com.alura.screenmatch.service.ConsumoAPI;
import com.alura.screenmatch.service.ConvierteDatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class SeriePrincipal {
    private Scanner teclado = new  Scanner(System.in);

    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=69015e0c";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void  muestraElMenu(){
        System.out.println("Por favor escribe el nombre de la serie que seas buscar");
        //Busca los datos generales de
        var nombreSerie = teclado.nextLine();
        var json =consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+")+ API_KEY);
        var datos = conversor.obtenerDatos(json, DatosSeries.class);

        //Busca los datos de todas las temporadas
        List<DatosTemporadas> temporadas = new ArrayList<>();
        for (int i = 1; i <= datos.totalDeTemporadas() ; i++) {
            json= consumoApi.obtenerDatos( URL_BASE + nombreSerie.replace(" ", "+") + "&Season="+i+"&apikey=69015e0c");
            var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
            temporadas.add(datosTemporadas);
        }
        //temporadas.forEach(System.out::println);

        //Mostrar solo el titulo de los episodios para temporadas
//        for (int i = 0; i < datos.totalDeTemporadas(); i++) {
//            List<DatosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            for (int j = 0; j < episodiosTemporada.size(); j++) {
//                System.out.println(episodiosTemporada.get(j).titulo());
//
//            }
//
//        }
        //temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        //Convertir todas las informaciones a una Lista del tipo Datos Episodios

        List<DatosEpisodio> datosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toUnmodifiableList());




        //top 5 episodios
//        System.out.println("Top 5 Episodios");
//        datosEpisodios.stream()
//                .filter(e -> !e.evaluacion().equalsIgnoreCase("N/A"))
//                .peek(e -> System.out.println("Primer filtro (N/A)" + e))
//                .sorted(Comparator.comparing(DatosEpisodio::evaluacion).reversed())
//                .peek(e -> System.out.println("Segundo ordenacion (M>m)" + e))
//                .map(e ->e.titulo().toUpperCase())
//                .peek(e -> System.out.println("Tecer filtro mayuscula (m>M)" + e))
//                .limit(5)
//
//                .forEach(System.out::println);

        //convertiendo los datos a una lista de tipo episodio
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numero(),d)))

                .collect(Collectors.toList());

//        episodios.forEach(System.out::println);

        //Busqueda de episodios a partir de x año
//        System.out.println("Por favor indique el año del que desea ver los episodios");
//        var fecha = teclado.nextLine();
//        teclado.nextLine();

//        LocalDate fechaBusqueda = LocalDate.of(Integer.parseInt(fecha),1,1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        episodios.stream()
//                .filter(e ->e.getFechaDeLanzamiento() != null && e.getFechaDeLanzamiento().isAfter(fechaBusqueda))
//                .forEach(e -> System.out.println(
//                        "Temporada" + e.getTemporada() +
//                                "Episodio" + e.getTitulo() +
//                                "Fecha de Lanzamiento" + e.getFechaDeLanzamiento().format(dtf)
//                ));

        //Busca episodio por un pedazo de titulo
//        System.out.println("Por favor digite el titulo del episodio");
//        var pedazoTitulo = teclado.nextLine();
//        Optional<Episodio> episodioBuscado = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(pedazoTitulo.toUpperCase()))
//                .findFirst();
//        if (episodioBuscado.isPresent()){
//            System.out.println("Episodio buscaddo");
//            System.out.println("Los datos son: " + episodioBuscado.get());
//        }else {
//            System.out.println("Episodio no encontrado");
//       }

        Map<Integer , Double > evaluacionesPorTemporada = episodios.stream()
                .filter(e -> e.getEvaluacion() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getEvaluacion)));

        System.out.println(evaluacionesPorTemporada);

        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getEvaluacion() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getEvaluacion));
        System.out.println("Media de las evaluaciones: " + est.getAverage());
        System.out.println("Episodio Mejor evaluado: " + est.getMax());
        System.out.println("Episodi peor evaluado: " + est.getMin());


    }
}
