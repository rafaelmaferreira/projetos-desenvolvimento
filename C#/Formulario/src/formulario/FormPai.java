/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

// Importando o JFrame
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Alan
 */
public class FormPai extends JFrame {
    
    private JToolBar toolBar;
    private JButton btnIncluir, btnAlterar, btnSair;
    public JPanel painel;
    private JTextField campoCodigo, campoNome, campoCPF, campoRG;
    private JLabel lblCodigo, lblNome, lblCPF, lblRG;
    
    public FormPai(){
        
        // Estipula o tamanho da janela
        setPreferredSize (new Dimension (600, 600));
        
        // Não deixa maximizar
        setResizable(false);
        
        // Seta o layout absoluto
        setLayout(null);
        
        // Adiciona os elementos na tela
        addCampos();
        
        // Reposiciona os elementos na tela
        pack();
        // Mostra a janela
        setVisible(true);
    }
    
    private void addCampos(){
        // Adiciona a JToolBar
        toolBar = new JToolBar("Barra de Botões");
        // Deixa ela fixa
        toolBar.setFloatable(false);
        // Mostra o Hover do botão
        toolBar.setRollover(true);
        // Seta a posição da JToolBar na tela
        toolBar.setBounds(0, 0, 600, 30);
        // Adiciona os Botões na JToolbar
        addButtons(toolBar);
        // Adiciona a JToolbar na tela
        add(toolBar);
        
        // Adiciona o JPanel
        painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(0, 30, 600, 570);
        
        // Adiciona o campo código
        lblCodigo = new JLabel("Código");
        lblNome = new JLabel("Nome");
        lblCPF = new JLabel("CPF");
        lblRG = new JLabel("RG");
        
        campoCodigo = new JTextField(5);
        campoNome = new JTextField(50);
        campoCPF = new JTextField(14);
        campoRG = new JTextField(11);
        
        painel.add(lblCodigo);
        painel.add(lblNome);
        painel.add(lblCPF);
        painel.add(lblRG);
        
        painel.add(campoCodigo);
        painel.add(campoNome);
        painel.add(campoCPF);
        painel.add(campoRG);
        
        add(painel);
        
        lblCodigo.setBounds(10, 10, 50, 20);
        lblNome.setBounds(10, 40, 50, 20);
        lblCPF.setBounds(10, 70, 50, 20);
        lblRG.setBounds(10, 100, 50, 20);
        
        campoCodigo.setBounds(70, 10, 100, 20);
        campoNome.setBounds(70, 40, 300, 20);
        campoCPF.setBounds(70, 70, 150, 20);
        campoRG.setBounds(70, 100, 130, 20);
    }
    
    private void addButtons(JToolBar toolBar) {
        btnIncluir = new JButton("Incluir");
        toolBar.add(btnIncluir);
        btnAlterar = new JButton("Alterar");
        toolBar.add(btnAlterar);
        btnSair = new JButton("Remover");
        toolBar.add(btnSair);
    }
    
}
