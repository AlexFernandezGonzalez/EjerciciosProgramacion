/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import java.util.Scanner;

public class Boletin6_3 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo obxC = new Circulo();
        obxC.calcularArea();
        obxC.calcularLonxitude();
        
        
        Circulo obxC2 = new Circulo(4,1);
        obxC2.calcularArea();
        System.out.println("A area da circunferencia é : "+obxC2.calcularArea());
        obxC2.calcularLonxitude();
        System.out.println("A lonxitude da circunferencia é : "+obxC2.calcularLonxitude());
        
    }
    
}
