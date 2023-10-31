package eventos; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class TrataEventoComponente extends JFrame implements ActionListener {

    private JButton botaoOK, botaoCancela;

    public TrataEventoComponente(JButton botaoOK, JButton botaoCancela) {
        this.botaoOK = botaoOK;
        this.botaoCancela = botaoCancela;
    }

    @Override

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botaoOK) {
            JOptionPane.showMessageDialog(null, "botão OK foi clicado");
        }

        if (evento.getSource() == botaoCancela) {
            JOptionPane.showMessageDialog(null, "botão CANCELA foi clicado");
        }
    } 
// fim do método actionPerformed 27 } // fim da classe TrataEventoComponente
