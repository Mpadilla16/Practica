/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alura;

/**
 *
 * @author Maria
 */
public class Pelicula {
    String Nombre;
    int FechaDeLanzamiento;
    int DracionDeMinutos;
    boolean IncuidaEnElPlan;
    double sumalasevaluaciones;
    int totalDelasEvaluaciones;
    
    
    void muestraFichaTecnica(){
         System.out.println("El nombre de mi pelicula es " + Nombre);
        System.out.println("Fecha de Lanzamiento " + FechaDeLanzamiento);
        System.out.println("Duracion " + DracionDeMinutos);
        System.out.println("Incluida en el plan " + IncuidaEnElPlan);
    }
    
    void evalua(double nota){
        sumalasevaluaciones += nota;
        totalDelasEvaluaciones ++;
    
    }
    
    double calculaMedia(){
        return sumalasevaluaciones / totalDelasEvaluaciones;
    }
    
}
