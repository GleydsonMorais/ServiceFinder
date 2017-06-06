/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author GM
 */
public class CPF implements ColaboradorVisitante{
    
    @Override
    public void visitar(UserColaborador uw, String cpf){
        this.visitar(uw, uw.cpf);
        uw.setCpf(cpf);
    }
}
