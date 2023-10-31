package Trabalhob1;

import java.util.Scanner;

public class Pagar extends Financeiro {

    Scanner leia = new Scanner(System.in);

    private String pag_fornecedor, pag_boleto;

    public String getPag_fornecedor() {
        return pag_fornecedor;
    }

    public void setPag_fornecedor(String pag_fornecedor) {
        this.pag_fornecedor = pag_fornecedor;
    }

    public String getPag_boleto() {
        return pag_boleto;
    }

    public void setPag_boleto(String pag_boleto) {
        this.pag_boleto = pag_boleto;
    }

    public void texto(String texto) {
        System.out.print(texto);
    }

    @Override
    public void entrada() {
        super.entrada();
        texto("fornecedor: ");
        setPag_fornecedor(leia.next());

        texto("boleto: ");
        setPag_boleto(leia.next());

    }

    @Override
    public void mostra() {
        super.mostra();
        texto("\nfornecedor: \n" + getPag_fornecedor());
        texto("\nBoleto: \n" + getPag_boleto());
    }

    public float calculo(float valor, float juros, float desconto) {
        float total;
        total = getFin_valor() + getFin_juros() - getFin_desconto();
        return total;
    }
}
