
package boletin3_3;
import java.util.Scanner;
public class Boletin3_3 {

    
    public static void main(String[] args) {
       int euros;
       int b100;
       int b20;
       int b5;
       int m1;
      
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduce os billetes de 100");
        b100 = sc.nextInt();
        System.out.println("Introduce os billetes de 20");
        b20 = sc.nextInt();
        System.out.println("Introduce os billetes de 5");
        b5 = sc.nextInt();
        System.out.println("Introduce as monedas de 1");
        m1 = sc.nextInt();
        
        euros = b100*100 + b20*20 + b5*5 + m1*1;
        System.out.println("Os euros son "+euros);
       
        
    }
    
}
