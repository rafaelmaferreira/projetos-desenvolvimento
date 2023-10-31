package Trabalhob1;

import java.util.Scanner;

public abstract class Juridica extends Pessoa {

    Scanner leia = new Scanner(System.in);

    private int pes_cnpj, pes_inscest;

    public int getPes_cnpj() {
        return pes_cnpj;
    }

    public void setPes_cnpj(int pes_cnpj) {
        this.pes_cnpj = pes_cnpj;
    }

    public int getPes_inscest() {
        return pes_inscest;
    }

    public void setPes_inscest(int pes_inscest) {
        this.pes_inscest = pes_inscest;
    }

    public void texto(String texto) {
        System.out.print(texto);
    }

    @Override
    public void entrada() {

        super.entrada();
        texto("cnpj: ");
        setPes_cnpj(leia.nextInt());

        texto("inscest: ");
        setPes_inscest(leia.nextInt());

    }
    @Override
    public void mostra() {
        
        super.mostra();
        texto("\ncnpj: \n" + getPes_cnpj());
        texto("\ncnpj: \n" + getPes_inscest());
        
    }

}
