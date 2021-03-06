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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guillermo
 */
public class BuscarPago extends javax.swing.JFrame {
DefaultTableModel modelo;
    /**
     * Creates new form BuscarPago
     */
    public BuscarPago() {
        initComponents();
        modelo = (DefaultTableModel) tablaBuscarClase.getModel();
        modelo.addColumn("IdClase");
        modelo.addColumn("Instructor");
        modelo.addColumn("Inicio");
        modelo.addColumn("Fin");
        modelo.addColumn("Cupo");
        modelo.addColumn("Cantidad");
        
    }

    public void limpiarClase() {
        int filas = tablaBuscarClase.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
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

        txtBuscarFolio = new javax.swing.JTextField();
        btnBuscarFolio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        lblFolio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBuscarClase = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        btnBuscarFolio.setText("Buscar Folio");
        btnBuscarFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFolioActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar Folio:");

        txtHora.setEditable(false);
        txtHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblHora.setText("Hora:");

        txtFolio.setEditable(false);
        txtFolio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblFolio.setText("Folio:");

        jLabel3.setText("Cliente:");

        txtCliente.setEditable(false);
        txtCliente.setEnabled(false);

        tablaBuscarClase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaBuscarClase.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaBuscarClase);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total Pagado: ");

        txtTotal.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 51, 51));
        txtTotal.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnBuscarFolio))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFolio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(172, 172, 172)
                        .addComponent(lblHora)
                        .addGap(52, 52, 52)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscarFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFolio))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFolio)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFolioActionPerformed
        // TODO add your handling code here
        int total=0;
        limpiarClase();
        int contador = 0;
        if (!txtBuscarFolio.getText().matches("^\\s*$")) {
            String[] datos = new String[6];
            try {
                ConexionMySQL conexion = new ConexionMySQL();
                conexion.MySQLConnection();
                Statement st = Conexion.createStatement();
                ResultSet rs = st.executeQuery("Select"
                    + " pago.folio as fo, "
                    + " pago.fecha as f, "
                    + " pago.IdCliente as CLi, "   
                    + " pagodetalle.idclase, "
                    + " c.idclase as id,"
                    + " c.IdInstructor as inst,"
                    + " c.HoraInicio as inicio,"
                    + " c.HoraFinal as fin, "
                    + " c.Cupo as cup, "
                    + " pagodetalle.cantidad as cant"
                    + " from pago"
                    + " INNER Join  pagodetalle ON pagodetalle.folio=pago.folio "
                    + " INNER Join  clase as c ON pagodetalle.IdClase=c.idclase "
                    + " WHERE pagodetalle.folio=" + txtBuscarFolio.getText());
                while (rs.next()) 
                {
                    txtFolio.setText(""+rs.getInt("fo"));
                    txtHora.setText(rs.getString("f")); 
                    txtCliente.setText(rs.getString("CLi"));
                    datos[0] = rs.getString("id");
                    datos[1] = rs.getString("inst");
                    datos[2] = rs.getString("inicio");
                    datos[3] = rs.getString("fin");
                    datos[4] = rs.getString("cup");
                    datos[5] = rs.getString("cant");
                    total+=Integer.parseInt(datos[5]);
                    modelo.addRow(datos);
                    contador++;
                    txtFolio.setText(datos[0]);
                    
                }
                if (contador == 0) {
                    txtCliente.setText("");
                    limpiarClase();
                }
                txtTotal.setText(""+total);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
    }//GEN-LAST:event_btnBuscarFolioActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFolio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTable tablaBuscarClase;
    private javax.swing.JTextField txtBuscarFolio;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
