package business.control;

import business.model.User;
import infra.UserIF;

/**
 *
 * @author GM
 */
public class InserirComando implements ComandoIF {
    
    private final User pnew;
	private final String tipo;

	public InserirComando(User neo) {
		pnew = neo;
		tipo = "Insere";
	}

	public User execute(UserIF users) throws Exception {

		users.addUser(pnew);
		return pnew;
	}

	@Override
	public String getNome() {
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
