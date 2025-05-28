
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maria
 */
public class Cajero {
    
     public static void main(String[] args) {
         
        String nombre = "Tony Stark";
        String TipoDeCuenta ="Corriente";
        double saldo = 500000;
        int opcion = 0;
        

        System.out.println("*******************************");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + TipoDeCuenta);
        System.out.println("Saldo: " + saldo + "$" );
        System.out.println("*******************************");
        
       String menu = """ 
                     \n ****Escriba el numero de la opcion deseada****
                     1 - Consultar saldo
                     2 - Retirar
                     3 - Depositar
                     9 - Salir
                     """;
        
       Scanner teclado = new Scanner(System.in);
       while (opcion != 9){
           System.out.println(menu);
           opcion = teclado.nextInt();
           
           switch (opcion){
               case 1:
                   System.out.println("Su saldo actual es: " + saldo + "$");
                   break;
                
               case 2:
                   System.out.println("Cual es saldo que desea retirar");
                   double valorRetirar = teclado.nextDouble();
                   
                   if (valorRetirar > saldo){
                       System.out.println("Saldo insuficiente");
                   }else{
                       saldo = saldo - valorRetirar;
                       System.out.println("Su Saldo Actual es: " + saldo + "$" );
                   }
                   break;
                   
               case 3:
                   System.out.println("Cual es saldo que desea Depositar");
                   double valorDepositar = teclado.nextDouble();
                   saldo = saldo + valorDepositar;
                   System.out.println("Su Saldo Actual es: " + saldo + "$" );
                   break;
                   
               case 9:
                   System.out.println("***Gracias por usar nuestros servicios");
                   break;
                   
               default: 
                   System.out.println("Ingrese una opcion valida");
                 
           }
       
       
       }
        
                
        
    }
    
}
