
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author Alex Cordova
 */
public class Estadisticas extends javax.swing.JFrame {
    
    String encabezado[]=new String[]{" "," "," "};
    DefaultTableModel defaultTable;
    
    public Estadisticas() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Para que las tabla no sea editable
        defaultTable = new DefaultTableModel(encabezado,0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
        };
        //Estblezco un modelo de la tabla por defecto
        defaultTable.setRowCount(0);
        jTable1.setModel(defaultTable);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnExtender1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox2D = new javax.swing.JCheckBox();
        jCheckBox3D = new javax.swing.JCheckBox();
        jCheckBoxBarras = new javax.swing.JCheckBox();
        jCheckBoxCircular = new javax.swing.JCheckBox();
        labelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setModalExclusionType(null);
        setUndecorated(true);

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

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

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_close_window_50px.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_close_window_50px.png"))); // NOI18N
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/exit2.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_graph_64px.png"))); // NOI18N
        jLabel15.setText("Ver gráficas");

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/minimizar2.png"))); // NOI18N
        btnMinimizar.setToolTipText("Minimizar ventana");
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/minimizar2.png"))); // NOI18N
        btnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/minimizar1.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnExtender1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/extender1.png"))); // NOI18N
        btnExtender1.setToolTipText("Extender ventana");
        btnExtender1.setBorder(null);
        btnExtender1.setBorderPainted(false);
        btnExtender1.setContentAreaFilled(false);
        btnExtender1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/extender1.png"))); // NOI18N
        btnExtender1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/extender2.png"))); // NOI18N
        btnExtender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtender1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExtender1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnCerrar)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExtender1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar)
                    .addComponent(jLabel15))
                .addContainerGap())
        );

        jPanel4.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(java.awt.SystemColor.controlHighlight);

        jTable1.setBackground(new java.awt.Color(45, 118, 232));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Calificacion mas baja", "Calificacion mas alta", "Promedio" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(220, 220, 220));

        jCheckBox2D.setBackground(new java.awt.Color(220, 220, 220));
        jCheckBox2D.setText("2D");
        jCheckBox2D.setBorder(null);
        jCheckBox2D.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2DItemStateChanged(evt);
            }
        });

        jCheckBox3D.setBackground(new java.awt.Color(220, 220, 220));
        jCheckBox3D.setText("3D");
        jCheckBox3D.setBorder(null);
        jCheckBox3D.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3DItemStateChanged(evt);
            }
        });

        jCheckBoxBarras.setBackground(new java.awt.Color(220, 220, 220));
        jCheckBoxBarras.setText("Barras");
        jCheckBoxBarras.setBorder(null);
        jCheckBoxBarras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxBarrasItemStateChanged(evt);
            }
        });

        jCheckBoxCircular.setBackground(new java.awt.Color(220, 220, 220));
        jCheckBoxCircular.setText("Circular");
        jCheckBoxCircular.setBorder(null);
        jCheckBoxCircular.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxCircularItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jCheckBox2D)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3D)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxBarras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxCircular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2D)
                            .addComponent(jCheckBox3D)
                            .addComponent(jCheckBoxBarras)
                            .addComponent(jCheckBoxCircular))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Métodos para controlar el color de los JPanels
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }
 
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(227,227,227));
    }
    
    //Función que imprime las tablas, crea una instancia de la clase EstadisticaModelo
    public void imprimirTablas(){
        String opcion = jComboBox1.getSelectedItem().toString();
        EstadisticaModelo statics = new EstadisticaModelo();
        DefaultTableModel modelo;
        
        modelo = statics.calificacion(labelResultado, opcion);
        jTable1.setModel(modelo);
    }
    
    //Función para graficar las tablas
    public void graficar(){
        if((jCheckBox2D.isSelected()) && (jCheckBoxBarras.isSelected())){
            
            DefaultCategoryDataset hojaDatos = new DefaultCategoryDataset();

            for(int i = 0; i < jTable1.getRowCount(); i++){
                hojaDatos.setValue(Float.parseFloat(jTable1.getValueAt(i, 2).toString()),jTable1.getValueAt(i, 1).toString(),jTable1.getValueAt(i, 1).toString());
            }
            JFreeChart ch = ChartFactory.createBarChart(jComboBox1.getSelectedItem().toString(),"Asignatura","Calificacion", hojaDatos,PlotOrientation.VERTICAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            cp.setDomainZoomable(true);
            jPanel4.removeAll();
            jPanel4.add(cp,BorderLayout.CENTER);
            jPanel4.revalidate();
        }else if((jCheckBox2D.isSelected()) && (jCheckBoxCircular.isSelected())){
            
            DefaultPieDataset hojaDatos = new DefaultPieDataset();

            for(int i = 0; i < jTable1.getRowCount(); i++){
                hojaDatos.setValue(jTable1.getValueAt(i, 1).toString(),Double.parseDouble(jTable1.getValueAt(i, 2).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart(jComboBox1.getSelectedItem().toString(),hojaDatos,true,true,false);
            ChartPanel cp = new ChartPanel(ch);
            cp.setDomainZoomable(true);
            jPanel4.removeAll();
            jPanel4.add(cp,BorderLayout.CENTER);
            jPanel4.revalidate();
        }else if((jCheckBox3D.isSelected()) && (jCheckBoxBarras.isSelected())){
            
            DefaultCategoryDataset hojaDatos = new DefaultCategoryDataset();

            for(int i = 0; i < jTable1.getRowCount(); i++){
                hojaDatos.setValue(Float.parseFloat(jTable1.getValueAt(i, 2).toString()),jTable1.getValueAt(i, 1).toString(),jTable1.getValueAt(i, 1).toString());
            }
            JFreeChart ch = ChartFactory.createBarChart3D(jComboBox1.getSelectedItem().toString(),"Asignatura","Calificacion", hojaDatos,PlotOrientation.VERTICAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            cp.setDomainZoomable(true);
            jPanel4.removeAll();
            jPanel4.add(cp,BorderLayout.CENTER);
            jPanel4.validate();
        }else if((jCheckBox3D.isSelected()) && (jCheckBoxCircular.isSelected())){
            
            DefaultPieDataset hojaDatos = new DefaultPieDataset();

            for(int i = 0; i < jTable1.getRowCount(); i++){
                hojaDatos.setValue(jTable1.getValueAt(i, 1).toString(),Double.parseDouble(jTable1.getValueAt(i, 2).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart3D(jComboBox1.getSelectedItem().toString(),hojaDatos,true,true,false);
            ChartPanel cp = new ChartPanel(ch);
            cp.setDomainZoomable(true);
            jPanel4.removeAll();
            jPanel4.add(cp,BorderLayout.CENTER);
            jPanel4.validate();
        
        }
    }
    
    //Oculta la etiqueta que se le manda por parámetro n segundos
    public void ocultar(JLabel label, int tiempo){
        ActionListener tarea;
        tarea = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                label.setText("");
            }
        };
     Timer timer = new Timer(tiempo, tarea);
     timer.setRepeats(false);
     timer.start();
    }
    
    //Funciones para mover la ventana al arrastrar el encabezado
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
    
    //Al pulsar el botón cerrar
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
        VentanaPrincipal.principal.setEnabled(true);
        VentanaPrincipal.principal.requestFocus();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(JFrame.NORMAL);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnExtender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtender1ActionPerformed
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnExtender1ActionPerformed
    
    //Escuchar si el estado de la lista del combobox ha cambiado
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Seleccione una opcion")){
                defaultTable.setRowCount(0);
                jTable1.setModel(defaultTable);
            }else if((jCheckBox2D.isSelected() || jCheckBox3D.isSelected()) && (jCheckBoxBarras.isSelected() || jCheckBoxCircular.isSelected())){
                this.imprimirTablas();
                this.graficar();
            }else{
                labelResultado.setForeground(Color.red);
                labelResultado.setText("¡Seleccione el tipo de grafico!");
                this.ocultar(labelResultado, 2000);
                jComboBox1.setSelectedIndex(0);
            }
        } else {
            jPanel4.getComponents();
            jPanel4.removeAll();
            jPanel4.revalidate();
            jPanel4.repaint();
        }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    
    //Los siguientes metodos escuchan si se realiza algún cambio en el estado respecto de JCheckBoxs
    private void jCheckBox2DItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2DItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jCheckBox3D.setEnabled(false);
        } else {
            jComboBox1.setSelectedIndex(0);
            jCheckBox3D.setEnabled(true);
        }
            
    }//GEN-LAST:event_jCheckBox2DItemStateChanged

    private void jCheckBox3DItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3DItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jCheckBox2D.setEnabled(false);
        } else {
            jCheckBox2D.setEnabled(true);
            jComboBox1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jCheckBox3DItemStateChanged

    private void jCheckBoxBarrasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxBarrasItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jCheckBoxCircular.setEnabled(false);
        } else {
            jCheckBoxCircular.setEnabled(true);
            jComboBox1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jCheckBoxBarrasItemStateChanged

    private void jCheckBoxCircularItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxCircularItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jCheckBoxBarras.setEnabled(false);
        } else {
            jCheckBoxBarras.setEnabled(true);
            jComboBox1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jCheckBoxCircularItemStateChanged

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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                Estadisticas ventanaTabla = new Estadisticas();
                ventanaTabla.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnExtender1;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JCheckBox jCheckBox2D;
    private javax.swing.JCheckBox jCheckBox3D;
    private javax.swing.JCheckBox jCheckBoxBarras;
    private javax.swing.JCheckBox jCheckBoxCircular;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelResultado;
    // End of variables declaration//GEN-END:variables
}
