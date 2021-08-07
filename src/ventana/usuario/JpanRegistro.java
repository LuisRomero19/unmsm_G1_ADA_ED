package ventana.usuario;

import Entidades.Usuario;
import Gestores.GestorUsuarios;
import Util.UtilSwing;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JpanRegistro extends javax.swing.JPanel {

    public GestorUsuarios miGU;
    public JpanRegistro() {
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

        eNombres = new javax.swing.JLabel();
        tfNombres = new javax.swing.JTextField();
        eApPaterno = new javax.swing.JLabel();
        tfApPaterno = new javax.swing.JTextField();
        eApMaterno = new javax.swing.JLabel();
        tfApMaterno = new javax.swing.JTextField();
        eDNI = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        eCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfInstitucion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCarrera = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfCarrera1 = new javax.swing.JTextField();

        eNombres.setText("Nombres:");

        eApPaterno.setText("Apellido Paterno:");

        eApMaterno.setText("Apellido Materno:");

        eDNI.setText("DNI:");

        eCodigo.setText("Código");

        jLabel1.setText("Institucion");

        jLabel2.setText("Carrera");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Monto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eApMaterno)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eNombres)
                                    .addComponent(eApPaterno)
                                    .addComponent(eDNI)
                                    .addComponent(eCodigo)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfApMaterno)
                                    .addComponent(tfNombres)
                                    .addComponent(tfApPaterno)
                                    .addComponent(tfDNI)
                                    .addComponent(tfCodigo)
                                    .addComponent(tfInstitucion)
                                    .addComponent(tfCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tfCarrera1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton1)
                        .addGap(62, 62, 62)
                        .addComponent(jButton2)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eNombres)
                    .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eApPaterno)
                    .addComponent(tfApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eApMaterno)
                    .addComponent(tfApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDNI)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(miGU.misUsuarios.existe(this.obtenerUsuario())){
            JOptionPane.showMessageDialog(this, "El usuario ya existe o algun campo esta en blanco", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            miGU.insertarUsuario(this.obtenerUsuario());
            JOptionPane.showMessageDialog(this, "¡Usuario registrado con éxito!", "Registrado", JOptionPane.INFORMATION_MESSAGE);
            vaciar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UtilSwing.quitarPanel(this);
    }//GEN-LAST:event_jButton2ActionPerformed


    public Usuario obtenerUsuario(){
        return new Usuario(tfNombres.getText(),this.tfApPaterno.getText(),this.tfApMaterno.getText(),this.tfDNI.getText(),
                this.tfCodigo.getText(),this.tfInstitucion.getText(),this.tfCarrera.getText());
    }
    
    public void vaciar(){
        this.tfNombres.setText("");
        this.tfApPaterno.setText("");
        this.tfApMaterno.setText("");
        this.tfDNI.setText("");
        this.tfCodigo.setText("");
        this.tfInstitucion.setText("");
        this.tfCarrera.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eApMaterno;
    private javax.swing.JLabel eApPaterno;
    private javax.swing.JLabel eCodigo;
    private javax.swing.JLabel eDNI;
    private javax.swing.JLabel eNombres;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfApMaterno;
    private javax.swing.JTextField tfApPaterno;
    private javax.swing.JTextField tfCarrera;
    private javax.swing.JTextField tfCarrera1;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfInstitucion;
    private javax.swing.JTextField tfNombres;
    // End of variables declaration//GEN-END:variables
}
