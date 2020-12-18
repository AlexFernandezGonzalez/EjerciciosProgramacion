
package exemploclasesconobxetos;


public class Ordenador {
    
    private float prezo;
    private Cpu cpu;
    private Pantalla panta;
    private Rato raton;

    public Ordenador() {
        Cpu cpu = new Cpu();
        Pantalla pan = new Pantalla();
        Rato raton = new Rato();
    }

    public Ordenador(float prezo,Cpu c,Pantalla p,Rato ra) {
         Cpu cpu = new Cpu(velo,marca);
        Pantalla pan = new Pantalla(pulgadas);
        Rato raton = new Rato(conexion);
        
       
        this.prezo = prezo;
        cpu = c;
        pan = p;
        raton = ra;
    }
    
    public Ordenador (float prezo, float velo, String marca,float pulgadas,String conexion){
         Cpu cpu = new Cpu();
        Pantalla pan = new Pantalla();
        Rato raton = new Rato();
        this.prezo = prezo;
        
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Pantalla getPanta() {
        return panta;
    }

    public void setPanta(Pantalla panta) {
        this.panta = panta;
    }

    public Rato getRaton() {
        return raton;
    }

    public void setRaton(Rato raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "prezo=" + prezo + ", cpu=" + cpu + ", panta=" + panta + ", raton=" + raton + '}';
    }
    
    
    
    
    
    
    
}
