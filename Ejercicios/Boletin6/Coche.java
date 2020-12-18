
package boletin6;


public class Coche {
    
   private int Velocidade; 
   
   //Constructor con un valor ya por defecto
    public Coche(){
        Velocidade = 0;
    }
    
  
    
    public Coche(int V){
        Velocidade=V;
    }
    public int getVelocidade(){
        return Velocidade;
    }
    public void Acelerar(int A){
        Velocidade=Velocidade+A;
        System.out.println("Al acelerar la velocidad es de "+Velocidade+"km/h");
    }
    public void Frenar(int F){
        Velocidade=Velocidade-F;
         System.out.println("Al frenar la velocidad es de "+Velocidade+"km/h");
    }
}
