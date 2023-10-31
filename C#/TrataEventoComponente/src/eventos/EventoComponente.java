package eventos;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class EventoComponente extends JFrame {

    private JButton btnOK = new JButton("OK");
    private JButton btnCancela = new JButton("Cancela");
    private TrataEventoComponente evento;

    public EventoComponente() {
        super("Tratamento de Eventos de Componentes");
        setLayout(new FlowLayout());
        evento = new TrataEventoComponente(btnOK, btnCancela);
        btnOK.addActionListener(evento);
        add(btnOK);
        btnCancela.addActionListener(evento);
        add(btnCancela);
    }

    public static void main(String[] args) {
        EventoComponente obj = new EventoComponente();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(350, 200);
        obj.setLocation(300, 300);
        obj.setVisible(true);
    }


 }
