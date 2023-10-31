package Exercico_6;

import java.util.Scanner;

public class Exercico_6 {

    Scanner leia = new Scanner(System.in);
    int fib = 1 , res;
    int n;

    public static void main(String[] args) {
        Exercico_6 obj = new Exercico_6();
        obj.caluculo();

    }

    public void caluculo() {
        for (n = 1; n <= 100; n++) {
            if ((n == 1) || (n == 2)) {
                res = 1;
            } 
            else {
                res = (fib * (n - 1) + fib * (n - 2));
            }
                System.out.println (res);
        }
    }
    
} 