
package fever_publicity;

import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


//Esta clase es una implementacion de hilo para asi poder controlar la hora
public class Interfas extends javax.swing.JFrame implements Runnable  {

    String hora,minutos,segundos;
    Thread Reloj;
    static String tiempo;
    private boolean grande,chica,fin;
    client C;
    //Inicio de la Interfas de las Pantallas "Monitor"
    public Interfas(client c) {
        initComponents();
        Admin.setVisible(false);
        this.C=c;
        Reloj=new Thread(this);
        Reloj.start();
        grande=true;
        chica=true;
        fin = false;
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Pantallas");
        setResizable(false);

        Pantallagrande.setTitle("Pantalla Grande");
        Pantallagrande.setPreferredSize(new java.awt.Dimension(500, 400));
        Pantallagrande.setVisible(true);

        jL_Hora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

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
                        .addComponent(restan, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallagrandeLayout.createSequentialGroup()
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallagrandeLayout.createSequentialGroup()
                        .addComponent(jL_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

        jL_Hora1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

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
                .addGap(57, 57, 57)
                .addComponent(mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallachicaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PantallachicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallachicaLayout.createSequentialGroup()
                        .addComponent(restan1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallachicaLayout.createSequentialGroup()
                        .addComponent(jL_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pantalla", "ID", "Hora Solicitada", "Duracion", "Mensaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        Admin.setText("Admin. Peticiones");
        Admin.setAutoscrolls(true);
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cola de Peticiones");

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
                .addGap(292, 292, 292)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Boton Admin para mostrar el modulo de Administracion de peticiones
    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
        Admin.setVisible(false);
        C.setVisible(true);
    }//GEN-LAST:event_AdminActionPerformed
    
    public void mostratadmin()
    {
        Admin.setVisible(true);
    }
    
    // Sincronizacion del Hilo que lleva la hora del sistema y ademas siempre notifica a todos
    // los hilos para ver cual le toca ejecutar
    public synchronized void hora() throws InterruptedException {
       Calendar calendario = new GregorianCalendar();
       Date horactual = new Date();
       calendario.setTime(horactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);  
        tiempo = hora+":"+minutos+":"+segundos;
        if(C.getcountclientes()==0 && !fin)
        {
            fin = true;
            int resp = JOptionPane.showConfirmDialog(null, "Ya no hay clientes, desea esperar por los hilos", "Alerta!", JOptionPane.YES_NO_OPTION);
            if(resp==0)
            {notifyAll();
                wait(1000);
            }else
            {
                System.exit(0);
            }
        }
        if(Tabla.getRowCount()==0 && C.getcountclientes()==0 && fin )
        {
            
            JOptionPane.showMessageDialog(null, "Saliendo del programa","",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        
        notifyAll();
    }
    
    //Metodo Critico sincronizado para la pantalla grande
    public synchronized void mensaje_grande(String msg, Date D, int dur,int id, int promo) throws InterruptedException, Exception
    {
       //Se carga la solicitud a la tabla que muestra la cola de solicitudes
        DefaultTableModel modelo=(DefaultTableModel) Tabla.getModel();
        Object[] fila= new Object[5];
        fila[0]="Pantalla Grande";
        fila[1]=id;
        fila[2]=D.toString();
        fila[3]=dur;
        fila[4]=msg;
        modelo.addRow(fila);
        Tabla.setModel(modelo);
        
        //Espera mientras su hora pedida no haya llegado  este libre la pantalla
        while(D.compareTo(new Date())>0 || !grande)
            wait();
        
        //marca la pantalla y muestra el mensaje
        grande=false;
        mensaje.setText(msg);
         Calendar c1 = new GregorianCalendar();
        Calendar c2;
        int min, seg;
        min = c1.get(Calendar.MINUTE) + (dur/60);
        seg= c1.get(Calendar.SECOND)+ dur%60;
        
        
        //espera a que llegue el tiempo de salir de la pantalla
        while((min*60)+seg > (c1.get(Calendar.MINUTE)*60 +c1.get(Calendar.SECOND) ) )    
        {
            c2 = new GregorianCalendar();
            restan.setText("restan: "+ (((min*60)+seg) - ((c2.get(Calendar.MINUTE)*60 +c2.get(Calendar.SECOND) ))  )
                    +" segundos");
            c1 = new GregorianCalendar();
            wait();
        }
        //Sale de la tabla de espera
        modelo=(DefaultTableModel) Tabla.getModel();
        Vector V = modelo.getDataVector();
        for(int i=0; i< modelo.getRowCount(); i++)
            modelo.removeRow(i);
        
        Tabla.setModel(modelo);
        for(int i=1; i<V.size();i++)
        {
            if(V.get(i)!=null)
            {
                fila = (Object[]) V.get(i);
                if(!fila[2].equals(D.toString()))
                    modelo.addRow(fila);
            }
        }
        Tabla.setModel(modelo);
        
        //libera la pantalla
        mensaje.setText("");
        restan.setText("");
        grande=true;
        //en caso de ser promocion manda el mensaje a la otra pantalla
        if (promo==1) mensaje_chico(msg,new Date(),dur,id,promo);
        notifyAll(); 
    }
    
    public synchronized void mensaje_chico(String msg, Date D, int dur, int id, int promo) throws InterruptedException, Exception
    {
        //Se carga la solicitud a la tabla que muestra la cola de solicitudes
            DefaultTableModel modelo=(DefaultTableModel) Tabla.getModel();
            Object[] fila= new Object[5];
            fila[0]="Pantalla chica";
            fila[1]=id;
            fila[2]=D.toString();
            fila[3]=dur;
            fila[4]=msg;
            modelo.addRow(fila);
            Tabla.setModel(modelo);
 
        //Espera mientras su hora pedida no haya llegado
        while(D.compareTo(new Date())>0 || !chica)
            wait();
        //marca la pantalla y muestra el mensaje
        chica=false;
        mensaje1.setText(msg);
        
        Calendar c1 = new GregorianCalendar();
        Calendar c2;
        int min, seg;
        min = c1.get(Calendar.MINUTE) + (dur/60);
        seg= c1.get(Calendar.SECOND)+ dur%60;
        //espera a que llegue el tiempo de salir de la pantalla
        while((min*60)+seg > (c1.get(Calendar.MINUTE)*60 +c1.get(Calendar.SECOND) ) )    
        {
            c2 = new GregorianCalendar();
            restan1.setText("restan: "+ (((min*60)+seg) - ((c2.get(Calendar.MINUTE)*60 +c2.get(Calendar.SECOND) ))  )
                    +" segundos");
            c1 = new GregorianCalendar();
            wait();
        }
        //Sale de la tabla de espera
        modelo=(DefaultTableModel) Tabla.getModel();
        Vector V = modelo.getDataVector();
        for(int i=0; i< modelo.getRowCount(); i++)
            modelo.removeRow(i);
        
        Tabla.setModel(modelo);
        for(int i=1; i<V.size();i++)
        {
            if(V.get(i)!=null)
            {
                fila = (Object[]) V.get(i);
                if(!fila[2].equals(D.toString()))
                    modelo.addRow(fila);
            }
        }
        Tabla.setModel(modelo);
        
        //libera la pantalla
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mensaje;
    private javax.swing.JTextField mensaje1;
    private javax.swing.JLabel restan;
    private javax.swing.JLabel restan1;
    // End of variables declaration//GEN-END:variables
    
    
    //Hilo Infinito que muestra la hora y controla la llamada de los demas hilos
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while(current==Reloj)
        {
            try {
                hora();
            } catch (InterruptedException ex) {
                Logger.getLogger(Interfas.class.getName()).log(Level.SEVERE, null, ex);
            }
            jL_Hora.setText(tiempo);
            jL_Hora1.setText(tiempo);
            
        }
    }
}
