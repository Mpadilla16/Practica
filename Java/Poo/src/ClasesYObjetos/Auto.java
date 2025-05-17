/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesYObjetos;

/**
 *
 * @author Maria
 */
public class Auto {
    //Atributos
    String color;
    String marca;
    int km;
    
    //Metodos
    
    public static void main(String[] args){
        Auto auto1 = new Auto(); //objeto auto1 pertece a la clase Auto
        
        auto1.color = "negro";
        auto1.km = 1234;
        auto1.marca = "Toyota";
        
        System.out.println("Este auto es de colo " + auto1.color);
        
    }
    
}




