package calculosalario;

import java.util.Scanner;

public class Calculosalario {

    String nome, nascimento, cpf, rg, mensagem;
    float salario, imposto, v_imposto;

    public void entradaDados() {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leia.next();

        System.out.println("Digite a data de nascimento: ");
        nascimento = leia.next();

        System.out.println("Digite seu cpf: ");
        cpf = leia.next();

        System.out.println("Digite seu rg: ");
        rg = leia.next();

        System.out.println("Digite seu salario: ");
        salario = leia.nextFloat();

    }

    public void testeSalario() {

        if (salario < 1500) {
        } else if ((salario >= 1500) && (salario < 2000)) {
            imposto = 10;
            mensagem = "10% de imposto";
        } else if ((salario >= 2000) && (salario < 2500)) {
            imposto = 15;
            mensagem = "15% de imposto"; 
        } else if ((salario >= 2500) && (salario < 3000)){
            imposto = 20;
            mensagem = "20% de imposto";
        }else if ((salario >= 3000) && (salario < 3500)){
            imposto = 25;
            mensagem = "25% de imposto";
        }else if ((salario >= 3500) && (salario < 4000)){
            imposto = 30;
            mensagem = "30% de imposto";
        }else if (salario >= 4000){
            imposto = 35;
            mensagem = "35% de imposto";
        }
            
        v_imposto = salario*(imposto/100);
        salario = salario - v_imposto;
        
    }

    public void imprimeDados(){
        
        System.out.println("O salario é: " + salario);
        System.out.println("O imposto cutsou: " + v_imposto);
    }
    
    
    public static void main(String[] args) {

        Calculosalario obj = new Calculosalario();
        obj.entradaDados();
        obj.testeSalario();
        obj.imprimeDados();
        
    }

}
