
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

  
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     float euros;
     float dolares;
     float cambio = 1.17f;
     /*También vale 
     float cambio;
     cambio = 1.17f;
     */
     euros = sc.nextFloat();
        System.out.println("Escribe los euros ");
     dolares = euros * cambio;
        System.out.println(euros+ "euros son "+dolares+" dolares");
                      
        
    }
    
}
