/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Alan
 */
public class FormFuncionario extends FormPai {
    private JComboBox boxCargo;
    private JRadioButton radioChefeSim, radioChefeNao;
    private ButtonGroup grupoChefe;
    private JTextField campoSalario;
    private JLabel lblCargo, lblChefe, lblSalario;
    private String[] arrCargos = { "Professor", "Coordenador", "Diretor", "Técnico" };
    
    public FormFuncionario(){
        
        setTitle("Cadastro de Funcionário");
        
        adicionaCampos();
        
        // Reposiciona os elementos na tela
        pack();
        
    }
    
    private void adicionaCampos(){
        
        // Cria os campos
        lblCargo = new JLabel("Cargo");
        lblChefe = new JLabel("Chefe");
        lblSalario = new JLabel("Salário");
        boxCargo = new JComboBox(arrCargos);
        radioChefeSim = new JRadioButton("Sim", false);
        radioChefeNao = new JRadioButton("Não", true);
        grupoChefe = new ButtonGroup();
        campoSalario = new JTextField();
        
        // Adiciona os campos na tela para depois serem setadas as configurações
        painel.add(lblCargo);
        painel.add(boxCargo);
        painel.add(lblChefe);
        painel.add(radioChefeSim);
        painel.add(radioChefeNao);
        painel.add(lblSalario);
        painel.add(campoSalario);
        
        // Seta as posições dos campos
        lblCargo.setBounds(10, 130, 50, 20);
        lblChefe.setBounds(10, 160, 50, 20);
        lblSalario.setBounds(10, 220, 50, 20);
        boxCargo.setBounds(70, 130, 150, 20);
        radioChefeSim.setBounds(70, 160, 50, 20);
        radioChefeNao.setBounds(70, 190, 50, 20);
        campoSalario.setBounds(70, 220, 100, 20);
        
        // Action Listener do BoxCargo
        boxCargo.addActionListener(boxCargo);
        
        // Adiciona as opções do Radio
        grupoChefe.add(radioChefeSim);
        grupoChefe.add(radioChefeNao);
        
    }
    
}
