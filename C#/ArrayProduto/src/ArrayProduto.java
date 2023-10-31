
public class ArrayProduto {

    public static void main(String[] args) {
        Produto[] arrayprod = new Produto[20];
        for (int i = 0; i < 20; i++) {
            arrayprod[i] = new Produto();
            arrayprod[i].entrar();
            arrayprod[i].imprimir();
        }
    }
}
