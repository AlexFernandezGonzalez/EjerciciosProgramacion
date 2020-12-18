
package exemploclasesconobxetos;


public class Ordenador {
    
    private float prezo;
    private Cpu cpu = new Cpu();
    private Pantalla panta = new Pantalla();
    private Rato raton = new Rato();

    public Ordenador() {
    }

    public Ordenador(float prezo,Cpu c,Pantalla p,Rato rato) {
        this.prezo = prezo;
        cpu = c;
        panta = p;
        this.raton = rato;
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
