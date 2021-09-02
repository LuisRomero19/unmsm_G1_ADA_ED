package ventana.libro;

import javax.swing.JOptionPane;

public class JpanListEliminados extends javax.swing.JPanel {

    /**
     * Se crea nuevo JpanListEliminados
     */
    public JpanListEliminados() {
        initComponents();
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnPedir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mejores-paginas-descargar-libros-gratis-forma-legal (1).jpg"))); // NOI18N

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPedir.setText("Solicitar Libros");
        btnPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnPedir)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPedir)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Util.UtilSwing.quitarPanel(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirActionPerformed
        int money = Integer.parseInt(JOptionPane.showInputDialog("¿Ingrese una cantidad de dinero?"));
        
        //calcular tiempo de ejecucion
        long startTime = System.currentTimeMillis(); 
        
        String solutionSt = "Con " + money + " soles podra comprar: ";
        int solutionInt = 0;
        int monedas[] = {10, 20, 50, 100, 200};
        
        int i = monedas.length - 1;
        int j = 0;

        while(i >= 0){
            if(solutionInt + monedas[i] <= money){
                solutionInt += monedas[i];
                j++;
            }
            else{
                solutionSt += "\n " + j + " libros(s) de: " + monedas[i];
                i = i - 1;
                j = 0;
                if(solutionInt + monedas[0] > money) solutionInt = money;
            }
        }
        long endTime = System.currentTimeMillis();
        JOptionPane.showMessageDialog(this, solutionSt);
        JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de pedir libros: " + (endTime-startTime));
    }//GEN-LAST:event_btnPedirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPedir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
