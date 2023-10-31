package Trabalhob1;

import java.util.Scanner;

public class Fornecedor extends Juridica{

    Scanner leia = new Scanner(System.in);

    private String for_contato, for_site, for_dtcadastro;
    private int for_limitecompra;

    public String getFor_contato() {
        return for_contato;
    }

    public void setFor_contato(String for_contato) {
        this.for_contato = for_contato;
    }

    public String getFor_site() {
        return for_site;
    }

    public void setFor_site(String for_site) {
        this.for_site = for_site;
    }

    public String getFor_dtcadastro() {
        return for_dtcadastro;
    }

    public void setFor_dtcadastro(String for_dtcadastro) {
        this.for_dtcadastro = for_dtcadastro;
    }

    public int getFor_limitecompra() {
        return for_limitecompra;
    }

    public void setFor_limitecompra(int for_limitecompra) {
        this.for_limitecompra = for_limitecompra;
    }

    public void texto(String texto) {
        System.out.print(texto);
    }
    
    @Override
    public void entrada() {

        super.entrada();
        texto("contato: ");
        setFor_contato(leia.next());
        
        texto("site: ");
        setFor_site(leia.next());
        
        texto("dtcadastro: ");
        setFor_dtcadastro(leia.next());
        
        texto("limite compra: ");
        setFor_limitecompra(leia.nextInt());

    }
    @Override
    public void mostra() {
        
        super.mostra();
        texto("\ncontato: \n" + getFor_contato());
        texto("\nsite: \n" + getFor_site());
        texto("\ndata cadastro: \n" + getFor_dtcadastro());
        texto("\nlimite compra: \n" + getFor_limitecompra());
        
    }

}
