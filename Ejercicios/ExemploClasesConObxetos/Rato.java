
package exemploclasesconobxetos;


public class Rato {
    String conexion;

    public Rato(String conexion) {
        this.conexion = conexion;
    }

    public Rato() {
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return "Rato{" + "conexion=" + conexion + '}';
    }
    
    
    
    
    
    
    
}
