
package boletin6_2;


public class Boletin6_2 {

   
    public static void main(String[] args) {
        Satelite sat = new Satelite();
        Satelite sat2 = new Satelite(30,40,600);
        System.out.println("Posicion satelite 1");
        sat.verPosicion();
        System.out.println("Posicion satelite 2");
        sat2.verPosicion();
        
        
    }
    
}
