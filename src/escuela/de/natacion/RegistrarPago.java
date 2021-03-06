/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela.de.natacion;

import BaseDeDatos.ConexionMySQL;
import static BaseDeDatos.ConexionMySQL.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guillermo
 */
public class RegistrarPago extends javax.swing.JFrame {

    DefaultTableModel modelo;
    DefaultTableModel asignar;
    double total = 0;

    public void obtenerFolio() {
        try {
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery("Select count(Folio) as num from pago");
            if (rs.next()) {
                int num = rs.getInt("num");
                if (num == 0) {
                    this.txtFolio.setText("1");
                } else {
                    ResultSet max = st.executeQuery("Select max(folio) as maximo from pago");
                    max.last();
                    int maximo = max.getInt("maximo");
                    this.txtFolio.setText("" + (maximo + 1));
                }
            }
            rs.close();
            conexion.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void obtenerFecha() {
        try {
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery("Select now() as fecha");
            if (rs.next()) {
                txtHora.setText(rs.getTimestamp("fecha").toString());
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Creates new form RegistrarPago
     */
    public RegistrarPago() {
        initComponents();
        obtenerFolio();
        obtenerFecha();
        modelo = (DefaultTableModel) tablaBuscarClase.getModel();
        modelo.addColumn("IdClase");
        modelo.addColumn("Instructor");
        modelo.addColumn("Inicio");
        modelo.addColumn("Fin");
        modelo.addColumn("Precio");
        modelo.addColumn("Cupo");
        modelo.addColumn("Disponibles");

        asignar = (DefaultTableModel) tablaAsignar.getModel();
        asignar.addColumn("IdClase");
        asignar.addColumn("Instructor");
        asignar.addColumn("Inicio");
        asignar.addColumn("Fin");
        asignar.addColumn("Precio");
        asignar.addColumn("Cupo");
        asignar.addColumn("Disponibles");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        lblFolio = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBuscarClase = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAsignar = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblCambio = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Agregar a la cuenta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Quitar de la cuenta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem2);

        lblFolio.setText("Folio:");

        txtFolio.setEditable(false);
        txtFolio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblHora.setText("Hora:");

        txtHora.setEditable(false);
        txtHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtCliente.setEditable(false);
        txtCliente.setEnabled(false);

        jLabel3.setText("Cliente:");

        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar Cliente:");

        jLabel1.setText("Clases");

        tablaBuscarClase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaBuscarClase.setComponentPopupMenu(jPopupMenu1);
        tablaBuscarClase.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaBuscarClase);

        jLabel2.setText("Por Pagar");

        tablaAsignar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaAsignar.setComponentPopupMenu(jPopupMenu2);
        tablaAsignar.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaAsignar);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total a Pagar: ");

        txtTotal.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 51, 51));
        txtTotal.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cantidad");

        lblCambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCambio.setText("Cambio");

        txtCambio.setEnabled(false);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo de promocion:");

        jButton1.setText("Aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnBuscarCliente)
                                .addGap(273, 273, 273)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(txtCantidad))
                                .addContainerGap(77, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(jLabel5)
                                .addGap(5, 5, 5)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(btnGuardar))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFolio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(lblHora)
                        .addGap(52, 52, 52)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblCambio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFolio)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblCambio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        limpiarClase();
        int contador = 0;
        if (!txtBuscarCliente.getText().matches("^\\s*$")) {
            String[] datos = new String[7];
            try {
                ConexionMySQL conexion = new ConexionMySQL();
                conexion.MySQLConnection();
                Statement st = Conexion.createStatement();
                ResultSet rs = st.executeQuery("Select"
                        + " c.idclase as id,"
                        + " c.IdInstructor as inst,"
                        + " c.HoraInicio as inicio,"
                        + " c.HoraFinal as fin, "
                        + " c.Precio as p,"
                        + " c.Cupo as cup, "
                        + "c.disponibles as dis"
                        + " from clienteclase as d"
                        + " INNER Join  clase as c ON d.IdClase=c.idclase where d.idcliente=" + txtBuscarCliente.getText());
                while (rs.next()) {
                    if (contador == 0) {
                        txtCliente.setText(txtBuscarCliente.getText());
                    }
                    datos[0] = "" + rs.getInt("id");
                    datos[1] = rs.getString("inst");
                    datos[2] = rs.getString("inicio");
                    datos[3] = rs.getString("fin");
                    datos[4] = rs.getString("p");
                    datos[5] = rs.getString("cup");
                    datos[6] = rs.getString("dis");
                    modelo.addRow(datos);
                    contador++;
                }
                if (contador == 0) {
                    txtCliente.setText("");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    public void BuscarPromo(){
        
        try
            {
                ConexionMySQL conexion = new ConexionMySQL();
                conexion.MySQLConnection();
                Statement st = Conexion.createStatement();
                ResultSet rs = st.executeQuery("SELECT Porcentaje FROM promocion WHERE IdPromocion="+jTextField1.getText().toString());
                while(rs.next())
                {
                    double descuento=rs.getDouble("Porcentaje");
                    
                    double total=Double.parseDouble(txtTotal.getText().toString());
                    
                    total=total-(total*(descuento*0.01));    
                    if(total<0)
                        txtTotal.setText("0");
                    else
                        txtTotal.setText(Double.toString(total).substring(0, Double.toString(total).indexOf(".")+2));
                }
                rs.close();
                conexion.closeConnection();
                
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
    }
    
    //Agregar
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int filas = tablaAsignar.getRowCount();
        int encontro = 0;
        if (filas > 0) {
            for (int i = 0; filas > i; i++) {
                String aux = asignar.getValueAt(i, 0).toString();
                if (aux.equals(modelo.getValueAt(tablaBuscarClase.getSelectedRow(), 0))) {
                    encontro = 1;
                    JOptionPane.showMessageDialog(rootPane, "Ya esta en tu asignacion");
                    break;
                }
            }
        }

        if (encontro == 0) {
            String[] fila = new String[7];
            for (int i = 0; i < tablaBuscarClase.getColumnCount(); i++) {
                fila[i] = (String) modelo.getValueAt(tablaBuscarClase.getSelectedRow(), i);
            }
            String aux = (modelo.getValueAt(tablaBuscarClase.getSelectedRow(), 4).toString());
            total += Double.parseDouble(aux);
            txtTotal.setText("" + total);
            asignar.addRow(fila);
            modelo.removeRow(tablaBuscarClase.getSelectedRow());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int filas = tablaAsignar.getRowCount();
        if (filas > 0) {
            String[] fila = new String[7];
            for (int i = 0; i < tablaAsignar.getColumnCount(); i++) {
                fila[i] = (String) asignar.getValueAt(tablaAsignar.getSelectedRow(), i);
            }
            String aux = (asignar.getValueAt(tablaAsignar.getSelectedRow(), 4).toString());
            total -= Double.parseDouble(aux);
            txtTotal.setText("" + total);

            modelo.addRow(fila);
            asignar.removeRow(tablaAsignar.getSelectedRow());

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    public void limpiarAsignar()
    {
        int filas=tablaAsignar.getRowCount();
        for (int i = 0;filas>i; i++) 
        {
            asignar.removeRow(0);
        }
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        total=0;
        obtenerFolio();
        int correcto = 1;
        if (txtCliente.getText().matches("^\\s*$")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el id");
        } else {
            if (txtCantidad.getText().matches("^\\s*$")) 
            {
                JOptionPane.showMessageDialog(rootPane, "Por favor ingrese la  cantidad");
            } 
            else 
            {
                try 
                {
                    if (Double.parseDouble(txtCantidad.getText()) >= Double.parseDouble(txtTotal.getText())) 
                    {
                        Double resul = Double.parseDouble(txtCantidad.getText()) - Double.parseDouble(txtTotal.getText());
                        txtCambio.setText(resul.toString());
                        ConexionMySQL conexion = new ConexionMySQL();
                        conexion.MySQLConnection();
                        Statement st = Conexion.createStatement();
                        int filas = tablaAsignar.getRowCount();
                        if (filas > 0) 
                        {
                            ResultSet rs = st.executeQuery("Select *from pago "
                                        + "where "
                                        + "DATEDIFF(now(),(Select max(Fecha)from pago where IdCliente=1)) >1");
                                if (rs.next()==false) 
                                {
                                    String q = "INSERT INTO pago"
                                            + " (Folio, Fecha, IdCliente)"
                                            + " VALUES"
                                            + "(" + txtFolio.getText() + ","
                                            + " (select NOW()), "
                                            + " " + txtCliente.getText() + ")";
                                    st.executeUpdate(q);
                                    for (int i = 0; filas > i; i++) 
                                    {
                                        String u = "INSERT INTO pagodetalle"
                                                + " (Folio,"
                                                + " TipoDePago,"/*0 para clase normal*/
                                                + " IdClase,"
                                                + "Cantidad)"
                                                + " VALUES"
                                                + "(" + txtFolio.getText() + ","
                                                + " " + 0 + ", "
                                                + " " + asignar.getValueAt(i, 0) + ","
                                                + " " + txtTotal.getText().toString() + ")";
                                        st.executeUpdate(u);
                                    }
                                }
                                else
                                {
                                    correcto=0;
                                    JOptionPane.showMessageDialog(rootPane, "Intenta registrar un pago con una diferencia menor de 1 dia");
                                }
                            }

                        if (correcto == 1) 
                        {
                            JOptionPane.showMessageDialog(rootPane, "Se registraron correctamente todas las clases");
                        }

                        txtCliente.setText("");
                        limpiarClase();
                        limpiarAsignar();
                        txtCantidad.setText("");
                        txtTotal.setText("");
                        txtCambio.setText("");
                        obtenerFolio();
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(rootPane, "Error ingrese una cantidad suficiente o elimine una clase");
                         
                    }

                } catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BuscarPromo();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiarClase() {
        int filas = tablaBuscarClase.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
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
            java.util.logging.Logger.getLogger(RegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTable tablaAsignar;
    private javax.swing.JTable tablaBuscarClase;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
