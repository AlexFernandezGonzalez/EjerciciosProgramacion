
package boletin3_4;
import java.util.Scanner;
public class Boletin3_4 {

    
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       int b100 ,b20 ,b5 ,m1,cantidade_entera,r1,r2;
       System.out.println("Teclea a cantidade enteira");
       cantidade_entera =sc.nextInt();
       b100 = cantidade_entera /100;
       r1 = cantidade_entera % 100;
       b20 = r1/20;
       r2 = r1%20;
       b5 = r2/5;
       m1= r2 %5;
       System.out.println("Billetes de 100 =" +b100 + " \n billetes de 20 ="+b20+" \n billetes de 5="+b5+ "monedas de un euro" + m1);
       
       /* Otro ejemplo
       int euros;
       int b100;
       int b20;
       int b5;
       int m1;
       int r1,r2,r3;
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduce a cantidade de diñeiro");
        euros = sc.nextInt();
        
      b100 = euros / 100;
        System.out.println(b100);
        r1 = euros % 100;
        
      b20 = r1 / 20;
        System.out.println(b20);
        r2 = r1% 20;
        
      b5 = r2 / 5;
         System.out.println(b5);
         r3 = r2 % 5; 
      
      m1 = r3 / 1;
        System.out.println(m1);
        */
    }
    
    
}
