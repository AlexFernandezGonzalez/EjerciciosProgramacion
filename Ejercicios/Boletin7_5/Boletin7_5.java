
package boletin7_5;

import java.util.Scanner;

public class Boletin7_5 {

   
    public static void main(String[] args) {
        int n1,n2,n3;
        int numero;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero 1");
      n1 = sc.nextInt();
      System.out.println("Escribe el numero 2");
      n2 = sc.nextInt();
      System.out.println("Escribe el numero 3");
      n3 = sc.nextInt();
      
      if (n1>n2 && n1>3){
          System.out.println("El primer numero es el mayor");
      }
      else if (n2>n1 && n2>n3){
          System.out.println("El segundo numero es el mayor");
      }
      else {
          System.out.println("El tercer numero es el mayor");
      }
      
      
      
      
      
      
      
      
      
      
      
    }
    
}
