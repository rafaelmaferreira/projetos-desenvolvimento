package Trabalhob1;

import java.util.Scanner;

public class Receber extends Financeiro {
Scanner leia = new Scanner(System.in);


private String rec_cliente,rec_nf;

    public String getRec_cliente() {
        return rec_cliente;
    }

    public void setRec_cliente(String rec_cliente) {
        this.rec_cliente = rec_cliente;
    }

    public String getRec_nf() {
        return rec_nf;
    }

    public void setRec_nf(String rec_nf) {
        this.rec_nf = rec_nf;
    }

    public void texto(String texto){
        System.out.print(texto);
    }
    @Override
    public void entrada(){
        super.entrada();
        texto ("cliente:");
        setRec_cliente(leia.next());
        
        texto("NF: ");
        setRec_nf(leia.next());
    }
    @Override
    public void mostra(){
        super.mostra();
        texto("\ncliente: \n" + getRec_cliente());
        texto("\nNF" + getRec_nf());
    }
    
    public float calculo(float valor, float juros, float desconto) {
        float total;
        total = getFin_valor() + getFin_juros() - getFin_desconto();
        return total;
    }    
}
