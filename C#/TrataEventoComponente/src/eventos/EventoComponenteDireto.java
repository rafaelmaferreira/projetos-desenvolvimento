package eventos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class EventoComponenteDireto extends JFrame {

    private JButton btnOK = new JButton("OK");
    private JButton btnCancela = new JButton("Cancela");
    private TrataEventoComponente evento;

    public EventoComponenteDireto() {
        super("Tratamento de Eventos de Componentes");
        setLayout(new FlowLayout());
        add(btnOK);
        add(btnCancela);// adicionando tratamento de evento ao botao OK  
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicou no Botão OK", "Tratamento de Evento", JOptionPane.WARNING_MESSAGE);
            }
        }
        );

        //
        // adicionando tratamento de evento ao botao CANCELAR 
        btnCancela.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event
                    ) {
                        JOptionPane.showMessageDialog(null, "Clicou no Botão CANCELA", "Tratamento de Evento", JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                    }
                }
        );

    }

    public static void main(String[] args) {
        EventoComponenteDireto obj = new EventoComponenteDireto();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(350, 200);
        obj.setLocation(300, 300);
        obj.setVisible(true);
    }
}
