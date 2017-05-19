/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.Servico;
import business.model.ServicoState;

/**
 *
 * @author GM
 */
public class AvaliarServico {
    
    protected ServicoState state;
    
    public AvaliarServico(Servico servico, int nota){
        if(nota<1 || nota>5)
            System.out.println("Nota inválida!");
        else{
            servico.setAvaliacao(nota);
            state = state.setDisponivel();
        }
    }
}
