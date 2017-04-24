
package fever_publicity;

import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class client extends javax.swing.JFrame {

   int n;
   double[] presupuestos;
    Interfas I ;
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
        I=new Interfas();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jmensaje = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jC_id_clientes = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Hora = new com.lavantech.gui.comp.DateTimePicker();
        jText_monto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Administrador de Peticiones");
        setResizable(false);

        jLabel1.setText("I:D Cliente");

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

        jButton2.setText("Nuevo Cliente");

        jButton3.setText("Cancelar");

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
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addGap(84, 84, 84))
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
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jC_id_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_id_clientesActionPerformed
        if(jC_id_clientes.getSelectedIndex()!=-1)jText_monto.setText(String.valueOf(presupuestos[Integer.parseInt(jC_id_clientes.getSelectedItem().toString())]));
        else jText_monto.setText("");
    }//GEN-LAST:event_jC_id_clientesActionPerformed

    private void JtiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtiempoKeyTyped
        char num = evt.getKeyChar();
        if((num<'0' || num>'9') && (num!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admiten números enteros","",JOptionPane.INFORMATION_MESSAGE);
	}
    }//GEN-LAST:event_JtiempoKeyTyped

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
            double costo=0;
            if(jRadioButton1.isSelected())
                costo  =costo + (2500*15)+Integer.parseInt(Jtiempo.getText())*500;
            if(jRadioButton2.isSelected())
                costo  =costo + (1500*15)+Integer.parseInt(Jtiempo.getText())*500;
            Calendar calendario = Hora.getCalendar();
            if(calendario.get(Calendar.HOUR_OF_DAY)>= 7 && calendario.get(Calendar.HOUR_OF_DAY)<= 10)
                costo = costo - (costo*0.5);
            
            if(costo>presupuestos[Integer.parseInt(jC_id_clientes.getSelectedItem().toString())])
                JOptionPane.showMessageDialog(null, "No alcanza el presupuesto","",JOptionPane.INFORMATION_MESSAGE);
            else{
                
                presupuestos[Integer.parseInt(jC_id_clientes.getSelectedItem().toString())]= presupuestos[Integer.parseInt(jC_id_clientes.getSelectedItem().toString())]- costo;
                
                //se llama al hilo
                
                
                if(presupuestos[Integer.parseInt(jC_id_clientes.getSelectedItem().toString())]<25000)
                    jC_id_clientes.removeItemAt(jC_id_clientes.getSelectedIndex());
                
                jC_id_clientes.setSelectedIndex(-1);
                Jtiempo.setText("");
                Jmensaje.setText("");
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
            }
       
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.lavantech.gui.comp.DateTimePicker Hora;
    private javax.swing.JTextArea Jmensaje;
    private javax.swing.JTextField Jtiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    // End of variables declaration//GEN-END:variables
}