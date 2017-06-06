/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.User;
import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;
import infra.InfraException;
import infra.UserIF;

/**
 *
 * @author GM
 */
public class FachadaColaborador {
    
    private UserAdmin userm;
    private UserIF users;
    private User u;

    public FachadaColaborador(String Opt) throws LoginInvalidException, PasswordInvalidException, InfraException{
        if(Opt.compareTo("0") == 0){
            userm.addUserWorker(u.getLogin(), u.getSenha(), u.getNome(), u.getEndereco(), u.getTelefone());

        }
        else
            userm.removeUser(u.getNome());

    }

    public User service(ComandoIF c) throws Exception {
            User u = c.execute(users);
            return u;
    }

    public void desfazOperacao(MementoAtualizacao mem) throws Exception {
            ComandoIF c = mem.getEstado();
            if (c == null) {
                    System.out.println("Nenhuma operaÃ§Ã£o para desfazer!");
            }
            c.execute(users);
            mem.setEstado(null);
    }
}
