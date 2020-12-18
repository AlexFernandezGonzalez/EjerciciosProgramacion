
package exemploherdanza;


public class Taxi extends VVehiculo{
    private String numLicencia;

    public Taxi() {
    }
    
    

    public Taxi(String numLicencia,String maatricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numLicencia = numLicencia;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    @Override
    public String toString() {
        return super.toString()+ "numLicencia=" + numLicencia ;
    }

   
    
    
    
}
