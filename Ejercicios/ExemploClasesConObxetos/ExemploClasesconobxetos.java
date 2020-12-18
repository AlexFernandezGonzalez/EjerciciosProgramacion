
package exemploclasesconobxetos;

import javax.swing.JOptionPane;


public class ExemploClasesconobxetos {

   
    public static void main(String[] args) {
        float prezo = lerFloat("Teclea o prezo :");
        float pulgadas = lerFloat("Tleclea pulgadas");
        String marca = lerString("Marca :");
        String conexion = lerString("conexion :");
        float velocidade = lerFloat("Teclea a velocidade :");
        Cpu c = new Cpu(velocidade,marca);
        Pantalla p = new Pantalla(pulgadas);
        Rato r = new Rato(conexion);
        
      Ordenador obxOrd = new Ordenador(prezo,c,p,r);
      //tamén Ordenador obxOrd = new Ordenador(prezo,new Cpu(velocidade,marca),new Pantalla(pulgadas),new Rato(conexion));
        System.out.println(obxOrd);
        velocidade = lerFloat("velocidade");
        obxOrd.getCpu().setVelocidade(500);
        //tamen obxOrd.getCpu().setVelocidade(lerFloat("velocidade"));
        System.out.println(obxOrd.toString());
                 
                
    }
    
        
        public static String lerString(String mensaxe){
           return JOptionPane.showInputDialog(mensaxe);
        }
        
        public static float lerFloat(String mensaxe){
            return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        }
        
    }
    

