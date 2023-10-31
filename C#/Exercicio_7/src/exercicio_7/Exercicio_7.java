
package exercicio_7;

import java.util.Scanner;

public class Exercicio_7 {
Scanner leia = new Scanner(System.in);
    int x;
    
    public static void main(String[] args) {
        Exercicio_7 obj = new Exercicio_7();
        obj.calcular();
        obj.imprimir();
    }
    public void calcular(){
        
        System.out.println( " Digite o x :");
        x = leia.nextInt();
        
        if (x%2 == 0){
            x = x/2 ;
            
        }
        else {
            x = (3*(x+1));
        }
    }
    
    public void imprimir (){
        System.out.println(x);
    }
}