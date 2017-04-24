
package fever_publicity;

import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Interfas extends javax.swing.JFrame implements Runnable  {

    String hora,minutos,segundos;
    Thread Reloj;
    static String tiempo;
    
    public Interfas() {
        initComponents();
        Reloj=new Thread(this);
        Reloj.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantallagrande = new javax.swing.JInternalFrame();
        jL_Hora = new javax.swing.JLabel();
        mensaje = new javax.swing.JTextField();
        Pantallachica = new javax.swing.JInternalFrame();
        jL_Hora1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Pantallas");
        setResizable(false);

        Pantallagrande.setTitle("Pantalla Grande");
        Pantallagrande.setPreferredSize(new java.awt.Dimension(500, 400));
        Pantallagrande.setVisible(true);

        mensaje.setEditable(false);

        javax.swing.GroupLayout PantallagrandeLayout = new javax.swing.GroupLayout(Pantallagrande.getContentPane());
        Pantallagrande.getContentPane().setLayout(PantallagrandeLayout);
        PantallagrandeLayout.setHorizontalGroup(
            PantallagrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallagrandeLayout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addComponent(jL_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PantallagrandeLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PantallagrandeLayout.setVerticalGroup(
            PantallagrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallagrandeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        Pantallachica.setTitle("Pantalla chica");
        Pantallachica.setPreferredSize(new java.awt.Dimension(350, 300));
        Pantallachica.setVisible(true);

        javax.swing.GroupLayout PantallachicaLayout = new javax.swing.GroupLayout(Pantallachica.getContentPane());
        Pantallachica.getContentPane().setLayout(PantallachicaLayout);
        PantallachicaLayout.setHorizontalGroup(
            PantallachicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallachicaLayout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jL_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PantallachicaLayout.setVerticalGroup(
            PantallachicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallachicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pantallagrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(Pantallachica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public synchronized void hora() {
       Calendar calendario = new GregorianCalendar();
       Date horactual = new Date();
       calendario.setTime(horactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);  
        tiempo = hora+":"+minutos+":"+segundos;
    }
    
    public synchronized void mensaje_grande(String msg) 
    {
        mensaje.setText(msg);
        try {
            sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interfas.class.getName()).log(Level.SEVERE, null, ex);
        }
        mensaje.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame Pantallachica;
    private javax.swing.JInternalFrame Pantallagrande;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jL_Hora;
    private javax.swing.JLabel jL_Hora1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mensaje;
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
