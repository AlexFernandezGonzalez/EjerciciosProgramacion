
package boletin3_1;

import java.util.Scanner;

public class Boletin3_1 {

   
    public static void main(String[] args) {
        //pt = prezo da tarifa e pp = prezo pagado
        float pt;
        float pp;
        float desconto;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el precio original");
        pt = sc.nextFloat();
        System.out.println("Escribe el precio pagado");
        pp = sc.nextFloat();
        /*Con esto calculas el % que estás pagando 
        sobre el precio original pero no cuanto descuento te hacen
       
        desconto = 100 * pp / pt;
        System.out.println("Estás pagando el  "+desconto+" % del precio original");
        Pero pide calclular el  porcentaje de descuento :
        */
        desconto = 100 - (100*pp/pt);
        System.out.println("El descuento es del "+desconto+" %");
        
    }
    
}
