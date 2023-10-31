package eventos;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventosMouse extends JFrame {

    private JPanel mousePanel; // painel em que os eventos de mouse ocorrerão 
    private JLabel statusBar; // rótulo que exibe informações de evento

// construtor MouseTrackerFrame configura GUI e 
    // registra handlers de evento de mouse 
    public EventosMouse() {
        super("Demonstração de Eventos do Mouse");
        mousePanel = new JPanel(); // cria o painel 
        mousePanel.setBackground(Color.WHITE); // configura cor de fundo 
        add(mousePanel, BorderLayout.CENTER); // adiciona painel ao JFrame 
        
        statusBar = new JLabel("Mouse fora do JPanel");
        add(statusBar, BorderLayout.SOUTH); // adiciona rótulo ao JFrame
        // cria e registra listener para mouse e eventos de movimento 30 MouseHandler handler = new MouseHandler(); 
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }// fim do construtor de MouseTrackerFrame

    private class MouseHandler implements MouseListener,
            MouseMotionListener {

    // Handlers de evento de MouseListener 
        // trata evento quando o mouse é liberado logo depois de pressionado 
        public void mouseClicked(MouseEvent event) {
            statusBar.setText(String.format("Clicado em [%d, %d]",
                    event.getX(), event.getY()
        }

    

    ))
; 
 } // fim do método mouseClicked 43 44 // trata evento quando mouse é pressionado 
public void mousePressed(MouseEvent event) {
        statusBar.setText(String.format("Pressionado em [%d, %d]",
                event.getX(), event.getY()));
    } // fim do método mousePressed 
// trata evento quando mouse é liberado depois de arrastado

    public void mouseReleased(MouseEvent event) {
        statusBar.setText(String.format("Liberado em [%d, %d]",
                event.getX(), event.getY()));
    }
// fim do método mouseReleased

