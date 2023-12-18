
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Page_Home extends javax.swing.JFrame {

    static DefaultTableModel model;

    public Page_Home(Person person) {
        initComponents();
        model = (DefaultTableModel) tbl_assets.getModel();
        person = DatabaseManager.loggedPerson;
        lbl_name.setText(person.getName());
    }

    public Page_Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupMenu = new javax.swing.JPopupMenu();
        mbtn_update = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mbtn_copy = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mbtn_delete = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lbl_filter = new javax.swing.JLabel();
        cbox_filter = new javax.swing.JComboBox<>();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lbl_welcomeBack = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_assets = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mbtn_add = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mbtn_showPersons = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mbtn_quit = new javax.swing.JMenuItem();

        PopupMenu.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        mbtn_update.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        mbtn_update.setText("Update");
        mbtn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        PopupMenu.add(mbtn_update);
        PopupMenu.add(jSeparator1);

        mbtn_copy.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        mbtn_copy.setText("Copy");
        mbtn_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtn_copyActionPerformed(evt);
            }
        });
        PopupMenu.add(mbtn_copy);
        PopupMenu.add(jSeparator4);

        mbtn_delete.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        mbtn_delete.setText("Delete");
        mbtn_delete.setToolTipText("");
        mbtn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtn_deleteActionPerformed(evt);
            }
        });
        PopupMenu.add(mbtn_delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_filter.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lbl_filter.setText("CATEGORY FILTER");

        cbox_filter.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cbox_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "Building", "Land", "Electronic", "Office Furniture", "Vehicle" }));
        cbox_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_filterActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        lbl_welcomeBack.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lbl_welcomeBack.setText("WELCOME BACK");

        lbl_name.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_welcomeBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbox_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_welcomeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        tbl_assets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Description", "Category", "Serial Number", "Purchase Date", "Price", "Location", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_assets.setComponentPopupMenu(PopupMenu);
        tbl_assets.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_assets);
        if (tbl_assets.getColumnModel().getColumnCount() > 0) {
            tbl_assets.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jMenu1.setText("Operations");

        mbtn_add.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        mbtn_add.setText("Add New Asset");
        mbtn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jMenu1.add(mbtn_add);
        jMenu1.add(jSeparator2);

        mbtn_showPersons.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        mbtn_showPersons.setText("Show Persons");
        mbtn_showPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtn_showPersonsActionPerformed(evt);
            }
        });
        jMenu1.add(mbtn_showPersons);
        jMenu1.add(jSeparator3);

        mbtn_quit.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        mbtn_quit.setText("Quit FARS");
        mbtn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtn_quitActionPerformed(evt);
            }
        });
        jMenu1.add(mbtn_quit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mbtn_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mbtn_quitActionPerformed

    private void mbtn_showPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_showPersonsActionPerformed
        new SubPage_PersonList().setVisible(true);
    }//GEN-LAST:event_mbtn_showPersonsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (new DatabaseManager().showAssets(model)) {
        } else {
            JOptionPane.showMessageDialog(rootPane, "There is no fixed asset in database");
        }
    }//GEN-LAST:event_formWindowOpened

    // check permission 
    public static boolean checkPermission() {
        if (!DatabaseManager.loggedPerson.getPosition().equals("General Manager")) {
            JOptionPane.showMessageDialog(null, "You do not have permission to do this!", "WARNING", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    private void cbox_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_filterActionPerformed
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>();
        rowSorter.setModel(model);
        if ("<none>".equals(cbox_filter.getSelectedItem().toString())) {
            tbl_assets.setRowSorter(null);
        } else {
            rowSorter.setRowFilter(RowFilter.regexFilter(cbox_filter.getSelectedItem().toString(), 2));
            tbl_assets.setRowSorter(rowSorter);
        }
    }//GEN-LAST:event_cbox_filterActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if (checkPermission()) {
            new Page_Add().setVisible(true);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if (checkPermission()) {
            if (tbl_assets.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Nothing was selected from the table.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                
                FixedAssets asset = new FixedAssets(
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 1).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 2).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 3).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 4).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 5).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 6).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 7).toString()
                );
                new Page_Update(Integer.parseInt(model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 0).toString()), asset).setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void mbtn_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_copyActionPerformed
        if (tbl_assets.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Nothing was selected from the table.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String copy = model.getDataVector().get(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow())).toString();
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(copy);
            clipboard.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_mbtn_copyActionPerformed

    private void mbtn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_deleteActionPerformed
        if (checkPermission()) {
            if (tbl_assets.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Nothing was selected from the table.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                if (new DatabaseManager().deleteAsset(Integer.parseInt(model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 0).toString()))) {
                    JOptionPane.showMessageDialog(
                            rootPane,
                            model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 1) + " is deleted.",
                            "INFORMATION",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    new DatabaseManager().showAssets(model);
                } else {
                    JOptionPane.showMessageDialog(
                            rootPane,
                            model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 1) + " cannot deleted.",
                            "WARNING",
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        }
    }//GEN-LAST:event_mbtn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Page_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopupMenu;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbox_filter;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lbl_filter;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_welcomeBack;
    private javax.swing.JMenuItem mbtn_add;
    private javax.swing.JMenuItem mbtn_copy;
    private javax.swing.JMenuItem mbtn_delete;
    private javax.swing.JMenuItem mbtn_quit;
    private javax.swing.JMenuItem mbtn_showPersons;
    private javax.swing.JMenuItem mbtn_update;
    private javax.swing.JTable tbl_assets;
    // End of variables declaration//GEN-END:variables

}
