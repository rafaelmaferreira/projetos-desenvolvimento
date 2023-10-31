package cadastro;


import java.util.Scanner;


public class Cadastro {
    
    static Scanner leia = new Scanner (System.in);
    static int codigo;
    static String descricao;
    static int qtde;
    
    public static void main(String[] args) {
      
        System.out.print("Codigo: ");
        codigo= leia.nextInt();
        
        System.out.print("Descricao: ");
        descricao= leia.next();
        
        System.out.print("Quantidade: ");
        qtde= leia.nextInt();
        
        
    }
    
}
