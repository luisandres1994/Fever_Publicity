/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fever_publicity;

import java.util.Date;

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
        
        I.mensaje_grande(msg);
        
    }
}
