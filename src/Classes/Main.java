/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Formularios.FormLogin;

/**
 *
 * @author virtual box
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        FormLogin login = new FormLogin(); //instanciando objeto JFrame para a Tela de Login
        login.setVisible(true); // tornando a JFrame Tela de Login visivel
        login.setLocationRelativeTo(null); // centralizando na tela o JFrame
    }
    
}
