
package boletin8_7;

import javax.swing.JOptionPane;

public class Boletin8_7 {

   
    public static void main(String[] args) {
     
        String figura = JOptionPane.showInputDialog("Introduce a figura:  Circulo - Cuadrado - Triangulo");
      
        switch (figura){
            case "Circulo":
                float areacir;
                float PI = 3.14f;      
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
                areacir = PI * (radio*radio);
                JOptionPane.showMessageDialog(null,"La superficie del cículo es "+areacir);
                break;
            case "Cuadrado":
                float areacua;
                 int baseCuadrado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del cuadrado"));
                 areacua = baseCuadrado * baseCuadrado;
                 JOptionPane.showMessageDialog(null,"La superficie del cuadrado es "+areacua);     
                break;
            case "Triangulo":
                float areatri;
                 int baseTri = Integer.parseInt(JOptionPane.showInputDialog("Introduce base del triangulo"));
                 int alturaTri = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
                 areatri =(float)(baseTri*alturaTri)/2;
                 JOptionPane.showMessageDialog(null,"La superficie del triangulo es "+areatri);
                break;   
                        default:
                            JOptionPane.showMessageDialog(null,"No es una figura valida");  
                            
        }
        
        
        
        
        
    }
    
}
