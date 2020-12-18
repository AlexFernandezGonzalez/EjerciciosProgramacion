
package extra1;

import java.util.Scanner;

public class Conta {
    //Atributos
    String nomeCliente;
    String numeroConta;
    double tipoInterese;
    double saldo;
    /*También vale 
    String nomeCliente,numeroConta;
double tipoInterese,saldo;
    
*/
    /*Constructor por defecto ya con valores aunque normalmente no los tiene ()
    public Conta(){
       nomeCliente  ="Alex";
       numeroConta = "123456";
       tipoInterese = 100;
       saldo = 0;
*/
    //Constructor por defecto
    public Conta (){
  
    }
    //Constructor con todos los parámetros
   public Conta(String nCl , String nCo , double tI, double s){
       nomeCliente = nCl;
       numeroConta = nCo;
       tipoInterese = tI;
       saldo = s;
   } 
   // Setteres y getters
   public String getNome (String nomeCliente){
       return nomeCliente;
   }
   public void setNome (String nCl){
       nomeCliente = nCl;
   }
   //
   public String getConta (String numeroConta){
       return numeroConta;
   }
   public void setConta (String nCo){
       numeroConta = nCo;
   }
   //
   public double getInterese (double tipoInterese){
       return tipoInterese;
   }
   public void setInterese (double tI){
       tipoInterese = tI;
   }
   //
   public double getSaldo (double saldo){
       return saldo;
   }
   public void setSaldo(double s){
       saldo = s;
   }
    //Metodos
   
    //Ingreso
   public void ingreso(){
       double saldo2;
       Scanner sc = new Scanner(System.in);
       System.out.println("Escribe el ingreso");
       saldo2 = sc.nextDouble();
       double  nuevosaldo=saldo + saldo2;
       System.out.println("El saldo final es de "+nuevosaldo); 
   }
   //Reintegro
   public void reintegro(){
       double reintegro;
       Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el reintegro");
        reintegro = sc.nextDouble();
         double nuevosaldo = saldo - reintegro;
         if (nuevosaldo > 0)
        System.out.println("El saldo final es de "+nuevosaldo); 
         else {
             System.out.println("ERROR");
         }
         //Transferencia
         public void transferencia(){
             
             
         }
   
   }
 
  
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
