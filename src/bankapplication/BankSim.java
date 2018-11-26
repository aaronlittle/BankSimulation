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
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Wral
 */
public class BankSim extends javax.swing.JFrame {
    private AccountCollection accountList = new AccountCollection();
    private Account account;
    private Timer timer;
    private TimerTask task;
    private int month = 2;
    private int tranCount;//postion in the array of transactions
    private int count = 0;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);

        jpMain.setBackground(new java.awt.Color(0, 0, 255));

        jpControlPanel.setBackground(new java.awt.Color(204, 204, 255));
        jpControlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

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

        jpControlPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 0, 903, -1));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel1.setText("First Name");
        jpControlPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel2.setText("Last Name");
        jpControlPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel3.setText("Account Type");
        jpControlPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel4.setText("Start Balance");
        jpControlPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtFirstName.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jpControlPanel.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 271, 35));

        txtLastName.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jpControlPanel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 271, 39));

        txtInitBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jpControlPanel.add(txtInitBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 271, 34));

        cmbAccountType.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        cmbAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings Account", "Current Account" }));
        jpControlPanel.add(cmbAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 271, 40));

        lblSimulationStop.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 36)); // NOI18N
        lblSimulationStop.setText("jLabel5");
        jpControlPanel.add(lblSimulationStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 63, 384, -1));

        lblMinLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblMinLabel.setText("Minimum Balance");
        jpControlPanel.add(lblMinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblMaxLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblMaxLabel.setText("Maximum Balance");
        jpControlPanel.add(lblMaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 120, -1, -1));

        lblMaxBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 22)); // NOI18N
        lblMaxBalance.setText("jLabel5");
        jpControlPanel.add(lblMaxBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 165, -1, -1));

        lblMinBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 22)); // NOI18N
        lblMinBalance.setText("jLabel5");
        jpControlPanel.add(lblMinBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 165, -1, -1));

        jLabel23.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jpControlPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 21, -1, -1));

        btnCreate.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        btnCreate.setText("Create Account");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jpControlPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, 50));

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
        jpControlPanel.add(btnGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 187, 75));

        jpDrawingPanel.setBackground(new java.awt.Color(204, 255, 204));
        jpDrawingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotDeposit.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblTotDeposit.setText("0.00");
        jpDrawingPanel.add(lblTotDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 141, -1));

        jLabel19.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        jLabel19.setText("Total Deposited:");
        jpDrawingPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel18.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        jLabel18.setText("Total Withdrawn:");
        jpDrawingPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblTotWithdrawn.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblTotWithdrawn.setText("0.00");
        jpDrawingPanel.add(lblTotWithdrawn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 141, -1));

        lblTotBalance.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblTotBalance.setText("0.00");
        jpDrawingPanel.add(lblTotBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 141, -1));

        jLabel17.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        jLabel17.setText("Account Balance:");
        jpDrawingPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lblMonth.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblMonth.setText("Month 1");
        jpDrawingPanel.add(lblMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblName.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 26)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 0, 204));
        lblName.setText("jLabel5");
        jpDrawingPanel.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 264, -1));

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

        jpDrawingPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 61, -1, 334));

        jLabel20.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel20.setText("Transactions");
        jpDrawingPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 16, -1, -1));

        txtErrorList.setColumns(20);
        txtErrorList.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        txtErrorList.setRows(5);
        jScrollPane3.setViewportView(txtErrorList);

        jpDrawingPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 61, 463, 334));

        jLabel21.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        jLabel21.setText("Messages");
        jpDrawingPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 16, -1, -1));

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
                .addComponent(jpControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDrawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
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
                    account = new SavingsAccount(fName, lName, init);
                    if(init <100){
                        JOptionPane.showMessageDialog(null, "Start balance cant be under £100");
                        error=true;
                        break;
                    }
                }

                else if(accountType==1){
                    account = new CurrentAccount(fName, lName, init);
                    if(init <1){
                        JOptionPane.showMessageDialog(null, "Start balance cant be under £1");
                        error=true;
                        break;
                    }
                }                                             
                lblName.setText(account.getFName()+" "+account.getLName());
                account.transaction(1,1);  //first transaction at month 1 and as a deposit               
                printTran(0);//print first element in transaction array onto table 
                tranCount=1;
                month=2;
                printMessage(account.getMessage());//print message if there is one
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

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphActionPerformed
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

    }//GEN-LAST:event_btnGraphActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
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
        } 
        else if (response == JOptionPane.CLOSED_OPTION) {
            System.out.println("JOptionPane closed");
        }
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnStartSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartSimActionPerformed
        btnStopSim.setEnabled(true);
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
        
       /* graphMonth = new int[account.getSuccessful().size()];
        graphBalance = new int[account.getSuccessful().size()];
        for (int i = 0; i < graphBalance.length; i++)
        {
            graphBalance[i] = account.getBalance(); //Add balance after each transaction to graphBalance array
        }*/
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
    // End of variables declaration//GEN-END:variables
}
