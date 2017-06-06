/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.control.UserAdmin;
import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;
import infra.InfraException;

/**
 *
 * @author GM
 */
public class Prototype {
    
    UserCliente u;
    UserAdmin um;
    
    
    public Prototype() throws LoginInvalidException, PasswordInvalidException, InfraException{
        UserColaborador uw = new UserColaborador();
        um.addUserWorker(u.getLogin(), u.getSenha(), u.getNome(), u.getEndereco(), u.getTelefone());
        um.removeUser(u.getNome());
    }
}
