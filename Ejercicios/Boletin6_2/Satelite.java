
package boletin6_2;

public class Satelite {
    final double meridiano;
    final double paralelo;
    final double distanciaTerra;
    
    public Satelite(){
        meridiano = paralelo = distanciaTerra = 0;
       
    }
    public Satelite(double m, double p, double d){
    meridiano = m;
    paralelo = p;
    distanciaTerra = d;
}
  public void verPosicion(){
      System.out.println("O satelite atopase no paralelo "+paralelo+", meridiano "+meridiano+" e a unha distancia da Terra de "+distanciaTerra);
  }  
    
    
    
}
