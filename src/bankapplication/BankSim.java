/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Wral
 */
public class BankSim extends javax.swing.JFrame {
    private Account account;
    private Timer timer;
    private TimerTask task;
    private int month = 2;
    private int tranCount = 1;
    private int rowCount = 0;
    private String[]errorList;
    private int errorCount=0;
    private int [] graphBalance; //= new int[account.getTransaction().size()]; //Create array to hold balance after each transaction using length of arrayList

    /**
     * Creates new form BankSim
     */
    public BankSim() {
        initComponents();
        disableAtStart();//disables all buttons not needed to create account
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jpControlPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnRestart = new javax.swing.JButton();
        btnStartSim = new javax.swing.JButton();
        btnStopSim = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtInitBalance = new javax.swing.JTextField();
        cmbAccountType = new javax.swing.JComboBox<>();
        lblSimulationStop = new javax.swing.JLabel();
        lblMinLabel = new javax.swing.JLabel();
        lblMaxLabel = new javax.swing.JLabel();
        lblMaxBalance = new javax.swing.JLabel();
        lblMinBalance = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnGraph = new javax.swing.JButton();
        jpDrawingPanel = new javax.swing.JPanel();
        lblTotDeposit = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblTotWithdrawn = new javax.swing.JLabel();
        lblTotBalance = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransaction = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtErrorList = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        jpControlPanel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setLayout(new java.awt.GridLayout());

        btnRestart.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnRestart.setText("Restart");
        btnRestart.setMaximumSize(new java.awt.Dimension(79, 31));
        btnRestart.setMinimumSize(new java.awt.Dimension(79, 31));
        btnRestart.setPreferredSize(new java.awt.Dimension(79, 31));
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestart);

        btnStartSim.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnStartSim.setText("Start Simulation");
        btnStartSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartSimActionPerformed(evt);
            }
        });
        jPanel1.add(btnStartSim);

        btnStopSim.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnStopSim.setText("Stop Simulation");
        btnStopSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopSimActionPerformed(evt);
            }
        });
        jPanel1.add(btnStopSim);

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel2.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel3.setText("Account Type");

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel4.setText("Start Balance");

        txtFirstName.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N

        txtInitBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N

        cmbAccountType.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        cmbAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings Account", "Current Account" }));

        lblSimulationStop.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 36)); // NOI18N
        lblSimulationStop.setText("jLabel5");

        lblMinLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblMinLabel.setText("Minimum Balance");

        lblMaxLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblMaxLabel.setText("Maximum Balance");

        lblMaxBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 22)); // NOI18N
        lblMaxBalance.setText("jLabel5");

        lblMinBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 22)); // NOI18N
        lblMinBalance.setText("jLabel5");

        jLabel23.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N

        btnCreate.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnCreate.setText("Create Account");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnGraph.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnGraph.setText("Show Graph");
        btnGraph.setMaximumSize(new java.awt.Dimension(115, 31));
        btnGraph.setMinimumSize(new java.awt.Dimension(115, 31));
        btnGraph.setPreferredSize(new java.awt.Dimension(115, 31));
        btnGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpControlPanelLayout = new javax.swing.GroupLayout(jpControlPanel);
        jpControlPanel.setLayout(jpControlPanelLayout);
        jpControlPanelLayout.setHorizontalGroup(
            jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlPanelLayout.createSequentialGroup()
                .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnCreate))
                    .addGroup(jpControlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpControlPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(22, 22, 22)
                                .addComponent(cmbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpControlPanelLayout.createSequentialGroup()
                                .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInitBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpControlPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlPanelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSimulationStop, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpControlPanelLayout.createSequentialGroup()
                                    .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMinLabel)
                                        .addComponent(lblMinBalance))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMaxLabel)
                                        .addComponent(lblMaxBalance))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlPanelLayout.createSequentialGroup()
                                .addComponent(btnGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpControlPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE))))
            .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpControlPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel23)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpControlPanelLayout.setVerticalGroup(
            jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlPanelLayout.createSequentialGroup()
                .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblSimulationStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinLabel)
                            .addComponent(lblMaxLabel))
                        .addGap(9, 9, 9)
                        .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinBalance)
                            .addComponent(lblMaxBalance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jpControlPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jpControlPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jpControlPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(cmbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtInitBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCreate)))
                .addContainerGap())
            .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpControlPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel23)
                    .addGap(0, 221, Short.MAX_VALUE)))
        );

        jpDrawingPanel.setBackground(new java.awt.Color(204, 255, 204));

        lblTotDeposit.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblTotDeposit.setText("0.00");

        jLabel19.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        jLabel19.setText("Total Deposited:");

        jLabel18.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        jLabel18.setText("Total Withdrawn:");

        lblTotWithdrawn.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblTotWithdrawn.setText("0.00");

        lblTotBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblTotBalance.setText("0.00");

        jLabel17.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        jLabel17.setText("Account Balance:");

        lblMonth.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblMonth.setText("Month 1");

        lblName.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 0, 204));
        lblName.setText("jLabel5");

        jScrollPane2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N

        tblTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "In/Out", "Amount", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTransaction.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(tblTransaction);

        jLabel20.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel20.setText("Transactions");

        txtErrorList.setColumns(20);
        txtErrorList.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        txtErrorList.setRows(5);
        jScrollPane3.setViewportView(txtErrorList);

        jLabel21.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel21.setText("Messages");

        javax.swing.GroupLayout jpDrawingPanelLayout = new javax.swing.GroupLayout(jpDrawingPanel);
        jpDrawingPanel.setLayout(jpDrawingPanelLayout);
        jpDrawingPanelLayout.setHorizontalGroup(
            jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                        .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMonth)
                                    .addComponent(jLabel17)))
                            .addComponent(jLabel18))
                        .addGap(52, 52, 52)
                        .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTotBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(lblTotWithdrawn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(64, 64, 64)
                .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel20)))
                .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(173, 173, 173))
                    .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jpDrawingPanelLayout.setVerticalGroup(
            jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(18, 18, 18)
                        .addComponent(lblMonth)
                        .addGap(24, 24, 24)
                        .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblTotBalance))
                        .addGap(38, 38, 38)
                        .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblTotWithdrawn))
                        .addGap(34, 34, 34)
                        .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblTotDeposit))
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                        .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(13, 13, 13)
                        .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpDrawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jpControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDrawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String fName = txtFirstName.getText();
        String lName = txtLastName.getText();
        String bal = txtInitBalance.getText();
        lblTotBalance.setText(bal);
        tranCount=1;
        month=2;

        int accountType = cmbAccountType.getSelectedIndex();
        boolean error = false;
        while(error=true)
        {
            if (!Pattern.matches("[a-zA-Z]+",fName)||!Pattern.matches("[a-zA-Z]+",lName))
            {
                error=true;
                JOptionPane.showMessageDialog(null, "Please enter valid name");
                break;
            }
            try
            {
                error=false;
                int init = Integer.parseInt(bal);
                if(accountType ==0)
                {
                    account = new SavingsAccount(fName, lName, init);
                    if(init <100)
                    {
                        JOptionPane.showMessageDialog(null, "Start balance cant be under £100");
                        error=true;
                        break;
                    }

                }

                else if(accountType==1)
                {
                    account = new CurrentAccount(fName, lName, init);
                    if(init <1)
                    {
                        JOptionPane.showMessageDialog(null, "Start balance cant be under £1");
                        error=true;
                        break;
                    }
                }

                account.clearTransactions();
                
                txtErrorList.setText("");

                lblName.setText(account.getFName()+" "+account.getLName());
                account.transaction(1,1);
                tranCount=1;
                printTran(0);
                enableStart();//disables all buttons, enables start button
                break;
            }
            catch(Exception ex)
            {
                error=true;
                JOptionPane.showMessageDialog(null, "Please enter valid balance");
                break;
            }
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphActionPerformed

        Graph createGraph = new Graph(graphBalance, month);
        createGraph.setVisible(true);

    }//GEN-LAST:event_btnGraphActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        // TODO add your handling code here:
        /*
        BankForm newSim = new BankForm();
        newSim.setVisible(true);

        this.dispose();
        */
        enableCreate();
        clearTable();
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnStartSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartSimActionPerformed
        // TODO add your handling code here:
        btnStopSim.setEnabled(true);
        btnStartSim.setEnabled(false);
        task = new TimerTask() {
            public void run() {

                lblMonth.setText("Month "+ month);
                account.transaction(randNum(),month);
                printTran(tranCount);
                printError(account.getMessage());
                lblTotBalance.setText("£"+Integer.toString(account.getBalance()));
                lblTotDeposit.setText("£"+Integer.toString(account.getTotDeposit()));
                lblTotWithdrawn.setText("£"+Integer.toString(account.getTotWithdraw()));
                tranCount ++;
                month++;

            }
        };
        timer = new Timer();
        timer.schedule(task, 1000, 1000);
    }//GEN-LAST:event_btnStartSimActionPerformed

    private void btnStopSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopSimActionPerformed
        // TODO add your handling code here:
        timer.cancel();
        timer.purge();
        lblMaxBalance.setText(account.findMax());
        lblMinBalance.setText(account.findMin());
        lblSimulationStop.setText("Simulation Stopped!");
        btnGraph.setVisible(true);
        lblSimulationStop.setVisible(true);
        lblMaxBalance.setVisible(true);
        lblMinBalance.setVisible(true);
        lblMaxLabel.setVisible(true);
        lblMinLabel.setVisible(true);
        btnStopSim.setEnabled(false);
        btnRestart.setEnabled(true);

        graphBalance = new int[account.getTransaction().size()];
        for (int i = 0; i < graphBalance.length; i++)
        {
            graphBalance[i] = account.getBalance(); //Add balance after each transaction to graphBalance array
        }
    }//GEN-LAST:event_btnStopSimActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BankSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankSim().setVisible(true);
            }
        });
    }
    
    public int randNum(){
        
        Random random = new Random();
        Random money = new Random();
        int num = (Math.random() <= 0.5) ? 1 : 2;
        return num;                    
    }
    
    public void printTran(int count)                        
    {     
        DefaultTableModel model = (DefaultTableModel)tblTransaction.getModel();
        Object[] row = {"Month "+account.getTransaction().get(count).getMonth(), account.getTransaction().get(count).getInOrOut(), account.getTransaction().get(count).getAmount(), account.getTransaction().get(count).getBalance()};
        model.addRow(row);

    }
    
    public void printError(String message)
    {
        if (message !=null)
        {
            txtErrorList.append("Month "+month+ "   "+message+"\n");
        }
        else
        {
            txtErrorList.append("");
        }                                                              
    }
    
    public void disableAtStart()
    {
        btnGraph.setVisible(false); 
        lblSimulationStop.setVisible(false);
        lblMaxBalance.setVisible(false);
        lblMinBalance.setVisible(false);
        lblMaxLabel.setVisible(false);
        lblMinLabel.setVisible(false);
        btnStopSim.setEnabled(false);
        btnStartSim.setEnabled(false);
        btnRestart.setEnabled(false);
              
    }
    
    public void enableStart()
    {
        btnCreate.setEnabled(false);              
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        txtInitBalance.setEnabled(false);
        cmbAccountType.setEnabled(false);
        btnStartSim.setEnabled(true);              
        txtFirstName.setText("");
        txtLastName.setText("");
        txtInitBalance.setText(""); 
        
    }
    public void enableCreate()
    {
        btnCreate.setEnabled(true);
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        txtInitBalance.setEnabled(true);
        cmbAccountType.setEnabled(true);
        btnStartSim.setEnabled(false);  
        btnStopSim.setEnabled(false);
        lblSimulationStop.setVisible(false);
        lblMaxBalance.setVisible(false);
        lblMinBalance.setVisible(false);
        lblMaxLabel.setVisible(false);
        lblMinLabel.setVisible(false);
        btnGraph.setVisible(false);
        btnRestart.setEnabled(false);
    }
    
    public void clearTable()
    {
        DefaultTableModel model = (DefaultTableModel)tblTransaction.getModel();

        while (model.getRowCount() > 0){
            for (int i = 0; i < model.getRowCount(); ++i){
            model.removeRow(i);
            }
        }
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnGraph;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnStartSim;
    private javax.swing.JButton btnStopSim;
    private javax.swing.JComboBox<String> cmbAccountType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpControlPanel;
    private javax.swing.JPanel jpDrawingPanel;
    private javax.swing.JLabel lblMaxBalance;
    private javax.swing.JLabel lblMaxLabel;
    private javax.swing.JLabel lblMinBalance;
    private javax.swing.JLabel lblMinLabel;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSimulationStop;
    private javax.swing.JLabel lblTotBalance;
    private javax.swing.JLabel lblTotDeposit;
    private javax.swing.JLabel lblTotWithdrawn;
    private javax.swing.JTable tblTransaction;
    private javax.swing.JTextArea txtErrorList;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtInitBalance;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
