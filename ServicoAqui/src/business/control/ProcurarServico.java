package business.control;

import business.model.ServicoState;
import infra.InfraException;
import infra.ServFile;

/**
 *
 * @author GM
 */
public class ProcurarServico {
    
    protected ServicoState state;
    public ProcurarServico(){
    ServFile servs = new ServFile();
        try{
            System.out.println(servs.loadServs().toString());
            state = state.setIndisponivel();
        }
        catch (InfraException e){
            System.out.println("ERRO!");
        }
    }
}
