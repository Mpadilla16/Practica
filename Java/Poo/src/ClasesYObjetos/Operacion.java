/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Maria
 */
public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int division;
    int multiplicacion;
    
    
    //Metodos
    //metodo para pedir al usuario que digite dos numeros;
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
    }
    //Metodo para sumar ambos numerps
    public void sumar(){
    suma = numero1 + numero2;
    }
    
    //metodo para restar
    public void restar(){
        resta = numero1 - numero2;
    }
    
    //metodo para multiplicar
    public void multiplica(){
        multiplicacion = numero1 * numero2;
    }
    
    //metodo para restar
    public void divide(){
        division = numero1 - numero2;
    }
    
    public void mostrarressultados(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
           
}
