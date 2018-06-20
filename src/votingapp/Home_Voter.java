
package votingapp;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import resources.Candidate;
import resources.Database;
import static votingapp.Login.user;

public class Home_Voter extends javax.swing.JFrame {
    
    // 0,17,36
    // 2,49,74    
    // 7,107,143
    ArrayList<String> PresList = new ArrayList<String>();
    ArrayList<String> VPresList = new ArrayList<String>();
    ArrayList<String> SenList = new ArrayList<String>();
    ArrayList<String> DRList = new ArrayList<String>();
    ArrayList<String> GovList = new ArrayList<String>();
    ArrayList<String> MayList = new ArrayList<String>();
    ArrayList<Candidate> CandList = new ArrayList<Candidate>();
    public static int presCtr = 0, vPresCtr = 0, senCtr = 0, drCtr = 0, 
        govCtr = 0, mayCtr = 0;
    
    public Home_Voter() {
        initComponents();
        username.setText(user);
        candidates_sideBar_onclick();
        PresidentInitial();
        VPresidentInitial();
        SenatorInital();
        DRInital();
        GovernorInitial();
        MayorInitial();
    }
    
    public void addRowToJTable(String can_name, String can_pos)
    {
        DefaultTableModel model = (DefaultTableModel) votingTable.getModel();
        model.addRow(new Object[]{
            can_name, can_pos
        });
    }
    
    
    /* INITIALIZING CANDIDATES OF EACH POSITION */
    public void PresidentInitial()
    {
        PresList.add("Renz Bernados");
        PresList.add("Marvin Lim");
        PresList.add("Kasey Cuyos");
        
        DefaultComboBoxModel dm = new DefaultComboBoxModel(PresList.toArray());
        pres_combo.setModel(dm);
    }
    
    public void VPresidentInitial()
    {
        VPresList.add("Zairiel Sarausad");    
        VPresList.add("Daniel Ubanan");
        VPresList.add("Jericho Mesina");
        
        DefaultComboBoxModel dm = new DefaultComboBoxModel(VPresList.toArray());
        vpres_combo.setModel(dm);
    }
    
    public void SenatorInital()
    {
        SenList.add("Jerly Palacio");    
        SenList.add("Grace Maureal");
        SenList.add("Alec Uy");
        SenList.add("Joseph Acriche");
        SenList.add("Gio Isola");
        SenList.add("Justin Canezo");    
        SenList.add("Princess Barote");
        SenList.add("Ace Alcover");
        SenList.add("Joseph Lazatin");
        SenList.add("Adrian Agpasa");
        
        DefaultComboBoxModel dm = new DefaultComboBoxModel(SenList.toArray());
        sen_combo.setModel(dm);
    }
    
    public void DRInital()
    {
        DRList.add("Janel Duenas");    
        DRList.add("Ariane Cavite");
        DRList.add("Virgilio Cavite");
        DRList.add("Clizen Cortes");
        DRList.add("Thessa Quijote");
        DRList.add("Carlo Janea");    
        DRList.add("Jack Garay");
        DRList.add("Bojo Alcisto");
        DRList.add("Robert Yap");
        DRList.add("Jasmine Yu");
       
        DefaultComboBoxModel dm = new DefaultComboBoxModel(DRList.toArray());
        drep_combo.setModel(dm);
    }
    
    public void GovernorInitial()
    {
        GovList.add("Joshua Isanan");    
        GovList.add("Robert Lim");
        GovList.add("Moses Divinagracia");
        
        DefaultComboBoxModel dm = new DefaultComboBoxModel(GovList.toArray());
        gov_combo.setModel(dm);
    }
    
    public void MayorInitial()
    {
        MayList.add("Vince Villamora"); 
        MayList.add("Joaquin Lava");
        MayList.add("Peter Galang");
        
        DefaultComboBoxModel dm = new DefaultComboBoxModel(MayList.toArray());
        mayor_combo.setModel(dm);
    }
    
    /* SIDE BAR */
    
    public void candidates_sideBar_onclick()
    {
        //set bg color when sidebar tab clicked
        candidates_side.setBackground(new Color(7,107,143));
        logout_side.setBackground(new Color(2,49,74));
        
        // hide and show right side jPanels
        candidates.setVisible(true);
    }
    public void logout_sideBar_onclick()
    {
        logout_side.setBackground(new Color(7,107,143));
        candidates_side.setBackground(new Color(2,49,74));
        
        new Login().setVisible(true);
        this.dispose();
    }
    
    public void clearTable()
    {
        DefaultTableModel model = (DefaultTableModel) votingTable.getModel();
        int rowCount = model.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        presCtr = vPresCtr = senCtr = drCtr = govCtr = mayCtr = 0;
        statuslabel.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        left_sidebar = new javax.swing.JPanel();
        userimg = new javax.swing.JLabel();
        user_label = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        candidates_side = new javax.swing.JPanel();
        candidates_side_label = new javax.swing.JLabel();
        logout_side = new javax.swing.JPanel();
        logout_side_label = new javax.swing.JLabel();
        candidates = new javax.swing.JPanel();
        candidates_jScrollPane = new javax.swing.JScrollPane();
        votingTable = new javax.swing.JTable();
        user_label1 = new javax.swing.JLabel();
        statuslabel = new javax.swing.JLabel();
        pres = new javax.swing.JLabel();
        pres_combo = new javax.swing.JComboBox<>();
        vpres = new javax.swing.JLabel();
        vpres_combo = new javax.swing.JComboBox<>();
        sen = new javax.swing.JLabel();
        sen_combo = new javax.swing.JComboBox<>();
        drep = new javax.swing.JLabel();
        drep_combo = new javax.swing.JComboBox<>();
        gov = new javax.swing.JLabel();
        gov_combo = new javax.swing.JComboBox<>();
        mayor = new javax.swing.JLabel();
        mayor_combo = new javax.swing.JComboBox<>();
        vote = new javax.swing.JButton();
        cleartable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 17, 36));
        jPanel1.setMaximumSize(new java.awt.Dimension(940, 618));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 618));
        jPanel1.setLayout(null);

        left_sidebar.setBackground(new java.awt.Color(2, 49, 74));
        left_sidebar.setLayout(null);

        userimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\VotingApp\\JavaVotingApp\\img\\user.png")); // NOI18N
        left_sidebar.add(userimg);
        userimg.setBounds(70, 50, 100, 110);

        user_label.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        user_label.setForeground(new java.awt.Color(255, 255, 255));
        user_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label.setText("VOTER");
        user_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        left_sidebar.add(user_label);
        user_label.setBounds(0, 170, 250, 40);

        username.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        left_sidebar.add(username);
        username.setBounds(0, 210, 250, 30);

        candidates_side.setBackground(new java.awt.Color(2, 49, 74));
        candidates_side.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        candidates_side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidates_sideMouseClicked(evt);
            }
        });

        candidates_side_label.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        candidates_side_label.setForeground(new java.awt.Color(255, 255, 255));
        candidates_side_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candidates_side_label.setText("VOTE CANDIDATES");
        candidates_side_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        logout_side.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout_side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_sideMouseClicked(evt);
            }
        });

        logout_side_label.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        logout_side_label.setForeground(new java.awt.Color(255, 255, 255));
        logout_side_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout_side_label.setText("LOGOUT");
        logout_side_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        left_sidebar.setBounds(0, 0, 250, 700);

        candidates.setBackground(new java.awt.Color(0, 17, 36));
        candidates.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        votingTable.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        votingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Candidate Name", "Position"
            }
        ));
        votingTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        candidates_jScrollPane.setViewportView(votingTable);

        user_label1.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        user_label1.setForeground(new java.awt.Color(255, 255, 255));
        user_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label1.setText("ONLINE BALLOT");
        user_label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        statuslabel.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        statuslabel.setForeground(new java.awt.Color(0, 153, 51));
        statuslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statuslabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pres.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        pres.setForeground(new java.awt.Color(196, 75, 77));
        pres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pres.setText("President");
        pres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pres_combo.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        pres_combo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pres_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pres_comboActionPerformed(evt);
            }
        });

        vpres.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        vpres.setForeground(new java.awt.Color(196, 75, 77));
        vpres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vpres.setText("Vice President");
        vpres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        vpres_combo.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        vpres_combo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vpres_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpres_comboActionPerformed(evt);
            }
        });

        sen.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        sen.setForeground(new java.awt.Color(196, 75, 77));
        sen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sen.setText("Senator");
        sen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sen_combo.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        sen_combo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sen_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sen_comboActionPerformed(evt);
            }
        });

        drep.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        drep.setForeground(new java.awt.Color(196, 75, 77));
        drep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drep.setText("District Representative");
        drep.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        drep_combo.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        drep_combo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        drep_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drep_comboActionPerformed(evt);
            }
        });

        gov.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        gov.setForeground(new java.awt.Color(196, 75, 77));
        gov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gov.setText("Governor");
        gov.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gov_combo.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        gov_combo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gov_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gov_comboActionPerformed(evt);
            }
        });

        mayor.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        mayor.setForeground(new java.awt.Color(196, 75, 77));
        mayor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mayor.setText("Mayor");
        mayor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mayor_combo.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        mayor_combo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mayor_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayor_comboActionPerformed(evt);
            }
        });

        vote.setBackground(new java.awt.Color(0, 153, 51));
        vote.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        vote.setForeground(new java.awt.Color(255, 255, 255));
        vote.setText("VOTE");
        vote.setBorder(null);
        vote.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voteMouseClicked(evt);
            }
        });

        cleartable.setBackground(new java.awt.Color(0, 153, 51));
        cleartable.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        cleartable.setForeground(new java.awt.Color(255, 255, 255));
        cleartable.setText("CLEAR TABLE");
        cleartable.setBorder(null);
        cleartable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cleartable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleartableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout candidatesLayout = new javax.swing.GroupLayout(candidates);
        candidates.setLayout(candidatesLayout);
        candidatesLayout.setHorizontalGroup(
            candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candidatesLayout.createSequentialGroup()
                .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(user_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(candidatesLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(candidates_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(candidatesLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(candidatesLayout.createSequentialGroup()
                                    .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sen, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sen_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pres, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pres_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(53, 53, 53)
                                    .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vpres, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vpres_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, candidatesLayout.createSequentialGroup()
                                            .addComponent(cleartable, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(vote, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(drep, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(drep_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(candidatesLayout.createSequentialGroup()
                                    .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gov, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gov_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(53, 53, 53)
                                    .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mayor_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        candidatesLayout.setVerticalGroup(
            candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candidatesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(user_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(candidates_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(candidatesLayout.createSequentialGroup()
                        .addComponent(vpres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(vpres_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(candidatesLayout.createSequentialGroup()
                        .addComponent(pres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pres_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(candidatesLayout.createSequentialGroup()
                        .addComponent(drep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(drep_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(candidatesLayout.createSequentialGroup()
                        .addComponent(sen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(sen_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(candidatesLayout.createSequentialGroup()
                        .addComponent(gov, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(gov_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(candidatesLayout.createSequentialGroup()
                        .addComponent(mayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(mayor_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(candidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleartable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(candidates);
        candidates.setBounds(250, 0, 690, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void candidates_sideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidates_sideMouseClicked
        candidates_sideBar_onclick();
    }//GEN-LAST:event_candidates_sideMouseClicked

    private void logout_sideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_sideMouseClicked
        logout_sideBar_onclick();
    }//GEN-LAST:event_logout_sideMouseClicked

    private void pres_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pres_comboActionPerformed
        String can_name = pres_combo.getSelectedItem().toString();
        String can_pos = pres.getText();
        presCtr++;
        addRowToJTable(can_name, can_pos);
    }//GEN-LAST:event_pres_comboActionPerformed

    private void vpres_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpres_comboActionPerformed
        String can_name = vpres_combo.getSelectedItem().toString();
        String can_pos = vpres.getText();
        vPresCtr++;
        addRowToJTable(can_name, can_pos);
    }//GEN-LAST:event_vpres_comboActionPerformed

    private void sen_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sen_comboActionPerformed
        String can_name = sen_combo.getSelectedItem().toString();
        String can_pos = sen.getText();
        senCtr++;
        addRowToJTable(can_name, can_pos);
    }//GEN-LAST:event_sen_comboActionPerformed

    private void drep_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drep_comboActionPerformed
        String can_name = drep_combo.getSelectedItem().toString();
        String can_pos = drep.getText();
        drCtr++;
        addRowToJTable(can_name, can_pos);
    }//GEN-LAST:event_drep_comboActionPerformed

    private void gov_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gov_comboActionPerformed
        String can_name = gov_combo.getSelectedItem().toString();
        String can_pos = gov.getText();
        govCtr++;
        addRowToJTable(can_name, can_pos);
    }//GEN-LAST:event_gov_comboActionPerformed

    private void mayor_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayor_comboActionPerformed
        String can_name = mayor_combo.getSelectedItem().toString();
        String can_pos = mayor.getText();
        mayCtr++;
        addRowToJTable(can_name, can_pos);
    }//GEN-LAST:event_mayor_comboActionPerformed

    private void voteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voteMouseClicked
        if(presCtr == 1 && vPresCtr == 1 && (senCtr >= 5 && senCtr <= 10)
            && (drCtr >= 4 && drCtr <= 10) && govCtr == 1 && mayCtr == 1){
            statuslabel.setForeground(new Color(0,153,51));
            statuslabel.setText("SUCESSFULLY VOTED!");
        }else{
            statuslabel.setForeground(new Color(196,75,77));
            statuslabel.setText("WRONG INPUTS!");
        }
    }//GEN-LAST:event_voteMouseClicked

    private void cleartableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleartableMouseClicked
        clearTable();
    }//GEN-LAST:event_cleartableMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Voter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel candidates;
    private javax.swing.JScrollPane candidates_jScrollPane;
    private javax.swing.JPanel candidates_side;
    private javax.swing.JLabel candidates_side_label;
    private javax.swing.JButton cleartable;
    private javax.swing.JLabel drep;
    private javax.swing.JComboBox<String> drep_combo;
    private javax.swing.JLabel gov;
    private javax.swing.JComboBox<String> gov_combo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left_sidebar;
    private javax.swing.JPanel logout_side;
    private javax.swing.JLabel logout_side_label;
    private javax.swing.JLabel mayor;
    private javax.swing.JComboBox<String> mayor_combo;
    private javax.swing.JLabel pres;
    private javax.swing.JComboBox<String> pres_combo;
    private javax.swing.JLabel sen;
    private javax.swing.JComboBox<String> sen_combo;
    private javax.swing.JLabel statuslabel;
    private javax.swing.JLabel user_label;
    private javax.swing.JLabel user_label1;
    private javax.swing.JLabel userimg;
    private javax.swing.JLabel username;
    private javax.swing.JButton vote;
    private javax.swing.JTable votingTable;
    private javax.swing.JLabel vpres;
    private javax.swing.JComboBox<String> vpres_combo;
    // End of variables declaration//GEN-END:variables
}
