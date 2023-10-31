package projeto_vendas.menu;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class Menu extends JFrame{
    // Menu
    JMenuBar menubar = new JMenuBar ();
        JMenu menuCad= new JMenu ("Cadastros");
            JMenuItem menuCadFunc = new JMenuItem ("Funcionários");
            JMenuItem menuCadAlu = new JMenuItem ("Alunos");
            JMenuItem menuCadProf = new JMenuItem ("Professores");
        
        JMenu menuMov= new JMenu ("Movimentos");
            JMenuItem menuMovMatr = new JMenuItem ("Matrícula");
            JMenuItem menuMovMens = new JMenuItem ("Mensalidades");
        
        JMenu menuFin= new JMenu ("Financeiro");
            JMenuItem menuFinContR = new JMenuItem ("Contas a Receber");
            JMenuItem menuFinContP = new JMenuItem ("Contas a Pagar");
            JMenuItem menuFinFluCx = new JMenuItem ("Fluxo de Caixa");
            
        JMenu menuSair= new JMenu ("Sair");
        
    public Menu(){
        super("Projeto de Vendas >> Menu");
        menubar.add(menuCad);
        menubar.add(menuMov);
        menubar.add(menuFin);
        menubar.add(menuSair);
        
        menuCad.add(menuCadFunc);
        menuCad.add(menuCadAlu);
        menuCad.add(menuCadProf);
        
        menuMov.add(menuMovMatr);
        menuMov.add(menuMovMens);
        
        menuFin.add(menuFinContR);
        menuFin.add(menuFinContP);
        menuFin.add(menuFinFluCx);
        
        this.setJMenuBar(menubar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(660,390);
        this.setResizable(false);
        this.setVisible(true);
    }
}
