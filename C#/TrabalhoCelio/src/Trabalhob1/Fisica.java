package Trabalhob1;

import java.util.Scanner;

public abstract class Fisica extends Pessoa {

    Scanner leia = new Scanner(System.in);

    private int pes_rg, pes_cpf;

    public int getPes_rg() {
        return pes_rg;
    }

    public void setPes_rg(int pes_rg) {
        this.pes_rg = pes_rg;
    }

    public int getPes_cpf() {
        return pes_cpf;
    }

    public void setPes_cpf(int pes_cpf) {
        this.pes_cpf = pes_cpf;
    }

    public void texto(String texto) {
        System.out.print(texto);
    }

    @Override
    public void entrada() {
        
        super.entrada();
        texto("rg: ");
        setPes_rg(leia.nextInt());

        texto("cpf: ");
        setPes_cpf(leia.nextInt());

    }

    @Override
    public void mostra() {

        super.mostra();
        texto("\nrg: \n" + getPes_rg());
        texto("\ncpf: \n" + getPes_cpf());

    }

}
