
package votingapp;

import java.awt.Color;
import java.util.ArrayList;
import resources.Officer;
import resources.Superuser;
import resources.Voter;

public class Login extends javax.swing.JFrame {
    // 2 voters, 1 officer, 1 superuser
    public static ArrayList<String> passwordList = new ArrayList<>();
    public static ArrayList<String> usernameList = new ArrayList<>();
    public Login() {
        initComponents();
        username.setBackground(new Color(0, 0, 0, 64));
        password.setBackground(new Color(0, 0, 0, 64));
        setDummyUser();
        setUsernameList();
        setPasswordList();
        
    }
    public void setDummyUser() 
    {
        Voter v1 = new Voter("Ethan", "Ethan Ray", "Mosqueda", "superuser");
        Voter v2 = new Voter("Hazel", "Hazel", "Cavite", "superuser");
        Officer o = new Officer("Joshua", "Joshua", "Ty", "superuser");
        Superuser s = new Superuser("Allena", "Allena", "Zamoras", "superuser");
    }
    
    public void setUsernameList()
    {
        Login.usernameList.add("Ethan");
        Login.usernameList.add("Hazel");
        Login.usernameList.add("Joshua");
        Login.usernameList.add("Allena");
    }
    
    public void setPasswordList()
    {
        Login.passwordList.add("Ethan");
        Login.passwordList.add("Hazel");
        Login.passwordList.add("Joshua");
        Login.passwordList.add("Allena");
    }
    
    public void checkCredentials()
    {
        String inputUsername = username.getText();
        String inputPassword = password.getText();
        if(usernameList.contains(inputUsername)){
            if(passwordList.contains(inputPassword) && inputUsername.equals(inputPassword)){
                switch(inputUsername){
                    case "Ethan":
                        new Home_Voter().setVisible(true);
                        this.dispose();
                        break;
                    case "Hazel":
                        new Home_Voter().setVisible(true);
                        this.dispose();
                        break;
                    case "Joshua":
                        new Home_Officer().setVisible(true);
                        this.dispose();
                        break;
                    case "Allena":
                        new Home_SuperUser().setVisible(true);
                        this.dispose();
                        break;
                }
            }else{
                statuslabel.setText("Password is incorrect");
            }
        }else{
            statuslabel.setText("Username doesn't exist");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        statuslabel = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Automated Voting System");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 60, 350, 60);

        statuslabel.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        statuslabel.setForeground(new java.awt.Color(255, 51, 51));
        statuslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(statuslabel);
        statuslabel.setBounds(280, 440, 360, 40);

        username_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\VotingApp\\JavaVotingApp\\img\\profile.png")); // NOI18N
        jPanel1.add(username_icon);
        username_icon.setBounds(290, 220, 30, 50);

        username.setBackground(new java.awt.Color(238, 238, 238));
        username.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
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

        password_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\VotingApp\\JavaVotingApp\\img\\key.png")); // NOI18N
        jPanel1.add(password_icon);
        password_icon.setBounds(290, 310, 30, 50);

        password.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 101, 102), 2, true));
        password.setOpaque(false);
        jPanel1.add(password);
        password.setBounds(280, 310, 360, 50);

        login.setBackground(new java.awt.Color(155, 75, 77));
        login.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
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

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\VotingApp\\JavaVotingApp\\img\\vote4.png")); // NOI18N
        jPanel1.add(background);
        background.setBounds(220, 130, 500, 380);

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

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        checkCredentials();
    }//GEN-LAST:event_loginMouseClicked

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
    private javax.swing.JLabel statuslabel;
    private javax.swing.JTextField username;
    private javax.swing.JLabel username_icon;
    // End of variables declaration//GEN-END:variables
}
