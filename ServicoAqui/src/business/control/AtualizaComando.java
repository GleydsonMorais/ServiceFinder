package business.control;

import business.model.User;
import infra.UserIF;

/**
 *
 * @author GM
 */
public class AtualizaComando implements ComandoIF {
    
    private User Old,New;
    private final String tipo;
    
    public AtualizaComando( User Old, User New){
        this.Old = Old;
        this.New = New;
        tipo = "Atualizacao";
    }
    
    @Override
    public User execute(UserIF users) throws Exception{
        users.updateUser(Old, New);
        return New;
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
