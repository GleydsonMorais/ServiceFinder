package infra;

import business.model.Servico;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GM
 */
public class ServicoFile {
    
    public static Logger logger = Logger.getLogger(ServicoFile.class.getName());

	public ServicoFile() {
		
            try {

                Handler hdConsole = new ConsoleHandler();
                Handler hdArquivo = new FileHandler("relatorioLog.txt");

                hdConsole.setLevel(Level.OFF);
                hdArquivo.setLevel(Level.OFF);

                ServicoFile.logger.addHandler(hdConsole);
                ServicoFile.logger.addHandler(hdArquivo);

                ServicoFile.logger.setUseParentHandlers(false);

            } catch (IOException ex) {
                logger.severe("ocorreu um erro no arquivo durante a execuÃ§Ã£o do programa");
            }
	}
        
    public void saveServs(Map<String, Servico> servs){
        
        File file = new File("jobs.bin");
        
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(servs);
            out.close();
            
        } catch (FileNotFoundException ex) {
        	ex.printStackTrace();
        } catch (IOException ex){
        	ex.printStackTrace();
        }
    }
    
    public Map<String, Servico> loadServs() throws InfraException{
    	
        Map<String, Servico> servs = new HashMap();
    	
        File file = new File("jobs.bin");
        
        ObjectInputStream objInput = null;
        
        InputStream in = null;
        
        if(!file.exists()){
            
            saveServs(servs);
        }
        
        try {
            
            in = new FileInputStream(file);
            
            //Recupera a lista
            objInput = new ObjectInputStream(in);
            
            servs = (Map<String, Servico>) objInput.readObject();
            
            return servs;
        } catch (NullPointerException ex){
            logger.config(ex.getMessage());
            throw new InfraException("Erro de persistencia, contacte o admin ou tente mais tarde");
        } catch (IOException ex){
            logger.config(ex.getMessage());
            throw new InfraException("Erro de persistencia, contacte o admin ou tente mais tarde");
         } catch (ClassNotFoundException ex) {
            logger.config(ex.getMessage());
            throw new InfraException("Erro de persistencia, contacte o admin ou tente mais tarde");      
        }
        
        finally {
        
            try {
                objInput.close();
		in.close();
            } catch (IOException e) {
		logger.severe(e.getMessage());	
            }	
        }
    }
}
