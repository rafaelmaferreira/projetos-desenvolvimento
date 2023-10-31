package exe_1;

import java.util.Scanner;

public class Exe_1 {

    static Scanner leia = new Scanner(System.in);
    int ra;
    String aluno,curso;
    String disciplina;
    float nota1, nota2,nota3, nota4;

    public void entradaDados() {

        System.out.print("Digite o seu RA: ");
        ra = leia.nextInt();

        System.out.print("Digite o seu nome: ");
        aluno = leia.next();

        System.out.print("Digite o seu curso: ");
        curso = leia.next();

        System.out.print("Digite a sua disciplina: ");
        disciplina = leia.next();

        System.out.print("Digite a sua 1 nota: ");
        nota1 = leia.nextFloat();

        System.out.print("Digite a sua 2 nota: ");
        nota2 = leia.nextFloat();

        System.out.print("Digite a sua 3 nota: ");
        nota3 = leia.nextFloat();

        System.out.print("Digite a sua 4 nota: ");
        nota4 = leia.nextFloat();
    }

    public void entradaNotas() {

        while ((nota1 > 10) || (nota1 < 0)) {
            System.out.println("Digite outra 1 nota valida");
            nota1 = leia.nextFloat();
        }

        while ((nota2 > 10) || (nota2 < 0)) {
            System.out.println("Digite outra 2 nota valida");
            nota2 = leia.nextFloat();
        }

        while ((nota3 > 10) || (nota3 < 0)) {
            System.out.println("Digite outra 3 nota valida");
            nota3 = leia.nextFloat();
        }

        while ((nota4 > 10) || (nota4 < 0)) {
            System.out.println("Digite outra 4 nota valida");
            nota4 = leia.nextFloat();
        }
    }

    public static void main(String[] args) {

        Exe_1 obj_aluno = new Exe_1();
        obj_aluno.entradaDados();
        obj_aluno.entradaNotas();

    }

}
