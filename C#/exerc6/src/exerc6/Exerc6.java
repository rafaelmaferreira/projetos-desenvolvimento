package exerc6;

import java.util.Scanner;

public class exerc6 {

    Scanner leia = new Scanner(System.in);
    int fib = 1 , res;
    int n;

    public static void main(String[] args) {
        exerc6 obj = new exerc6();
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