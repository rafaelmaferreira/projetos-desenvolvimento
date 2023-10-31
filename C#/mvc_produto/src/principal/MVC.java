/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import conexao.CriaConexao;
import view.UsuarioView;

/**
 *
 * @author celio
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CriaConexao objconexao = new CriaConexao();
        UsuarioView usuarioview = new UsuarioView();
    }
    
}
