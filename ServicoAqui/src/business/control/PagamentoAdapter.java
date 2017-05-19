package business.control;

/**
 *
 * @author GM
 */
public class PagamentoAdapter {
    
    double valor;
    
    public PagamentoAdapter(String tipo, double preço){
        
        valor = preço;
        
        Pagamento pag = new Pagamento(valor);
        
        switch(tipo){
            
            case "PayPal":
                pag.payPal(preço);
                break;
            case "Boleto":
                pag.boletoBancario(preço);
                break;
            default:
                break;
        }
    }
}
