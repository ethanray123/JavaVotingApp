
package votingapp;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resources.Database;
import resources.Superuser;
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
        officers_sideBar_onclick();
        initialOfficer();
        addRowToOfficerJTable();
        initialVoter();
        addRowToVoterJTable();
        username.setText(user);
    }
    
    public void addRowToOfficerJTable()
    {
        DefaultTableModel model = (DefaultTableModel) officersTable.getModel();
       
        Object rowData[] = new Object[3];
        for(int i = 0; i < SUOfficerList.size(); i++){
            rowData[0] = i;
            rowData[1] = SUOfficerList.get(i).getFirstName();
            rowData[2] = SUOfficerList.get(i).getLastName();
           
            model.addRow(rowData);
        }
    }
    
    public void initialOfficer()
    {
        Superuser s1 = new Superuser("Joshua", "Joshua", "Ty", "Allena");
        Superuser s2 = new Superuser("Rosslyn", "Rosslyn", "Taghoy", "Allena");
        Superuser s3 = new Superuser("Earvin", "Earvin", "Hao", "Allena");
        Superuser s4 = new Superuser("Terrence", "Terrence", "Ting", "Allena");
        Superuser s5 = new Superuser("Gian", "Gian", "Young", "Allena");
        
        SUOfficerList.add(s1);
        SUOfficerList.add(s2);
        SUOfficerList.add(s3);
        SUOfficerList.add(s4);
        SUOfficerList.add(s5);
        
    }
    
    public void addRowToVoterJTable()
    {
        DefaultTableModel model = (DefaultTableModel) votersTable.getModel();
       
        Object rowData[] = new Object[3];
        for(int i = 0; i < SUVoterList.size(); i++){
            rowData[0] = i;
            rowData[1] = SUVoterList.get(i).getFirstName();
            rowData[2] = SUVoterList.get(i).getLastName();
           
            model.addRow(rowData);
        }
    }
    
    public void initialVoter()
    {
        Superuser s1 = new Superuser("Ethan", "Ethan", "Mosqueda", "Allena");
        Superuser s2 = new Superuser("Hazel", "Hazel", "Cavite", "Allena");
        Superuser s3 = new Superuser("Daniela", "Daniela", "Andrade", "Allena");
        Superuser s4 = new Superuser("Maddie", "Maddie", "Burgos", "Allena");
        
        SUVoterList.add(s1);
        SUVoterList.add(s2);
        SUVoterList.add(s3);
        SUVoterList.add(s4);
        
    }
    
    public void officers_sideBar_onclick()
    {
        //set bg color when sidebar tab clicked
        officers_side.setBackground(new Color(7,107,143));
        voters_side.setBackground(new Color(2,49,74));
        logout_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        officers.setVisible(true);
        voters.setVisible(false);
    }
    
    public void voters_sideBar_onclick()
    {
        //set bg color when sidebar tab clicked
        voters_side.setBackground(new Color(7,107,143));
        officers_side.setBackground(new Color(2,49,74));
        logout_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        voters.setVisible(true);
        officers.setVisible(false);
    }
    public void logout_sideBar_onclick()
    {
        logout_side.setBackground(new Color(7,107,143));
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
        }else if(flag == 1){
            DefaultTableModel model = (DefaultTableModel) votersTable.getModel();
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
        lnamelabel1 = new javax.swing.JLabel();
        lname1 = new javax.swing.JTextField();
        addVoter = new javax.swing.JButton();
        deleteVoter = new javax.swing.JButton();
        updateVoter = new javax.swing.JButton();

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
        officers_side.setBounds(0, 280, 250, 60);

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
        voters_side.setBounds(0, 340, 250, 60);

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
        logout_side.setBounds(0, 400, 250, 60);

        jPanel1.add(left_sidebar);
        left_sidebar.setBounds(0, 0, 250, 570);

        officers.setBackground(new java.awt.Color(0, 17, 36));
        officers.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        user_label1.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        user_label1.setForeground(new java.awt.Color(255, 255, 255));
        user_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label1.setText("TABLE LIST OF OFFICERS");
        user_label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        statuslabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fnamelabel.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        fnamelabel.setForeground(new java.awt.Color(196, 75, 77));
        fnamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnamelabel.setText("FIRST NAME");
        fnamelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        lnamelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(officersLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(candidates_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(officersLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(officersLayout.createSequentialGroup()
                                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(313, 313, 313))
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
                                        .addComponent(updateOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
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
                .addGap(18, 18, 18)
                .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(officersLayout.createSequentialGroup()
                        .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(officersLayout.createSequentialGroup()
                        .addComponent(lnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(officersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel1.add(officers);
        officers.setBounds(250, 0, 710, 580);

        voters.setBackground(new java.awt.Color(0, 17, 36));
        voters.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        voters_label.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        voters_label.setForeground(new java.awt.Color(255, 255, 255));
        voters_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        voters_label.setText("TABLE LIST OF VOTERS");
        voters_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        votersTable.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        votersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name"
            }
        ));
        votersTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        votersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votersTableMouseClicked(evt);
            }
        });
        voters_jScrollPane.setViewportView(votersTable);

        statuslabel2.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        statuslabel2.setForeground(new java.awt.Color(0, 153, 51));
        statuslabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statuslabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fnamelabel1.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        fnamelabel1.setForeground(new java.awt.Color(196, 75, 77));
        fnamelabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnamelabel1.setText("FIRST NAME");
        fnamelabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fname1.setBackground(new java.awt.Color(15, 74, 74));
        fname1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        fname1.setForeground(new java.awt.Color(255, 255, 255));
        fname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        fname1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fname1.setOpaque(false);

        lnamelabel1.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lnamelabel1.setForeground(new java.awt.Color(196, 75, 77));
        lnamelabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnamelabel1.setText("LAST NAME");
        lnamelabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lname1.setBackground(new java.awt.Color(15, 74, 74));
        lname1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        lname1.setForeground(new java.awt.Color(255, 255, 255));
        lname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        lname1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lname1.setOpaque(false);

        addVoter.setBackground(new java.awt.Color(0, 153, 51));
        addVoter.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        addVoter.setForeground(new java.awt.Color(255, 255, 255));
        addVoter.setText("ADD");
        addVoter.setBorder(null);
        addVoter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        deleteVoter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        updateVoter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(votersLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voters_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(voters_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statuslabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(votersLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(votersLayout.createSequentialGroup()
                                .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(313, 313, 313))
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
                                        .addComponent(updateVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
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
                .addGap(18, 18, 18)
                .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(votersLayout.createSequentialGroup()
                        .addComponent(fnamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(votersLayout.createSequentialGroup()
                        .addComponent(lnamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(votersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(voters);
        voters.setBounds(250, 0, 710, 570);

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

        String officer_fname = model.getValueAt(selectedRowIndex, 1).toString();
        String officer_lname = model.getValueAt(selectedRowIndex, 2).toString();

        fname.setText(officer_fname);
        lname.setText(officer_lname);
    }//GEN-LAST:event_officersTableMouseClicked

    private void addOfficerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOfficerMouseClicked
        if(!fname.getText().isEmpty() && !lname.getText().isEmpty()){

            String officer_fname = fname.getText();
            String officer_lname = lname.getText();
            
            Superuser newSU = new Superuser(officer_fname, officer_fname, officer_lname, "Allena");
            Database.addToActiveSUOfficers(newSU);
            SUOfficerList.addAll(Database.getFromActiveSUOfficers());
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
            "Are you sure you want to remove officer?","Warning", dialogButton);

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
            "Are you sure you want to update officer?","Warning", dialogButton);

        if (dialogResult == JOptionPane.YES_OPTION) {
            if(!fname.getText().isEmpty() && !lname.getText().isEmpty()){
                model.setValueAt(fname.getText(), selectedRowIndex, 1);
                model.setValueAt(lname.getText(), selectedRowIndex, 2);
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
        DefaultTableModel model = (DefaultTableModel) votersTable.getModel();
        int selectedRowIndex = votersTable.getSelectedRow();

        String officer_fname = model.getValueAt(selectedRowIndex, 1).toString();
        String officer_lname = model.getValueAt(selectedRowIndex, 2).toString();

        fname1.setText(officer_fname);
        lname1.setText(officer_lname);
    }//GEN-LAST:event_votersTableMouseClicked

    private void addVoterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVoterMouseClicked
        if(!fname1.getText().isEmpty() && !lname1.getText().isEmpty()){

            String officer_fname = fname1.getText();
            String officer_lname = lname1.getText();
            
            Superuser newSU = new Superuser(officer_fname, officer_fname, officer_lname, "Allena");
            Database.addToActiveSUVoters(newSU);
            SUVoterList.addAll(Database.getFromActiveSUVoters());
            sidebar = 1;
            clearAddTable(sidebar);
            
            statuslabel2.setForeground(new Color(0,153,51));
            statuslabel2.setText("SUCESSFULLY ADDED!");
        }else{
            statuslabel2.setForeground(new Color(196,75,77));
            statuslabel2.setText("THERE IS AN ERROR IN YOUR INPUT!");
        }
    }//GEN-LAST:event_addVoterMouseClicked

    private void deleteVoterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteVoterMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null,
            "Are you sure you want to remove voter?","Warning", dialogButton);

        if (dialogResult == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) votersTable.getModel();
            int SelectedRowIndex = votersTable.getSelectedRow();
            model.removeRow(SelectedRowIndex);
            statuslabel2.setForeground(new Color(0,153,51));
            statuslabel2.setText("SUCESSFULLY DELETED!");
        }else{
            statuslabel2.setForeground(new Color(196,75,77));
            statuslabel2.setText("YOU HAVE CANCELLED DELETION!");
        }
    }//GEN-LAST:event_deleteVoterMouseClicked

    private void updateVoterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateVoterMouseClicked
        DefaultTableModel model = (DefaultTableModel) votersTable.getModel();
        int selectedRowIndex = votersTable.getSelectedRow();

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null,
            "Are you sure you want to update voter?","Warning", dialogButton);

        if (dialogResult == JOptionPane.YES_OPTION) {
            if(!fname1.getText().isEmpty() && !lname1.getText().isEmpty()){
                model.setValueAt(fname1.getText(), selectedRowIndex, 1);
                model.setValueAt(lname1.getText(), selectedRowIndex, 2);
                statuslabel2.setForeground(new Color(0,153,51));
                statuslabel2.setText("SUCESSFULLY UPDATED!");
            }else{
                statuslabel2.setForeground(new Color(196,75,77));
                statuslabel2.setText("THERE IS AN ERROR IN YOUR INPUT!");
            }
        }else{
            statuslabel2.setForeground(new Color(196,75,77));
            statuslabel2.setText("YOU HAVE CANCELLED UPDATE!");
        }
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
