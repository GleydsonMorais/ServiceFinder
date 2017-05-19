package business.control;

import business.model.User;
import infra.UserIF;

/**
 *
 * @author GM
 */
public class BuscaComando implements ComandoIF {
    
    String nomeBusca;
    private final String tipo;
    
    public BuscaComando(String nome){
        nomeBusca = nome;
        tipo = "Busca";
    }
    
    
    @Override
    public User execute(UserIF users) throws Exception{
        return users.findUser(nomeBusca);
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
