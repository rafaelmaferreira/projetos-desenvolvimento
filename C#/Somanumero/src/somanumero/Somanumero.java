
package somanumero;


public class Somanumero {
    
    int x, soma=0;
    
    public void entradaDados(){
        
        for (x=1;x<=1000;x++){
            soma = soma + x;
        }
        System.out.println("A soma dos numeros foi: " + soma);        
    }
 
    public static void main(String[] args) {
        Somanumero obj = new Somanumero();
        obj.entradaDados();
       
    }
    
}
