
package votingapp;

import java.awt.Color;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        username.setBackground(new Color(0, 0, 0, 64));
        password.setBackground(new Color(0, 0, 0, 64));
    }
    // 2 voters, 1 officer, 1 superuser

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username_icon = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password_icon = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 17, 36));
        jPanel1.setMaximumSize(new java.awt.Dimension(940, 618));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 618));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Automated Voting System");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 60, 350, 60);

        username_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\student.CEACCS\\Documents\\Hazel\\JavaVotingApp\\img\\profile.png")); // NOI18N
        jPanel1.add(username_icon);
        username_icon.setBounds(290, 220, 30, 50);

        username.setBackground(new java.awt.Color(238, 238, 238));
        username.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 101, 102), 2, true));
        username.setOpaque(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(280, 220, 360, 50);

        password_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\student.CEACCS\\Documents\\Hazel\\JavaVotingApp\\img\\key.png")); // NOI18N
        jPanel1.add(password_icon);
        password_icon.setBounds(290, 310, 30, 50);

        password.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 101, 102), 2, true));
        password.setOpaque(false);
        jPanel1.add(password);
        password.setBounds(280, 310, 360, 50);

        login.setBackground(new java.awt.Color(155, 75, 77));
        login.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.setBorder(null);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(280, 390, 360, 50);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\student.CEACCS\\Documents\\Hazel\\JavaVotingApp\\img\\vote4.png")); // NOI18N
        jPanel1.add(background);
        background.setBounds(220, 130, 500, 398);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        //new Home_SuperUser().setVisible(true);
        // new Home_Officer().setVisible(true);
        new Home_Voter().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    
    }//GEN-LAST:event_loginActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password_icon;
    private javax.swing.JTextField username;
    private javax.swing.JLabel username_icon;
    // End of variables declaration//GEN-END:variables
}
