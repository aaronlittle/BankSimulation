/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wral
 */
public class BankForm extends javax.swing.JFrame {
    Account account;
    Timer timer;
    TimerTask task;
    int month = 1;
    
    int tranCount = 0;
    int rowCount = 0;
    String[]errorList;
    int errorCount=0;
    int[] graphBalance = new int[100];
    
    /**
     * Creates new form BankForm
     */
    public BankForm() {
        initComponents();
        btnGraph.setVisible(false); 
        lblSimulationStop.setVisible(false);
        lblMaxBalance.setVisible(false);
        lblMinBalance.setVisible(false);
        btnStopSim.setEnabled(false);
        btnStartSim.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jpControlPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbAccountType = new javax.swing.JComboBox<>();
        txtInitBalance = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnStopSim = new javax.swing.JButton();
        btnStartSim = new javax.swing.JButton();
        lblMinBalance = new javax.swing.JLabel();
        lblMaxBalance = new javax.swing.JLabel();
        lblSimulationStop = new javax.swing.JLabel();
        btnGraph = new javax.swing.JButton();
        jpDrawingPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTotBalance = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblTotWithdrawn = new javax.swing.JLabel();
        lblTotDeposit = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransaction = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtErrorList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jpControlPanel.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setText("First Name");

        txtFirstName.setText("jTextField1");
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.setText("jTextField2");

        jLabel2.setText("Last Nam");

        jLabel3.setText("Account Type");

        cmbAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings", "Current" }));

        txtInitBalance.setText("jTextField3");

        jLabel4.setText("Initial Balance");

        btnCreate.setText("Create Account");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName)
                    .addComponent(txtLastName)
                    .addComponent(cmbAccountType, 0, 313, Short.MAX_VALUE)
                    .addComponent(txtInitBalance)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnCreate)
                .addContainerGap(72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtInitBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCreate))
        );

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        btnStopSim.setText("Stop Simulation");
        btnStopSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopSimActionPerformed(evt);
            }
        });
        jPanel3.add(btnStopSim);

        btnStartSim.setText("Start Simulation");
        btnStartSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartSimActionPerformed(evt);
            }
        });
        jPanel3.add(btnStartSim);

        lblMinBalance.setText("jLabel5");

        lblMaxBalance.setText("jLabel5");

        lblSimulationStop.setText("jLabel5");

        btnGraph.setText("Show Graph");
        btnGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpControlPanelLayout = new javax.swing.GroupLayout(jpControlPanel);
        jpControlPanel.setLayout(jpControlPanelLayout);
        jpControlPanelLayout.setHorizontalGroup(
            jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlPanelLayout.createSequentialGroup()
                        .addComponent(lblSimulationStop)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpControlPanelLayout.createSequentialGroup()
                        .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpControlPanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(btnGraph))
                            .addComponent(lblMinBalance)
                            .addComponent(lblMaxBalance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jpControlPanelLayout.setVerticalGroup(
            jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlPanelLayout.createSequentialGroup()
                .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpControlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGraph))
                    .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpControlPanelLayout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpControlPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblSimulationStop)
                            .addGap(34, 34, 34)
                            .addGroup(jpControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpControlPanelLayout.createSequentialGroup()
                                    .addComponent(lblMinBalance)
                                    .addGap(44, 44, 44)
                                    .addComponent(lblMaxBalance))
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel1.add(jpControlPanel);

        jpDrawingPanel.setBackground(new java.awt.Color(51, 204, 255));

        jLabel20.setText("Transactions");

        jLabel21.setText("Messages");

        lblTotBalance.setText("0.00");

        jLabel17.setText("Account Balance:");

        lblMonth.setText("Month 1");

        jLabel18.setText("Total Withdrawn:");

        lblTotWithdrawn.setText("0.00");

        lblTotDeposit.setText("0.00");

        jLabel19.setText("Total Deposited:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMonth)
                        .addComponent(jLabel17)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTotBalance)
                        .addComponent(lblTotDeposit))
                    .addComponent(lblTotWithdrawn))
                .addGap(0, 115, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblMonth)
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblTotBalance))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblTotWithdrawn))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblTotDeposit))
                .addGap(0, 116, Short.MAX_VALUE))
        );

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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTransaction.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(tblTransaction);

        txtErrorList.setColumns(20);
        txtErrorList.setRows(5);
        jScrollPane3.setViewportView(txtErrorList);

        javax.swing.GroupLayout jpDrawingPanelLayout = new javax.swing.GroupLayout(jpDrawingPanel);
        jpDrawingPanel.setLayout(jpDrawingPanelLayout);
        jpDrawingPanelLayout.setHorizontalGroup(
            jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(189, 189, 189))))
        );
        jpDrawingPanelLayout.setVerticalGroup(
            jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDrawingPanelLayout.createSequentialGroup()
                .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jpDrawingPanel);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String fName = txtFirstName.getText();
        String lName = txtLastName.getText();
        String bal = txtInitBalance.getText();       
        
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
                    

                }

                else if(accountType==1)
                {
                    account = new CurrentAccount(fName, lName, init);
                    
                }
                account.transaction(1, tranCount, month);
                printTran(tranCount);
                tranCount++;
                month++;
                btnCreate.setEnabled(false);
                txtFirstName.setEnabled(false);
                txtLastName.setEnabled(false);
                txtInitBalance.setEnabled(false);
                cmbAccountType.setEnabled(false);
                btnStartSim.setEnabled(true);
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

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnStartSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartSimActionPerformed
        // TODO add your handling code here:
        btnStopSim.setEnabled(true);
        task = new TimerTask() {
        public void run() {
            
            
            lblMonth.setText("Month "+ month);
            account.transaction(randNum(),tranCount, month);
            printTran(tranCount);
            printError(account.getMessage());
            lblTotBalance.setText(Integer.toString(account.getBalance()));
            lblTotDeposit.setText(Integer.toString(account.getTotDeposit()));
            lblTotWithdrawn.setText(Integer.toString(account.getTotWithdraw()));
            tranCount ++;
            month++;
            graphBalance[month] = account.getBalance();                                              
        }
    };
     timer = new Timer();
     timer.schedule(task, 5000, 5000);

        
        
    }//GEN-LAST:event_btnStartSimActionPerformed

    private void btnStopSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopSimActionPerformed
        // TODO add your handling code here:
        timer.cancel();
        timer.purge();
        //int max = account.findMax();
        //int min = account.findMin();
        lblMaxBalance.setText("Max Balance = "+account.findMax());
        lblMinBalance.setText("Min Balance = "+account.findMin());
        lblSimulationStop.setText("Simulation Stopped!");
        btnGraph.setVisible(true); 
        lblSimulationStop.setVisible(true);
        lblMaxBalance.setVisible(true);
        lblMinBalance.setVisible(true);
      
    }//GEN-LAST:event_btnStopSimActionPerformed

    private void btnGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphActionPerformed
        
       //Graph createGraph = new Graph();
       //createGraph.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGraphActionPerformed

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
            java.util.logging.Logger.getLogger(BankForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankForm().setVisible(true);
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
        
        Object[] row = {"Month "+account.getTransaction().get(count).getMonth(), account.getTransaction().get(count).getInOrOut(), account.getTransaction().get(count).getAmount(), account.getTransaction().get(count).getBalance()};
        DefaultTableModel model = (DefaultTableModel) tblTransaction.getModel();
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
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnGraph;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpControlPanel;
    private javax.swing.JPanel jpDrawingPanel;
    private javax.swing.JLabel lblMaxBalance;
    private javax.swing.JLabel lblMinBalance;
    private javax.swing.JLabel lblMonth;
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
