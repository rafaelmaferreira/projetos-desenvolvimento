
package imprimirnumero;


public class Imprimirnumero {
    
    int x;
    
    public void numeroImpresso(){
        for ( x=150; x<=300; x++){
            System.out.println("Numero impresso e: " + x);
        }
    }
    
        
    public static void main(String[] args) {
        
        Imprimirnumero obj = new Imprimirnumero();
        obj.numeroImpresso();
        
        }
    
}
