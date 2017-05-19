package business.control;

import business.model.User;
import infra.*;

/**
 *
 * @author GM
 */
public interface ComandoIF {
    
    public abstract User execute(UserIF usuarios) throws Exception;
    public abstract String getLogin();
    public abstract String getSenha();
    public abstract String getNome();
    public abstract String getEndereco();
    public abstract String getTelefone();
}
