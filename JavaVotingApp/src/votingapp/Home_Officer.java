
package votingapp;
import resources.Officer;
import java.awt.Color;
import java.util.ArrayList;

public class Home_Officer extends javax.swing.JFrame {
    // 0,17,36
    // 2,49,74    
    // 7,107,143
    ArrayList<String> presidentList = new ArrayList<String>();
    ArrayList<String> vicePresidentList = new ArrayList<String>();
    ArrayList<String> SenatorList = new ArrayList<String>();
    ArrayList<String> DistrictRepresentativeList = new ArrayList<String>();
    ArrayList<String> GovernorList = new ArrayList<String>(); 
    ArrayList<String> MayorList = new ArrayList<String>(); 
   Officer of = new Officer("","","","");

    public Home_Officer() {
        initComponents();
        dashboard();
    }
    
   
    public void dashboard()
    {
        //set bg color when sidebar tab clicked
        dashboard_side.setBackground(new Color(7,107,143));
        candidates_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        dashboard.setVisible(true);
        candidates.setVisible(false);
        
    }
    public void candidates_sideBar_onclick()
    {
        //set bg color when sidebar tab clicked
        candidates_side.setBackground(new Color(7,107,143));
        dashboard_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        candidates.setVisible(true);
        dashboard.setVisible(false);
        Input.setVisible(false);
        Search.setVisible(false);
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
        candidates_side = new javax.swing.JPanel();
        candidates_side_label = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        dashboard_right_label = new javax.swing.JLabel();
        candidates = new javax.swing.JPanel();
        candidates_right_label = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        OpenSearchPanel = new javax.swing.JButton();
        Input = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FullnameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        AddButton = new javax.swing.JButton();
        Search = new javax.swing.JPanel();
        SearchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 17, 36));
        jPanel1.setMaximumSize(new java.awt.Dimension(940, 618));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 618));
        jPanel1.setLayout(null);

        left_sidebar.setBackground(new java.awt.Color(2, 49, 74));
        left_sidebar.setLayout(null);
        left_sidebar.add(userimg);
        userimg.setBounds(73, 56, 100, 110);

        user_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        user_label.setForeground(new java.awt.Color(255, 255, 255));
        user_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label.setText("OFFICER");
        left_sidebar.add(user_label);
        user_label.setBounds(10, 180, 230, 40);

        dashboard_side.setBackground(new java.awt.Color(7, 107, 143));
        dashboard_side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard_sideMouseClicked(evt);
            }
        });

        dashboard_side_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
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
        dashboard_side.setBounds(0, 280, 250, 58);

        candidates_side.setBackground(new java.awt.Color(2, 49, 74));
        candidates_side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidates_sideMouseClicked(evt);
            }
        });

        candidates_side_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        candidates_side_label.setForeground(new java.awt.Color(255, 255, 255));
        candidates_side_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candidates_side_label.setText("LIST OF CANDIDATES");

        javax.swing.GroupLayout candidates_sideLayout = new javax.swing.GroupLayout(candidates_side);
        candidates_side.setLayout(candidates_sideLayout);
        candidates_sideLayout.setHorizontalGroup(
            candidates_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candidates_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(candidates_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        candidates_sideLayout.setVerticalGroup(
            candidates_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candidates_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(candidates_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        left_sidebar.add(candidates_side);
        candidates_side.setBounds(0, 340, 250, 58);

        jPanel1.add(left_sidebar);
        left_sidebar.setBounds(0, 0, 250, 620);

        dashboard.setBackground(new java.awt.Color(0, 17, 36));
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        dashboard_right_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        dashboard_right_label.setForeground(new java.awt.Color(255, 255, 255));
        dashboard_right_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard_right_label.setText("this is dashboard");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(dashboard_right_label, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(dashboard_right_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );

        jPanel1.add(dashboard);
        dashboard.setBounds(250, 0, 690, 620);

        candidates.setBackground(new java.awt.Color(0, 17, 36));
        candidates.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        candidates_right_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        candidates_right_label.setForeground(new java.awt.Color(255, 255, 255));
        candidates_right_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candidates_right_label.setText("this is candidates");

        jButton2.setText("Add Candidate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        OpenSearchPanel.setText("Search Candidate");
        OpenSearchPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenSearchPanelActionPerformed(evt);
            }
        });

        jLabel1.setText("Full Name: ");

        FullnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullnameFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Position:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "President", "Vice President", "Senator", "District Representative", "Governor", "Mayor" }));

        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InputLayout = new javax.swing.GroupLayout(Input);
        Input.setLayout(InputLayout);
        InputLayout.setHorizontalGroup(
            InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 143, Short.MAX_VALUE)
                    .addComponent(FullnameField))
                .addGap(23, 23, 23))
            .addGroup(InputLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InputLayout.setVerticalGroup(
            InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FullnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(AddButton)
                .addGap(23, 23, 23))
        );

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Full Name:");

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchLayout = new javax.swing.GroupLayout(Search);
        Search.setLayout(SearchLayout);
        SearchLayout.setHorizontalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(SearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchField)
                .addGap(18, 18, 18))
        );
        SearchLayout.setVerticalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchButton)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout candidatesLayout = new javax.swing.GroupLayout(candidates);
        candidates.setLayout(candidatesLayout);
        candidatesLayout.setHorizontalGroup(
            candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candidatesLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(candidatesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(candidatesLayout.createSequentialGroup()
                        .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, candidatesLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(OpenSearchPanel))
                            .addGroup(candidatesLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(candidates_right_label, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        candidatesLayout.setVerticalGroup(
            candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, candidatesLayout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(candidates_right_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(OpenSearchPanel))
                .addGap(33, 33, 33)
                .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(108, 108, 108))
        );

        jPanel1.add(candidates);
        candidates.setBounds(250, 0, 690, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboard_sideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_sideMouseClicked
        dashboard();
    }//GEN-LAST:event_dashboard_sideMouseClicked

    private void candidates_sideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidates_sideMouseClicked
        candidates_sideBar_onclick();
        
    }//GEN-LAST:event_candidates_sideMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Input.setVisible(true);
        Search.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FullnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullnameFieldActionPerformed

    private void OpenSearchPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenSearchPanelActionPerformed
        // TODO add your handling code here:
        Input.setVisible(false);
        Search.setVisible(true);
    }//GEN-LAST:event_OpenSearchPanelActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        String fn = FullnameField.getText();
        String pos = jComboBox1.getSelectedItem().toString();
        
        of.AddCandidate(fn, pos);
       
      
    }//GEN-LAST:event_AddButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        String fn = searchField.getText();
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Officer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField FullnameField;
    private javax.swing.JPanel Input;
    private javax.swing.JButton OpenSearchPanel;
    private javax.swing.JPanel Search;
    private javax.swing.JButton SearchButton;
    private javax.swing.JPanel candidates;
    private javax.swing.JLabel candidates_right_label;
    private javax.swing.JPanel candidates_side;
    private javax.swing.JLabel candidates_side_label;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dashboard_right_label;
    private javax.swing.JPanel dashboard_side;
    private javax.swing.JLabel dashboard_side_label;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left_sidebar;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel user_label;
    private javax.swing.JLabel userimg;
    // End of variables declaration//GEN-END:variables
}
