package Trabalhob1;

import java.util.Scanner;

public class Funcionario extends Fisica{

    Scanner leia = new Scanner(System.in);

    private String fun_ctps, fun_dtadmissao, fun_dtdemissao;
    private float fun_salario;

    public String getFun_ctps() {
        return fun_ctps;
    }

    public void setFun_ctps(String fun_ctps) {
        this.fun_ctps = fun_ctps;
    }

    public String getFun_dtadmissao() {
        return fun_dtadmissao;
    }

    public void setFun_dtadmissao(String fun_dtadmissao) {
        this.fun_dtadmissao = fun_dtadmissao;
    }

    public String getFun_dtdemissao() {
        return fun_dtdemissao;
    }

    public void setFun_dtdemissao(String fun_dtdemissao) {
        this.fun_dtdemissao = fun_dtdemissao;
    }

    public float getFun_salario() {
        return fun_salario;
    }

    public void setFun_salario(float fun_salario) {
        this.fun_salario = fun_salario;
    }

 

    public void texto(String texto){
        System.out.print(texto);
    }
    
    @Override
    public void entrada() {
        
        super.entrada();
        texto("ctps: ");
        setFun_ctps(leia.next());
        
        texto("salario: ");
        setFun_salario(leia.nextFloat());
        
        texto("data admissao: ");
        setFun_dtadmissao(leia.next());
        
        texto("data demissao: ");
        setFun_ctps(leia.next());
        
    }
    @Override
    public void mostra(){
        
        super.mostra();
        texto("\nctps: \n" + getFun_ctps());
        texto("\nsalario: \n" + getFun_salario());
        texto("\ndtadmissao: \n" + getFun_dtadmissao());
        texto("\ndtdemissao: \n" + getFun_dtdemissao());
    }
}
