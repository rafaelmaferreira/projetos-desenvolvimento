/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Alan
 */
public class Menu extends JFrame {

    private JMenuBar barraMenu;
    private JMenu menuCadastro;
    private JMenuItem itemAluno, itemFuncionario;

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
        itemAluno = new JMenuItem("Cliente");
        itemAluno.setToolTipText("Cadastro de Clientes");
        itemAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FormCliente frmCliente = new FormCliente();
            }
        });
        itemFuncionario = new JMenuItem("Fornecedor");
        itemFuncionario.setToolTipText("Cadastro de Fornecedor");
        itemFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FormFornecedor frmFornecedor = new FormFornecedor();
            }

         
                

            }

            );
            menuCadastro.add (itemAluno);

            menuCadastro.add (itemFuncionario);

            barraMenu.add (menuCadastro);

            setJMenuBar(barraMenu);
        }
    
    }
