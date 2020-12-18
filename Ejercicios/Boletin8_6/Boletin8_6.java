
package boletin8_6;

import javax.swing.JOptionPane;

public class Boletin8_6 {

    
    public static void main(String[] args) {
        
        int vendasAnuais= Integer.parseInt(JOptionPane.showInputDialog("Introduce as vendads anuais do artigo"));
      
        if (vendasAnuais<=100 && vendasAnuais>0){
            System.out.println("E de baixo consumo");
        }
        else if (vendasAnuais>100 && vendasAnuais<=500) {
            System.out.println("E de medio consumo");
        }  
        else if (vendasAnuais<=1000 && vendasAnuais>500){
            System.out.println("E de alto consumo");
        }
        else if (vendasAnuais>1000){
            System.out.println("E de primeira necesidade");
        }
        else if(vendasAnuais<=0){
        System.out.println("As ventas non poden ser menores que 0");
    }
    
    }
}