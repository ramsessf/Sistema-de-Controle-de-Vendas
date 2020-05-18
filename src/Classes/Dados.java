/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author virtual box
 */
public class Dados {
    
    public boolean validarDados(String usuario, String senha){
        if(usuario.equals("ramsessf") && senha.equals("123")){
        return true;   
        
        }else{
        return false;    
        }
    }
}
