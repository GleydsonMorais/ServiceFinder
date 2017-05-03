package business.model;

import java.io.Serializable;

/**
 *
 * @author GM
 */
public class UserColaborador extends User implements Serializable {
    
    private static final long serialVersionUID = -3409171233621036055L;
    
    public String cpf;
    
    public UserColaborador() {
        
        super();
        this.cpf = cpf;
    }
}
