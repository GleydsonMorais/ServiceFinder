/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.ServicoState;
import business.model.User;
import business.model.UserCliente;
import business.model.UserColaborador;
import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;
import business.util.UserValidador;
import infra.InfraException;
import infra.UserFile;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author GM
 */
public class UserAdmin {
    
    private Map<String, User> users;
    UserFile userFile;
    protected ServicoState state;

    public UserAdmin() {		
            userFile = new UserFile();
            try {
                users = (Map<String, User>) userFile.loadUsers();
            } catch (InfraException e) {
                    UserFile.logger.log(Level.FINE, e.getMessage());
            } 
    }

    public void addUserUser(String email, String pass, String name, String end, String telefone) throws LoginInvalidException, PasswordInvalidException {
            UserValidador.validateName(name);
            UserValidador.validatePassword(pass);
            User user = new UserCliente();
            user.login = email;
            user.senha = pass;
            user.nome = name;
            user.endereco = end;
            user.telefone = telefone;

            users.put(user.login, user);
            userFile.saveUsers(users);
    }   
    
    public void addUserWorker(String email, String pass, String name, String end, String telefone) throws LoginInvalidException, PasswordInvalidException {
            UserValidador.validateName(name);
            UserValidador.validatePassword(pass);
            User user = new UserColaborador();
            user.login = email;
            user.senha = pass;
            user.nome = name;
            user.endereco = end;
            user.telefone = telefone;
            state = state.setDisponivel();

            users.put(user.login, user);
            userFile.saveUsers(users);
    }

    public void removeUser(String name) throws InfraException {
        Iterator<User> key;
        key = (Iterator) this.getAllUsers().keySet().iterator();
        while(key.hasNext()){
            User user = key.next();
            if(user.login.equals(name)){
                key.remove();
                JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
            }
        }
    }

    public Map<String, User> getAllUsers() throws InfraException {
                    try {
                    Map<String, User> mymap = userFile.loadUsers();
                    return mymap;
                    
                    } catch (NullPointerException ex){
                UserFile.logger.severe(ex.getMessage());
                throw new InfraException("Erro de persistencia, contacte o admin ou tente mais tarde");
            }
    }
}
