/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.lima.vista;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.upeu.edu.lima.DAO.DistritoDAO;
import pe.upeu.edu.lima.DAO.IglesiaDAO;
import pe.upeu.edu.lima.DAO.TipoIglesiaDAO;
import pe.upeu.edu.lima.modelo.Distrito;
import pe.upeu.edu.lima.modelo.Iglesia;

import pe.upeu.edu.lima.modelo.TipoIglesia;

/**
 *
 * @author juan
 */
public class IglesiaForm extends javax.swing.JFrame {
ArrayList<Distrito> lista1 = new ArrayList();
ArrayList<TipoIglesia> lista2 = new ArrayList();
DistritoDAO dao1 =new DistritoDAO();
TipoIglesiaDAO dao2 = new TipoIglesiaDAO();
IglesiaDAO dao3= new IglesiaDAO();
ArrayList<Iglesia> lista3= new ArrayList();
DefaultComboBoxModel<Object> modelodistrito = new DefaultComboBoxModel<>();
DefaultComboBoxModel<Object> modelotipo = new DefaultComboBoxModel<>();
DefaultTableModel model = new DefaultTableModel();
int op;
    /**
     * Creates new form FrmVista
     */
    public IglesiaForm() {
        initComponents();
        setLocationRelativeTo(null);
        cargarDistrito();
        cargartipoiglesia();
        listarIglesias();
    }
final void cargarDistrito(){
    lista1 = dao1.listarDistrito();
    modelodistrito.addElement("Seleccionar Distrito");
    cboDistrito.setModel(modelodistrito);
    for(int i=0;i<lista1.size();i++){
        modelodistrito.addElement(lista1.get(i).getDisc());
    }
    cboDistrito.setModel(modelodistrito);
}
final void cargartipoiglesia(){
   lista2 = dao2.listarTipoIglesia();
    modelotipo.addElement("Seleccionar Tipo Iglesia");
    cboTipoiglesia.setModel(modelotipo);
    for(int i=0;i<lista2.size();i++){
        modelotipo.addElement(lista2.get(i).getNomtipo());
}
    cboTipoiglesia.setModel(modelotipo);
}   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboDistrito = new javax.swing.JComboBox();
        cboTipoiglesia = new javax.swing.JComboBox();
        txtiglesia1 = new javax.swing.JTextField();
        txtcuenta1 = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txtDistrito = new javax.swing.JTextField();
        txtTipoIglesia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatosIglesia = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IGLESIA");

        jLabel1.setText("Distrito");

        jLabel2.setText("TipoIglesia");

        jLabel3.setText("Iglesia");

        jLabel4.setText("Cuenta");

        cboDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDistritoActionPerformed(evt);
            }
        });

        cboTipoiglesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoiglesiaActionPerformed(evt);
            }
        });

        txtiglesia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiglesia1ActionPerformed(evt);
            }
        });
        txtiglesia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtiglesia1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtiglesia1KeyTyped(evt);
            }
        });

        txtcuenta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuenta1KeyTyped(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jtDatosIglesia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_iglesia", "id_dist", "idtipo_iiglesi", "iglesia", "cuenta"
            }
        ));
        jtDatosIglesia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDatosIglesiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDatosIglesia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtiglesia1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(217, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtcuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                                        .addComponent(btnRegistrar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cboTipoiglesia, javax.swing.GroupLayout.Alignment.LEADING, 0, 143, Short.MAX_VALUE)
                                            .addComponent(cboDistrito, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDistrito)
                                            .addComponent(txtTipoIglesia))))
                                .addGap(42, 42, 42))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboTipoiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtiglesia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDistritoActionPerformed
        // TODO add your handling code here:
        String distrito= cboDistrito.getSelectedItem().toString();
        
        int id;
        int x= cboDistrito.getSelectedIndex();
        if(x!=0)
        {
            id=dao1.idDistrito(distrito);
            txtDistrito.setText(""+id);
        }
        
    }//GEN-LAST:event_cboDistritoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      int idd = dao1.idDistrito(cboDistrito.getSelectedItem().toString());
        int idti = dao2.idTipoIglesia(cboTipoiglesia.getSelectedItem().toString());
        String iglesia = txtiglesia1.getText();
        int cuenta = Integer.parseInt(txtcuenta1.getText());
        int x = dao3.registrarIglesia(idd, idti, iglesia, cuenta);
        if(x>0){
            JOptionPane.showMessageDialog(null, "Exito");
            updateComponets();
            //listarEquipo();
            limpiar();
            
        }else{
            JOptionPane.showMessageDialog(null, "Falla");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtiglesia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiglesia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiglesia1ActionPerformed

    private void jtDatosIglesiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosIglesiaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtDatosIglesiaMouseClicked

    private void txtcuenta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuenta1KeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtcuenta1KeyTyped

    private void txtiglesia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtiglesia1KeyTyped
       char a=evt.getKeyChar();
        if((a<'a' || a>'z')&&(a<'A')|a>'Z')evt.consume();
    }//GEN-LAST:event_txtiglesia1KeyTyped

    private void txtiglesia1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtiglesia1KeyPressed
      int key= evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        {
            if(!txtiglesia1.getText().equals("")){
                op = dao3.verificarIglesia(txtiglesia1.getText());
                if(op==1){
                    JOptionPane.showMessageDialog(null,"Iglesia EXISTE" );
                    txtiglesia1.setText(null);
                    txtiglesia1.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null,"Iglesia NO EXISTE" );
                    txtcuenta1.requestFocus();
                }
            }else{
                   JOptionPane.showMessageDialog(null,"Escriba algo " );
                    txtiglesia1.requestFocus(); 
            }
        }
    }//GEN-LAST:event_txtiglesia1KeyPressed

    private void cboTipoiglesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoiglesiaActionPerformed
        // TODO add your handling code here:
        String TipoIglesia= cboTipoiglesia.getSelectedItem().toString();
        
        int id;
        int x= cboTipoiglesia.getSelectedIndex();
        if(x!=0)
        {
            id=dao2.idTipoIglesia(TipoIglesia);
            txtTipoIglesia.setText(""+id);
        }
    }//GEN-LAST:event_cboTipoiglesiaActionPerformed
void listarIglesias(){
    lista3 =dao3.listarIglesia();
    model = (DefaultTableModel) jtDatosIglesia.getModel();
        Object[] usu = new Object[5];
        for(int i=0;i<lista3.size();i++){
            usu[0]=lista3.get(i).getIdi();
            usu[1]=lista3.get(i).getIdd();
            usu[2]=lista3.get(i).getIdti();
            usu[3]=lista3.get(i).getNomiglesia();
            usu[4]=lista3.get(i).getCuenta();
           
            model.addRow(usu);
               
        jtDatosIglesia.setModel(model);
        }
}
    void limpiar(){
        txtDistrito.setText(null);
        txtTipoIglesia.setText(null);
        txtcuenta1.setText(null);
        txtiglesia1.setText(null);
        cboDistrito.setSelectedIndex(0);
        cboTipoiglesia.setSelectedIndex(0);
        
        }
    void updateComponets(){
    LimpiarTabla(model);
    listarIglesias();
//    modelocombo.removeAllElements();
    //cargarCombo();
    //modelolista.clear();
    //cargarList();    
    }
    void LimpiarTabla(DefaultTableModel modelo){
        int a =modelo.getRowCount()-1;
        for(int i=a;i>=0;i--){  
            modelo.removeRow(i);
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
            java.util.logging.Logger.getLogger(IglesiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IglesiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IglesiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IglesiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IglesiaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboDistrito;
    private javax.swing.JComboBox cboTipoiglesia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtDatosIglesia;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtTipoIglesia;
    private javax.swing.JTextField txtcuenta1;
    private javax.swing.JTextField txtiglesia1;
    // End of variables declaration//GEN-END:variables
}
