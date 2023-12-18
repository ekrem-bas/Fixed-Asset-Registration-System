
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SubPage_PersonList extends javax.swing.JFrame {

    DefaultTableModel dtm;

    public SubPage_PersonList() {
        initComponents();
        dtm = (DefaultTableModel) tbl_persons.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmenu = new javax.swing.JPopupMenu();
        pbtn_delete = new javax.swing.JMenuItem();
        jSplitPane2 = new javax.swing.JSplitPane();
        pnl_top = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        pnl_bottom = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_persons = new javax.swing.JTable();

        pbtn_delete.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        pbtn_delete.setText("Delete");
        pbtn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        pmenu.add(pbtn_delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jSplitPane2.setDividerLocation(100);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_topLayout = new javax.swing.GroupLayout(pnl_top);
        pnl_top.setLayout(pnl_topLayout);
        pnl_topLayout.setHorizontalGroup(
            pnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_topLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        pnl_topLayout.setVerticalGroup(
            pnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_topLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jSplitPane2.setLeftComponent(pnl_top);

        tbl_persons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Surname", "Phone", "Mail", "Gender", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_persons.setComponentPopupMenu(pmenu);
        jScrollPane1.setViewportView(tbl_persons);

        javax.swing.GroupLayout pnl_bottomLayout = new javax.swing.GroupLayout(pnl_bottom);
        pnl_bottom.setLayout(pnl_bottomLayout);
        pnl_bottomLayout.setHorizontalGroup(
            pnl_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
        pnl_bottomLayout.setVerticalGroup(
            pnl_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(pnl_bottom);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (new DatabaseManager().showPersons(dtm)) {
            JOptionPane.showMessageDialog(rootPane, tbl_persons.getRowCount() + " person found!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "There is no one in database!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if (Page_Home.checkPermission()) {
            if (new DatabaseManager().delete((int) dtm.getDataVector().get(tbl_persons.getSelectedRow()).elementAt(0))) {
                JOptionPane.showMessageDialog(rootPane, dtm.getDataVector().get(tbl_persons.getSelectedRow()).elementAt(1) + " deleted.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                new DatabaseManager().showPersons(dtm);
            } else {
                JOptionPane.showMessageDialog(rootPane, dtm.getDataVector().get(tbl_persons.getSelectedRow()).elementAt(1) + " cannot deleted.");
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(SubPage_PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubPage_PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubPage_PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubPage_PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubPage_PersonList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JMenuItem pbtn_delete;
    private javax.swing.JPopupMenu pmenu;
    private javax.swing.JPanel pnl_bottom;
    private javax.swing.JPanel pnl_top;
    private javax.swing.JTable tbl_persons;
    // End of variables declaration//GEN-END:variables

}
