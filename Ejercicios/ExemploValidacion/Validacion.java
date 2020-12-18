
package exemplovalidacion;


import javax.swing.JOptionPane;

public class Validacion {
    
    public float validarDato(){
        float dato;
        /*dato es una variable local que solo funciona
        en validarDato por lo que en validaWhile no
        la puedo utilizar y hay que volver a declararla
        y puede tener el mismo nombre
        */
        do{
          dato = Float.parseFloat(JOptionPane.showInputDialog("Escribe valor >=  0"));
        } while (dato<=0);
        return dato;
    }
    
    public float validaWhile(){
        float dato2;
         dato2 = Float.parseFloat(JOptionPane.showInputDialog("Escribe valor >=  0"));
        while(dato2<=0){
             dato2= Float.parseFloat(JOptionPane.showInputDialog("Escribe valor >=  0"));
        }
        return dato2; 
    }
    
    
    
}
    
    


