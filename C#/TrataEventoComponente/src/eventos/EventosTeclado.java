package eventos;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class EventosTeclado extends JFrame implements KeyListener {

    private String line1 = ""; // primeira linha de textarea 
    private String line2 = ""; // segunda linha de textarea 
    private String line3 = ""; // terceira linha de textarea 
    private JTextArea textArea; // textarea a exibir saída 
    // construtor KeyDemoFrame 
    public EventosTeclado() { 
    super("Demonstrando Eventos de Teclado em Java"); 
    textArea  = new JTextArea(10, 15); // configura JTextArea 
    textArea.setText ("Pressione uma tecla..."); 
    textArea.setEnabled (false); // desativa textarea 
    textArea.setDisabledTextColor (Color.BLACK); // configura cor de texto 
    add(textArea); // adiciona textarea ao JFrame

    addKeyListener(



this); // permite que o frame processe os eventos de teclado
    
    } // fim do construtor KeyDemoFrame 
// trata o pressionamento de qualquer tecla 
public void keyPressed(KeyEvent event) { 
line1 = String.format("Tecla pressionada: %s", 
event.getKeyText(event.getKeyCode()));
} // gera saída de tecla pressionada 
setLines2and3(event); // configura a saída das linhas dois e três 
} // fim do método keyPressed 
// trata liberação de qualquer tecla 
public void keyReleased(KeyEvent event) { 
line1 = String.format("Tecla liberada: %s", 
event.getKeyText(event.getKeyCode())); // gera saída de tecla liberada 
setLines2and3(event); // configura a saída das linhas dois e três
