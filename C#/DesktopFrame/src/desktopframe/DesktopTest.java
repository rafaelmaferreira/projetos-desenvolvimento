package desktopframe;

// Fig. 22.12: DesktopTest.java
// Demonstrando JDesktopPane.
import javax.swing.JFrame;

public class DesktopTest {

    public static void main(String args[]) {
        DesktopFrame desktopFrame = new DesktopFrame();
        desktopFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        desktopFrame.setSize(600, 480); // configura o tamanho do frame
        desktopFrame.setVisible(true); // exibe o frame
    } // fim do main
} // fim da classe DesktopTest
