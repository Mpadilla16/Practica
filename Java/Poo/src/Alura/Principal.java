
package                                                                                                                                                                                                                                                                                                  Alura;

public class Principal{
 
    public static void main(String [] args){
        Pelicula mipelicula= new Pelicula();
        
        mipelicula.Nombre = "maxmas";
        mipelicula.FechaDeLanzamiento = 2023;
        mipelicula.DracionDeMinutos = 120;
        mipelicula.IncuidaEnElPlan = true;
        
       mipelicula.muestraFichaTecnica();
       mipelicula.evalua(10);
       mipelicula.evalua(10);
       
       
       System.out.println(mipelicula.sumalasevaluaciones);
       System.out.println(mipelicula.totalDelasEvaluaciones);
       System.out.println(mipelicula.calculaMedia());
    
    }
    
}