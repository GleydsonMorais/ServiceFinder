package infra;

import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;
import business.model.UserCliente;
import business.model.UserColaborador;

/**
 *
 * @author GM
 */
interface UserFactoryIF {
    
    public abstract UserCliente criaUserCliente() throws LoginInvalidException, PasswordInvalidException;
    public abstract UserColaborador criaUserColaborador() throws LoginInvalidException, PasswordInvalidException;
}
