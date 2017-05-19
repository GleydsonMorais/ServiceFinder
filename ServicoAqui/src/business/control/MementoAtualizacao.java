package business.control;

/**
 *
 * @author GM
 */
public class MementoAtualizacao {
    
    private ComandoIF mem = null;
    
    public void setEstado(ComandoIF est){
        mem = est;
    }
    
    public ComandoIF getEstado(){
        return mem;
    }
}
