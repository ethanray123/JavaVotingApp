
package votingapp;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resources.Database;
import static resources.Database.addToActiveUsers;
import resources.Superuser;
import resources.User;
import static votingapp.Login.user;

public class Home_SuperUser extends javax.swing.JFrame {
    // 0,17,36
    // 2,49,74    
    // 7,107,143
    public static int sidebar = 0; // 0 - List of Officers, 1 - List of Voters
    ArrayList<Superuser> SUOfficerList = new ArrayList<Superuser>();
    ArrayList<Superuser> SUVoterList = new ArrayList<Superuser>();
    public static int officerid = 6;
    public Home_SuperUser() {
        initComponents();
        dashboard();
        initialOfficer();
        addRowToOfficerJTable();
        username.setText(user);
    }
    
    public void addRowToOfficerJTable()
    {
        DefaultTableModel model = (DefaultTableModel) officersTable.getModel();
       
        Object rowData[] = new Object[2];
        for(int i = 0; i < SUOfficerList.size(); i++){
            rowData[0] = i;
            rowData[1] = SUOfficerList.get(i).getFirstName() + " " +
                SUOfficerList.get(i).getLastName();
           
            model.addRow(rowData);
        }
    }
    
    public void initialOfficer()
    {
        Superuser s1 = new Superuser("Joshua", "Joshua", "Ty", "Hazel");
        Superuser s2 = new Superuser("Rosslyn", "Rosslyn", "Taghoy", "Hazel");
        Superuser s3 = new Superuser("Earvin", "Earvin", "Hao", "Hazel");
        Superuser s4 = new Superuser("Joshua", "Joshua", "Alcoy", "Hazel");
        Superuser s5 = new Superuser("Terrence", "Terrence", "Ting", "Hazel");
        Superuser s6 = new Superuser("Gian", "Gian", "Young", "Hazel");
        
        SUOfficerList.add(s1);
        SUOfficerList.add(s2);
        SUOfficerList.add(s3);
        SUOfficerList.add(s4);
        SUOfficerList.add(s5);
        SUOfficerList.add(s6);
        
    }
    public void dashboard()
    {
        //set bg color when sidebar tab clicked
        dashboard_side.setBackground(new Color(7,107,143));
        officers_side.setBackground(new Color(2,49,74));
        voters_side.setBackground(new Color(2,49,74));
        logout_side.setBackground(new Color(2,49,74));
        
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
        logout_side.setBackground(new Color(2,49,74));
        
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
        logout_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        voters.setVisible(true);
        dashboard.setVisible(false);
        officers.setVisible(false);
    }
    public void logout_sideBar_onclick()
    {
        logout_side.setBackground(new Color(7,107,143));
        dashboard_side.setBackground(new Color(2,49,74));
        voters_side.setBackground(new Color(2,49,74));
        officers_side.setBackground(new Color(2,49,74));
        
        new Login().setVisible(true);
        this.dispose();
    }
    public void clearAddTable(int flag)
    {   
        
        if(flag == 0){
            DefaultTableModel model = (DefaultTableModel) officersTable.getModel();
            int rowCount = model.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            Object rowData[] = new Object[3];
        
            for(int i = 0; i < SUOfficerList.size(); i++){
                rowData[0] = i;
                rowData[1] = SUOfficerList.get(i).getFirstName();
                rowData[2] = SUOfficerList.get(i).getLastName();

                System.out.println(rowData[0]);
                System.out.println(rowData[1]);
                System.out.println("\n");

                model.addRow(rowData);
            }    
        }else{
            DefaultTableModel model = (DefaultTableModel) officersTable.getModel();
            int rowCount = model.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            Object rowData[] = new Object[3];
            for(int i = 0; i < SUVoterList.size(); i++){
                rowData[0] = i;
                rowData[1] = SUVoterList.get(i).getFirstName();
                rowData[2] = SUVoterList.get(i).getLastName();

                System.out.println(rowData[0]);
                System.out.println(rowData[1]);
                System.out.println("\n");

                model.addRow(rowData);
            }
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
        officers_side = new javax.swing.JPanel();
        officers_side_label = new javax.swing.JLabel();
        voters_side = new javax.swing.JPanel();
        voters_side_label = new javax.swing.JLabel();
        logout_side = new javax.swing.JPanel();
        logout_side_label = new javax.swing.JLabel();
        officers = new javax.swing.JPanel();
        user_label1 = new javax.swing.JLabel();
        candidates_jScrollPane = new javax.swing.JScrollPane();
        officersTable = new javax.swing.JTable();
        statuslabel = new javax.swing.JLabel();
        fnamelabel = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        lnamelabel = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        addOfficer = new javax.swing.JButton();
        deleteOfficer = new javax.swing.JButton();
        updateOfficer = new javax.swing.JButton();
        voters = new javax.swing.JPanel();
        voters_label = new javax.swing.JLabel();
        voters_jScrollPane = new javax.swing.JScrollPane();
        votersTable = new javax.swing.JTable();
        statuslabel2 = new javax.swing.JLabel();
        fnamelabel1 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        lname1 = new javax.swing.JTextField();
        lnamelabel1 = new javax.swing.JLabel();
        addVoter = new javax.swing.JButton();
        deleteVoter = new javax.swing.JButton();
        updateVoter = new javax.swing.JButton();
        dashboard = new javax.swing.JPanel();
        dashboard_right_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 17, 36));
        jPanel1.setMaximumSize(new java.awt.Dimension(940, 618));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 618));
        jPanel1.setLayout(null);

        left_sidebar.setBackground(new java.awt.Color(2, 49, 74));
        left_sidebar.setLayout(null);

        userimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\VotingApp\\JavaVotingApp\\img\\user.png")); // NOI18N
        left_sidebar.add(userimg);
        userimg.setBounds(70, 40, 100, 110);

        user_label.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        user_label.setForeground(new java.awt.Color(255, 255, 255));
        user_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label.setText("SUPERUSER");
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
                .addComponent(logout_side_label, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
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
        logout_side.setBounds(0, 460, 250, 60);

        jPanel1.add(left_sidebar);
        left_sidebar.setBounds(0, 0, 250, 570);

        officers.setBackground(new java.awt.Color(0, 17, 36));
        officers.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        user_label1.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        user_label1.setForeground(new java.awt.Color(255, 255, 255));
        user_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label1.setText("TABLE LIST OF OFFICERS");

        officersTable.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        officersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name"
            }
        ));
        officersTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        officersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                officersTableMouseClicked(evt);
            }
        });
        candidates_jScrollPane.setViewportView(officersTable);

        statuslabel.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        statuslabel.setForeground(new java.awt.Color(0, 153, 51));
        statuslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fnamelabel.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        fnamelabel.setForeground(new java.awt.Color(196, 75, 77));
        fnamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnamelabel.setText("FIRST NAME");

        lname.setBackground(new java.awt.Color(15, 74, 74));
        lname.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        lname.setOpaque(false);

        lnamelabel.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lnamelabel.setForeground(new java.awt.Color(196, 75, 77));
        lnamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnamelabel.setText("LAST NAME");

        fname.setBackground(new java.awt.Color(15, 74, 74));
        fname.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        fname.setOpaque(false);

        addOfficer.setBackground(new java.awt.Color(0, 153, 51));
        addOfficer.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        addOfficer.setForeground(new java.awt.Color(255, 255, 255));
        addOfficer.setText("ADD");
        addOfficer.setBorder(null);
        addOfficer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOfficerMouseClicked(evt);
            }
        });

        deleteOfficer.setBackground(new java.awt.Color(0, 153, 51));
        deleteOfficer.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        deleteOfficer.setForeground(new java.awt.Color(255, 255, 255));
        deleteOfficer.setText("DELETE");
        deleteOfficer.setBorder(null);
        deleteOfficer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteOfficerMouseClicked(evt);
            }
        });

        updateOfficer.setBackground(new java.awt.Color(0, 153, 51));
        updateOfficer.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        updateOfficer.setForeground(new java.awt.Color(255, 255, 255));
        updateOfficer.setText("UPDATE");
        updateOfficer.setBorder(null);
        updateOfficer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateOfficerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout officersLayout = new javax.swing.GroupLayout(officers);
        officers.setLayout(officersLayout);
        officersLayout.setHorizontalGroup(
            officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(officersLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(candidates_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(officersLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(officersLayout.createSequentialGroup()
                                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(officersLayout.createSequentialGroup()
                                .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(officersLayout.createSequentialGroup()
                                        .addComponent(addOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(updateOfficer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(37, 37, 37)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        officersLayout.setVerticalGroup(
            officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, officersLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(user_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(candidates_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(officersLayout.createSequentialGroup()
                        .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(officersLayout.createSequentialGroup()
                        .addComponent(lnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.add(officers);
        officers.setBounds(250, 0, 710, 580);

        voters.setBackground(new java.awt.Color(0, 17, 36));
        voters.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        voters_label.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        voters_label.setForeground(new java.awt.Color(255, 255, 255));
        voters_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        voters_label.setText("TABLE LIST OF OFFICERS");

        votersTable.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        votersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name"
            }
        ));
        votersTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        votersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votersTableMouseClicked(evt);
            }
        });
        voters_jScrollPane.setViewportView(votersTable);

        statuslabel2.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        statuslabel2.setForeground(new java.awt.Color(0, 153, 51));
        statuslabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fnamelabel1.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        fnamelabel1.setForeground(new java.awt.Color(196, 75, 77));
        fnamelabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnamelabel1.setText("FIRST NAME");

        fname1.setBackground(new java.awt.Color(15, 74, 74));
        fname1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        fname1.setForeground(new java.awt.Color(255, 255, 255));
        fname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        fname1.setOpaque(false);

        lname1.setBackground(new java.awt.Color(15, 74, 74));
        lname1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        lname1.setForeground(new java.awt.Color(255, 255, 255));
        lname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        lname1.setOpaque(false);

        lnamelabel1.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lnamelabel1.setForeground(new java.awt.Color(196, 75, 77));
        lnamelabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnamelabel1.setText("LAST NAME");

        addVoter.setBackground(new java.awt.Color(0, 153, 51));
        addVoter.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        addVoter.setForeground(new java.awt.Color(255, 255, 255));
        addVoter.setText("ADD");
        addVoter.setBorder(null);
        addVoter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addVoterMouseClicked(evt);
            }
        });

        deleteVoter.setBackground(new java.awt.Color(0, 153, 51));
        deleteVoter.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        deleteVoter.setForeground(new java.awt.Color(255, 255, 255));
        deleteVoter.setText("DELETE");
        deleteVoter.setBorder(null);
        deleteVoter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteVoterMouseClicked(evt);
            }
        });

        updateVoter.setBackground(new java.awt.Color(0, 153, 51));
        updateVoter.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        updateVoter.setForeground(new java.awt.Color(255, 255, 255));
        updateVoter.setText("UPDATE");
        updateVoter.setBorder(null);
        updateVoter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateVoterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout votersLayout = new javax.swing.GroupLayout(voters);
        voters.setLayout(votersLayout);
        votersLayout.setHorizontalGroup(
            votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(votersLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voters_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voters_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statuslabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(votersLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(votersLayout.createSequentialGroup()
                                .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(votersLayout.createSequentialGroup()
                                .addComponent(fnamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lnamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(votersLayout.createSequentialGroup()
                                        .addComponent(addVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(updateVoter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(37, 37, 37)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        votersLayout.setVerticalGroup(
            votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, votersLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(voters_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(voters_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(statuslabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(votersLayout.createSequentialGroup()
                        .addComponent(fnamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(votersLayout.createSequentialGroup()
                        .addComponent(lnamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(voters);
        voters.setBounds(250, 0, 710, 570);

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
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dashboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_right_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(dashboard);
        dashboard.setBounds(250, 0, 710, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void logout_sideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_sideMouseClicked
        logout_sideBar_onclick();
    }//GEN-LAST:event_logout_sideMouseClicked

    private void officersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_officersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) officersTable.getModel();
        int selectedRowIndex = officersTable.getSelectedRow();

        String officer_name = model.getValueAt(selectedRowIndex, 1).toString();

        fname.setText(officer_name);
    }//GEN-LAST:event_officersTableMouseClicked

    private void addOfficerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOfficerMouseClicked
        if(!fname.getText().isEmpty() && !lname.getText().isEmpty()){

            String officer_fname = fname.getText();
            String officer_lname = lname.getText();
            
            User u = new User(officer_fname, officer_fname, officer_lname, "Hazel");
            Database.addToActiveUsers(u);
            SUOfficerList.addAll(Database.getCandidateList());
            
            sidebar = 0;
            clearAddTable(sidebar);
            
            statuslabel.setForeground(new Color(0,153,51));
            statuslabel.setText("SUCESSFULLY ADDED!");
        }else{
            statuslabel.setForeground(new Color(196,75,77));
            statuslabel.setText("THERE IS AN ERROR IN YOUR INPUT!");
        }
    }//GEN-LAST:event_addOfficerMouseClicked

    private void deleteOfficerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOfficerMouseClicked

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null,
            "Are you sure you want to remove candidate?","Warning", dialogButton);

        if (dialogResult == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) officersTable.getModel();
            int SelectedRowIndex = officersTable.getSelectedRow();
            model.removeRow(SelectedRowIndex);
            statuslabel.setForeground(new Color(0,153,51));
            statuslabel.setText("SUCESSFULLY DELETED!");
        }else{
            statuslabel.setForeground(new Color(196,75,77));
            statuslabel.setText("YOU HAVE CANCELLED DELETION!");
        }
    }//GEN-LAST:event_deleteOfficerMouseClicked

    private void updateOfficerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateOfficerMouseClicked
        DefaultTableModel model = (DefaultTableModel) officersTable.getModel();
        int selectedRowIndex = officersTable.getSelectedRow();

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null,
            "Are you sure you want to update candidate?","Warning", dialogButton);

        if (dialogResult == JOptionPane.YES_OPTION) {
            if(!fname.getText().isEmpty()){
                model.setValueAt(fname.getText(), selectedRowIndex, 1);
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
    }//GEN-LAST:event_updateOfficerMouseClicked

    private void votersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votersTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_votersTableMouseClicked

    private void addVoterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVoterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addVoterMouseClicked

    private void deleteVoterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteVoterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteVoterMouseClicked

    private void updateVoterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateVoterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateVoterMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_SuperUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOfficer;
    private javax.swing.JButton addVoter;
    private javax.swing.JScrollPane candidates_jScrollPane;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dashboard_right_label;
    private javax.swing.JPanel dashboard_side;
    private javax.swing.JLabel dashboard_side_label;
    private javax.swing.JButton deleteOfficer;
    private javax.swing.JButton deleteVoter;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel fnamelabel;
    private javax.swing.JLabel fnamelabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left_sidebar;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField lname1;
    private javax.swing.JLabel lnamelabel;
    private javax.swing.JLabel lnamelabel1;
    private javax.swing.JPanel logout_side;
    private javax.swing.JLabel logout_side_label;
    private javax.swing.JPanel officers;
    private javax.swing.JTable officersTable;
    private javax.swing.JPanel officers_side;
    private javax.swing.JLabel officers_side_label;
    private javax.swing.JLabel statuslabel;
    private javax.swing.JLabel statuslabel2;
    private javax.swing.JButton updateOfficer;
    private javax.swing.JButton updateVoter;
    private javax.swing.JLabel user_label;
    private javax.swing.JLabel user_label1;
    private javax.swing.JLabel userimg;
    private javax.swing.JLabel username;
    private javax.swing.JPanel voters;
    private javax.swing.JTable votersTable;
    private javax.swing.JScrollPane voters_jScrollPane;
    private javax.swing.JLabel voters_label;
    private javax.swing.JPanel voters_side;
    private javax.swing.JLabel voters_side_label;
    // End of variables declaration//GEN-END:variables
}
