
package boletin3_2;

import java.util.Scanner;
public class Boletin3_2 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float grados,kelvin,farenheit;
        System.out.println("Teclea los grados centigrados: ");
        grados= sc.nextFloat();
        kelvin= grados + 273;
        farenheit = grados *1.8f+ 32;
        System.out.println("Os grados kelvin son = " + kelvin);
        System.out.println("Os grados farenheit son = "+farenheit);
        
        
        
    }
    
}
