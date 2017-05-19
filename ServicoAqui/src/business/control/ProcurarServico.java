package business.control;

import business.model.ServicoState;
import infra.InfraException;
import infra.ServicoFile;

/**
 *
 * @author GM
 */
public class ProcurarServico {
    
    protected ServicoState state;
    public ProcurarServico(){
    ServicoFile servs = new ServicoFile();
        try{
            System.out.println(servs.loadServs().toString());
            state = state.setIndisponivel();
        }
        catch (InfraException e){
            System.out.println("ERRO!");
        }
    }
}
