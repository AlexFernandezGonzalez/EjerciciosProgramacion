
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

  
    public static void main(String[] args) {
        float n1,n2;
       float suma;
       float resta;
       float producto;
       float cociente;
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Dime el primer numero");
       n1 = sc.nextFloat();
        System.out.println("Dime el segundo numero numero");
       n2 = sc.nextFloat();
        
        suma = n1 + n2;
        System.out.println("La suma de "+n1+" mas "+n2+" es "+suma);
        resta = n1 - n2;
        System.out.println("La resta de "+n1+" menos  "+n2+" es "+resta);
        producto = n1 * n2;
        System.out.println("El producto de "+n1+" por  "+n2+" es "+producto);
        cociente = n1 / n2;
        System.out.println("El cociente de "+n1+" entre  "+n2+" es "+cociente);
        
        
        
        
    }
      
    
}
