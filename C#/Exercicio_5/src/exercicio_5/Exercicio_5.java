package exercicio_5;

import java.util.Scanner;

public class Exercicio_5 {

    Scanner leia = new Scanner(System.in);
    int fatorial = 1;

    public static void main(String[] args) {
        Exercicio_5 obj = new Exercicio_5();
        obj.calculo();

    }

    public void calculo() {
        int n;
        for (n = 1; n <= 40; n++) {
            fatorial = fatorial * n;
            System.out.println("o fatorial de " + n + " é : " + fatorial);
        }
       
    }
}

