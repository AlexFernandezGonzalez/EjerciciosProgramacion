
package boletin7_4;

import java.util.Scanner;

public class Boletin7_4 {

    
    public static void main(String[] args) {
        //n = nome e p = peso
        String n1,n2;
        float p1,p2;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre");
        n1 = sc.nextLine();
        System.out.println("Escribe el segundo nombre");
        n2 = sc.nextLine();
        System.out.println("Escribe el peso");
        p1 = sc.nextFloat();
        System.out.println("Escribe el segundo peso");
        p2 = sc.nextFloat();
        
        if (p1 > p2 ){
            System.out.println(n1+" é mais pesado que "+n2);
            float peso;
            peso = p1-p2;
            System.out.println("A diferencia de peso é de "+peso+" kg");
        }
        else if (p1 < p2){
            System.out.println(n2+" é mais pesado que "+n1);
            float peso;
            peso = p2 -p1;
            System.out.println("A diferencia de peso é de "+peso+" Kg");
            
        }
        else {
            System.out.println("");
        }
        
        
    }
    
}
