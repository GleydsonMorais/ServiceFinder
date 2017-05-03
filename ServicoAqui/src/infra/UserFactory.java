package infra;

import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;
import business.model.UserCliente;
import business.model.UserColaborador;

/**
 *
 * @author GM
 */
public class UserFactory implements UserFactoryIF{
    
    @Override
    public UserCliente criaUserCliente() throws LoginInvalidException, PasswordInvalidException{
        
        return new UserCliente();
    }
    
    @Override
    public UserColaborador criaUserColaborador() throws LoginInvalidException, PasswordInvalidException{
        return new UserColaborador();
    }
}
