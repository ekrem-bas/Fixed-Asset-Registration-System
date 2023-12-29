
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SubPage_EmployeesList extends javax.swing.JFrame {

    DefaultTableModel model;

    public SubPage_EmployeesList() {
        initComponents();
        model = (DefaultTableModel) tbl_persons.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmenu = new javax.swing.JPopupMenu();
        pbtn_copy = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        pbtn_delete = new javax.swing.JMenuItem();
        jSplitPane2 = new javax.swing.JSplitPane();
        pnl_top = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        pnl_bottom = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_persons = new javax.swing.JTable();

        pbtn_copy.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        pbtn_copy.setText("Copy");
        pbtn_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbtn_copyActionPerformed(evt);
            }
        });
        pmenu.add(pbtn_copy);
        pmenu.add(jSeparator2);

        pbtn_delete.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        pbtn_delete.setText("Delete");
        pbtn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        pmenu.add(pbtn_delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMPLOYEES");
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
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
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
        tbl_persons.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_persons);
        if (tbl_persons.getColumnModel().getColumnCount() > 0) {
            tbl_persons.getColumnModel().getColumn(0).setResizable(false);
            tbl_persons.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_persons.getColumnModel().getColumn(5).setResizable(false);
            tbl_persons.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        javax.swing.GroupLayout pnl_bottomLayout = new javax.swing.GroupLayout(pnl_bottom);
        pnl_bottom.setLayout(pnl_bottomLayout);
        pnl_bottomLayout.setHorizontalGroup(
            pnl_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        pnl_bottomLayout.setVerticalGroup(
            pnl_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
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
        if (DatabaseManager.showPersons(model)) {
            if (DatabaseManager.checkPermission()) {
                JOptionPane.showMessageDialog(rootPane, tbl_persons.getRowCount() + " person found!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "There is no one in database!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    // delete employee operation
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            if (DatabaseManager.checkPermission()) {
                if (tbl_persons.getSelectedRows().length != 1) {
                    // CUSTOM EXCEPTION
                    throw new Exception("Please select exactly one row from table!");
                } else {
                    int selection = JOptionPane.showConfirmDialog(rootPane, "Are you sure to delete " + model.getValueAt(tbl_persons.getSelectedRow(), 1).toString() + "?", "Are you sure?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (selection == JOptionPane.YES_OPTION) {
                        if (DatabaseManager.delete((int) (model.getValueAt(tbl_persons.convertRowIndexToModel(tbl_persons.getSelectedRow()), 0)))) {
                            JOptionPane.showMessageDialog(
                                    rootPane,
                                    model.getValueAt(tbl_persons.convertRowIndexToModel(tbl_persons.getSelectedRow()), 1) + " is deleted.",
                                    "INFORMATION",
                                    JOptionPane.INFORMATION_MESSAGE
                            );
                            DatabaseManager.showPersons(model);
                        } else {
                            JOptionPane.showMessageDialog(
                                    rootPane,
                                    model.getValueAt(tbl_persons.convertRowIndexToModel(tbl_persons.getSelectedRow()), 1) + " cannot deleted.",
                                    "WARNING",
                                    JOptionPane.WARNING_MESSAGE
                            );
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sorry you do not have a permission to do this!", "Sorry", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void pbtn_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbtn_copyActionPerformed
        Page_Home.btn_copyActionPerformed(evt, model, tbl_persons);
    }//GEN-LAST:event_pbtn_copyActionPerformed

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
            java.util.logging.Logger.getLogger(SubPage_EmployeesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubPage_EmployeesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubPage_EmployeesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubPage_EmployeesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>.toString()
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
                new SubPage_EmployeesList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JMenuItem pbtn_copy;
    private javax.swing.JMenuItem pbtn_delete;
    private javax.swing.JPopupMenu pmenu;
    private javax.swing.JPanel pnl_bottom;
    private javax.swing.JPanel pnl_top;
    private javax.swing.JTable tbl_persons;
    // End of variables declaration//GEN-END:variables

}
