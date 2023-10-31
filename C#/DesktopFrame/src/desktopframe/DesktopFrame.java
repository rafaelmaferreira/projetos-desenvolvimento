package desktopframe;

// Fig. 22.11: DesktopFrame.java
// Demonstrando JDesktopPane.
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class DesktopFrame extends JFrame {

    private JDesktopPane theDesktop;

    // configura a GUI
    public DesktopFrame() {
        super("Using a JDesktopPane");

        JMenuBar bar = new JMenuBar(); // cria a barra de menu
        JMenu addMenu = new JMenu("Add"); // cria o menu Add
        JMenuItem newFrame = new JMenuItem("Internal Frame");

        addMenu.add(newFrame); // adiciona um novo item de frame ao menu Add
        bar.add(addMenu); // adiciona o menu Add à barra de menus
        setJMenuBar(bar); // configura a barra de menus para esse aplicativo

        theDesktop = new JDesktopPane(); // cria o painel de área de trabalho
        add(theDesktop); // adiciona painel de área de trabalho ao frame

        // configura o ouvinte para o item de menu newFrame
        newFrame.addActionListener(
                new ActionListener() // classe interna anônima
                {
                    // exibe a nova janela interna
                    public void actionPerformed(ActionEvent event) {
                        // cria o frame interno
                        JInternalFrame frame = new JInternalFrame(
                                "Internal Frame", true, true, true, true);

                        MyJPanel panel = new MyJPanel(); // cria um novo painel
                        frame.add(panel, BorderLayout.CENTER); // adiciona o painel
                        frame.pack(); // configura frame interno de acordo c/ o tamanho do conteúdo
                        
                        theDesktop.add( frame ); // anexa frame interno
 frame.setVisible( true ); // mostra o frame interno
 } // fim do método actionPerformed
 } // fim da classe interna anÔnima
 ); // fim da chamada para addActionListener
 } // fim do construtor DesktopFrame
 } // fim da classe DesktopFrame

 // classe para exibir um ImageIcon em um painel
 class MyJPanel extends JPanel
 {
 private static Random generator = new Random();
 private ImageIcon picture; // imagem a ser exibida
 private String[] images = { "yellowflowers.png", "purpleflowers.png",
 "redflowers.png", "redflowers2.png", "lavenderflowers.png" };
 
 // carrega a imagem
 public MyJPanel()
 {
 int randomNumber = generator.nextInt( 5 );
 picture = new ImageIcon( images[ randomNumber ] ); // configura o ícone
 } // fim do construtor MyJPanel

 // exibe o imageIcon no painel
 public void paintComponent( Graphics g )
 {
 super.paintComponent( g );
 picture.paintIcon( this, g, 0, 0 ); // exibe o ícone
 } // fim do método paintComponent

 // retorna dimensões da imagem
 public Dimension getPreferredSize()
 {
 return new Dimension( picture.getIconWidth(),
 picture.getIconHeight() );
 } // fim do método getPreferredSize
 } // fim da classe MyJPanel