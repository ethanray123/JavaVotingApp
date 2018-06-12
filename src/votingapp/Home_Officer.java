
package votingapp;
import resources.*;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Home_Officer extends javax.swing.JFrame {
    // 0,17,36
    // 2,49,74    
    // 7,107,143
    public static int statuscolor = 0;
    ArrayList<Candidate> CandList = new ArrayList<Candidate>();
    public Home_Officer() {
        initComponents();
        initial();
        dashboard();
        addRowToJTable();
    }
    
    public void initial(){
        Database.addToCandidates(0, "Renz Bernados", "President", "Joshua");    
        Database.addToCandidates(1,"Marvin Lim","President","Joshua");
        Database.addToCandidates(2,"Jerly Palacio","Senator","Joshua");
        Database.addToCandidates(3,"Janel Duenas","District Representative","Joshua");
        Database.addToCandidates(4,"Vince Villamora","Mayor","Joshua");
        Database.addToCandidates(5,"Allena Zamoras","President","Joshua");
        Database.addToCandidates(6,"Zairiel Sarausad","Vice President","Joshua");
        Database.addToCandidates(7,"Joshua Isanan","Governor","Joshua");
        Database.addToCandidates(8,"Kasey Cuyos","President","Joshua");
        Database.addToCandidates(9,"Daniel Ubanan","Vice President","Joshua");
        Database.addToCandidates(10,"Grace Maureal","Senator","Joshua");
        Database.addToCandidates(11,"Joaquin Lava","Mayor","Joshua");
        Database.addToCandidates(12,"Jericho Mesina","Vice President","Joshua");
        
        CandList.addAll(Database.getCandidateList());
        
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
    }
    
    public void setTextFields(String can_name, String can_pos, String can_votes)
    {
        name.setText(can_name);
        position.setSelectedItem(can_pos);
        numvotes.setText(can_votes);
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
        candidates = new javax.swing.JPanel();
        searchbar_panel = new javax.swing.JPanel();
        search_icon = new javax.swing.JLabel();
        searchbar_dashboard = new javax.swing.JTextField();
        statuslabel = new javax.swing.JLabel();
        candidates_jScrollPane = new javax.swing.JScrollPane();
        candidatesTable = new javax.swing.JTable();
        namelabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        positionlabel = new javax.swing.JLabel();
        numvoteslabel = new javax.swing.JLabel();
        numvotes = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        position = new javax.swing.JComboBox<>();
        dashboard = new javax.swing.JPanel();
        dashboard_right_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 17, 36));
        jPanel1.setMaximumSize(new java.awt.Dimension(940, 618));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 618));
        jPanel1.setLayout(null);

        left_sidebar.setBackground(new java.awt.Color(2, 49, 74));
        left_sidebar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        left_sidebar.setLayout(null);

        userimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\VotingApp\\JavaVotingApp\\img\\user.png")); // NOI18N
        left_sidebar.add(userimg);
        userimg.setBounds(73, 56, 100, 110);

        user_label.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
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

        candidates_side.setBackground(new java.awt.Color(2, 49, 74));
        candidates_side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidates_sideMouseClicked(evt);
            }
        });

        candidates_side_label.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
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
        candidates_side.setBounds(0, 340, 250, 60);

        jPanel1.add(left_sidebar);
        left_sidebar.setBounds(0, 0, 250, 620);

        candidates.setBackground(new java.awt.Color(0, 17, 36));
        candidates.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        searchbar_panel.setBackground(new java.awt.Color(0, 17, 36));
        searchbar_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchbar_panel.setMaximumSize(new java.awt.Dimension(940, 618));
        searchbar_panel.setMinimumSize(new java.awt.Dimension(940, 618));
        searchbar_panel.setLayout(null);

        search_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\VotingApp\\JavaVotingApp\\img\\growth.png")); // NOI18N
        searchbar_panel.add(search_icon);
        search_icon.setBounds(400, 20, 30, 40);

        searchbar_dashboard.setBackground(new java.awt.Color(15, 74, 74));
        searchbar_dashboard.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        searchbar_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        searchbar_dashboard.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchbar_dashboard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        searchbar_dashboard.setOpaque(false);
        searchbar_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbar_dashboardActionPerformed(evt);
            }
        });
        searchbar_panel.add(searchbar_dashboard);
        searchbar_dashboard.setBounds(390, 20, 280, 40);

        statuslabel.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        statuslabel.setForeground(new java.awt.Color(0, 153, 51));
        statuslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchbar_panel.add(statuslabel);
        statuslabel.setBounds(30, 100, 640, 30);

        candidatesTable.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        candidatesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Position", "No. of Votes"
            }
        ));
        candidatesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        candidatesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidatesTableMouseClicked(evt);
            }
        });
        candidates_jScrollPane.setViewportView(candidatesTable);

        searchbar_panel.add(candidates_jScrollPane);
        candidates_jScrollPane.setBounds(30, 140, 640, 210);

        namelabel.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        namelabel.setForeground(new java.awt.Color(196, 75, 77));
        namelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namelabel.setText("NAME");
        searchbar_panel.add(namelabel);
        namelabel.setBounds(60, 390, 260, 20);

        name.setBackground(new java.awt.Color(15, 74, 74));
        name.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        name.setOpaque(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        searchbar_panel.add(name);
        name.setBounds(60, 420, 260, 40);

        positionlabel.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        positionlabel.setForeground(new java.awt.Color(196, 75, 77));
        positionlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        positionlabel.setText("POSITION");
        searchbar_panel.add(positionlabel);
        positionlabel.setBounds(380, 390, 260, 20);

        numvoteslabel.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        numvoteslabel.setForeground(new java.awt.Color(196, 75, 77));
        numvoteslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numvoteslabel.setText("NO. OF VOTES");
        searchbar_panel.add(numvoteslabel);
        numvoteslabel.setBounds(60, 470, 260, 20);

        numvotes.setBackground(new java.awt.Color(15, 74, 74));
        numvotes.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        numvotes.setForeground(new java.awt.Color(255, 255, 255));
        numvotes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numvotes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        numvotes.setOpaque(false);
        numvotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numvotesActionPerformed(evt);
            }
        });
        searchbar_panel.add(numvotes);
        numvotes.setBounds(60, 500, 260, 40);

        add.setBackground(new java.awt.Color(0, 153, 51));
        add.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.setBorder(null);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        searchbar_panel.add(add);
        add.setBounds(380, 500, 100, 40);

        update.setBackground(new java.awt.Color(0, 153, 51));
        update.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.setBorder(null);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        searchbar_panel.add(update);
        update.setBounds(540, 500, 100, 40);

        position.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "President", "Vice President", "Senator", "District Representative", "Governor", "Mayor" }));
        searchbar_panel.add(position);
        position.setBounds(380, 420, 260, 40);

        javax.swing.GroupLayout candidatesLayout = new javax.swing.GroupLayout(candidates);
        candidates.setLayout(candidatesLayout);
        candidatesLayout.setHorizontalGroup(
            candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candidatesLayout.createSequentialGroup()
                .addComponent(searchbar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        candidatesLayout.setVerticalGroup(
            candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candidatesLayout.createSequentialGroup()
                .addComponent(searchbar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel1.add(candidates);
        candidates.setBounds(250, 0, 690, 620);

        dashboard.setBackground(new java.awt.Color(0, 17, 36));
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dashboard_right_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        dashboard_right_label.setForeground(new java.awt.Color(255, 255, 255));
        dashboard_right_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard_right_label.setText("this is dashboard");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dashboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_right_label, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dashboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_right_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(dashboard);
        dashboard.setBounds(250, 0, 700, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
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

    private void searchbar_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbar_dashboardActionPerformed

    }//GEN-LAST:event_searchbar_dashboardActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        
    }//GEN-LAST:event_updateMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

    }//GEN-LAST:event_updateActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        
    }//GEN-LAST:event_nameActionPerformed

    private void numvotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numvotesActionPerformed
        
    }//GEN-LAST:event_numvotesActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        
    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(!name.getText().isEmpty() && !position.getSelectedItem().toString().isEmpty()
            && !numvotes.getText().isEmpty() && numvotes.getText().matches("[0-9]+")){

            String can_name = name.getText();

            String can_pos = position.getSelectedItem().toString();

            String can_votes = numvotes.getText();
            
            DefaultTableModel model = (DefaultTableModel) candidatesTable.getModel();
            model.addRow(new Object[]{
                can_name, can_pos, can_votes
            });
            statuslabel.setForeground(new Color(0,153,51));
            statuslabel.setText("SUCESSFULLY ADDED!");
        }else{
            statuslabel.setForeground(new Color(196,75,77));
            statuslabel.setText("THERE IS AN ERROR IN YOUR INPUT!");
        }
    }//GEN-LAST:event_addActionPerformed

    private void candidatesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) candidatesTable.getModel();
        int selectedRowIndex = candidatesTable.getSelectedRow();
        
        String candidate_name = model.getValueAt(selectedRowIndex, 0).toString();

        String candidate_pos = model.getValueAt(selectedRowIndex, 1).toString();

        String numVotes = model.getValueAt(selectedRowIndex, 2).toString();
        
        setTextFields(candidate_name, candidate_pos, numVotes);
    }//GEN-LAST:event_candidatesTableMouseClicked
    public void addRowToJTable()
    {
        DefaultTableModel model = (DefaultTableModel) candidatesTable.getModel();
       
        Object rowData[] = new Object[3];
        for(int i = 0; i < CandList.size(); i++){
            rowData[0] = CandList.get(i).getCandidateName();
            rowData[1] = CandList.get(i).getPosition();
            rowData[2] = CandList.get(i).getVotes();
           
            model.addRow(rowData);
        }
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Officer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel candidates;
    private javax.swing.JTable candidatesTable;
    private javax.swing.JScrollPane candidates_jScrollPane;
    private javax.swing.JPanel candidates_side;
    private javax.swing.JLabel candidates_side_label;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dashboard_right_label;
    private javax.swing.JPanel dashboard_side;
    private javax.swing.JLabel dashboard_side_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left_sidebar;
    private javax.swing.JTextField name;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField numvotes;
    private javax.swing.JLabel numvoteslabel;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JLabel positionlabel;
    private javax.swing.JLabel search_icon;
    private javax.swing.JTextField searchbar_dashboard;
    private javax.swing.JPanel searchbar_panel;
    private javax.swing.JLabel statuslabel;
    private javax.swing.JButton update;
    private javax.swing.JLabel user_label;
    private javax.swing.JLabel userimg;
    // End of variables declaration//GEN-END:variables
}
