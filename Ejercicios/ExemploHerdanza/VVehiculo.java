
package exemploherdanza;


public class VVehiculo {
    
   private String matricula;
    private String modelo;
     private int potencia;
    /*
     si fuese:
     private String matricula;
    private String modelo;
     int potencia;
     Como matricula y modelo son private solo se acceden desde la clase
pero como int no pues es de paquete
*/

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

@Override
public String toString() {
    return "matricula=" + matricula + ",modelo=" + modelo + ",potencia=" + potencia;
}


}
