
import java.awt.*;
import javax.swing.*;

public class ProgJanelas extends JFrame {

    private JLabel lblTitulo, lblRA, lblNome;
    private JTextField edtRA, edtNome;

    public ProgsJanelas() {
        setTitle("Exemplo de Componentes Swing em Java"); // título do frame
        setPreferredSize(new Dimension(600, 277)); // ajuste do tamanho e layout
        setLayout(null); // aqui a definicao para utilizacao de layout absoluto

        CriarComponentes(); // instancia componentes (objetos Swing);
        AdicionarComponentes(); // adiciona componentes no frame
        ConfigurarPosicoes(); // configura as posices dos componentes;
        pack(); // reorganiza os componentes (objetos) no frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // deixa o frame visível
    }

    public void CriarComponentes() {
        lblTitulo = new JLabel("Utilizacao de Componentes Swing em Java");
        lblRA = new JLabel("R.A."); // Label do R.A.
        edtRA = new JTextField(5); // TextField do R.A.
        
        lblNome = new JLabel("Nome"); // Label do Nome
        edtNome = new JTextField(50); // TextField do Nome
    }

    public void AdicionarComponentes() {
        add(lblTitulo); // adiciona o Label do Título no Frame
        add(lblRA); // adiciona o Label do RA no Frame
        add(lblNome); // adiciona o Label do Nome no Frame
        add(edtRA); // adiciona o TextField do RA no Frame
        add(edtNome); // adiciona o TextField do Nome no Frame
    }

    private void ConfigurarPosicoes() {
// Setbounds( posicao x, posicao y, largura, algura )
        lblTitulo.setBounds(115, 15, 225, 20);
        lblRA.setBounds(25, 55, 100, 25);
        lblNome.setBounds(15, 90, 100, 25);

        edtRA.setBounds(55, 55, 375, 25);
        edtNome.setBounds(55, 90, 375, 25);
    }

    public static void main(String[] args) {
        ProgsJanelas obj = new ProgsJanelas();
    }
}
