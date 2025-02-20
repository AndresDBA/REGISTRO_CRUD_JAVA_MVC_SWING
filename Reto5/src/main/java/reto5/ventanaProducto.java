/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static reto5.crudProducto.acceso;

/**
 *
 * @author andreabautista
 */
public class ventanaProducto extends javax.swing.JFrame {

    /**
     * Creates new form ventanaProducto
     */
    public ventanaProducto() {
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

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        idProdLbl = new javax.swing.JLabel();
        nomProdLbl = new javax.swing.JLabel();
        precioProdLbl = new javax.swing.JLabel();
        descripProdLbl = new javax.swing.JLabel();
        fechaProdLbl = new javax.swing.JLabel();
        idProdTxt = new javax.swing.JTextField();
        nomProdTxt = new javax.swing.JTextField();
        precioProdTxt = new javax.swing.JTextField();
        desProdTxt = new javax.swing.JTextField();
        fechaProdTxt = new javax.swing.JTextField();
        regProdBtn = new javax.swing.JButton();
        actProdBtn = new javax.swing.JButton();
        elimProdBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productoTable = new javax.swing.JTable();
        Modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Titulo.setText("TIENDA RETO 5");

        idProdLbl.setText("ID del Producto:");

        nomProdLbl.setText("Nombre:");

        precioProdLbl.setText("Precio:");

        descripProdLbl.setText("Descripción:");

        fechaProdLbl.setText("Fecha de caducidad:");

        idProdTxt.setToolTipText("");
        idProdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProdTxtActionPerformed(evt);
            }
        });

        regProdBtn.setText("Registrar");
        regProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regProdBtnActionPerformed(evt);
            }
        });

        actProdBtn.setText("Actualizar");
        actProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actProdBtnActionPerformed(evt);
            }
        });

        elimProdBtn.setText("Eliminar");
        elimProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimProdBtnActionPerformed(evt);
            }
        });

        productoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        productoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productoTable);

        Modificar.setText("Modificar");
        Modificar.setActionCommand("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desProdTxt)
                            .addComponent(fechaProdTxt)
                            .addComponent(nomProdTxt)
                            .addComponent(precioProdTxt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaProdLbl)
                                    .addComponent(idProdLbl)
                                    .addComponent(descripProdLbl)
                                    .addComponent(nomProdLbl)
                                    .addComponent(precioProdLbl))
                                .addGap(0, 187, Short.MAX_VALUE))
                            .addComponent(idProdTxt))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(regProdBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(actProdBtn)
                        .addGap(87, 87, 87)
                        .addComponent(Modificar)
                        .addGap(100, 100, 100)
                        .addComponent(elimProdBtn)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idProdLbl)
                        .addGap(2, 2, 2)
                        .addComponent(idProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomProdLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioProdLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripProdLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaProdLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regProdBtn)
                    .addComponent(actProdBtn)
                    .addComponent(elimProdBtn)
                    .addComponent(Modificar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarDatos() {

        String[] campos = {"ID", "Nombre", "Precio", "Descripcion", "Fecha"};
        DefaultTableModel modelo = new DefaultTableModel(campos, 0);
        productoTable.setModel(modelo);

        for (int i = 0; i < crudProducto.consultarProducto().size(); i++) {
            int codigo = crudProducto.consultarProducto().get(i).id;
            String nombre = crudProducto.consultarProducto().get(i).nombre;
            int precio = crudProducto.consultarProducto().get(i).precio;
            String descripcion = crudProducto.consultarProducto().get(i).descripcion;
            String fecha = crudProducto.consultarProducto().get(i).fecha;

            Object objetoDatos[] = {codigo, nombre, precio, descripcion, fecha};
            modelo.addRow(objetoDatos);
            } 
    }
    
    private void idProdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProdTxtActionPerformed

    private void elimProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimProdBtnActionPerformed
        // TODO add your handling code here:
        
        int fila = productoTable.getSelectedRow();
        int valorFila = productoTable.getSelectedRowCount();
        
        if(valorFila<1){
        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto", "Eliminar",JOptionPane.INFORMATION_MESSAGE);
        }
        else{  
            int id = Integer.parseInt(productoTable.getValueAt(fila,0).toString());
            crudProducto.eliminarProducto(id);
            
            }

    }//GEN-LAST:event_elimProdBtnActionPerformed

    private void regProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regProdBtnActionPerformed
        // TODO add your handling code here:
        
        int id;
        String nombre;
        int precio;
        String descripcion;
        String fecha;

        id = Integer.parseInt(idProdTxt.getText());
        nombre = nomProdTxt.getText();
        precio = Integer.parseInt(precioProdTxt.getText());
        descripcion = desProdTxt.getText();
        fecha = fechaProdTxt.getText();
        
        crudProducto.crearProducto(new Producto(id, nombre, precio, descripcion, fecha)); 
        
    }//GEN-LAST:event_regProdBtnActionPerformed

    private void actProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actProdBtnActionPerformed
        // TODO add your handling code here:
        
        actualizarDatos();
            
    }//GEN-LAST:event_actProdBtnActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        
        int id;
        String nombre;
        int precio;
        String descripcion;
        String fecha;

        id = Integer.parseInt(idProdTxt.getText());
        nombre = nomProdTxt.getText();
        precio = Integer.parseInt(precioProdTxt.getText());
        descripcion = desProdTxt.getText();
        fecha = fechaProdTxt.getText();
        
        crudProducto.modificarProducto(new Producto(id, nombre, precio, descripcion, fecha));
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void productoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoTableMouseClicked
        // TODO add your handling code here:
        
        int fila = productoTable.getSelectedRow();
        idProdTxt.setText(productoTable.getValueAt(fila, 0).toString());
        nomProdTxt.setText(productoTable.getValueAt(fila, 1).toString());
        precioProdTxt.setText(productoTable.getValueAt(fila, 2).toString());
        desProdTxt.setText(productoTable.getValueAt(fila, 3).toString());
        fechaProdTxt.setText(productoTable.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_productoTableMouseClicked

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
            java.util.logging.Logger.getLogger(ventanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton actProdBtn;
    private javax.swing.JTextField desProdTxt;
    private javax.swing.JLabel descripProdLbl;
    private javax.swing.JButton elimProdBtn;
    private javax.swing.JLabel fechaProdLbl;
    private javax.swing.JTextField fechaProdTxt;
    private javax.swing.JLabel idProdLbl;
    private javax.swing.JTextField idProdTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomProdLbl;
    private javax.swing.JTextField nomProdTxt;
    private javax.swing.JLabel precioProdLbl;
    private javax.swing.JTextField precioProdTxt;
    private javax.swing.JTable productoTable;
    private javax.swing.JButton regProdBtn;
    // End of variables declaration//GEN-END:variables
}
