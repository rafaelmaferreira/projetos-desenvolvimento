
import static com.sun.glass.ui.Cursor.setVisible;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
 import java.awt.Font;
 import java.awt.BorderLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
 import javax.swing.JFrame;
 import javax.swing.JRadioButtonMenuItem;
 import javax.swing.JCheckBoxMenuItem;
 import javax.swing.JOptionPane;
 import javax.swing.JLabel;
 import javax.swing.SwingConstants;
 import javax.swing.ButtonGroup;
 import javax.swing.JMenu;
 import javax.swing.JMenuItem;
 import javax.swing.JMenuBar;


public class FormModelo extends JFrame {
    
    private JButton botaoSair = new JButton ("Sair");
    
    public FormModelo ()
    {
        super ("Formulario Modelo");
        add (botaoSair);
        setVisible(true);
        pack();
        
    }
    
}
