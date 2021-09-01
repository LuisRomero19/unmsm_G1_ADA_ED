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
        jLabel1.setText(":D");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPedir.setText("Pedir libros");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPedir)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPedir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
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
        JOptionPane.showMessageDialog(this, solutionSt);
        long endTime = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de pedir libros: " + (endTime-startTime));
    }//GEN-LAST:event_btnPedirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPedir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
