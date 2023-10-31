package Trabalhob1;

import java.util.Scanner;

public class Menu {

    Scanner leia = new Scanner(System.in);

    private int op1;
    private String op2;
    

    Funcionario obj_funcionario = new Funcionario();
    Cliente obj_cliente = new Cliente();
    Fornecedor obj_fornecedor = new Fornecedor();
    Receber obj_receber = new Receber();
    Pagar obj_pagar = new Pagar();

    public void texto(String texto) {
        System.out.print(texto);
    }

    public void metodoMenu() {
int op3 = 0;
while(op3<=0){
        texto("\n1. Cadastro de funcionarios\n"
                + "2. Cadastro de Clientes\n"
                + "3. Cadastro de fornecedores\n"
                + "4. Contas a receber\n"
                + "5. Contas a pagar\n"
                + "6. Fluxo de caixa\n"
                + "7. Sair\n"
                + "Digite a opcao desejada: \n");

        op1 = leia.nextInt();

        switch (op1) {

            case 1:
                texto("a. Incluir\n"
                        + "b. Alterar\n"
                        + "c. Consultar\n"
                        + "d. Excluir\n");
                op2 = leia.next();
                switch (op2) {
                    case "a":
                        obj_funcionario.entrada();
                        break;
                    case "b":
                        obj_funcionario.entrada();
                        break;
                    case "c":
                        obj_funcionario.mostra();
                        break;
                    case "d":
                        obj_funcionario = new Funcionario();
                        break;
                }
                break;
            case 2:
                texto("a. Incluir\n"
                        + "b. Alterar\n"
                        + "c. Consultar\n"
                        + "d. Excluir\n");
                op2 = leia.next();
                switch (op2) {
                    case "a":
                        obj_cliente.entrada();
                        break;
                    case "b":
                        obj_cliente.entrada();
                        break;
                    case "c":
                        obj_cliente.mostra();
                        break;
                    case "d":
                        obj_cliente = new Cliente();
                        break;
                }
                break;
            case 3:
                texto("a. Incluir\n"
                        + "b. Alterar\n"
                        + "c. Consultar\n"
                        + "d. Excluir\n");
                op2 = leia.next();
                switch (op2) {
                    case "a":
                        obj_fornecedor.entrada();
                        break;
                    case "b":
                        obj_fornecedor.entrada();
                        break;
                    case "c":
                        obj_fornecedor.mostra();
                        break;
                    case "d":
                        obj_fornecedor = new Fornecedor();
                        break;
                }
                break;
            case 4:
                texto("a. Incluir\n"
                        + "b. Alterar\n"
                        + "c. Consultar\n"
                        + "d. Excluir\n");
                op2 = leia.next();
                switch (op2) {
                    case "a":
                        obj_receber.entrada();
                        break;
                    case "b":
                        obj_receber.entrada();
                        break;
                    case "c":
                        obj_receber.mostra();
                        break;
                    case "d":
                        obj_receber = new Receber();
                        break;
                }
                break;
            case 5:
                texto("a. Incluir\n"
                        + "b. Alterar\n"
                        + "c. Consultar\n"
                        + "d. Excluir\n");
                op2 = leia.next();
                switch (op2) {
                    case "a":
                        obj_pagar.entrada();
                        break;
                    case "b":
                        obj_pagar.entrada();
                        break;
                    case "c":
                        obj_pagar.mostra();
                        break;
                    case "d":
                        obj_pagar = new Pagar();
                        break;
                }
                break;
            case 6:
                texto("VAZIO");
                break;
            case 7:
                op3=1;
                break;
        }

        }

    }

}
