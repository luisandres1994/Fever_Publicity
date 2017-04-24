/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fever_publicity;

import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class Peticion extends Thread{
    
    public Interfas I;
    public String msg;
    public Date date;
    public int duracion,id;
    public Peticion(Interfas I, String msg2,Date dat,int dur,int i)
    {
        this.I=I;
        msg=msg2;
        date=dat;
        duracion=dur;
        id=i;
    }
    
    public void run()
    {
        
        try {
            I.mensaje_grande(msg,date,duracion);
        } catch (InterruptedException ex) {
            Logger.getLogger(Peticion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
}
