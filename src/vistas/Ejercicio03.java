/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author SOPORTE
 */
public class Ejercicio03 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio03
     */
    public Ejercicio03() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_numero1 = new javax.swing.JTextField();
        txt_numero2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_resultado = new javax.swing.JLabel();
        btn_Suma = new javax.swing.JButton();
        btn_Resta = new javax.swing.JButton();
        btn_Multiplicacion = new javax.swing.JButton();
        btn_Division = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA SIMPLE");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("OPERACIONES BÁSICAS"));

        jLabel1.setText("Número 1:");

        jLabel2.setText("Número 2:");

        txt_numero1.setText(" ");

        txt_numero2.setText(" ");
        txt_numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numero2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado:");

        lbl_resultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_Suma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Suma.setText("+");
        btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumaActionPerformed(evt);
            }
        });

        btn_Resta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Resta.setText("-");
        btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestaActionPerformed(evt);
            }
        });

        btn_Multiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Multiplicacion.setText("*");
        btn_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicacionActionPerformed(evt);
            }
        });

        btn_Division.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Division.setText("/");
        btn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Suma)
                .addGap(18, 18, 18)
                .addComponent(btn_Resta)
                .addGap(18, 18, 18)
                .addComponent(btn_Multiplicacion)
                .addGap(18, 18, 18)
                .addComponent(btn_Division)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_numero1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_numero2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Suma)
                    .addComponent(btn_Resta)
                    .addComponent(btn_Multiplicacion)
                    .addComponent(btn_Division))
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lbl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numero2ActionPerformed

    private void btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumaActionPerformed

        double numero1 = Double.parseDouble(txt_numero1.getText());
        double numero2 = Double.parseDouble(txt_numero2.getText());

        double resultado;

        resultado = numero1 + numero2;

        lbl_resultado.setText(String.valueOf(resultado));

    }//GEN-LAST:event_btn_SumaActionPerformed

    private void btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestaActionPerformed
        double numero1 = Double.parseDouble(txt_numero1.getText());
        double numero2 = Double.parseDouble(txt_numero2.getText());

        double resultado;

        resultado = numero1 - numero2;

        lbl_resultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btn_RestaActionPerformed

    private void btn_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicacionActionPerformed

        double numero1 = Double.parseDouble(txt_numero1.getText());
        double numero2 = Double.parseDouble(txt_numero2.getText());

        double resultado;

        resultado = numero1 * numero2;

        lbl_resultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btn_MultiplicacionActionPerformed

    private void btn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivisionActionPerformed

        double numero1 = Double.parseDouble(txt_numero1.getText());
        double numero2 = Double.parseDouble(txt_numero2.getText());
        double resultado = 0;

        if (numero2 != 0) {  
            resultado = numero1 / numero2;
            lbl_resultado.setText(String.valueOf(resultado));
        } else {
            lbl_resultado.setText("Error: No se puede dividir entre cero");
            return; 
        }
    }//GEN-LAST:event_btn_DivisionActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Division;
    private javax.swing.JButton btn_Multiplicacion;
    private javax.swing.JButton btn_Resta;
    private javax.swing.JButton btn_Suma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JTextField txt_numero1;
    private javax.swing.JTextField txt_numero2;
    // End of variables declaration//GEN-END:variables
}
