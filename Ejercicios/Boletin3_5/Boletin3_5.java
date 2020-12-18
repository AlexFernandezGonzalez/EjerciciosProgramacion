
package boletin3_5;

import java.util.Scanner;

public class Boletin3_5 {

    
    public static void main(String[] args) {
        float fixo;
        float comision;
        float kilom;
        float dietas;
        float bruto;
        float liquido;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe o soldo fixo");
        fixo = sc.nextFloat();
        System.out.println("Escribe a comision");
        comision = sc.nextFloat();
        System.out.println("Escribe a quilometraxe");
        kilom = sc.nextFloat();
        System.out.println("Escribe as dietas");
        dietas = sc.nextFloat();
        
        bruto = fixo + comision*5/100 + kilom*2  + dietas*30;
        
        liquido = bruto - (bruto*18/100) - 36;
        
        System.out.println("O soldo bruto é de "+bruto);
        System.out.println("O soldo liquido é de "+liquido);
      
        
      /*  En clase:
        
        Scanner sc = new Scanner(System.in);
        float bruto,fixo,liquido,quilometraje,comision,dieta;
        System.out.println("Itroduce el sueldo fijo");
        fixo=sc.nextFloat();
         System.out.println("Itroduce el total de ventas");
        comision=sc.nextFloat();
         System.out.println("Itroduce el quilometraje");
        quilometraje=sc.nextFloat();
        System.out.println("Itroduce los dias desplazados");
        dieta=sc.nextFloat();
        bruto =fixo+quilometraje*2+comision*5/100+dieta*30;
        System.out.println("O soldo fixo e "+ bruto + " euros");
        liquido=(float) (0.82*bruto-36);
        System.out.println("O soldo liquido e "+ liquido+ "euros");
        */
        
    }
    
}
