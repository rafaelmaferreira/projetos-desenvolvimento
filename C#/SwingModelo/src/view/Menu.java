
package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Menu extends JFrame {

    private JMenuBar barraMenu;
    private JMenu menuCadastro, menuMovimento, menuSair;
    private JMenuItem itemCliente, itemFuncionario, itemFormapag, itemUsuario, itemCompra, itemVenda,itemSair;

    public Menu() {
        // Estipula o tamanho da janela
        setPreferredSize(new Dimension(600, 600));

        setResizable(false);

        // Seta o layout absoluto
        setLayout(null);

        // Define o titulo
        setTitle("Sistema");

        // Adiciona o menu
        criaMenu();

        // Reposiciona os elementos na tela
        pack();
        // Seta a operação ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Mostra a janela
        setVisible(true);
    }

    private void criaMenu() {
        barraMenu = new JMenuBar();
        
        menuCadastro = new JMenu("Cadastro");
        menuMovimento = new JMenu("Movimento");
        menuSair = new JMenu("Sair");
        
        
        itemCliente = new JMenuItem("Cliente");
        itemCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FormCliente frmCliente = new FormCliente();
            }
        });
        itemFuncionario = new JMenuItem("Fornecedor");
        itemFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FormFornecedor frmFornecedor = new FormFornecedor();
            }

        });
        
        itemFormapag = new JMenuItem("Forma de pagamento");
        itemFormapag.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FormPagamento frmpag = new FormPagamento();
            }

        });
        
        itemUsuario = new JMenuItem("Usuário");
        itemUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FormUsuario frmusuario = new FormUsuario();
            }

        });
        
        itemVenda = new JMenuItem("Venda");
        itemVenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FormVenda frmvenda = new FormVenda();
            }

        });
        
        itemCompra = new JMenuItem("Compra");
        itemCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FormCompra frmcompra = new FormCompra();
            }

        });
        
         itemSair = new JMenuItem("Sair");
        itemSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
       
        
        
        barraMenu.add(menuCadastro);
        
        menuCadastro.add(itemCliente);

        menuCadastro.add(itemFuncionario);
        
        menuCadastro.add(itemFormapag);
        
        menuCadastro.add(itemUsuario);

        barraMenu.add(menuMovimento);
        
        menuMovimento.add(itemVenda);

        menuMovimento.add(itemCompra);
        
        barraMenu.add(menuSair);
        
        menuSair.add(itemSair);
        
        setJMenuBar(barraMenu);
    }

}
