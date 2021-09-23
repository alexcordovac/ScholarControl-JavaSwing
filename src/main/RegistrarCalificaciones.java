
package main;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Alex Cordova
 */
public class RegistrarCalificaciones extends javax.swing.JFrame{
    int contador;
    /**
     * Creates new form Home_Data
     */
    public RegistrarCalificaciones() {
        initComponents();
        this.listarCombobox(jComboBox1);
        this.setLocationRelativeTo(null);
        jTextField2.setEnabled(false);
        jPanelAceptar.setEnabled(false);
        contador = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelAsignatura = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelCancelar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelAceptar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/group_52px_1.png"))); // NOI18N
        jLabel15.setText("Registrar calificaciones");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ponderación 0 - 100");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 419, 77));

        labelResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelResultado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3.add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 240, 19));

        jPanel4.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel4.setForeground(java.awt.SystemColor.controlHighlight);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(labelAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 20));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Alumno:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 19));

        jPanelCancelar.setBackground(java.awt.SystemColor.controlHighlight);
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_cancel_26px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelCancelarLayout = new javax.swing.GroupLayout(jPanelCancelar);
        jPanelCancelar.setLayout(jPanelCancelarLayout);
        jPanelCancelarLayout.setHorizontalGroup(
            jPanelCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCancelarLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(22, 22, 22))
        );
        jPanelCancelarLayout.setVerticalGroup(
            jPanelCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCancelarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.add(jPanelCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 72, 64));

        jPanelAceptar.setBackground(java.awt.SystemColor.controlHighlight);
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_ok_24px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAceptarLayout = new javax.swing.GroupLayout(jPanelAceptar);
        jPanelAceptar.setLayout(jPanelAceptarLayout);
        jPanelAceptarLayout.setHorizontalGroup(
            jPanelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAceptarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanelAceptarLayout.setVerticalGroup(
            jPanelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAceptarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.add(jPanelAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 72, 64));

        jPanel5.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel5.setForeground(java.awt.SystemColor.controlHighlight);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(java.awt.SystemColor.controlHighlight);
        jTextField2.setToolTipText("Pulsa enter para agregar calificacion");
        jTextField2.setBorder(null);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 20));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 210, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Calificacion n:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 19));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Asignatura:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jPanel2.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel2.setForeground(java.awt.SystemColor.controlHighlight);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setForeground(java.awt.SystemColor.controlHighlight);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 190, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Funciones para controlar el color de los JPanels
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }
 
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(227,227,227));
    }
    
    //Función para ocultar un JLabel, generalmente usada como un logger
    public void ocultar(JLabel label, int tiempo){
        ActionListener tarea = (ActionEvent evt) -> {
            label.setText("");
        };
     Timer timer = new Timer(tiempo, tarea);
     timer.setRepeats(false);
     timer.start();
    }
    
    private void jPanelCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCancelarMouseEntered
        this.setColor(jPanelCancelar);
    }//GEN-LAST:event_jPanelCancelarMouseEntered

    private void jPanelCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCancelarMouseExited
        this.resetColor(jPanelCancelar);
    }//GEN-LAST:event_jPanelCancelarMouseExited

    private void jPanelCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCancelarMousePressed
        this.setVisible(false);
        VentanaPrincipal.principal.setEnabled(true);
        VentanaPrincipal.principal.requestFocus();
    }//GEN-LAST:event_jPanelCancelarMousePressed
     
    //Funciones para poder mover la ventana mediante el encabezado JPanel1
    int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }//GEN-LAST:event_jPanel1MouseDragged

    //Al hacer click en el jComboBox1
    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        if(VentanaPrincipal.totalAlumnos <1){
            labelResultado.setForeground(Color.red);
            labelResultado.setText("¡No ha ingresado el numero de alumnos!");
            this.ocultar(labelResultado, 2000);
        }else if(VentanaPrincipal.servicio.asignaturas[0][0]==null){
            labelResultado.setForeground(Color.BLUE);
            labelResultado.setText("¡Agregue asignaturas!");
            this.ocultar(labelResultado, 2000);
        }
    }//GEN-LAST:event_jComboBox1MouseClicked
    
    //Verifica si el item del combobox ya fue llenado en el arreglo calificaciones
    private boolean itemSeleccionado(int index){
        int sumador=0;
        for(int columna=0; columna<VentanaPrincipal.servicio.calificaciones[index].length; 
                columna++){
            sumador=sumador+VentanaPrincipal.servicio.calificaciones[index][columna];
            }
        return sumador!=0;
    }
    
    //Valida que un campo sea caracter
    public void verificarCaracteres(java.awt.event.KeyEvent evt, JLabel etiqueta){
    char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            labelResultado.setForeground(Color.blue);
            labelResultado.setText("Ingrese sólo números enteros");
            this.ocultar(labelResultado, 2000);
        }
    }
    
    //Al seleccionar un elemento del JComboBox1 verifica si ya ha sido modificado
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        int index=jComboBox1.getSelectedIndex();
        
        if(index>=0){
            if(itemSeleccionado(index)){
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Este elemento ya ha sido modificado. \n"
                        + "         ¿Desea continuar?", "Aviso", dialogButton);
                
                if(dialogResult==1){
                    this.reiniciarAgregado();
                    return;                    
                }
            }
            jComboBox1.setEnabled(false);
            jTextField2.setEnabled(true);
            jTextField2.requestFocus();
        }
                
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jPanelAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAceptarMouseEntered
        this.setColor(jPanelAceptar);
    }//GEN-LAST:event_jPanelAceptarMouseEntered

    private void jPanelAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAceptarMouseExited
        this.resetColor(jPanelAceptar);
    }//GEN-LAST:event_jPanelAceptarMouseExited
    
    //Cuando el jTextField2 gana el focus, entonces empieza a ingresar calificaciones
    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jLabel6.setText("Calificacion "+Integer.toString(contador+1)+":");
        labelAsignatura.setText("1");
    }//GEN-LAST:event_jTextField2FocusGained
    
    //Función para reiniciar el agregado de calificaciones
    private void reiniciarAgregado(){
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setEnabled(true);
        contador=0;
        jLabel6.setText("Calificacion n:");
        jTextField2.setText("");
        labelAsignatura.setText("");
        jTextField2.setEnabled(false);
    }
    
    //Agrega calificaciones al arreglo calificaciones
    private void agregarCalificacion(){
        try{
            if(contador<VentanaPrincipal.totalAlumnos){

                //Si no se ha ingresado nada en el campo de calificacion se sale
                if(jTextField2.getText().isEmpty()){
                    return;
                }
                int temp= Integer.parseInt(jTextField2.getText());
                if((temp>=0) && (temp<=100)){
                    VentanaPrincipal.servicio.calificaciones[jComboBox1.getSelectedIndex()][contador] = Integer.parseInt(jTextField2.getText());
                    contador++;
                    labelAsignatura.setText(String.valueOf(contador+1));
                    jTextField2.setText("");
                    jTextField2.requestFocus();
                    jLabel6.setText("Calificacion "+Integer.toString(contador+1)+":");
                }else{
                    labelResultado.setForeground(Color.BLUE);
                    labelResultado.setText("¡Calificaciones del 0 al 100!");
                    this.ocultar(labelResultado, 2000);
                }
            }
            if(contador==VentanaPrincipal.totalAlumnos){
                labelResultado.setForeground(new Color(0,153,0));
                labelResultado.setText("¡Registro completado!");
                this.ocultar(labelResultado, 1000);
                this.reiniciarAgregado();
            }
        }catch(Exception e){
            labelResultado.setForeground(Color.red);
            labelResultado.setText("¡Ocurrio un error! :(");
            this.ocultar(labelResultado, 2000);
        }
        
    }
    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        this.agregarCalificacion();
        
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        this.verificarCaracteres(evt, labelResultado);
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jPanelAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAceptarMousePressed
        this.agregarCalificacion();
    }//GEN-LAST:event_jPanelAceptarMousePressed
    
    //Lista todas las asignaturas en el jComboBox
    private void listarCombobox(JComboBox combo){
       combo.removeAllItems();
       String[] lista = new String[VentanaPrincipal.servicio.asignaturas.length];
       int contadorLista=0;
        for (String[] asignatura : VentanaPrincipal.servicio.asignaturas) {
            if (asignatura[0] != null) {
                lista[contadorLista] = asignatura[0] + " " + asignatura[1];
                contadorLista++;
            }
        }
       DefaultComboBoxModel mod = new DefaultComboBoxModel(lista);
       combo.setModel(mod);
       combo.setSelectedIndex(-1);
    }
    
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
            java.util.logging.Logger.getLogger(RegistrarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCalificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAceptar;
    private javax.swing.JPanel jPanelCancelar;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelAsignatura;
    private javax.swing.JLabel labelResultado;
    // End of variables declaration//GEN-END:variables
}
