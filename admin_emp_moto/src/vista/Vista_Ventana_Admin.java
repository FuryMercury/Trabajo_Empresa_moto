
package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class Vista_Ventana_Admin extends javax.swing.JFrame {

    private Vista_Panel_Menu menu;
    private Vista_Panel_UserBar userBar;
    
    public Vista_Ventana_Admin() {
        initComponents();
        menu =new Vista_Panel_Menu();
        userBar = new Vista_Panel_UserBar();
        administrarPanel(jsMenuBar,menu);
        administrarPanel(jsUserBar,userBar);
        configFrame();
        
    }
    
    private void configFrame(){    
        setMinimumSize(new Dimension(400, 300));
        setMaximumSize(new Dimension(1200, 900));
        setSize(new Dimension(1280, 720));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public void administrarPanel(JScrollPane contenedor,Component compt){
        contenedor.setViewportView(compt);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jsUserBar = new javax.swing.JScrollPane();
        jsMenuBar = new javax.swing.JScrollPane();
        jsContent = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jsUserBar.setBorder(null);
        jsUserBar.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 1280;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jsUserBar, gridBagConstraints);

        jsMenuBar.setBorder(null);
        jsMenuBar.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 655;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jsMenuBar, gridBagConstraints);

        jsContent.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1230;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jsContent, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jsContent;
    public javax.swing.JScrollPane jsMenuBar;
    public javax.swing.JScrollPane jsUserBar;
    // End of variables declaration//GEN-END:variables
}
