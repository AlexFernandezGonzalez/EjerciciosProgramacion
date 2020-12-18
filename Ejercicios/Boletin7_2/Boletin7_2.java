
package boletin7_2;

import java.util.Scanner;

public class Boletin7_2 {

  
    public static void main(String[] args) {
        short numero1;
        short numero2;
        float suma;
        float resta;
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Teclea el primer numero");
        numero1 = sc.nextShort();
        System.out.println("Teclea el segundo numero");
         numero2 = sc.nextShort();
         //Indico
        suma = numero1+numero2;
        resta = numero1-numero2;
        //Condicion
        if (numero1>=numero2){
            System.out.println("La resta de "+numero1+" menos "+numero2+" es "+resta);
            
        }
        else{
            System.out.println("");
        }
        //Que muestre la suma
        System.out.println("La suma de "+numero1+" mas "+numero2+" es "+suma);
        
        
        
    }
    
}
    
        
       

