
package boletin7_3;

import java.util.Scanner;

public class Boletin7_3 {

    
    public static void main(String[] args) {
        float numero;
       
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el numero");
        numero=sc.nextFloat();
        
      if (numero>0){
          System.out.println("Es +");
      }
      else if (numero<0){
          System.out.println("Es -");
      }
      else {
          System.out.println("Es 0");
      }
     
    
    }
    
    
}
    
    