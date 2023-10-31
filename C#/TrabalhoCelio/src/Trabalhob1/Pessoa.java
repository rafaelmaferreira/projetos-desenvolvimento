package Trabalhob1;

import java.util.Scanner;

public abstract class Pessoa {

    Scanner leia = new Scanner(System.in);

    private int pes_codigo;
    private String pes_nome, pes_endereco, pes_bairro, pes_cidade, pes_uf, pes_cep, pes_email, pes_celular, pes_fone;

    public int getPes_codigo() {
        return pes_codigo;
    }

    public void setPes_codigo(int pes_codigo) {
        this.pes_codigo = pes_codigo;
    }

    public String getPes_nome() {
        return pes_nome;
    }

    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public String getPes_endereco() {
        return pes_endereco;
    }

    public void setPes_endereco(String pes_endereco) {
        this.pes_endereco = pes_endereco;
    }

    public String getPes_bairro() {
        return pes_bairro;
    }

    public void setPes_bairro(String pes_bairro) {
        this.pes_bairro = pes_bairro;
    }

    public String getPes_cidade() {
        return pes_cidade;
    }

    public void setPes_cidade(String pes_cidade) {
        this.pes_cidade = pes_cidade;
    }

    public String getPes_uf() {
        return pes_uf;
    }

    public void setPes_uf(String pes_uf) {
        this.pes_uf = pes_uf;
    }

    public String getPes_cep() {
        return pes_cep;
    }

    public void setPes_cep(String pes_cep) {
        this.pes_cep = pes_cep;
    }

    public String getPes_email() {
        return pes_email;
    }

    public void setPes_email(String pes_email) {
        this.pes_email = pes_email;
    }

    public String getPes_celular() {
        return pes_celular;
    }

    public void setPes_celular(String pes_celular) {
        this.pes_celular = pes_celular;
    }

    public String getPes_fone() {
        return pes_fone;
    }

    public void setPes_fone(String pes_fone) {
        this.pes_fone = pes_fone;
    }

    public void texto(String texto) {
        System.out.print(texto);
    }

    public void entrada() {

        texto("codigo: ");
        setPes_codigo(leia.nextInt());
        
        texto("nome: ");
        setPes_nome(leia.next());
        
        texto("endereço: ");
        setPes_endereco(leia.next());
        
        texto("bairro: ");
        setPes_bairro(leia.next());
        
        texto("cidade: ");
        setPes_cidade(leia.next());
        
        texto("uf: ");
        setPes_uf(leia.next());
        
        texto("cep: ");
        setPes_cep(leia.next());
        
        texto("email: ");
        setPes_email(leia.next());
        
        texto("celular: ");
        setPes_celular(leia.next());
        
        texto("fone: ");
        setPes_fone(leia.next());
    }
    
    public void mostra() {
        
        texto("\ncodigo: \n" + getPes_codigo());
        texto("\nnome: \n" + getPes_nome());
        texto("\nendereço: \n" + getPes_endereco());
        texto("\nbairro: \n" + getPes_bairro());
        texto("\ncidade: \n" + getPes_cidade());
        texto("\nuf: \n" + getPes_uf());
        texto("\ncep: \n" + getPes_cep());
        texto("\nemail: \n" + getPes_email());
        texto("\ncelular: \n" + getPes_celular());
        texto("\nfone: \n" + getPes_fone());
        
    }

}
