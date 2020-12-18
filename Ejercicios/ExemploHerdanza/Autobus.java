
package exemploherdanza;


public class Autobus extends VVehiculo {
    private int numPlazas;

    public Autobus() {
    }

    public Autobus(int numPlazas, String matricula, String modelo, int potencia) {
        super(matricula,modelo,potencia);
        this.numPlazas = numPlazas;
        
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public String toString() {
        return "Autobus{" + "numPlazas=" + numPlazas + '}';
    }
    
    
    
    
}
