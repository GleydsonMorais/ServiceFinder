package business.control;

import business.model.Prototype;
import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;
import infra.InfraException;

/**
 *
 * @author GM
 */
public class Pagamento {
    
    public Pagamento(){
        
        super();
    }
    public Pagamento (double valor){
        
        if(valor == 25){
            
            //Autoriza pagamento
            System.out.println("Pagamento realizado com sucesso!");
            try{
                Prototype pt = new Prototype();
            }
            catch(InfraException | LoginInvalidException | PasswordInvalidException e){}
        }
        else{
            
            //Recusa tentativa de pagamento
            System.out.println("Pagamento não autorizado!");
        }
    }
    
    public void payPal(double valor){
        
        Pagamento p = new Pagamento(valor);
        //Realiza a conexão com o servidor do PayPal
    }
    
    public void boletoBancario(double valor){
        
        Pagamento p = new Pagamento(valor);
        //Realiza conexão com o servidor bancário
    }
}
