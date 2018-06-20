
package votingapp;
import resources.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static votingapp.Login.user;

public class Home_Officer extends javax.swing.JFrame {
    // 0,17,36
    // 2,49,74    
    // 7,107,143
    public static int statuscolor = 0;
    ArrayList<Candidate> CandList = new ArrayList<Candidate>();
    public static int idnum = 14;
    public Home_Officer() {
        initComponents();
        dashboard();
        initial();
        addRowToJTable();
        username.setText(user);
    }
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
    public void initial(){
        Database.addToActiveCandidates("Renz Bernados", "President", "Joshua");    
        Database.addToActiveCandidates("Marvin Lim", "President", "Joshua");
        Database.addToActiveCandidates("Jerly Palacio", "Senator", "Joshua");
        Database.addToActiveCandidates("Janel Duenas", "District Representative", "Joshua");
        Database.addToActiveCandidates("Vince Villamora", "Mayor", "Joshua");
        Database.addToActiveCandidates("Allena Zamoras", "President", "Joshua");
        Database.addToActiveCandidates("Zairiel Sarausad","Vice President", "Joshua");
        Database.addToActiveCandidates("Joshua Isanan", "Governor", "Joshua");
        Database.addToActiveCandidates("Kasey Cuyos", "President", "Joshua");
        Database.addToActiveCandidates("Daniel Ubanan", "Vice President", "Joshua");
        Database.addToActiveCandidates("Grace Maureal", "Senator", "Joshua");
        Database.addToActiveCandidates("Joaquin Lava", "Mayor", "Joshua");
        Database.addToActiveCandidates("Jericho Mesina", "Vice President", "Joshua");
        Database.addToActiveCandidates("Robert Lim", "Governor", "Joshua");
        
        CandList.addAll(Database.getCandidateList());
        
    }
    public void dashboard()
    {
        //set bg color when sidebar tab clicked
        dashboard_side.setBackground(new Color(7,107,143));
        candidates_side.setBackground(new Color(2,49,74));
        logout_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        dashboard.setVisible(true);
        candidates.setVisible(false);
        
    }
    public void candidates_sideBar_onclick()
    {
        //set bg color when sidebar tab clicked
        candidates_side.setBackground(new Color(7,107,143));
        dashboard_side.setBackground(new Color(2,49,74));
        logout_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        candidates.setVisible(true);
        dashboard.setVisible(false);
    }
    
    public void logout_sideBar_onclick()
    {
        logout_side.setBackground(new Color(7,107,143));
        dashboard_side.setBackground(new Color(2,49,74));
        candidates_side.setBackground(new Color(2,49,74));
        
        new Login().setVisible(true);
        this.dispose();
    }
    
    public void setTextFields(String can_name, String can_pos, String can_votes)
    {
        name.setText(can_name);
        position.setSelectedItem(can_pos);
        numvotes.setText(can_votes);
    }
    
    public void clearAddTable()
    {
        DefaultTableModel model = (DefaultTableModel) candidatesTable.getModel();
        int rowCount = model.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        Object rowData[] = new Object[3];
        for(int i = 0; i < CandList.size(); i++){
            rowData[0] = CandList.get(i).getCandidateName();
            rowData[1] = CandList.get(i).getPosition();
            rowData[2] = CandList.get(i).getVotes();

            System.out.println(rowData[0]);
            System.out.println(rowData[1]);
            System.out.println(rowData[2]);
            System.out.println("\n");

            model.addRow(rowData);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        left_sidebar = new javax.swing.JPanel();
        userimg = new javax.swing.JLabel();
        user_label = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        dashboard_side = new javax.swing.JPanel();
        dashboard_side_label = new javax.swing.JLabel();
        candidates_side = new javax.swing.JPanel();
        candidates_side_label = new javax.swing.JLabel();
        logout_side = new javax.swing.JPanel();
        logout_side_label = new javax.swing.JLabel();
        candidates = new javax.swing.JPanel();
        searchbar_panel = new javax.swing.JPanel();
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
        delete = new javax.swing.JButton();
        position = new javax.swing.JComboBox<>();
        user_label1 = new javax.swing.JLabel();
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
        userimg.setBounds(70, 40, 100, 110);

        user_label.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        user_label.setForeground(new java.awt.Color(255, 255, 255));
        user_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label.setText("OFFICER");
        left_sidebar.add(user_label);
        user_label.setBounds(10, 160, 230, 40);

        username.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left_sidebar.add(username);
        username.setBounds(0, 210, 250, 30);

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

        logout_side.setBackground(new java.awt.Color(2, 49, 74));
        logout_side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_sideMouseClicked(evt);
            }
        });

        logout_side_label.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        logout_side_label.setForeground(new java.awt.Color(255, 255, 255));
        logout_side_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout_side_label.setText("LOGOUT");

        javax.swing.GroupLayout logout_sideLayout = new javax.swing.GroupLayout(logout_side);
        logout_side.setLayout(logout_sideLayout);
        logout_sideLayout.setHorizontalGroup(
            logout_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        logout_sideLayout.setVerticalGroup(
            logout_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        left_sidebar.add(logout_side);
        logout_side.setBounds(0, 400, 250, 60);

        jPanel1.add(left_sidebar);
        left_sidebar.setBounds(0, 0, 250, 620);

        candidates.setBackground(new java.awt.Color(0, 17, 36));
        candidates.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        searchbar_panel.setBackground(new java.awt.Color(0, 17, 36));
        searchbar_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchbar_panel.setMaximumSize(new java.awt.Dimension(940, 618));
        searchbar_panel.setMinimumSize(new java.awt.Dimension(940, 618));
        searchbar_panel.setLayout(null);

        statuslabel.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        statuslabel.setForeground(new java.awt.Color(0, 153, 51));
        statuslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchbar_panel.add(statuslabel);
        statuslabel.setBounds(30, 320, 640, 50);

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
        candidates_jScrollPane.setBounds(30, 110, 640, 210);

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
        searchbar_panel.add(add);
        add.setBounds(380, 500, 60, 40);

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
        searchbar_panel.add(update);
        update.setBounds(570, 500, 70, 40);

        delete.setBackground(new java.awt.Color(0, 153, 51));
        delete.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.setBorder(null);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        searchbar_panel.add(delete);
        delete.setBounds(470, 500, 70, 40);

        position.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "President", "Vice President", "Senator", "District Representative", "Governor", "Mayor" }));
        searchbar_panel.add(position);
        position.setBounds(380, 420, 260, 40);

        user_label1.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        user_label1.setForeground(new java.awt.Color(255, 255, 255));
        user_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label1.setText("TABLE LIST OF CANDIDATES");
        searchbar_panel.add(user_label1);
        user_label1.setBounds(30, 40, 640, 50);

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

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        DefaultTableModel model = (DefaultTableModel) candidatesTable.getModel();
        int selectedRowIndex = candidatesTable.getSelectedRow();
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, 
            "Are you sure you want to update candidate?","Warning", dialogButton);

        if (dialogResult == JOptionPane.YES_OPTION) {
            if(!name.getText().isEmpty() && !numvotes.getText().isEmpty() 
                && numvotes.getText().matches("[0-9]+")){
                    model.setValueAt(name.getText(), selectedRowIndex, 0);
                    model.setValueAt(position.getSelectedItem(), selectedRowIndex, 1);
                    model.setValueAt(numvotes.getText(), selectedRowIndex, 2);
                    statuslabel.setForeground(new Color(0,153,51));
                    statuslabel.setText("SUCESSFULLY UPDATED!");
            }else{
                statuslabel.setForeground(new Color(196,75,77));
                statuslabel.setText("THERE IS AN ERROR IN YOUR INPUT!");
            }
        }else{
            statuslabel.setForeground(new Color(196,75,77));
            statuslabel.setText("YOU HAVE CANCELLED UPDATE!");
        }
    }//GEN-LAST:event_updateMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if(!name.getText().isEmpty() && !position.getSelectedItem().toString().isEmpty()
            && !numvotes.getText().isEmpty() && numvotes.getText().matches("[0-9]+")){

            String can_name = name.getText();

            String can_pos = position.getSelectedItem().toString();

            String can_votes = numvotes.getText();
            
            Database.addToActiveCandidates(can_name,can_pos,user);
            CandList.addAll(Database.getCandidateList());
            
            clearAddTable();
            statuslabel.setForeground(new Color(0,153,51));
            statuslabel.setText("SUCESSFULLY ADDED!");
        }else{
            statuslabel.setForeground(new Color(196,75,77));
            statuslabel.setText("THERE IS AN ERROR IN YOUR INPUT!");
        }
    }//GEN-LAST:event_addMouseClicked

    private void candidatesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidatesTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) candidatesTable.getModel();
        int selectedRowIndex = candidatesTable.getSelectedRow();
        
        String candidate_name = model.getValueAt(selectedRowIndex, 0).toString();

        String candidate_pos = model.getValueAt(selectedRowIndex, 1).toString();

        String numVotes = model.getValueAt(selectedRowIndex, 2).toString();
        
        setTextFields(candidate_name, candidate_pos, numVotes);
    }//GEN-LAST:event_candidatesTableMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, 
            "Are you sure you want to remove candidate?","Warning", dialogButton);

        if (dialogResult == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) candidatesTable.getModel();
            int SelectedRowIndex = candidatesTable.getSelectedRow();
            model.removeRow(SelectedRowIndex);
            statuslabel.setForeground(new Color(0,153,51));
            statuslabel.setText("SUCESSFULLY DELETED!");
        }else{
            statuslabel.setForeground(new Color(196,75,77));
            statuslabel.setText("YOU HAVE CANCELLED DELETION!");
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void logout_sideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_sideMouseClicked
        logout_sideBar_onclick();
    }//GEN-LAST:event_logout_sideMouseClicked
    
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
    private javax.swing.JButton delete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left_sidebar;
    private javax.swing.JPanel logout_side;
    private javax.swing.JLabel logout_side_label;
    private javax.swing.JTextField name;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField numvotes;
    private javax.swing.JLabel numvoteslabel;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JLabel positionlabel;
    private javax.swing.JPanel searchbar_panel;
    private javax.swing.JLabel statuslabel;
    private javax.swing.JButton update;
    private javax.swing.JLabel user_label;
    private javax.swing.JLabel user_label1;
    private javax.swing.JLabel userimg;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
