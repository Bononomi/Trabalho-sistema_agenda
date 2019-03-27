
package br.SisAgenda;

import java.awt.CardLayout;

//TELA DE BOA VINDA 

public class Welcome extends javax.swing.JPanel {

    private CardLayout cl;
   
    
    public Welcome() {
        initComponents();
        
        //ADICIONADA O PAINEL DE BOA VINDA
        
        this.add(Welcome, "welcome");
        
        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "welcome");
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("BEM VINDO!");

        javax.swing.GroupLayout WelcomeLayout = new javax.swing.GroupLayout(Welcome);
        Welcome.setLayout(WelcomeLayout);
        WelcomeLayout.setHorizontalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        WelcomeLayout.setVerticalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        add(Welcome, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Welcome;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
