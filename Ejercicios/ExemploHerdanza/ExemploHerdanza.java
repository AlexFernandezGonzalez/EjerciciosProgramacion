
package exemploherdanza;


public class ExemploHerdanza {

    public static void main(String[] args) {
        
        Taxi obxTaxi = new Taxi(" aaaa","1234","audi",120);
        Autobus obxAutobus = new Autobus();
        
        System.out.println("taxi : "+obxTaxi.toString());
        
        System.out.println("autobus : "+obxAutobus.toString());
    }
    
}
