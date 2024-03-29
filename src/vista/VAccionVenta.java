/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author Lenovo
 */
public class VAccionVenta extends javax.swing.JFrame {

    int accion = 0; // Accion a relizar: 0 = Crear, 1 = Modificar, 2 = Eliminar
   

    public VAccionVenta(int accion) {
        initComponents();
        if (accion == 1) {
            this.accion = accion;
            lblTitle.setText("Modificar venta");
            labelCrear.setText("Modificar");
            setLocationRelativeTo(null);
            pack();
            try {
                llenarbox();
                llenarvendedor();
            } catch (SQLException ex) {
                Logger.getLogger(VAccionVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (accion == 2) {
            this.accion = accion;
            lblTitle.setText("Eliminar venta");
            labelCrear.setText("Eliminar");
            txtId.setForeground(Color.black);
            txtCliente.setEnabled(false);
            txtCliente.setText("Omite este campo");
            calendariocaja.setEnabled(false);
            txtMonto.setEnabled(false);
            txtMonto.setText("Omite este campo");
            Motocaja.setEnabled(false);
            Tipopago.setEnabled(false);
            Vendedorcaja.setEnabled(false);
            setLocationRelativeTo(null);
            try {
                llenarbox();
                llenarvendedor();
            } catch (SQLException ex) {
                Logger.getLogger(VAccionVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            pack();
            
        } else {
            txtId.setEnabled(false);
            txtId.setText("Omite este campo");
            setLocationRelativeTo(null);
            pack();
            try {
                llenarbox();
                llenarvendedor();
            } catch (SQLException ex) {
                Logger.getLogger(VAccionVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        calendariocaja = new com.toedter.calendar.JDateChooser();
        Tipopago = new javax.swing.JComboBox<>();
        Motocaja = new javax.swing.JComboBox<>();
        Vendedorcaja = new javax.swing.JComboBox<>();
        buttons = new javax.swing.JPanel();
        btnAccion = new javax.swing.JPanel();
        labelCrear = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnConsular = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top.setBackground(new java.awt.Color(21, 25, 29));

        lblTitle.setFont(new java.awt.Font("SlimSansSerif", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Agregar venta");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));

        jLabel1.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Id:");

        txtId.setFont(new java.awt.Font("SlimSansSerif", 0, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(204, 204, 204));
        txtId.setBorder(null);
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Vendedor");

        jLabel3.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Moto");

        txtCliente.setFont(new java.awt.Font("SlimSansSerif", 0, 12)); // NOI18N
        txtCliente.setBorder(null);

        jLabel4.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Cliente");

        txtMonto.setFont(new java.awt.Font("SlimSansSerif", 0, 12)); // NOI18N
        txtMonto.setBorder(null);

        jLabel6.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Monto");

        jLabel7.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Fecha");

        jLabel8.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Tipo de pago");

        Tipopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione", "Credito con sucursal", "Credito con banco", "Efectivo" }));

        Motocaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione" }));
        Motocaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotocajaActionPerformed(evt);
            }
        });

        Vendedorcaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione" }));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(Tipopago, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calendariocaja, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(txtCliente)
                    .addComponent(txtId)
                    .addComponent(txtMonto)
                    .addComponent(Motocaja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vendedorcaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vendedorcaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Motocaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addComponent(Tipopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(calendariocaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 440));

        buttons.setBackground(new java.awt.Color(33, 37, 41));

        btnAccion.setBackground(new java.awt.Color(21, 25, 29));
        btnAccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccionMouseClicked(evt);
            }
        });

        labelCrear.setFont(new java.awt.Font("SlimSansSerif", 1, 14)); // NOI18N
        labelCrear.setForeground(new java.awt.Color(255, 255, 255));
        labelCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrear.setText("Crear");

        javax.swing.GroupLayout btnAccionLayout = new javax.swing.GroupLayout(btnAccion);
        btnAccion.setLayout(btnAccionLayout);
        btnAccionLayout.setHorizontalGroup(
            btnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAccionLayout.setVerticalGroup(
            btnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        btnRegresar.setBackground(new java.awt.Color(21, 25, 29));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SlimSansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Regresar");

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        btnConsular.setBackground(new java.awt.Color(21, 25, 29));
        btnConsular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsularMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SlimSansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Consultar");

        javax.swing.GroupLayout btnConsularLayout = new javax.swing.GroupLayout(btnConsular);
        btnConsular.setLayout(btnConsularLayout);
        btnConsularLayout.setHorizontalGroup(
            btnConsularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConsularLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(14, 14, 14))
        );
        btnConsularLayout.setVerticalGroup(
            btnConsularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        background.add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 290, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void llenarbox() throws SQLException{
        DaoMoto ob1 = new DaoMoto();
        ResultSet rs = ob1.getMotos("");
        while(rs.next()){
            Motocaja.addItem(rs.getString("linea"));
        }
    }
    
    private void llenarvendedor() throws SQLException{
        DaoVendedor ob1 = new DaoVendedor();
        ResultSet rs = ob1.getVendedor("");
        while(rs.next()){
            Vendedorcaja.addItem(rs.getString("Nombre"));
        }
    }
            
    
    
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    private void btnAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccionMouseClicked

        DaoVenta crud = new DaoVenta();
        DtoVenta venta = new DtoVenta();
        DaoVendedor ob1 = new DaoVendedor();

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        int resultado = 0;
        
        switch (this.accion) { 
            case 0:       
                resultado = ob1.consultaid((String) Vendedorcaja.getSelectedItem());
                venta.setIdVendedor(String.valueOf(resultado));
                venta.setIdMoto(Motocaja.getSelectedIndex());
                venta.setIdCliente(txtCliente.getText());
                venta.setIdTipoPago(Tipopago.getSelectedIndex());
                try {
                    String fecha = formato.format(calendariocaja.getDate());
                    java.util.Date utilDate = formato.parse(fecha);
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // Convertir a java.sql.Date
                    venta.setFecha(sqlDate);
                } catch (ParseException ex) {
                    System.out.println("Error al parsear la fecha" + ex);
                }
                venta.setMonto(Long.parseLong(txtMonto.getText()));
                if (crud.agregar(venta)) {
                    JOptionPane.showMessageDialog(this, "Exito: venta realizada por " + Vendedorcaja.getSelectedItem() + " agregada con exito.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error: la venta no ha sido agregada.");
                }
                break;

            case 1:
                
                resultado = ob1.consultaid((String) Vendedorcaja.getSelectedItem());
                venta.setId(Integer.parseInt(txtId.getText()));
                venta.setIdVendedor(String.valueOf(resultado));
                venta.setIdMoto(Motocaja.getSelectedIndex());
                venta.setIdCliente(txtCliente.getText());
                venta.setIdTipoPago(Tipopago.getSelectedIndex());
                try {
                    String fecha = formato.format(calendariocaja.getDate());
                    
                    java.util.Date utilDate = formato.parse(fecha);
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // Convertir a java.sql.Date
                    venta.setFecha(sqlDate);
                } catch (ParseException ex) {
                    System.out.println("Error al parsear la fecha" + ex);
                }
                venta.setMonto(Long.parseLong(txtMonto.getText()));
                
                if (crud.modificar(venta)) {
                    JOptionPane.showMessageDialog(this, "Exito: venta modificada con exito.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error: la venta no ha sido modificada.");
                }
                break;
            case 2:
                if (crud.eliminar(Integer.parseInt(txtId.getText()))) {
                    JOptionPane.showMessageDialog(this, "Exito: venta eliminada con exito.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error: la venta no ha sido eliminada.");
                }
                break;
        }
    }//GEN-LAST:event_btnAccionMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnConsularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsularMouseClicked
        DaoVenta crud = new DaoVenta();
        DtoVenta venta = new DtoVenta();

        venta.setId(Integer.parseInt(txtId.getText()));
        if (crud.consultar(venta)) {
            txtCliente.setText(venta.getIdCliente());
            calendariocaja.setDate(venta.getFecha());
            txtMonto.setText(String.valueOf(venta.getMonto()));
        } else {
            JOptionPane.showMessageDialog(this, "Error: venta no encontrado en la base de datos.");
        }
    }//GEN-LAST:event_btnConsularMouseClicked

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        txtId.setForeground(Color.black);
    }//GEN-LAST:event_txtIdMouseClicked

    private void MotocajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotocajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotocajaActionPerformed

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
            java.util.logging.Logger.getLogger(VAccionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAccionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAccionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAccionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new VAccionVenta(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Motocaja;
    private javax.swing.JComboBox<String> Tipopago;
    private javax.swing.JComboBox<String> Vendedorcaja;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnAccion;
    private javax.swing.JPanel btnConsular;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JPanel buttons;
    private com.toedter.calendar.JDateChooser calendariocaja;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelCrear;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel top;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
