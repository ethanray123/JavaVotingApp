
package votingapp;

import java.awt.Color;

public class Home_SuperUser extends javax.swing.JFrame {
    // 0,17,36
    // 2,49,74    
    // 7,107,143
    
    public Home_SuperUser() {
        initComponents();
        dashboard();
    }
    public void dashboard()
    {
        //set bg color when sidebar tab clicked
        dashboard_side.setBackground(new Color(7,107,143));
        officers_side.setBackground(new Color(2,49,74));
        voters_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        dashboard.setVisible(true);
        officers.setVisible(false);
        voters.setVisible(false);
        
    }
    public void officers_sideBar_onclick()
    {
        //set bg color when sidebar tab clicked
        officers_side.setBackground(new Color(7,107,143));
        dashboard_side.setBackground(new Color(2,49,74));
        voters_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        officers.setVisible(true);
        dashboard.setVisible(false);
        voters.setVisible(false);
    }
    
    public void voters_sideBar_onclick()
    {
        //set bg color when sidebar tab clicked
        voters_side.setBackground(new Color(7,107,143));
        dashboard_side.setBackground(new Color(2,49,74));
        officers_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        voters.setVisible(true);
        dashboard.setVisible(false);
        officers.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        left_sidebar = new javax.swing.JPanel();
        userimg = new javax.swing.JLabel();
        user_label = new javax.swing.JLabel();
        dashboard_side = new javax.swing.JPanel();
        dashboard_side_label = new javax.swing.JLabel();
        officers_side = new javax.swing.JPanel();
        officers_side_label = new javax.swing.JLabel();
        voters_side = new javax.swing.JPanel();
        voters_side_label = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        dashboard_right_label = new javax.swing.JLabel();
        officers = new javax.swing.JPanel();
        dashboard_right_label1 = new javax.swing.JLabel();
        voters = new javax.swing.JPanel();
        dashboard_right_label2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 17, 36));
        jPanel1.setMaximumSize(new java.awt.Dimension(940, 618));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 618));
        jPanel1.setLayout(null);

        left_sidebar.setBackground(new java.awt.Color(2, 49, 74));
        left_sidebar.setLayout(null);

        userimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\VotingApp\\JavaVotingApp\\img\\user.png")); // NOI18N
        left_sidebar.add(userimg);
        userimg.setBounds(73, 56, 100, 110);

        user_label.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        user_label.setForeground(new java.awt.Color(255, 255, 255));
        user_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label.setText("SUPERUSER");
        left_sidebar.add(user_label);
        user_label.setBounds(10, 180, 230, 40);

        dashboard_side.setBackground(new java.awt.Color(7, 107, 143));
        dashboard_side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard_sideMouseClicked(evt);
            }
        });

        dashboard_side_label.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        dashboard_side_label.setForeground(new java.awt.Color(255, 255, 255));
        dashboard_side_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard_side_label.setText("DASHBOARD");

        javax.swing.GroupLayout dashboard_sideLayout = new javax.swing.GroupLayout(dashboard_side);
        dashboard_side.setLayout(dashboard_sideLayout);
        dashboard_sideLayout.setHorizontalGroup(
            dashboard_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboard_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashboard_sideLayout.setVerticalGroup(
            dashboard_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboard_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        left_sidebar.add(dashboard_side);
        dashboard_side.setBounds(0, 280, 250, 60);

        officers_side.setBackground(new java.awt.Color(2, 49, 74));
        officers_side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                officers_sideMouseClicked(evt);
            }
        });

        officers_side_label.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        officers_side_label.setForeground(new java.awt.Color(255, 255, 255));
        officers_side_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        officers_side_label.setText("LIST OF OFFICERS");

        javax.swing.GroupLayout officers_sideLayout = new javax.swing.GroupLayout(officers_side);
        officers_side.setLayout(officers_sideLayout);
        officers_sideLayout.setHorizontalGroup(
            officers_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(officers_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(officers_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        officers_sideLayout.setVerticalGroup(
            officers_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(officers_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(officers_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        left_sidebar.add(officers_side);
        officers_side.setBounds(0, 340, 250, 60);

        voters_side.setBackground(new java.awt.Color(2, 49, 74));
        voters_side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voters_sideMouseClicked(evt);
            }
        });

        voters_side_label.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        voters_side_label.setForeground(new java.awt.Color(255, 255, 255));
        voters_side_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        voters_side_label.setText("LIST OF VOTERS");

        javax.swing.GroupLayout voters_sideLayout = new javax.swing.GroupLayout(voters_side);
        voters_side.setLayout(voters_sideLayout);
        voters_sideLayout.setHorizontalGroup(
            voters_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(voters_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voters_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        voters_sideLayout.setVerticalGroup(
            voters_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(voters_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voters_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        left_sidebar.add(voters_side);
        voters_side.setBounds(0, 400, 250, 60);

        jPanel1.add(left_sidebar);
        left_sidebar.setBounds(0, 0, 250, 600);

        dashboard.setBackground(new java.awt.Color(0, 17, 36));
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        dashboard_right_label.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        dashboard_right_label.setForeground(new java.awt.Color(255, 255, 255));
        dashboard_right_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard_right_label.setText("this is dashboard");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dashboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_right_label, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dashboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_right_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(dashboard);
        dashboard.setBounds(250, 0, 710, 600);

        officers.setBackground(new java.awt.Color(0, 17, 36));
        officers.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        dashboard_right_label1.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        dashboard_right_label1.setForeground(new java.awt.Color(255, 255, 255));
        dashboard_right_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard_right_label1.setText("this is officers");

        javax.swing.GroupLayout officersLayout = new javax.swing.GroupLayout(officers);
        officers.setLayout(officersLayout);
        officersLayout.setHorizontalGroup(
            officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(officersLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_right_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        officersLayout.setVerticalGroup(
            officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(officersLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_right_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(officers);
        officers.setBounds(250, 0, 710, 600);

        voters.setBackground(new java.awt.Color(0, 17, 36));
        voters.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        dashboard_right_label2.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        dashboard_right_label2.setForeground(new java.awt.Color(255, 255, 255));
        dashboard_right_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard_right_label2.setText("this is voters");

        javax.swing.GroupLayout votersLayout = new javax.swing.GroupLayout(voters);
        voters.setLayout(votersLayout);
        votersLayout.setHorizontalGroup(
            votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(votersLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_right_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        votersLayout.setVerticalGroup(
            votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(votersLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_right_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(voters);
        voters.setBounds(250, 0, 710, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboard_sideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_sideMouseClicked
        dashboard();
    }//GEN-LAST:event_dashboard_sideMouseClicked

    private void officers_sideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_officers_sideMouseClicked
        officers_sideBar_onclick();
    }//GEN-LAST:event_officers_sideMouseClicked

    private void voters_sideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voters_sideMouseClicked
        voters_sideBar_onclick();
    }//GEN-LAST:event_voters_sideMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_SuperUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dashboard_right_label;
    private javax.swing.JLabel dashboard_right_label1;
    private javax.swing.JLabel dashboard_right_label2;
    private javax.swing.JPanel dashboard_side;
    private javax.swing.JLabel dashboard_side_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left_sidebar;
    private javax.swing.JPanel officers;
    private javax.swing.JPanel officers_side;
    private javax.swing.JLabel officers_side_label;
    private javax.swing.JLabel user_label;
    private javax.swing.JLabel userimg;
    private javax.swing.JPanel voters;
    private javax.swing.JPanel voters_side;
    private javax.swing.JLabel voters_side_label;
    // End of variables declaration//GEN-END:variables
}
