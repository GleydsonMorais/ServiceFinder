package business.control;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author GM
 */
public abstract class Template {
    
    public Template(){
        Date d = GregorianCalendar.getInstance().getTime();
	SimpleDateFormat format = new SimpleDateFormat();
	System.out.println("Relatório gerado por: " + toString() + "\t" + format.format(d));
    }
}
