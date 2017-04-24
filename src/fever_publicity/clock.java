
package fever_publicity;

import java.util.*;

public class clock extends javax.swing.JFrame implements Runnable{
String hora,minutos,segundos,ampm;
Calendar calendario;
Thread h1; 

   
    public clock() {
        initComponents();
        h1=new Thread(this); 
        h1.start();
        
        setLocationRelativeTo(null);
        setTitle("Reloj");
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblReloj.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblReloj;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct= Thread.currentThread();
        
        while(ct==h1){
            calcula();
            lblReloj.setText(hora+":"+minutos+":"+segundos);
            
            try{
                Thread.sleep(1000);
                }
            catch(InterruptedException e){
            
                    
            }          
            
        }
    }

    private void calcula() {
        Calendar calendario =new GregorianCalendar();
        Date fechaHoraActual = new Date();
        
        calendario.setTime(fechaHoraActual); 
        ampm= calendario.get(Calendar.AM_PM)== Calendar.AM?"AM":"PM";

        if(ampm.equals("PM")){
            int h= calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora= h >9?""+h:"0"+h;
            }else{
            hora= calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
        
    }
}
