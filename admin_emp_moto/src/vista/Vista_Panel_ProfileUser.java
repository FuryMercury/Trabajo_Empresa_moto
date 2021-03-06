
package vista;


public class Vista_Panel_ProfileUser extends javax.swing.JPanel {

    public Vista_Panel_ProfileUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblImagen = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblEditUser = new javax.swing.JLabel();
        lblEditStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/defaultUser.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        add(lblImagen, gridBagConstraints);

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("USER:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(lblUser, gridBagConstraints);

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("STATUS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(lblStatus, gridBagConstraints);

        lblEditUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEditUser.setForeground(new java.awt.Color(255, 255, 255));
        lblEditUser.setText("NAME DEFAULT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(lblEditUser, gridBagConstraints);

        lblEditStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEditStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblEditStatus.setText("PRIVILEGE DEFAULT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(lblEditStatus, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblEditStatus;
    public javax.swing.JLabel lblEditUser;
    public javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
