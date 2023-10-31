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
public class FormCliente extends FormPai {
    
    private JComboBox boxCurso, boxTurma;
    private JLabel lblCurso, lblTurma;
    private String[] arrCursos = { "Ciência da Computação", "Tecnologia da informação", "Sistema da informação", "Engenharia da Computação" }, arrTurma = { "1º Ano", "2º Ano", "3º Ano", "4º Ano" };
    
    public FormCliente(){
        
        setTitle("Cadastro de Aluno");
        
        adicionaCampos();
        
        // Reposiciona os elementos na tela
        pack();
        
    }
    
    private void adicionaCampos(){
        
        // Cria os campos
        boxCurso = new JComboBox(arrCursos);
        boxTurma = new JComboBox(arrTurma);
        lblCurso = new JLabel("Curso");
        lblTurma = new JLabel("Turma");
        
        // Adiciona os campos na tela para depois serem setadas as configurações
        painel.add(lblCurso);
        painel.add(lblTurma);
        painel.add(boxCurso);
        painel.add(boxTurma);
        
        // Action Listener dos Boxs
        boxCurso.addActionListener(boxCurso);
        boxTurma.addActionListener(boxTurma);
        
        // Seta as posições dos campos
        lblCurso.setBounds(10, 130, 50, 20);
        lblTurma.setBounds(10, 160, 50, 20);
        boxCurso.setBounds(70, 130, 200, 20);
        boxTurma.setBounds(70, 160, 100, 20);
        
    }
    
}
