
package boletin5;


public class Consumo {
    //Atributos
    private double kilometros;
    private float litros;
    private float velocidade;
    private double prezogasolina;
    //Constructores
    //Constructor por defecto
    public Consumo(){ 
    }
    //Constructor 
    public Consumo(double km, float li,float vel,float prezo){
        kilometros = km;
        litros = li;
        velocidade = vel;
        prezogasolina = prezo;
    }
    //Metodos Set y Get
    //Set
    public void setKilometros(double kmreco){
        kilometros = kmreco;
    }
    public void setLitros(float litrosC){
        litros = litrosC;
    }
    public void setPrezogasolina(double pgas){
        prezogasolina = pgas;
    }
    //Get
    public double getkilometros(){
        return kilometros;
    }
    public float getlitros(){
        return litros;
    }
    public double getprezogasolina(){
        return prezogasolina;
    }
    public float getvelocidade(){
    return velocidade;
    }
    //Métodos con instruciones
    public double getTempo(){
        double tempo = kilometros/velocidade;
        return tempo;
    }
    public double consumoEuros(){
         double euros;
        euros = litros*prezogasolina*100;
        return euros;
    }
    public double consumoMedio(){
        double consumo;
        consumo = litros/kilometros*100;
        return consumo;
        
    }
    public void amosar(){
        double km;
        float li;
        float vel;
        double prezo;
        
         double consumo2;
      consumo2= litros/kilometros*100;
        System.out.println("Consumo medio es "+consumo2);
    }
    
    
}
  
    
    
    
    
    
    
    
    
    
    

