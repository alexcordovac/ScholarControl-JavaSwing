/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Alex Cordova
 */
public class RegistrarAsignatura extends javax.swing.JFrame {
    
//    private Servicios servicio;
    /**
     * Creates new form VentanaPrincipal
     */
    public RegistrarAsignatura() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelCancelar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelAceptar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtClave = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtAsignatura = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setModalExclusionType(null);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jPanelCancelar.setBackground(java.awt.SystemColor.controlHighlight);
        jPanelCancelar.setToolTipText("Cancelar");
        jPanelCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelCancelarMousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_cancel_26px.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelCancelarLayout = new javax.swing.GroupLayout(jPanelCancelar);
        jPanelCancelar.setLayout(jPanelCancelarLayout);
        jPanelCancelarLayout.setHorizontalGroup(
            jPanelCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCancelarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelCancelarLayout.setVerticalGroup(
            jPanelCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCancelarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelAceptar.setBackground(java.awt.SystemColor.controlHighlight);
        jPanelAceptar.setToolTipText("Añadir asignatura");
        jPanelAceptar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanelAceptarFocusGained(evt);
            }
        });
        jPanelAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAceptarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelAceptarMousePressed(evt);
            }
        });
        jPanelAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanelAceptarKeyPressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_ok_24px.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelAceptarLayout = new javax.swing.GroupLayout(jPanelAceptar);
        jPanelAceptar.setLayout(jPanelAceptarLayout);
        jPanelAceptarLayout.setHorizontalGroup(
            jPanelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAceptarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanelAceptarLayout.setVerticalGroup(
            jPanelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAceptarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Asignatura:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Clave:");

        jPanel5.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtClave.setBackground(java.awt.SystemColor.controlHighlight);
        txtClave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtClave.setForeground(new java.awt.Color(45, 118, 232));
        txtClave.setToolTipText("Inserte la clave");
        txtClave.setBorder(null);
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });
        jPanel5.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 20));

        jPanel3.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAsignatura.setBackground(java.awt.SystemColor.controlHighlight);
        txtAsignatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAsignatura.setForeground(new java.awt.Color(45, 118, 232));
        txtAsignatura.setToolTipText("Inserte la asignatura");
        txtAsignatura.setBorder(null);
        txtAsignatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAsignaturaKeyPressed(evt);
            }
        });
        jPanel3.add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 20));

        jPanel1.setBackground(new java.awt.Color(28, 73, 153));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_book_60px_2.png"))); // NOI18N
        jLabel15.setText(" Registrar asignatura");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        labelResultado.setBackground(new java.awt.Color(255, 255, 255));
        labelResultado.setForeground(new java.awt.Color(0, 153, 0));
        labelResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelResultado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jPanelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanelAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Controlar color JPanels
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }
 
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(227,227,227));
    }
    
    //Oculta la etiqueta que se le manda por parámetro n segundos
    private void ocultar(JLabel label, int tiempo){
        ActionListener tarea = (ActionEvent evt) -> {
            label.setText("");
        };
     Timer timer = new Timer(tiempo, tarea);
     timer.setRepeats(false);
     timer.start();
    }
    
    //Agrega asignaturas en el arreglo asignaturas
    private void agregarAsignatura(){
        try{
            
            //Validación y si alguna condición se cumple, se sale de esta función
            if(VentanaPrincipal.totalAlumnos<1){
                labelResultado.setForeground(Color.black);
                labelResultado.setText("¡Agregue el total de alumnos!");
                this.ocultar(labelResultado, 1000);
                return;
            }else if(txtClave.getText().isEmpty() || txtAsignatura.getText().isEmpty()){
                labelResultado.setForeground(Color.black);
                labelResultado.setText("¡Campos vacios!");
                this.ocultar(labelResultado, 1000);
                txtClave.requestFocus();
                return;
            }
            
            //Si todo sale bien, se agrega la asignatura
            int posicion = VentanaPrincipal.servicio.indexVacio(VentanaPrincipal.servicio.asignaturas);
            VentanaPrincipal.servicio.asignaturas[posicion][0] = txtClave.getText();
            VentanaPrincipal.servicio.asignaturas[posicion][1] = txtAsignatura.getText();

            //Redimensiono los arreglos una posición más
            VentanaPrincipal.servicio.asignaturas = VentanaPrincipal.servicio.redimensionar(VentanaPrincipal.servicio.asignaturas);
            VentanaPrincipal.servicio.calificaciones = VentanaPrincipal.servicio.redimensionar(VentanaPrincipal.servicio.calificaciones);

            //Mostramos la etiqueta y la ocultamos
            labelResultado.setText("¡Agregado!");
            labelResultado.setForeground(new Color(0,153,0));
            this.ocultar(labelResultado, 1000);
            
            txtClave.setText("");
            txtClave.requestFocus();
            txtAsignatura.setText("");
        }catch(Exception e){
            labelResultado.setForeground(Color.red);
            labelResultado.setText("No se pudo agregar :(");
            this.ocultar(labelResultado, 1000);
        }
    }
    private void jPanelCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCancelarMouseEntered
        setColor(jPanelCancelar);
    }//GEN-LAST:event_jPanelCancelarMouseEntered

    private void jPanelAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAceptarMouseEntered
        setColor(jPanelAceptar);
    }//GEN-LAST:event_jPanelAceptarMouseEntered

    private void jPanelCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCancelarMouseExited
        resetColor(jPanelCancelar);
    }//GEN-LAST:event_jPanelCancelarMouseExited

    private void jPanelAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAceptarMouseExited
        resetColor(jPanelAceptar);
    }//GEN-LAST:event_jPanelAceptarMouseExited

    private void jPanelCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCancelarMousePressed
        this.setVisible(false);
        VentanaPrincipal.principal.setEnabled(true);
        VentanaPrincipal.principal.requestFocus();
    }//GEN-LAST:event_jPanelCancelarMousePressed
    
    private void jPanelAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAceptarMousePressed
        this.agregarAsignatura();
    }//GEN-LAST:event_jPanelAceptarMousePressed
    
    //Métodos para poder mover la ventana con el encabezado
    int xx,xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }//GEN-LAST:event_jPanel1MouseDragged

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtAsignatura.requestFocus();
        }
    }//GEN-LAST:event_txtClaveKeyPressed

    private void txtAsignaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAsignaturaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jPanelAceptar.requestFocus();
        }
    }//GEN-LAST:event_txtAsignaturaKeyPressed
    
    //Al recibir el focus el boton aceptar
    private void jPanelAceptarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanelAceptarFocusGained
        labelResultado.setForeground(Color.blue);
        labelResultado.setText("Pulse nuevamente enter para agregar");
        this.ocultar(labelResultado, 1000);
    }//GEN-LAST:event_jPanelAceptarFocusGained
    
    //Una vez que recibe el focus y se vuelve a pulsar enter, se llama a la función para que agregue la asignatura
    private void jPanelAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanelAceptarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.agregarAsignatura();
        }else{
            labelResultado.setForeground(Color.blue);
            labelResultado.setText("Pulse nuevamente enter para agregar");
            this.ocultar(labelResultado, 1000);
        }
    }//GEN-LAST:event_jPanelAceptarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAsignatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAceptar;
    private javax.swing.JPanel jPanelCancelar;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtClave;
    // End of variables declaration//GEN-END:variables
}
