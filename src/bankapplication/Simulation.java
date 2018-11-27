/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wral
 */
public class Simulation extends JFrame{
    private AccountCollection accountList = new AccountCollection();
    private Account account;
    private Timer timer;
    private TimerTask task;
    private int month = 0;
    private int tranCount;//postion in the array of transactions
    private int count = 0;
    
    public Simulation() {
        initialise();
        disableAtStart();//disables all buttons not needed to create account
    }
    
    private void initialise(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);
        //setting variables
        jpMain = new javax.swing.JPanel();
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
        
        jpMain.setBackground(new java.awt.Color(0, 0, 255));
        
        jpControlPanel.setBackground(new java.awt.Color(204, 204, 255));
        jpControlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        //buttons
        btnRestart.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnRestart.setText("Restart");
        btnRestart.setMaximumSize(new java.awt.Dimension(79, 31));
        btnRestart.setMinimumSize(new java.awt.Dimension(79, 31));
        btnRestart.setPreferredSize(new java.awt.Dimension(79, 31));
        
        btnGraph.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnGraph.setText("Show Graph");
        btnGraph.setMaximumSize(new java.awt.Dimension(115, 31));
        btnGraph.setMinimumSize(new java.awt.Dimension(115, 31));
        btnGraph.setPreferredSize(new java.awt.Dimension(115, 31));
        
        btnCreate.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnCreate.setText("Create Account");
        
        btnStartSim.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnStartSim.setText("Start Simulation");

        btnStopSim.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnStopSim.setText("Stop Simulation");
        //labels
        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel4.setText("Start Balance");
        lblSimulationStop.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 55)); // NOI18N
        lblSimulationStop.setText("Simulation Stopped!");
        lblMinLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 36)); // NOI18N
        lblMinLabel.setText("Minimum Balance");
        lblMaxLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 36)); // NOI18N
        lblMaxLabel.setText("Maximum Balance");
        lblMaxBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 36)); // NOI18N
        lblMaxBalance.setText("£0.00");
        lblMinBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 36)); // NOI18N
        lblMinBalance.setText("£0.00");
        jLabel23.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
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
        jPanel1.add(btnRestart);
        lblMonth.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblMonth.setText("Month 1");
        lblName.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 0, 204));
        lblName.setText("jLabel5");
        jLabel20.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel20.setText("Transactions");
        jLabel21.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel21.setText("Messages");
        //input fields
        txtFirstName.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        txtLastName.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        txtInitBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        txtErrorList.setColumns(20);
        txtErrorList.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        txtErrorList.setRows(5);
        jScrollPane3.setViewportView(txtErrorList);
        cmbAccountType.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        cmbAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings Account", "Current Account" }));
        //table for showing transactions
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
        jScrollPane2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        tblTransaction.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(tblTransaction);

        jPanel1.add(btnStartSim);
        jPanel1.add(btnStopSim);

        jpControlPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 930, -1));
        jpControlPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jpControlPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jpControlPanel.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 271, 35));
        jpControlPanel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 271, 39));
        jpControlPanel.add(txtInitBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 271, 34));
        jpControlPanel.add(cmbAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 271, 40));
        jpControlPanel.add(lblSimulationStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 510, -1));
        jpControlPanel.add(lblMinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));
        jpControlPanel.add(lblMaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 140, -1, -1));
        jpControlPanel.add(lblMaxBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 180, -1, -1));
        jpControlPanel.add(lblMinBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));
        jpControlPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 21, -1, -1));
        jpControlPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 250, 70));
        jpControlPanel.add(btnGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 250, 110));

        jpDrawingPanel.setBackground(new java.awt.Color(204, 255, 204));
        jpDrawingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpDrawingPanel.add(lblTotDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 141, -1));
        jpDrawingPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        jpDrawingPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        jpDrawingPanel.add(lblTotWithdrawn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 141, -1));
        jpDrawingPanel.add(lblTotBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 141, -1));
        jpDrawingPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jpDrawingPanel.add(lblMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jpDrawingPanel.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 264, -1));
        jpDrawingPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 334));
        jpDrawingPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));
        jpDrawingPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 463, 334));
        jpDrawingPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 80, -1, -1));

        //action listeners
        btnStartSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickStart(evt);
            }
        });
        btnStopSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickStop(evt);
            }
        });
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickRestart(evt);
            }
        });
        btnGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickGraph(evt);
            }
        });
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickCreate(evt);
            }
        });
        
        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpDrawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addComponent(jpControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpDrawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();        
    }//end initialise
    
    private void clickCreate(ActionEvent evt) {
        String fName = txtFirstName.getText();
        String lName = txtLastName.getText();
        String bal = txtInitBalance.getText();
        lblTotBalance.setText("£"+bal);
        int accountType = cmbAccountType.getSelectedIndex();
        boolean error = false;
        while(error=true){
            if (!Pattern.matches("[a-zA-Z]+",fName)||!Pattern.matches("[a-zA-Z]+",lName)){
                error=true;
                JOptionPane.showMessageDialog(null, "Please enter valid name");
                break;
            }
            try{
                error=false;
                int init = Integer.parseInt(bal);
                if(accountType ==0){
                    account = new SavingsAccount(fName, lName, init,"Savings Account");
                    if(init <100){
                        JOptionPane.showMessageDialog(null, "Start balance cant be under £100");
                        error=true;
                        break;
                    }
                }

                else if(accountType==1){
                    account = new CurrentAccount(fName, lName, init,"Current Account");
                    if(init <1){
                        JOptionPane.showMessageDialog(null, "Start balance cant be under £1");
                        error=true;
                        break;
                    }
                }                   
                month=1;
                lblName.setText(account.getFName()+" "+account.getLName());
                account.transaction(month,1);  //first transaction at month 1 and as a deposit               
                printTran(0);//print first element in transaction array onto table 
                tranCount=1;
                printMessage(account.getMessage());//print message if there is one
                month++;
                enableStart();//disables all buttons, enables start button
                accountList.addToAccounts(account);
                break;
            }
            catch(Exception ex){
                error=true;
                JOptionPane.showMessageDialog(null, "Please enter valid balance");
                break;
            }
        }
    }
    private void clickGraph(ActionEvent evt) {                                         
        int size = account.getSuccessful().size();
        int[] graphBalance = new int[size];
        int[] graphMonth = new int[size];
        for(int i=0; i<account.getSuccessful().size();i++){
            int x = account.getSuccessful().get(i).getBalance();
            int y = account.getSuccessful().get(i).getMonth();
            graphBalance[i] = x;
            graphMonth[i]=y;
            //graphMonth.add(y);
            
        }
        Graph createGraph = new Graph(graphBalance, graphMonth);
        createGraph.setVisible(true);
       
       /*for (int i = 0; i < graphBalance.length; i++)
       {
           System.out.println(graphBalance[i]);
       } */

    }
    private void clickRestart(ActionEvent evt) {                                           
        JDialog.setDefaultLookAndFeelDecorated(true);
        //ask userto confirm they want to restart
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to restart?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {
            System.out.println("No button clicked");
        } 
        else if (response == JOptionPane.YES_OPTION) {
            enableCreate();
            clearTable();
            account.clearTransactions();
            txtErrorList.setText("");
            lblName.setText("");
            lblMonth.setVisible(false);
        } 
        else if (response == JOptionPane.CLOSED_OPTION) {
            System.out.println("JOptionPane closed");
        }
    } 
    private void clickStart(java.awt.event.ActionEvent evt) {                                            
        btnStopSim.setEnabled(true);
        lblMonth.setVisible(true);
        btnStartSim.setEnabled(false);
       // graphMonth = new int[10];
        //graphBalance = new int[10];
        task = new TimerTask() {
            public void run() {

                lblMonth.setText("Month "+ month);
                account.transaction(randNum(),month);
                printTran(tranCount);
                printMessage(account.getMessage());
                lblTotBalance.setText("£"+Integer.toString(account.getBalance()));
                lblTotDeposit.setText("£"+Integer.toString(account.getTotDeposit()));
                lblTotWithdrawn.setText("£"+Integer.toString(account.getTotWithdraw()));
                //graphBalance[count] = account.getBalance();
                //graphMonth[count] = month;
                count++;
                tranCount ++;
                month++;

            }
        };
        timer = new Timer();
        timer.schedule(task, 1000, 1000);
    }
    private void clickStop(ActionEvent evt) {                                           
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
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulation().setVisible(true);
            }
        });
    }
    private int randNum(){
        
        Random random = new Random();
        Random money = new Random();
        int num = (Math.random() <= 0.5) ? 1 : 2;
        return num;                    
    }
    
    private void printTran(int count){     
        DefaultTableModel model = (DefaultTableModel)tblTransaction.getModel();
        Object[] row = {"Month "+account.getTransaction().get(count).getMonth(), account.getTransaction().get(count).getInOrOut(), account.getTransaction().get(count).getAmount(), account.getTransaction().get(count).getBalance()};
        model.addRow(row);

    }
    
    private void printMessage(String message){
        //account.setMsgList(message);
        if (message !=null){
            txtErrorList.append("Month "+month+ "   "+message+"\n");
        }
        else{
            txtErrorList.append("");
        }                                                              
    }
    
    private void disableAtStart(){
        btnGraph.setVisible(false); 
        lblSimulationStop.setVisible(false);
        lblMaxBalance.setVisible(false);
        lblMinBalance.setVisible(false);
        lblMaxLabel.setVisible(false);
        lblMinLabel.setVisible(false);
        btnStopSim.setEnabled(false);
        btnStartSim.setEnabled(false);
        btnRestart.setEnabled(false);
        lblName.setText("");
        //jpViewAccounts.setVisible(false);
        lblMonth.setVisible(false);
              
    }
    
    private void enableStart(){
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
    private void enableCreate(){
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
    
    private void clearTable(){
        DefaultTableModel model = (DefaultTableModel)tblTransaction.getModel();

        while (model.getRowCount() > 0){
            for (int i = 0; i < model.getRowCount(); ++i){
            model.removeRow(i);
            }
        }
    }
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpControlPanel;
    private javax.swing.JPanel jpDrawingPanel;
    private javax.swing.JPanel jpMain;
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
    // End of variables declaration          
}
