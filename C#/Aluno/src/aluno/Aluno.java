package aluno;

import java.util.Scanner;



public class Aluno {   
    
    int alu_codigo;
    int alu_cpf;
    String alu_rg;
    String alu_nome;
    String alu_endereco;
    int alu_numero;
    String alu_complemento;
    String alu_bairro;
    String alu_cidade;
    String alu_estado;
    String alu_telefone;
    String alu_celular;
    String alu_email;
    float alu_salario;
    String alu_masculino;
    
    public void entradaAluno()
    {
        Scanner leia = new Scanner (System.in);
        
        System.out.print("Codigo: ");
        alu_codigo= leia.nextInt();
        
        System.out.print("Digite o seu CPF: ");
        alu_cpf= leia.nextInt();
        
        System.out.print("Digite o seu RG: ");
        alu_rg= leia.next();

        System.out.print("Digite o seu nome: ");
        alu_nome= leia.next();
        
        System.out.print("Digite o seu endereco");
        alu_endereco= leia.next();
        
        System.out.print("Digite o seu numero");
        alu_numero= leia.nextInt();
        
        System.out.print("Digite o seu Complemento: ");
        alu_complemento= leia.next();
        
        System.out.print("Digite o seu bairro");
        alu_bairro= leia.next();
        
        System.out.print("Diigite a sua cidade: ");
        alu_cidade= leia.next();
        
        System.out.print("Diigte o seu estado: ");
        alu_estado= leia.next();
        
        System.out.print("Digite o seu telefone: ");
        alu_telefone= leia.next();
        
        System.out.print("Digite o seu celular");
        alu_celular= leia.next();
        
        System.out.print("Digite o seu email: ");
        alu_email= leia.next();
        
        System.out.print("Digite o seu salario: ");
        alu_salario= leia.nextFloat();
        
        System.out.print("Qual e o seu sexo? ");
        alu_masculino= leia.next();
        
    }

public void imprimeAluno()
    {
                
        System.out.print("Codigo:"+ alu_codigo);        
        System.out.print("CPF:"+alu_cpf);        
        System.out.print("RG:"+alu_rg);
        System.out.print("nome:"+alu_nome);        
        System.out.print("endereco"+alu_endereco);
        System.out.print("numero"+alu_numero);
        System.out.print("Complemento:"+alu_complemento);
        System.out.print("bairro"+alu_bairro);
        System.out.print("cidade:"+alu_cidade);      
        System.out.print("estado:"+alu_estado);       
        System.out.print("telefone:"+alu_telefone);
        System.out.print("celular"+alu_celular);
        System.out.print("email:"+alu_email);
        System.out.print("salario:"+alu_salario);        
        System.out.print("sexo"+alu_masculino);
        
    }

    public static void main(String[] args) {
        
       Aluno obj_aluno= new Aluno();
       obj_aluno.entradaAluno();
       obj_aluno.imprimeAluno();
        
    }
    
}
