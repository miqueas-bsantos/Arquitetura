package sp.senac.arquitetura;


import javax.ejb.Local;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miqueas.bsantos1
 */
@Local
public interface LoginEJBLocal {
    
    public boolean validarUsuario(String senha, String nome);
    
}
