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
    public int duracion,id,pantalla,promocion;
    public Peticion(int pant,Interfas I, String msg2,Date dat,int dur,int i, int promo)
    {
        this.I=I;
        msg=msg2;
        date=dat;
        duracion=dur;
        id=i;
        pantalla=pant;
        promocion=promo;
    }

    
    
    public void run()
    {
        
        if(pantalla==1)
        {
            try {
                I.mensaje_grande(msg, date, duracion,id,promocion);
            } catch (InterruptedException ex) {
                Logger.getLogger(Peticion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        {
            try {
                I.mensaje_chico(msg, date, duracion,id,0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Peticion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
