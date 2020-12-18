
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
      float millas;
      float metros;
      
      Scanner sc = new Scanner (System.in);
        System.out.println("Dime las millas marinas");
       millas = sc.nextFloat();
       metros = millas  * 1852;
        System.out.println(millas+" millas marinas son "+metros+" metros");
    }
    
}
  