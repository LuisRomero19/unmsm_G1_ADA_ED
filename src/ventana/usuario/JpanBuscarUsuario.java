package ventana.usuario;

import Entidades.Usuario;
import Gestores.GestorUsuarios;
import Util.UtilSwing;
import javax.swing.JOptionPane;

public class JpanBuscarUsuario extends javax.swing.JPanel {

    public GestorUsuarios miGU;
    

    public JpanBuscarUsuario() {
        initComponents();
        miGU = new GestorUsuarios();
        miGU.obtenerDatos();
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxfDni = new javax.swing.JTextField();
        jtxfNombre = new javax.swing.JTextField();
        jtxfCodigo = new javax.swing.JTextField();
        jtxfApPaterno = new javax.swing.JTextField();
        jtxfApMaterno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jLabel1.setText("Buscar Usuario");

        jLabel2.setText("DNI:");

        jLabel3.setText("Nombre");

        jLabel4.setText("Código:");

        jLabel5.setText("Ap.Paterno");

        jLabel6.setText("Ap.Materno");

        jtxfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfDniActionPerformed(evt);
            }
        });

        jtxfNombre.setEditable(false);
        jtxfNombre.setBackground(new java.awt.Color(102, 204, 255));

        jtxfCodigo.setEditable(false);
        jtxfCodigo.setBackground(new java.awt.Color(102, 204, 255));

        jtxfApPaterno.setEditable(false);
        jtxfApPaterno.setBackground(new java.awt.Color(102, 204, 255));

        jtxfApMaterno.setEditable(false);
        jtxfApMaterno.setBackground(new java.awt.Color(102, 204, 255));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxfCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jtxfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addGap(1, 1, 1))
                                    .addComponent(jtxfApPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxfApMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxfDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(bEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxfApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxfApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(bEliminar)
                    .addComponent(jButton2))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfDniActionPerformed
 
    }//GEN-LAST:event_jtxfDniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dni = jtxfDni.getText();
        Usuario usuario=miGU.buscarPorDNI(dni);
        if(usuario == null){
            JOptionPane.showMessageDialog(this, "El usuario con el DNI: " +dni+" No existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            jtxfApMaterno.setText(usuario.getAp_materno());
            jtxfApPaterno.setText(usuario.getAp_paterno());
            jtxfNombre.setText(usuario.getNombre());
            jtxfCodigo.setText(usuario.getCodigo());
        }   
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UtilSwing.quitarPanel(this);          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        String dni = jtxfDni.getText();        
        if(miGU.eliminarPorDNI(dni)){
            JOptionPane.showMessageDialog(this, "¡Usuario fue eliminado con exito!", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
        
        }else{
            JOptionPane.showMessageDialog(this, "El usuario con el DNI: " +dni+" No existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        vaciar();
    }//GEN-LAST:event_bEliminarActionPerformed

    private void vaciar(){
        this.jtxfApMaterno.setText("");
        jtxfApPaterno.setText("");
        jtxfNombre.setText("");
        jtxfCodigo.setText("");
        jtxfDni.setText("");
    }
    // Declaracion de variables - no modificar//GEN-BEGIN:variables
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jtxfApMaterno;
    private javax.swing.JTextField jtxfApPaterno;
    private javax.swing.JTextField jtxfCodigo;
    private javax.swing.JTextField jtxfDni;
    private javax.swing.JTextField jtxfNombre;
    // Fin de la declaracion de variables//GEN-END:variables
}
