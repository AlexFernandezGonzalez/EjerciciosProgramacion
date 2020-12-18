
package boletin4;


public class Libro {
    //Atributos
    String titulo;
    String autor;
    int ano;
    short numPaginas;
    float valoracion;
        
    //Constructor por defecto
        public  Libro(){
            
        }
    
//Constructor que permita inicializar los atributos
    public Libro(String ti,String au, int an, short num, float val){
            titulo = ti;
            autor = au;
            ano = an;
           numPaginas = num;
           valoracion = val;
    }     
 //Metodos de acceso para todos los atributos   
    public String getTitulo(String titulo){
        return titulo;
    }
    public void setTitulo(String ti){
      titulo = ti;
    }
    public String getAutor(String autor){
        return autor;
    }
    public void setAutor(String au){
      autor = au;
    }   
    public String getAno(String ano){
        return ano;
    }
    public void setAno(int an){
        ano = an;
    }
    public String getPag(String numPaginas){
        return numPaginas;
    }
    public void setPag(short num){
        numPaginas = num;
    }   
    public String getValoracion(String valoracion){
        return valoracion;
    }
    public void setValoracion(float val){
        valoracion = val;
    }
  
    Libro a = new Libro();
    

    
}
