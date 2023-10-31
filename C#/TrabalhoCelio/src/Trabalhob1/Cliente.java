package Trabalhob1;

import java.util.Scanner;

public class Cliente extends Juridica {

    Scanner leia = new Scanner(System.in);

    private int cli_limitecredito;
    private String cli_cobr_endereco, cli_cobr_bairro, cli_cobr_uf, cli_cobr_cidade, cli_cobr_cep;

    public int getCli_limitecredito() {
        return cli_limitecredito;
    }

    public void setCli_limitecredito(int cli_limitecredito) {
        this.cli_limitecredito = cli_limitecredito;
    }

    public String getCli_cobr_endereco() {
        return cli_cobr_endereco;
    }

    public void setCli_cobr_endereco(String cli_cobr_endereco) {
        this.cli_cobr_endereco = cli_cobr_endereco;
    }

    public String getCli_cobr_bairro() {
        return cli_cobr_bairro;
    }

    public void setCli_cobr_bairro(String cli_cobr_bairro) {
        this.cli_cobr_bairro = cli_cobr_bairro;
    }

    public String getCli_cobr_uf() {
        return cli_cobr_uf;
    }

    public void setCli_cobr_uf(String cli_cobr_uf) {
        this.cli_cobr_uf = cli_cobr_uf;
    }

    public String getCli_cobr_cidade() {
        return cli_cobr_cidade;
    }

    public void setCli_cobr_cidade(String cli_cobr_cidade) {
        this.cli_cobr_cidade = cli_cobr_cidade;
    }

    public String getCli_cobr_cep() {
        return cli_cobr_cep;
    }

    public void setCli_cobr_cep(String cli_cobr_cep) {
        this.cli_cobr_cep = cli_cobr_cep;
    }

    public void texto(String texto) {
        System.out.print(texto);

    }

    @Override
    public void entrada() {
        super.entrada();
        texto("Limite de crédito: ");
        setCli_limitecredito(leia.nextInt());

    }

    @Override
    public void mostra() {
        super.mostra();
        texto("\nLimite de crédito\n" + getCli_limitecredito());
        texto("\nEndereço\n" + getCli_cobr_endereco());
        texto("\nbairro\n" + getCli_cobr_bairro());
        texto("\nUF\n" + getCli_cobr_uf());
        texto("\ncidade\n" + getCli_cobr_cidade());
        texto("\nCEP\n" + getCli_cobr_cep());

    }
}
