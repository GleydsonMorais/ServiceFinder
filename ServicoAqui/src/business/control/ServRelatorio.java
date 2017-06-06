/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import infra.InfraException;
import infra.ServFile;

/**
 *
 * @author GM
 */
public class ServRelatorio {
    
    public ServRelatorio(){
        super();
        ServFile servs = new ServFile();
        try{
            System.out.println(servs.loadServs());
        }
        catch (InfraException e){
            System.out.println("ERRO!");
        }
    }
}
