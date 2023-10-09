import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {
    //#EBE4D1 #B4B4B3 #26577C #E55604
    final String regex = "^[a-zA-Z\\s]+$";
    private DatabaseConnection mycon;
    private Color customColor = new Color(242,242,242);
    
    public Main() {
        initComponents();
        logCheckFunc(false);
        try{
            this.mycon = new DatabaseConnection();

            Image icon = new ImageIcon(this.getClass().getResource("/database.png")).getImage();
            this.setIconImage(icon);

            checkLBL.setText("");
            mainTable.setModel(mycon.getAllRecord());

            
            dbstatus.setText(mycon.status.getSecond());
            getStatus();

            labelClick(logoDisplay);

            resetlbl.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                    mycon.resetTable();
                    checkLBLFormat(Color.green, "Reset Successfully!");
                }
            });
        }catch(Exception e){
            checkLBLFormat(Color.blue, "No database connection.");
            dbstatus.setText(mycon.status.getSecond());
        }
    }
    
    private void labelClick(javax.swing.JLabel get){
        get.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                mainTab.setSelectedIndex(0);
            }
        });       
    }

    private void logCheckFunc(boolean check){
        tabViewTable.setEnabled(check);
        tabAdd.setEnabled(check);
        tabInsert.setEnabled(check);
        tabDelete.setEnabled(check);
        tabReset.setEnabled(check);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        checkLBL = new javax.swing.JLabel();
        logoDisplay = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tabViewTable = new javax.swing.JButton();
        tabAdd = new javax.swing.JButton();
        tabInsert = new javax.swing.JButton();
        tabDelete = new javax.swing.JButton();
        tabReset = new javax.swing.JButton();
        mainTab = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        createadmin1 = new javax.swing.JLabel();
        dbstatus = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tableChoices = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        department = new javax.swing.JTextField();
        program = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        new_fname = new javax.swing.JTextField();
        new_lname = new javax.swing.JTextField();
        new_department = new javax.swing.JTextField();
        new_program = new javax.swing.JTextField();
        fLBL = new javax.swing.JLabel();
        lLBL = new javax.swing.JLabel();
        dLBL = new javax.swing.JLabel();
        pLBL = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        deleteTextField = new javax.swing.JTextField();
        choiceDel = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        fLBL1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        resetlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 107, 135));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(212, 255, 251));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkLBL.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        checkLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkLBL.setText("Inserted Successfully");
        jPanel2.add(checkLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 400, 160, -1));

        logoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1696634118543.png"))); // NOI18N
        jPanel2.add(logoDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 87));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CRUDIFY");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Programmed by: Josuan");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, -1));

        tabViewTable.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        tabViewTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1696636271834.png"))); // NOI18N
        tabViewTable.setText("View Table");
        tabViewTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabViewTableActionPerformed(evt);
            }
        });
        jPanel2.add(tabViewTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 96, 33));

        tabAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1696634368343.png"))); // NOI18N
        tabAdd.setText("Add");
        tabAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabAddActionPerformed(evt);
            }
        });
        jPanel2.add(tabAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 96, 33));

        tabInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1696636271790.png"))); // NOI18N
        tabInsert.setText("Update");
        tabInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabInsertActionPerformed(evt);
            }
        });
        jPanel2.add(tabInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 96, 33));

        tabDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1696636271746.png"))); // NOI18N
        tabDelete.setText("Delete");
        tabDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(tabDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 96, 33));

        tabReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1696636271878.png"))); // NOI18N
        tabReset.setText("Reset");
        tabReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabResetActionPerformed(evt);
            }
        });
        jPanel2.add(tabReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 96, 33));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 420));

        jPanel8.setBackground(new java.awt.Color(23, 107, 135));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enter (1).png"))); // NOI18N
        loginBtn.setText("Start App");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel8.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 120, 37));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/database (2).png"))); // NOI18N
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(100, 204, 197));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Crudify");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 220, -1));

        createadmin1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        createadmin1.setForeground(new java.awt.Color(100, 204, 197));
        createadmin1.setText("A Simple MySQL DBMS");
        jPanel8.add(createadmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        dbstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dbstatus.setText("jLabel13");
        jPanel8.add(dbstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 300, 500, -1));

        mainTab.addTab("tab6", jPanel8);

        jPanel6.setBackground(new java.awt.Color(23, 107, 135));

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(mainTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 204, 197));
        jLabel2.setText("Student Table");

        tableChoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Show only Names", "Show only Department", "Show only Program" ,"Admins"}));
        tableChoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableChoicesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tableChoices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tableChoices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainTab.addTab("tab4", jPanel6);

        jPanel3.setBackground(new java.awt.Color(23, 107, 135));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 204, 197));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD RECORD");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        fname.setBackground(new java.awt.Color(212, 255, 251));
        fname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(4, 54, 74));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lname.setBackground(new java.awt.Color(212, 255, 251));
        lname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(4, 54, 74));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        department.setBackground(new java.awt.Color(212, 255, 251));
        department.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        department.setForeground(new java.awt.Color(4, 54, 74));
        department.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        program.setBackground(new java.awt.Color(212, 255, 251));
        program.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        program.setForeground(new java.awt.Color(4, 54, 74));
        program.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programActionPerformed(evt);
            }
        });

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 204, 197));
        jLabel3.setText("First name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 204, 197));
        jLabel4.setText("Last name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(100, 204, 197));
        jLabel7.setText("Department");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(100, 204, 197));
        jLabel8.setText("Program");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        mainTab.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(23, 107, 135));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(100, 204, 197));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("UPDATE RECORD");
        jLabel5.setToolTipText("");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ID.setBackground(new java.awt.Color(212, 255, 251));
        ID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(4, 54, 74));
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(100, 204, 197));
        jLabel9.setText("ID");

        new_fname.setBackground(new java.awt.Color(212, 255, 251));
        new_fname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        new_fname.setForeground(new java.awt.Color(4, 54, 74));

        new_lname.setBackground(new java.awt.Color(212, 255, 251));
        new_lname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        new_lname.setForeground(new java.awt.Color(4, 54, 74));

        new_department.setBackground(new java.awt.Color(212, 255, 251));
        new_department.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        new_department.setForeground(new java.awt.Color(4, 54, 74));

        new_program.setBackground(new java.awt.Color(212, 255, 251));
        new_program.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        new_program.setForeground(new java.awt.Color(4, 54, 74));

        fLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fLBL.setForeground(new java.awt.Color(100, 204, 197));
        fLBL.setText("Firstname");

        lLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lLBL.setForeground(new java.awt.Color(100, 204, 197));
        lLBL.setText("Last name");

        dLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dLBL.setForeground(new java.awt.Color(100, 204, 197));
        dLBL.setText("Department");

        pLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pLBL.setForeground(new java.awt.Color(100, 204, 197));
        pLBL.setText("Program");

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(new_department, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(new_program, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(new_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fLBL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lLBL)
                                    .addComponent(new_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(dLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pLBL)
                        .addGap(183, 183, 183))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fLBL)
                    .addComponent(lLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dLBL)
                    .addComponent(pLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_department, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_program, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        mainTab.addTab("tab2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(23, 107, 135));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(100, 204, 197));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DELETE RECORD");
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        deleteTextField.setBackground(new java.awt.Color(212, 255, 251));
        deleteTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteTextField.setForeground(new java.awt.Color(4, 54, 74));

        choiceDel.setBackground(new java.awt.Color(212, 255, 251));
        choiceDel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "First name", "Last name", "Department" ,"Program"}));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        fLBL1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fLBL1.setForeground(new java.awt.Color(100, 204, 197));
        fLBL1.setText("Delete by");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(fLBL1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choiceDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choiceDel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        mainTab.addTab("tab3", jPanel5);

        jPanel7.setBackground(new java.awt.Color(23, 107, 135));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(100, 204, 197));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("RESET RECORD");
        jLabel14.setToolTipText("");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        resetlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1696685523022.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(resetlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(resetlbl)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        mainTab.addTab("tab5", jPanel7);

        jPanel1.add(mainTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -56, 510, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabAddActionPerformed
        try{
            mainTab.setSelectedIndex(2);
            checkLBL.setText("");
            mainTable.setModel(mycon.getAllRecord());
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tabAddActionPerformed

    private void tabInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabInsertActionPerformed
        try{
            mainTab.setSelectedIndex(3);
            checkLBL.setText("");
            mainTable.setModel(mycon.getAllRecord());
        }catch(Exception e){
        }
    }//GEN-LAST:event_tabInsertActionPerformed

    private void tabResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabResetActionPerformed
        try{
            mainTab.setSelectedIndex(5);
            checkLBL.setText("");
            mainTable.setModel(mycon.getAllRecord());
        }catch(Exception e){
        }
    }//GEN-LAST:event_tabResetActionPerformed

    private void tabViewTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabViewTableActionPerformed
        try{
        mainTab.setSelectedIndex(1);
        checkLBL.setText("");
        mainTable.setModel(mycon.getAllRecord());
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tabViewTableActionPerformed

    private void tabDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabDeleteActionPerformed
        mainTab.setSelectedIndex(4);
        checkLBL.setText("");
    }//GEN-LAST:event_tabDeleteActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //"ID", "First name", "Last name", "Department" ,"Program"
        try{
            String selectItem = (String) choiceDel.getSelectedItem();
            String getToDelete = deleteTextField.getText();
            if(!getToDelete.trim().isEmpty()){
                if("ID".equals(selectItem)){
                    try{
                        if(mycon.deleteRecordByID(Integer.parseInt(getToDelete)) != 0){
                            checkLBLFormat(Color.green, "Deleted successfully!");
                        }else{
                            checkLBLFormat(Color.green, "Deleted successfully!");
                        }
                    }catch(Exception e){
                        checkLBLFormat(Color.red, "Something went wrong!");
                    }
                }else if("First name".equals(selectItem)){
                    if(mycon.deleteRecord("FirstName",getToDelete) != 0){
                        checkLBLFormat(Color.green, "Deleted successfully!");
                    }else{
                        checkLBLFormat(Color.red, "Something went wrong!");
                    }
                }else if("Last name".equals(selectItem)){
                    if(mycon.deleteRecord("LastName",getToDelete) != 0){
                        checkLBLFormat(Color.green, "Deleted successfully!");
                    }else{
                        checkLBLFormat(Color.red, "Something went wrong!");
                    }
                }else if("Department".equals(selectItem)){
                    if(mycon.deleteRecord("Department",getToDelete) != 0){
                        checkLBLFormat(Color.green, "Deleted successfully!");
                    }else{
                        checkLBLFormat(Color.red, "Something went wrong!");
                    }
                }else if("Program".equals(selectItem)){
                    if(mycon.deleteRecord("Program",getToDelete) != 0){
                        checkLBLFormat(Color.green, "Deleted successfully!");
                    }else{
                        checkLBLFormat(Color.red, "Something went wrong!");
                    }
                }
            }else{
                checkLBLFormat(Color.blue, selectItem+" is Blank!");
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try{
            String getId = ID.getText();
            String getFname = new_fname.getText().trim();
            String getLname = new_lname.getText().trim();
            String getDepartment = new_department.getText().trim();
            String getProgram = new_program.getText().trim();

            if(!getId.trim().isEmpty()){
                int getRID = Integer.parseInt(getId);
                if(!getFname.trim().isEmpty()){
                    if(isLetterOnly(getFname)){
                        if(mycon.updateCol(getFname, getRID, "FirstName")!=0){
                            checkLBLFormat(Color.green, "Change succesfully!");
                            new_fname.setText("");
                            ID.setText("");
                            fLBL.setForeground(customColor);
                        }else{
                            checkLBLFormat(Color.red, "Something went wrong!");
                        }
                    }else{
                        fLBL.setForeground(Color.red);
                    }
                }

                if(!getLname.trim().isEmpty()){
                    if(isLetterOnly(getLname)){
                        if(mycon.updateCol(getLname, getRID, "LastName")!=0){
                            checkLBLFormat(Color.green, "Change succesfully!");
                            new_lname.setText("");
                            ID.setText("");
                            lLBL.setForeground(customColor);
                        }else{
                            checkLBLFormat(Color.red, "Something went wrong!");
                        }
                    }else{
                        lLBL.setForeground(Color.red);
                    }
                }

                if(!getDepartment.trim().isEmpty()){
                    if(isLetterOnly(getDepartment)){
                        if(mycon.updateCol(getDepartment, getRID, "Department")!=0){
                            checkLBLFormat(Color.green, "Change succesfully!");
                            new_department.setText("");
                            ID.setText("");
                            dLBL.setForeground(customColor);
                        }else{
                            checkLBLFormat(Color.red, "Something went wrong!");
                        }
                    }else{
                        dLBL.setForeground(Color.red);
                    }
                }

                if(!getProgram.trim().isEmpty()){
                    if(isLetterOnly(getProgram)){
                        if(mycon.updateCol(getProgram, Integer.parseInt(getId), "Program")!=0){
                            checkLBLFormat(Color.green, "Change succesfully!");
                            new_program.setText("");
                            ID.setText("");
                            pLBL.setForeground(customColor);
                        }else{
                            checkLBLFormat(Color.red, "Something went wrong!");
                        }
                    }else{
                        pLBL.setForeground(Color.red);
                    }
                }
            }else{
                checkLBLFormat(Color.BLUE, "ID is blank!");
            }

        }catch(Exception e){
            checkLBLFormat(Color.red, "Something went wrong!");
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try{
            String getFname = fname.getText().trim();
            String getLname = lname.getText().trim();
            String getDepartment = department.getText().trim();
            String getProgram = program.getText().trim();

            boolean checkEmpty = !getFname.isEmpty() &&!getLname.isEmpty() && !getDepartment.isEmpty() && !getProgram.isEmpty();
            boolean checkRegex = isLetterOnly(getFname) && isLetterOnly(getLname) && isLetterOnly(getDepartment) && isLetterOnly(getProgram);

            if(checkEmpty && checkRegex){
                if(mycon.addRecord(getFname, getLname, getDepartment, getProgram) != 0){
                    checkLBLFormat(Color.green, "Added Successfully!");
                    fname.setText("");
                    lname.setText("");
                    department.setText("");
                    program.setText("");
                }else{
                    checkLBLFormat(Color.red, "Something went wrong!");
                }
            }else{
                checkLBLFormat(Color.red, "Something went wrong!");
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programActionPerformed

//[242,242,242]
    private void tableChoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableChoicesActionPerformed
        //Default, Show only Names, Show only Department, Show only Program, Admins
        try{
            String selectItem = (String) tableChoices.getSelectedItem();

            if("Default".equals(selectItem)){
                mainTable.setModel(mycon.getAllRecord());
            }else if("Show only Names".equals(selectItem)){
                mainTable.setModel(mycon.getOnlyNames());
            }else if("Show only Department".equals(selectItem)){
                mainTable.setModel(mycon.getOnly("Department"));
            }else if("Show only Program".equals(selectItem)){
                mainTable.setModel(mycon.getOnly("Program"));
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tableChoicesActionPerformed
    
    private void getStatus(){
        try{
            Boolean gstatus = mycon.status.getFirst();
            dbstatus.setText(mycon.status.getSecond());
            if(gstatus){
                dbstatus.setForeground(Color.green);
            }else{
                dbstatus.setForeground(Color.red);
            }
        }catch(Exception e){
        }
    }
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try{
            boolean checkS = mycon.status.getFirst();
            
            mycon.createTable();
            
            logCheckFunc(checkS );
        }catch(Exception e){
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void resetText(){
        ID.setText("");
        new_fname.setText("");
        new_lname.setText("");
        new_department.setText("");
        new_program.setText("");
    }
    
    private boolean isLetterOnly(String text){
        return text.matches(regex);
    }
    
    private void checkLBLFormat(Color col, String text){
        checkLBL.setForeground(col);
        checkLBL.setText(text);        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel checkLBL;
    private javax.swing.JComboBox<String> choiceDel;
    private javax.swing.JLabel createadmin1;
    private javax.swing.JLabel dLBL;
    private javax.swing.JLabel dbstatus;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField deleteTextField;
    private javax.swing.JTextField department;
    private javax.swing.JLabel fLBL;
    private javax.swing.JLabel fLBL1;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lLBL;
    private javax.swing.JTextField lname;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel logoDisplay;
    private javax.swing.JTabbedPane mainTab;
    private javax.swing.JTable mainTable;
    private javax.swing.JTextField new_department;
    private javax.swing.JTextField new_fname;
    private javax.swing.JTextField new_lname;
    private javax.swing.JTextField new_program;
    private javax.swing.JLabel pLBL;
    private javax.swing.JTextField program;
    private javax.swing.JLabel resetlbl;
    private javax.swing.JButton tabAdd;
    private javax.swing.JButton tabDelete;
    private javax.swing.JButton tabInsert;
    private javax.swing.JButton tabReset;
    private javax.swing.JButton tabViewTable;
    private javax.swing.JComboBox<String> tableChoices;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
