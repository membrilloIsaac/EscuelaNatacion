/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela.de.natacion;

/**
 *
 * @author Guillermo
 */
public class Menu extends javax.swing.JFrame {
    static final int AgregarEmpleado = 1;
    static final int ModificarEmpleado = 2;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuEmpleado = new javax.swing.JMenu();
        SubMenuIngresarEmpleado = new javax.swing.JMenuItem();
        MenuModificarEmpleado = new javax.swing.JMenuItem();
        MenuBuscarEmpleado = new javax.swing.JMenuItem();
        MenuBajaAltaEmpleado = new javax.swing.JMenuItem();
        MenuMostrarEmpleados = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        MenuAgregarCliente = new javax.swing.JMenuItem();
        MenuModificarCliente = new javax.swing.JMenuItem();
        MenuBuscarCliente = new javax.swing.JMenuItem();
        MenuEliminarCliente = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuMostrarClientes = new javax.swing.JMenuItem();
        MenuClase = new javax.swing.JMenu();
        MenuAgregarClase = new javax.swing.JMenuItem();
        MenuBuscarClase = new javax.swing.JMenuItem();
        MenuMostrarClases = new javax.swing.JMenuItem();
        MenuEliminarClase = new javax.swing.JMenuItem();
        MenuPago = new javax.swing.JMenu();
        MenuRegistrarPago = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuEmpleado.setLabel("Empleados");

        SubMenuIngresarEmpleado.setText("Ingresar Empleado");
        SubMenuIngresarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuIngresarEmpleadoActionPerformed(evt);
            }
        });
        MenuEmpleado.add(SubMenuIngresarEmpleado);
        SubMenuIngresarEmpleado.getAccessibleContext().setAccessibleName("SubMenuIngresarEmpleado");

        MenuModificarEmpleado.setText("Modificar Empleado");
        MenuModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModificarEmpleadoActionPerformed(evt);
            }
        });
        MenuEmpleado.add(MenuModificarEmpleado);
        MenuModificarEmpleado.getAccessibleContext().setAccessibleName("MenuModificarEmpleado");

        MenuBuscarEmpleado.setText("Buscar Empleado");
        MenuBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarEmpleadoActionPerformed(evt);
            }
        });
        MenuEmpleado.add(MenuBuscarEmpleado);
        MenuBuscarEmpleado.getAccessibleContext().setAccessibleName("MenuBuscarEmpleado");

        MenuBajaAltaEmpleado.setText("Baja/Alta Empleado");
        MenuBajaAltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBajaAltaEmpleadoActionPerformed(evt);
            }
        });
        MenuEmpleado.add(MenuBajaAltaEmpleado);

        MenuMostrarEmpleados.setText("Mostrar Empleados");
        MenuMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMostrarEmpleadosActionPerformed(evt);
            }
        });
        MenuEmpleado.add(MenuMostrarEmpleados);

        jMenuBar1.add(MenuEmpleado);
        MenuEmpleado.getAccessibleContext().setAccessibleName("MenuEmpleado");

        MenuClientes.setText("Clientes");

        MenuAgregarCliente.setText("Agregar Cliente");
        MenuAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgregarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuAgregarCliente);

        MenuModificarCliente.setText("Modificar Cliente");
        MenuModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModificarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuModificarCliente);

        MenuBuscarCliente.setText("Buscar Cliente");
        MenuBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuBuscarCliente);

        MenuEliminarCliente.setText("Baja/Alta Cliente");
        MenuEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEliminarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuEliminarCliente);

        jMenuItem5.setText("Asignar a clase");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenuClientes.add(jMenuItem5);

        MenuMostrarClientes.setText("Mostrar Clientes");
        MenuMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMostrarClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuMostrarClientes);

        jMenuBar1.add(MenuClientes);

        MenuClase.setText("Clase");

        MenuAgregarClase.setText("Agregar");
        MenuAgregarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgregarClaseActionPerformed(evt);
            }
        });
        MenuClase.add(MenuAgregarClase);

        MenuBuscarClase.setText("Buscar");
        MenuBuscarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarClaseActionPerformed(evt);
            }
        });
        MenuClase.add(MenuBuscarClase);

        MenuMostrarClases.setText("Mostrar todas");
        MenuMostrarClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMostrarClasesActionPerformed(evt);
            }
        });
        MenuClase.add(MenuMostrarClases);

        MenuEliminarClase.setText("Eliminar");
        MenuEliminarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEliminarClaseActionPerformed(evt);
            }
        });
        MenuClase.add(MenuEliminarClase);

        jMenuBar1.add(MenuClase);

        MenuPago.setText("Pago");

        MenuRegistrarPago.setText("Registrar Pago");
        MenuRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrarPagoActionPerformed(evt);
            }
        });
        MenuPago.add(MenuRegistrarPago);

        jMenuBar1.add(MenuPago);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubMenuIngresarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuIngresarEmpleadoActionPerformed
        // TODO add your handling code here:
        Empleado empleado=new Empleado();//
        empleado.setVisible(true);
    }//GEN-LAST:event_SubMenuIngresarEmpleadoActionPerformed

    /*ModificarEmpleado*/
    private void MenuModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModificarEmpleadoActionPerformed
        // TODO add your handling code here:
        BuscarEmpleado bModificarEmpleado=new BuscarEmpleado(2);//
        bModificarEmpleado.setVisible(true);
    }//GEN-LAST:event_MenuModificarEmpleadoActionPerformed

    private void MenuBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
        BuscarEmpleado buscarEmpleado=new BuscarEmpleado(1);//
        buscarEmpleado.setVisible(true);
    }//GEN-LAST:event_MenuBuscarEmpleadoActionPerformed

    private void MenuBajaAltaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBajaAltaEmpleadoActionPerformed
        // TODO add your handling code here:
        BuscarEmpleado bBajaEmpleado=new BuscarEmpleado(3);//
        bBajaEmpleado.setVisible(true);
    }//GEN-LAST:event_MenuBajaAltaEmpleadoActionPerformed

    private void MenuMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMostrarEmpleadosActionPerformed
        // TODO add your handling code here:
        MostrarEmpleados mostrar =new MostrarEmpleados();
        mostrar.setVisible(true);
    }//GEN-LAST:event_MenuMostrarEmpleadosActionPerformed

    private void MenuAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgregarClienteActionPerformed
        // TODO add your handling code here:
         Cliente cliente=new Cliente();//
        cliente.setVisible(true);
    }//GEN-LAST:event_MenuAgregarClienteActionPerformed

    private void MenuModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModificarClienteActionPerformed
        // TODO add your handling code here:
         BuscarCliente buscarCliente=new BuscarCliente(2);//
        buscarCliente.setVisible(true);
    }//GEN-LAST:event_MenuModificarClienteActionPerformed

    private void MenuBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarClienteActionPerformed
        // TODO add your handling code here:
        BuscarCliente buscarCliente=new BuscarCliente(1);//
        buscarCliente.setVisible(true);
    }//GEN-LAST:event_MenuBuscarClienteActionPerformed

    private void MenuEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEliminarClienteActionPerformed
        // TODO add your handling code here:
        BuscarCliente bBajaCliente=new BuscarCliente(3);//
        bBajaCliente.setVisible(true);
    }//GEN-LAST:event_MenuEliminarClienteActionPerformed

    private void MenuMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMostrarClientesActionPerformed
        // TODO add your handling code here:
        MostrarClientes mostrarClientes =new MostrarClientes();
        mostrarClientes.setVisible(true);
    }//GEN-LAST:event_MenuMostrarClientesActionPerformed

    private void MenuAgregarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgregarClaseActionPerformed
        // TODO add your handling code here:
       Clase clase=new Clase();
       clase.setVisible(true);
    }//GEN-LAST:event_MenuAgregarClaseActionPerformed

    private void MenuEliminarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEliminarClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuEliminarClaseActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void MenuRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrarPagoActionPerformed
        // TODO add your handling code here:
        RegistrarPago pago=new RegistrarPago();
        pago.setVisible(true);
    }//GEN-LAST:event_MenuRegistrarPagoActionPerformed

    private void MenuBuscarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarClaseActionPerformed
        // TODO add your handling code here:
        BuscarClase bc=new BuscarClase();
        bc.setVisible(true);
    }//GEN-LAST:event_MenuBuscarClaseActionPerformed

    private void MenuMostrarClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMostrarClasesActionPerformed
        // TODO add your handling code here:
        MostrarClases mc=new MostrarClases();
        mc.setVisible(true);
    }//GEN-LAST:event_MenuMostrarClasesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAgregarClase;
    private javax.swing.JMenuItem MenuAgregarCliente;
    private javax.swing.JMenuItem MenuBajaAltaEmpleado;
    private javax.swing.JMenuItem MenuBuscarClase;
    private javax.swing.JMenuItem MenuBuscarCliente;
    private javax.swing.JMenuItem MenuBuscarEmpleado;
    private javax.swing.JMenu MenuClase;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenuItem MenuEliminarClase;
    private javax.swing.JMenuItem MenuEliminarCliente;
    private javax.swing.JMenu MenuEmpleado;
    private javax.swing.JMenuItem MenuModificarCliente;
    private javax.swing.JMenuItem MenuModificarEmpleado;
    private javax.swing.JMenuItem MenuMostrarClases;
    private javax.swing.JMenuItem MenuMostrarClientes;
    private javax.swing.JMenuItem MenuMostrarEmpleados;
    private javax.swing.JMenu MenuPago;
    private javax.swing.JMenuItem MenuRegistrarPago;
    private javax.swing.JMenuItem SubMenuIngresarEmpleado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
