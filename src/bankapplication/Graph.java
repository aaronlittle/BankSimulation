package bankapplication;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

public class Graph extends javax.swing.JFrame {
    int [] graphBalance;
    int [] graphMonth;
    private int barWidth = 10;
    private int barSpaces = 70;
    private int barHeight = 50;
    private int maxVal = 400;

    public Graph() {
        initComponents();  //this constructor will not be used    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTotalBal = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Account Balance Progression");

        lblTotalBal.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        lblTotalBal.setText("jLabel2");

        btnClose.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblTotalBal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(362, 362, 362)
                .addComponent(btnClose)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTotalBal)
                    .addComponent(btnClose))
                .addContainerGap(706, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Graph a = new Graph();
                a.setVisible(true);
                //a.paint(null);                
            }
        });
    }
            
    public Graph (int[] balance, int[] month) {  
        //implemented constructor
        initComponents();
        graphBalance = balance;
        graphMonth = month;
                       
        for(int i=1; i<graphBalance.length; i++){
            if(i%13==0){
                barSpaces = (barSpaces/2);
                barHeight = barHeight-(barHeight/2);
            }
        }       
        lblTotalBal.setText("Balance = "+graphBalance[graphBalance.length-1]);                          
    }
    public void paint(Graphics g){
        int max = findMax();
        super.paint(g);
        int y = 100;
        Graphics2D g2 = (Graphics2D)g;
        for(int i=0;i<graphBalance.length;i++){ 
            Color purple = new Color(204,204,255); 
            g2.setColor(purple);
            if(graphBalance[i]<0){
                g2.fillRect(180, y, 0,barHeight );
                g2.setPaint(Color.black);
                g2.drawString("£"+graphBalance[i],250,y);
            }

            else{//scaling the graph
               if(max>49999){
                    g2.fillRect(180, y, (graphBalance[i]/100)+300,barHeight );
                    g2.setPaint(Color.black);
                    g2.drawString("£"+graphBalance[i],((graphBalance[i]/100)+300)+250,y);
                }
                else if(max>10000){
                    g2.fillRect(180, y, graphBalance[i]/50,barHeight );
                    g2.setPaint(Color.black);
                    g2.drawString("£"+graphBalance[i],(graphBalance[i]/50)+250,y);                    
                }
                else if(max>5000){
                    g2.fillRect(180, y, graphBalance[i]/50,barHeight );
                    g2.setPaint(Color.black);
                    g2.drawString("£"+graphBalance[i],(graphBalance[i]/50)+250,y);                     
                }
                else{
                    g2.fillRect(180, y, graphBalance[i]/barWidth,barHeight );
                    g2.setPaint(Color.black);
                    g2.drawString("£"+graphBalance[i],(graphBalance[i]/barWidth)+250,y);
                }
            }                       
            g2.drawString("Month "+graphMonth[i], 50, y);
            y= y+ barSpaces;           
        }                     
    }
    public int findMax(){//similar to method in Account class, finds maxmimum balance for scaling purposes
        int max = graphBalance[0];
        for(int i = 0; i<graphBalance.length;i++){
            if(graphBalance[i]> max){
                max= graphBalance[i];
               
            }
        }
        return max;
    }
    public int findMin(){//finds minimum balance
        int min = graphBalance[0];
        for(int i = 0; i<graphBalance.length;i++){
            if(graphBalance[i]< min){
                min= graphBalance[i];
               
            }
        }
        return min;
    }                   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTotalBal;
    // End of variables declaration//GEN-END:variables
}//end class
