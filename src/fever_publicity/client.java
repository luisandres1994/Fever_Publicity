
package fever_publicity;

import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class client extends javax.swing.JFrame {

   int n;
   double[] presupuestos;
    Interfas I ;
    
    //Se inician los mudulos tanto clientes como las pantallas
    public client(int n, double m) {
        this.n=n;
        presupuestos = new double[n];
        initComponents();
        int i ;
        for(i=0; i<n; i++)
        {
            presupuestos[i]=m;
            jC_id_clientes.addItem(i);
        }
        I=new Interfas(this);
        I.setVisible(true);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jtiempo = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jmensaje = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jC_id_clientes = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Hora = new com.lavantech.gui.comp.DateTimePicker();
        jText_monto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modulo Administrador de Peticiones");
        setResizable(false);

        jLabel1.setText("ID Cliente:");

        jLabel2.setText("Mensaje que quiere publicar:");

        jLabel3.setText("Tiempo:");

        Jtiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtiempoKeyTyped(evt);
            }
        });

        jRadioButton1.setText("Pantalla Grande");

        jRadioButton2.setText("Pantalla Pequeña");

        jButton1.setText("Publicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        salir.setText("Atras");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Jmensaje.setColumns(20);
        Jmensaje.setRows(5);
        jScrollPane1.setViewportView(Jmensaje);

        jLabel4.setText("Monto Disponible:");

        jC_id_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_id_clientesActionPerformed(evt);
            }
        });

        jLabel5.setText("Fechay hora de publicacion:");

        jText_monto.setForeground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Jtiempo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jC_id_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jText_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 26, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jC_id_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jText_monto))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Jtiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel5)))
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //seleccion del cliente
    private void jC_id_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_id_clientesActionPerformed
        if(jC_id_clientes.getSelectedIndex()!=-1)jText_monto.setText(String.valueOf(presupuestos[Integer.parseInt(jC_id_clientes.getSelectedItem().toString())]));
        else jText_monto.setText("");
        
    }//GEN-LAST:event_jC_id_clientesActionPerformed
    
    public int getcountclientes()
    {
        return jC_id_clientes.getItemCount();
    }
   //escritura de tiempo
    private void JtiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtiempoKeyTyped
        char num = evt.getKeyChar();
        if((num<'0' || num>'9') && (num!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admiten números enteros","",JOptionPane.INFORMATION_MESSAGE);
	}
    }//GEN-LAST:event_JtiempoKeyTyped
    
    //accion de publicacion
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Jtiempo.getText().equals("") || Jmensaje.getText().equals("") 
                || (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) || jC_id_clientes.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar","",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Integer.parseInt(Jtiempo.getText())<5 || Integer.parseInt(Jtiempo.getText())>120)
        {
            JOptionPane.showMessageDialog(null, "El tiempo debe estar entre 5 a 120","",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            //Todos los campos estan llenos y son vallidos
            
            double costo=0;
            int promo=0;
            int tiempo=Integer.parseInt(Jtiempo.getText());
            int id_p=Integer.parseInt(jC_id_clientes.getSelectedItem().toString());
            //calculo de costos
            if(jRadioButton1.isSelected())
                costo  =costo + (2500*15)+tiempo*500;
            if(jRadioButton2.isSelected())
                costo  =costo + (1500*15)+tiempo*500;
            Calendar calendario = Hora.getCalendar();
            if(calendario.get(Calendar.HOUR_OF_DAY)>= 7 && calendario.get(Calendar.HOUR_OF_DAY)<= 10)
            {
                //caso que sea horario de promocion
                costo = (2500*15)+ tiempo*500;
                costo = costo - costo*0.05;
                promo=1;
            }
            //En caso de que el presupuesto no sea suficiente
            if(costo>presupuestos[id_p])
                JOptionPane.showMessageDialog(null, "No alcanza el presupuesto","",JOptionPane.INFORMATION_MESSAGE);
            else if(Hora.getDate().compareTo(new Date())<0)
            { //La Hora seleccionada no es valida
                JOptionPane.showMessageDialog(null, "La fecha-Hora ingresada ya paso 'Invalida' ","",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
               //LLamadas a los hilos correspondientes 
               //Se resta del presupuesto al cliente seleccionado
                presupuestos[id_p]= presupuestos[id_p]- costo;
                if(promo==1)
                { //Si es caso de promocion
                    Peticion P = new Peticion(1,I,Jmensaje.getText(),Hora.getDate(),tiempo,id_p,promo);
                    P.start();
                }else
                {
                    //No es promocion
                    if(jRadioButton1.isSelected())
                    { //Hilo para pantalla grande
                        Peticion P = new Peticion(1,I,Jmensaje.getText(),Hora.getDate(),tiempo,id_p,promo);
                        P.start();
                    }
                    if(jRadioButton2.isSelected())
                    { //Hilo para pantalla pequeña
                        Peticion P = new Peticion(2,I,Jmensaje.getText(),Hora.getDate(),tiempo,id_p,promo);
                        P.start();
                    }
                }
                //Si ya gasto el presupuesto el cliente sale del modulo
                if(presupuestos[id_p]<25000)
                    jC_id_clientes.removeItemAt(jC_id_clientes.getSelectedIndex());
                
                //Se limpian los campos
                jC_id_clientes.setSelectedIndex(-1);
                Jtiempo.setText("");
                Jmensaje.setText("");
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
            }
            
       
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //Boton de Atras
        I.setVisible(true);
        this.setVisible(false);
        I.mostratadmin();
    }//GEN-LAST:event_salirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.lavantech.gui.comp.DateTimePicker Hora;
    private javax.swing.JTextArea Jmensaje;
    private javax.swing.JTextField Jtiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jC_id_clientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jText_monto;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
