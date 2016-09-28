package sp.senac.arquitetura;

import javax.ejb.Stateless;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miqueas.bsantos1
 */
@Stateless
public class LoginEJB implements LoginEJBLocal{
    @Override
    public boolean validarUsuario(String senha, String nome) {
        return (nome.equals("teste") && senha.equals("1234"));
    }
    
}
