
package boletin6_3;


public class Circulo {
    //Atributos
    private double radio;
    //Como PI es una constante va en mayus.
    public double PI=3.14;
    //Metodos Constructores
    //Metodos constructores sen parametros
    public Circulo(){
        
    }
    public Circulo (double r, double p){
        radio = r;
       
        
    }
    //Metodos de acceso
    public void setRadio(double r){
        radio=r;
    }
    public double getRadio(){
        return radio;
    }
  //Metodos calcular
    public double calcularArea(){
        double area;
        area=Math.pow(radio, 2)*PI;
        return area;
    }
    public double calcularLonxitude(){
        double lonxitude;
        lonxitude = (2*radio)*PI;
        return lonxitude;
    }
    
    
    
    
    
    
    
    
    
    
}
