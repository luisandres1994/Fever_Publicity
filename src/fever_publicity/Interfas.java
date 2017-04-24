
package fever_publicity;

import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Interfas extends javax.swing.JFrame implements Runnable  {

    String hora,minutos,segundos;
    Thread Reloj;
    static String tiempo;
    private boolean grande,chica;
    client C;
    public Interfas(client c) {
        initComponents();
        Admin.setVisible(false);
        this.C=c;
        Reloj=new Thread(this);
        Reloj.start();
        grande=true;
        chica=true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantallagrande = new javax.swing.JInternalFrame();
        jL_Hora = new javax.swing.JLabel();
        mensaje = new javax.swing.JTextField();
        restan = new javax.swing.JLabel();
        Pantallachica = new javax.swing.JInternalFrame();
        jL_Hora1 = new javax.swing.JLabel();
        mensaje1 = new javax.swing.JTextField();
        restan1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Pantallas");
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        Pantallagrande.setTitle("Pantalla Grande");
        Pantallagrande.setPreferredSize(new java.awt.Dimension(500, 400));
        Pantallagrande.setVisible(true);

        mensaje.setEditable(false);
        mensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mensaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        restan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        restan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PantallagrandeLayout = new javax.swing.GroupLayout(Pantallagrande.getContentPane());
        Pantallagrande.getContentPane().setLayout(PantallagrandeLayout);
        PantallagrandeLayout.setHorizontalGroup(
            PantallagrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallagrandeLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(PantallagrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallagrandeLayout.createSequentialGroup()
                        .addComponent(jL_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallagrandeLayout.createSequentialGroup()
                        .addComponent(restan, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallagrandeLayout.createSequentialGroup()
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        PantallagrandeLayout.setVerticalGroup(
            PantallagrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallagrandeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        Pantallachica.setTitle("Pantalla chica");
        Pantallachica.setPreferredSize(new java.awt.Dimension(350, 300));
        Pantallachica.setVisible(true);

        mensaje1.setEditable(false);
        mensaje1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mensaje1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        restan1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        restan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PantallachicaLayout = new javax.swing.GroupLayout(Pantallachica.getContentPane());
        Pantallachica.getContentPane().setLayout(PantallachicaLayout);
        PantallachicaLayout.setHorizontalGroup(
            PantallachicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallachicaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PantallachicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallachicaLayout.createSequentialGroup()
                        .addComponent(jL_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallachicaLayout.createSequentialGroup()
                        .addComponent(restan1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
            .addGroup(PantallachicaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        PantallachicaLayout.setVerticalGroup(
            PantallachicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallachicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restan1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHICHO-LOVE-JUGGERS");

        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Hora", "Duracion", "Mensaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setEnabled(false);
        jScrollPane1.setViewportView(Tabla);

        Admin.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Pantallagrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(Pantallachica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pantallachica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pantallagrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void mostratadmin()
    {
        Admin.setVisible(true);
    }
    
    public synchronized void hora() {
       Calendar calendario = new GregorianCalendar();
       Date horactual = new Date();
       calendario.setTime(horactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);  
        tiempo = hora+":"+minutos+":"+segundos;
        notifyAll();
    }
    
    public synchronized void mensaje_grande(String msg, Date D, int dur) throws InterruptedException
    {
        while(!grande)
            wait();
        while(D.compareTo(new Date())>0)
            wait();
        grande=false;
        mensaje.setText(msg);
        
        Calendar c1 = new GregorianCalendar();
        Calendar c2;
        int min, seg;
        min = c1.get(Calendar.MINUTE) + (dur/60);
        seg= c1.get(Calendar.SECOND)+ dur%60;
        while((min*60)+seg > (c1.get(Calendar.MINUTE)*60 +c1.get(Calendar.SECOND) ) )    
        {
            c2 = new GregorianCalendar();
            restan.setText("restan: "+ (((min*60)+seg) - ((c2.get(Calendar.MINUTE)*60 +c2.get(Calendar.SECOND) ))  )
                    +" segundos");
            c1 = new GregorianCalendar();
            wait();
        }
        mensaje.setText("");
        restan.setText("");
        grande=true;
        notifyAll();
    }
    
    public synchronized void mensaje_chico(String msg, Date D, int dur) throws InterruptedException
    {
        while(!chica)
            wait();
        while(D.compareTo(new Date())>0)
            wait();
        chica=false;
        mensaje1.setText(msg);
        
        Calendar c1 = new GregorianCalendar();
        Calendar c2;
        int min, seg;
        min = c1.get(Calendar.MINUTE) + (dur/60);
        seg= c1.get(Calendar.SECOND)+ dur%60;
        while((min*60)+seg > (c1.get(Calendar.MINUTE)*60 +c1.get(Calendar.SECOND) ) )    
        {
            c2 = new GregorianCalendar();
            restan1.setText("restan: "+ (((min*60)+seg) - ((c2.get(Calendar.MINUTE)*60 +c2.get(Calendar.SECOND) ))  )
                    +" segundos");
            c1 = new GregorianCalendar();
            wait();
        }
        mensaje1.setText("");
        restan1.setText("");
        chica=true;
        notifyAll();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JInternalFrame Pantallachica;
    private javax.swing.JInternalFrame Pantallagrande;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jL_Hora;
    private javax.swing.JLabel jL_Hora1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mensaje;
    private javax.swing.JTextField mensaje1;
    private javax.swing.JLabel restan;
    private javax.swing.JLabel restan1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while(current==Reloj)
        {
            hora();
            jL_Hora.setText(tiempo);
            jL_Hora1.setText(tiempo);
            
        }
    }
}
