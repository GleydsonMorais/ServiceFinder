package business.control;

import business.model.User;
import infra.UserIF;

/**
 *
 * @author GM
 */
public class RemoverComando implements ComandoIF {
    
    private String nome;
    private final String tipo;
    
    public RemoverComando(String s){
        nome = s;
        tipo = "Remove";
    }
    
    @Override
    public User execute(UserIF users) throws Exception{
        users.removeUser(nome);
        return null;
    }
    
    @Override
    public String getNome(){
        return tipo;
    }

    @Override
    public String getLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
