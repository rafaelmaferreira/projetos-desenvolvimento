
package multiplonumero;

public class Multiplonumero {
    
    int x;
    
    public void entradaDados(){
        for (x=1; x<=100;x++){
            if ( x % 3 == 0){
                System.out.println("Os multiplos sao: " + x);
            }
        }
                
    }

    
    public static void main(String[] args) {
        
        Multiplonumero obj = new Multiplonumero();
        obj.entradaDados();
        
    }
    
}
