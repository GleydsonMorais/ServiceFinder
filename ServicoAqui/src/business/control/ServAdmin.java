/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.Servico;
import infra.InfraException;
import infra.ServFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author GM
 */
public class ServAdmin {
    
    private Map<String, Servico> servs = new HashMap();
    ServFile servFile;
	
    public ServAdmin() {		

        servFile = new ServFile();
        try {
            servs = (Map<String, Servico>) servFile.loadServs();
        } catch (InfraException e) {
                ServFile.logger.log(Level.FINE, e.getMessage());
        } 
    }

    public void addServ(String nome, String prestador, String tipo, 
        double preco, String descricao, double avaliacao, boolean atendimento){

        Servico serv = new Servico(nome, prestador, tipo, preco, descricao, avaliacao, atendimento);

        servs.put(serv.getNomeServico() ,new Servico(serv.getNomeServico(), serv.getColaborador(), serv.getTipo(), serv.getPreco(), serv.getDescricao(), serv.getAvaliacao(), serv.isAtendimento()));
        servFile.saveServs(servs);
    }

    public void removeServ(String name) throws InfraException {
        Iterator<Servico> key;
        key = (Iterator) this.getAllServicos().entrySet().iterator();
        while(key.hasNext()){
            Servico serv = key.next();
            if(serv.getNomeServico().equals(name)){
                key.remove();
                JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
            }
        }
    }

    public Map<String, Servico> getAllServicos() throws InfraException {
        try {
            Map<String, Servico> mylist = servFile.loadServs();
            return mylist;
            
        } catch (NullPointerException ex){
            ServFile.logger.severe(ex.getMessage());
            throw new InfraException("Erro de persistencia, contacte o admin ou tente mais tarde");
        }
    }
}
