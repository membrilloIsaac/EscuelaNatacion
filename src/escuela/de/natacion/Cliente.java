/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela.de.natacion;

import BaseDeDatos.ConexionMySQL;
import static BaseDeDatos.ConexionMySQL.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngineResult.Status;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillermo
 */
public class Cliente extends javax.swing.JFrame {
    int IdCliente;
    String ApellidoPaternoCliente;
    String ApellidoMaternoCliente;
    String NombreCliente;
    String TelefonoCliente;
    String NumInteriorCliente;
    String CalleCliente;
    String ColoniaCliente;
    String MunicipioCliente;
    String EntidadCliente;
    int Status;
    
    public void IdSiguienteCliente()
    {
        try
        {
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery("Select count(IdCliente) as num from cliente");
            while (rs.next())
            {
                int num=rs.getInt("num");
                if(num==0)
                {
                    this.txtIdCliente.setText("1");
                }
                else
                {
                    ResultSet max = st.executeQuery("Select max(IdCliente) as maximo from cliente");
                    max.last();
                    int maximo= max.getInt("maximo");
                    this.txtIdCliente.setText(""+(maximo+1));       
                   }
                }
                rs.close();
                conexion.closeConnection();
                
                }
                catch(Exception e)
                {
                    
                }
    }
    
    public Cliente()
    {
        initComponents();
        this.btnBajaCliente.setVisible(false);
        this.btnModificarCliente.setVisible(false);
        
        this.btnIngresarCliente.setVisible(true);
        lblEstado.setVisible(false);
        cmbEstado.setVisible(false);
        IdSiguienteCliente();    
    }
    public Cliente(int id, int op)
    {
        initComponents();
        this.btnIngresarCliente.setVisible(false);
        try 
        {
            this.btnBajaCliente.setVisible(false);
            this.btnModificarCliente.setVisible(false);
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery("Select  *from cliente where IdCliente="+id);
            while(rs.next())
            {
                int ID= rs.getInt("IdCliente");
                txtIdCliente.setText(""+ID);
                txtApellidoPaternoCliente.setText(rs.getString("ApellidoPaterno"));
                txtApellidoMaternoCliente.setText(rs.getString("ApellidoMaterno"));
                txtNombreCliente.setText(rs.getString("Nombre"));
                txtTelefonoCliente.setText(rs.getString("Telefono"));
                txtNumeroInteriorCliente.setText(rs.getString("NumeroInterior"));
                txtCalleCliente.setText(rs.getString("Calle"));
                txtColoniaCliente.setText(rs.getString("Colonia"));
                txtMunicipioCliente.setText(rs.getString("Municipio"));
                txtEntidadCliente.setText(rs.getString("Entidad"));
                Status=rs.getInt("Status");
                if(Status==0)
                {
                    cmbEstado.setSelectedIndex(0);
                }
                else
                {
                    cmbEstado.setSelectedIndex(1);
                }
            }
            cmbEstado.setEnabled(false);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(op==1)
        {
            bloquearCampos();
        }
        if(op==2)//2 modificar
        {
            this.btnBajaCliente.setVisible(false);
            this.btnModificarCliente.setVisible(true);
            
        }
        if(op==3)//3 eliminar
        {
            this.btnBajaCliente.setVisible(true);
            this.btnModificarCliente.setVisible(false);
            bloquearCampos();
            cmbEstado.setEnabled(true);
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

        panelCliente = new javax.swing.JPanel();
        lblNombreCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblApellidoPaternoCliente = new javax.swing.JLabel();
        lblApellidoMaternoCliente = new javax.swing.JLabel();
        txtApellidoMaternoCliente = new javax.swing.JTextField();
        txtApellidoPaternoCliente = new javax.swing.JTextField();
        lblTelefonoCliente = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        lblCalleCliente = new javax.swing.JLabel();
        txtCalleCliente = new javax.swing.JTextField();
        lblNumeroInterior = new javax.swing.JLabel();
        txtNumeroInteriorCliente = new javax.swing.JTextField();
        lblColoniaCliente = new javax.swing.JLabel();
        txtColoniaCliente = new javax.swing.JTextField();
        lblMunicipioCliente = new javax.swing.JLabel();
        txtMunicipioCliente = new javax.swing.JTextField();
        lblEntidadCliente = new javax.swing.JLabel();
        txtEntidadCliente = new javax.swing.JTextField();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        btnIngresarCliente = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnBajaCliente = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelCliente.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        lblNombreCliente.setText("Nombre:");

        lblApellidoPaternoCliente.setText("Apellido Paterno:");

        lblApellidoMaternoCliente.setText("Apellido Materno:");

        lblTelefonoCliente.setText("Telefono:");

        lblCalleCliente.setText("Calle:");

        lblNumeroInterior.setText("Numero Interior:");

        lblColoniaCliente.setText("Colonia:");

        lblMunicipioCliente.setText("Municipio:");

        lblEntidadCliente.setText("Entidad:");

        lblIdCliente.setText("ID de Empleado:");

        txtIdCliente.setEditable(false);

        btnIngresarCliente.setLabel("Ingresar");
        btnIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarClienteActionPerformed(evt);
            }
        });

        btnCerrar.setLabel("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnModificarCliente.setText("Modificar");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnBajaCliente.setText("Guardar Estado Actual");
        btnBajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaClienteActionPerformed(evt);
            }
        });

        lblEstado.setText("Estado:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inactivo", "Activo" }));

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreCliente)
                                    .addComponent(lblTelefonoCliente)
                                    .addComponent(lblCalleCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addComponent(txtCalleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNumeroInterior)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumeroInteriorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(lblColoniaCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtColoniaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(lblIdCliente)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(lblApellidoPaternoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidoPaternoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(lblApellidoMaternoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidoMaternoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnModificarCliente)
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addComponent(lblMunicipioCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblEntidadCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEntidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(btnBajaCliente))))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(lblEstado)
                                .addGap(18, 18, 18)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnIngresarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCliente)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoPaternoCliente)
                    .addComponent(txtApellidoPaternoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoMaternoCliente)
                    .addComponent(txtApellidoMaternoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCliente)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefonoCliente)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalleCliente)
                    .addComponent(txtCalleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroInterior)
                    .addComponent(lblColoniaCliente)
                    .addComponent(txtColoniaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroInteriorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipioCliente)
                    .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEntidadCliente)
                    .addComponent(txtEntidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstado)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarCliente)
                    .addComponent(btnCerrar)
                    .addComponent(btnModificarCliente)
                    .addComponent(btnBajaCliente))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarClienteActionPerformed
        Status=1;//Activo
        Boolean correcto;
        try
        {
            correcto=obtenercampos();
            if(correcto==true)
            {
                ConexionMySQL mysql = new ConexionMySQL();
                mysql.MySQLConnection();
                String Query = "INSERT INTO cliente "
                + "(IdCliente,"
                + "ApellidoPaterno,"
                + "ApellidoMaterno,"
                + "Nombre,"
                + "Telefono,"
                + "NumeroInterior,"
                + "Calle,"
                + "Colonia,"
                + "Municipio,"
                + "Entidad,"
                + "Status) "
                + "VALUES "
                + "("+IdCliente+","
                + "'"+ApellidoPaternoCliente+"',"
                + "'"+ApellidoMaternoCliente+"',"
                + "'"+NombreCliente+"',"
                + "'"+TelefonoCliente+"',"
                + "'"+NumInteriorCliente+"',"
                + "'"+CalleCliente+"',"
                + "'"+ColoniaCliente+"',"
                + "'"+MunicipioCliente+"',"
                + "'"+EntidadCliente+"',"
                + ""+Status+")";

                Statement st = Conexion.createStatement();
                st.executeUpdate(Query);
                mysql.closeConnection();
                JOptionPane.showMessageDialog(null, "Cliente Ingresado satisfactoriamente con el ID:"+IdCliente);
                limpiarCliente();
            }
            else
            {
                JOptionPane.showMessageDialog(panelCliente,"Los apellidos y el nombre son campos obligatorios");
            }

        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btnIngresarClienteActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();//Cerrar esta ventana
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        obtenercampos();
        try
        {
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();

            String Query;
            Query="UPDATE cliente SET ApellidoPaterno='"+ApellidoPaternoCliente+"',"
            + ""+"ApellidoMaterno='"+ApellidoPaternoCliente+"',"
            + ""+"Nombre='"+NombreCliente+"',"
            + ""+"Telefono='"+TelefonoCliente+"',"
            + ""+"NumeroInterior='"+NumInteriorCliente+"',"
            + ""+"Calle='"+CalleCliente+"',"
            + ""+"Colonia='"+ColoniaCliente+"',"
            + ""+"Municipio='"+MunicipioCliente+"',"
            + ""+"Entidad='"+EntidadCliente+"'"
            +"WHERE IdCliente="+IdCliente;

            PreparedStatement pst= Conexion.prepareStatement(Query);
            pst.executeUpdate();
            pst.close();
            conexion.closeConnection();
            JOptionPane.showMessageDialog(panelCliente, "Registro Modificado Exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(panelCliente, ex);
        }
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnBajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaClienteActionPerformed
        // TODO add your handling code here:
        obtenercampos();
        try
        {
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.MySQLConnection();
            Status=cmbEstado.getSelectedIndex();
            String Query;
            Query="UPDATE cliente SET Status='"+Status+"'"
            +"WHERE IdCliente="+IdCliente;

            PreparedStatement pst= Conexion.prepareStatement(Query);
            pst.executeUpdate();
            pst.close();
            conexion.closeConnection();
            JOptionPane.showMessageDialog(panelCliente, "Status Modificado Exitosamente");
            this.dispose();
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btnBajaClienteActionPerformed

    public Boolean obtenercampos()
    {
        Boolean correcto=true;
       
        if(txtIdCliente.getText().matches("^\\s*$"))
        {
            correcto=false;
        }
        else
        {
             IdCliente=Integer.parseInt(txtIdCliente.getText());
        }
        ApellidoPaternoCliente= txtApellidoPaternoCliente.getText();
        if(ApellidoPaternoCliente.matches("^\\s*$"))
        {
            correcto=false;
        }
        ApellidoMaternoCliente= txtApellidoMaternoCliente.getText();
        if(ApellidoMaternoCliente.matches("^\\s*$"))
        {
            correcto=false;
        }
        NombreCliente = txtNombreCliente.getText();
        if(NombreCliente.matches("^\\s*$"))
        {
            correcto=false;
        }
        TelefonoCliente = txtTelefonoCliente.getText();
        NumInteriorCliente = txtNumeroInteriorCliente.getText();
        CalleCliente = txtCalleCliente.getText();
        ColoniaCliente = txtColoniaCliente.getText();
        MunicipioCliente = txtMunicipioCliente.getText();
        EntidadCliente = txtEntidadCliente.getText();
        if(EntidadCliente.equals(""))
        {
            EntidadCliente="JALISCO";
        }
        return correcto;
    }
    public void limpiarCliente()
    {
        IdSiguienteCliente();
        txtApellidoPaternoCliente.setText("");
        txtApellidoMaternoCliente.setText("");
        txtNombreCliente.setText("");
        txtTelefonoCliente.setText("");
        txtNumeroInteriorCliente.setText("");
        txtCalleCliente.setText("");
        txtColoniaCliente.setText("");
        txtMunicipioCliente.setText("");
        txtEntidadCliente.setText("");
        Status=1;
    }
    
    public void bloquearCampos()
    {
                txtApellidoPaternoCliente.setEditable(false);
                txtApellidoMaternoCliente.setEditable(false);
                txtNombreCliente.setEditable(false);
                txtTelefonoCliente.setEditable(false);
                txtNumeroInteriorCliente.setEditable(false);
                txtCalleCliente.setEditable(false);
                txtColoniaCliente.setEditable(false);
                txtMunicipioCliente.setEditable(false);
                txtEntidadCliente.setEditable(false);
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBajaCliente;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresarCliente;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JLabel lblApellidoMaternoCliente;
    private javax.swing.JLabel lblApellidoPaternoCliente;
    private javax.swing.JLabel lblCalleCliente;
    private javax.swing.JLabel lblColoniaCliente;
    private javax.swing.JLabel lblEntidadCliente;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblMunicipioCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNumeroInterior;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JTextField txtApellidoMaternoCliente;
    private javax.swing.JTextField txtApellidoPaternoCliente;
    private javax.swing.JTextField txtCalleCliente;
    private javax.swing.JTextField txtColoniaCliente;
    private javax.swing.JTextField txtEntidadCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtMunicipioCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumeroInteriorCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
