/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author Wral
 */
public class ViewAccounts extends javax.swing.JPanel {

    /**
     * Creates new form ViewAccounts
     */
    public ViewAccounts() {
        initComponents();
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
        listAccounts = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMessages = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAccTrans = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listAccounts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listAccounts);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 137, 205));

        txtMessages.setColumns(20);
        txtMessages.setRows(5);
        jScrollPane2.setViewportView(txtMessages);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 460, 340));

        jScrollPane3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N

        tblAccTrans.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAccTrans.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(tblAccTrans);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 334));

        btnBack.setText("Back");
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listAccounts;
    private javax.swing.JTable tblAccTrans;
    private javax.swing.JTextArea txtMessages;
    // End of variables declaration//GEN-END:variables
}
