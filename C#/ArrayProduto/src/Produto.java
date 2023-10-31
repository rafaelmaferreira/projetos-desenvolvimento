
import java.util.Scanner;

public class Produto {

    int codigo;
    String descricao;
    double estoque, preco, custo;

    public Produto() {
        codigo = 0;
        descricao = "";
        estoque = 0;
        preco = 0;
        custo = 0;
    }

    public void entrar() {
        Scanner leia = new Scanner(System.in);
        codigo = leia.nextInt();
        descricao = leia.next();
        estoque = leia.nextInt();
        preco = leia.nextInt();
        custo = leia.nextInt();
    }

    public void imprimir() {
        System.out.println("codigo" + codigo);
        System.out.println("descricao" + descricao);
        System.out.println("estoque" + estoque);
        System.out.println("preco" + preco);
        System.out.println("custo" + custo);
    }
}
