package Trabalhob1;

import java.util.Scanner;

public abstract class Financeiro {

    Scanner leia = new Scanner(System.in);

    private int fin_codigo, fin_numero;
    private String fin_emissao, fin_vencimento, fin_pagamento, fin_historico;
    private float fin_valor, fin_juros, fin_desconto;

    public int getFin_codigo() {
        return fin_codigo;
    }

    public void setFin_codigo(int fin_codigo) {
        this.fin_codigo = fin_codigo;
    }

    public int getFin_numero() {
        return fin_numero;
    }

    public void setFin_numero(int fin_numero) {
        this.fin_numero = fin_numero;
    }

    public String getFin_emissao() {
        return fin_emissao;
    }

    public void setFin_emissao(String fin_emissao) {
        this.fin_emissao = fin_emissao;
    }

    public String getFin_vencimento() {
        return fin_vencimento;
    }

    public void setFin_vencimento(String fin_vencimento) {
        this.fin_vencimento = fin_vencimento;
    }

    public String getFin_pagamento() {
        return fin_pagamento;
    }

    public void setFin_pagamento(String fin_pagamento) {
        this.fin_pagamento = fin_pagamento;
    }

    public String getFin_historico() {
        return fin_historico;
    }

    public void setFin_historico(String fin_historico) {
        this.fin_historico = fin_historico;
    }

    public float getFin_valor() {
        return fin_valor;
    }

    public void setFin_valor(float fin_valor) {
        this.fin_valor = fin_valor;
    }

    public float getFin_juros() {
        return fin_juros;
    }

    public void setFin_juros(float fin_juros) {
        this.fin_juros = fin_juros;
    }

    public float getFin_desconto() {
        return fin_desconto;
    }

    public void setFin_desconto(float fin_desconto) {
        this.fin_desconto = fin_desconto;
    }

    public void texto(String texto) {
        System.out.print(texto);
    }
  
    public void entrada() {

        texto("codigo: ");
        setFin_codigo(leia.nextInt());

        texto("numero: ");
        setFin_numero(leia.nextInt());

        texto("emissao: ");
        setFin_emissao(leia.next());

        texto("vencimento: ");
        setFin_vencimento(leia.next());

        texto("pagamento: ");
        setFin_pagamento(leia.next());

        texto("historico: ");
        setFin_historico(leia.next());

        texto("valor: ");
        setFin_valor(leia.nextFloat());

        texto("juros: ");
        setFin_juros(leia.nextFloat());

        texto("desconto: ");
        setFin_desconto(leia.nextFloat());

    }

    public void mostra() {

        texto("\ncodigo: \n" + getFin_codigo());
        texto("\nnumero: \n" + getFin_numero());
        texto("\nemissao: \n" + getFin_emissao());
        texto("\nvencimento: \n" + getFin_vencimento());
        texto("\npagamento: \n" + getFin_pagamento());
        texto("\nhistorico: \n" + getFin_historico());
        texto("\nvalor: \n" + getFin_valor());
        texto("\njuros: \n" + getFin_juros());
        texto("\ndesconto: \n" + getFin_desconto());

    }

}
