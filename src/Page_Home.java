
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Page_Home extends javax.swing.JFrame {

    // table model
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
        pnl_up = new javax.swing.JPanel();
        lbl_filter = new javax.swing.JLabel();
        cbox_filter = new javax.swing.JComboBox<>();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lbl_welcomeBack = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        pnl_icon = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        pnl_down = new javax.swing.JScrollPane();
        tbl_assets = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mbtn_export = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mbtn_logOut = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mbtn_quit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mbtn_add = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mbtn_showPersons = new javax.swing.JMenuItem();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("FARS - HOME");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
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

        pnl_icon.setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout pnl_iconLayout = new javax.swing.GroupLayout(pnl_icon);
        pnl_icon.setLayout(pnl_iconLayout);
        pnl_iconLayout.setHorizontalGroup(
            pnl_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_iconLayout.setVerticalGroup(
            pnl_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_upLayout = new javax.swing.GroupLayout(pnl_up);
        pnl_up.setLayout(pnl_upLayout);
        pnl_upLayout.setHorizontalGroup(
            pnl_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_upLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_welcomeBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_upLayout.createSequentialGroup()
                        .addComponent(cbox_filter, 0, 644, Short.MAX_VALUE)
                        .addGap(100, 100, 100)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(pnl_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(pnl_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        pnl_upLayout.setVerticalGroup(
            pnl_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_upLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_welcomeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnl_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tbl_assets.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        tbl_assets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "User", "Description", "Category", "Serial Number", "Purchase Date", "Price", "Location", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        tbl_assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_assetsMousePressed(evt);
            }
        });
        pnl_down.setViewportView(tbl_assets);
        if (tbl_assets.getColumnModel().getColumnCount() > 0) {
            tbl_assets.getColumnModel().getColumn(0).setResizable(false);
            tbl_assets.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbl_assets.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_assets.getColumnModel().getColumn(3).setResizable(false);
        }

        jMenu2.setText("File");

        mbtn_export.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        mbtn_export.setText("Export");
        mbtn_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtn_exportActionPerformed(evt);
            }
        });
        jMenu2.add(mbtn_export);
        jMenu2.add(jSeparator6);

        mbtn_logOut.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        mbtn_logOut.setText("Log out");
        mbtn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtn_logOutActionPerformed(evt);
            }
        });
        jMenu2.add(mbtn_logOut);
        jMenu2.add(jSeparator5);

        mbtn_quit.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        mbtn_quit.setText("Quit FARS");
        mbtn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtn_quitActionPerformed(evt);
            }
        });
        jMenu2.add(mbtn_quit);

        jMenuBar1.add(jMenu2);

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

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_down)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_down, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mbtn_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_quitActionPerformed
        // when user clicks on quit button it will show a confirm dialog to ensure the user wants to exit
        int input = JOptionPane.showConfirmDialog(rootPane, "Are you sure to exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        // if user clicks on yes it will close the application
        if (input == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mbtn_quitActionPerformed

    private void mbtn_showPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_showPersonsActionPerformed
        // if user clicks on Show Persons button it will open the Employees Page
        new SubPage_EmployeesList().setVisible(true);
    }//GEN-LAST:event_mbtn_showPersonsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // when home page opened it will take the assets from database and show them to user
        if (DatabaseManager.showAssets(model)) {
        } else {
            // if there is an error with database or there is nothing in database it will show an message
            JOptionPane.showMessageDialog(rootPane, "There is no fixed asset in database", "Something Went Wrong", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    // filtration of table
    private void cbox_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_filterActionPerformed
        // i took these lines of code from internet seraching about filtration of jTable
        // create a rowSorter
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>();
        // and set its model to Asset Table's model
        rowSorter.setModel(model);
        // if there is nothing selected from combo box it will not filter the table
        if ("<none>".equals(cbox_filter.getSelectedItem().toString())) {
            tbl_assets.setRowSorter(null);
        } else {
            // else it will take the combo box string with regex filter and filter them with the category column
            rowSorter.setRowFilter(RowFilter.regexFilter(cbox_filter.getSelectedItem().toString(), 3));
            tbl_assets.setRowSorter(rowSorter);
        }
    }//GEN-LAST:event_cbox_filterActionPerformed

    // add button
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // if the user has a permission it will open the page add
        if (DatabaseManager.checkPermission()) {
            new Page_Add().setVisible(true);
        } else {
            // else it will show an message
            JOptionPane.showMessageDialog(rootPane, "You do not have permission to do this!", "Sorry", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    // update button
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // check the permission
        if (DatabaseManager.checkPermission()) {
            // if there is nothing selected or more than one selected from table it will show an error
            if (tbl_assets.getSelectedRows().length != 1) {
                JOptionPane.showMessageDialog(rootPane, "Please select exactly one row from the table.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                FixedAssets asset = new FixedAssets(
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 1).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 2).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 3).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 4).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 5).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 6).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 7).toString(),
                        model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 8).toString()
                );
                new Page_Update((int) (model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 0)), asset).setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "You do not have permission to do this!", "Sorry", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    // copy button function to use it in here and employees page
    public static void btn_copyActionPerformed(java.awt.event.ActionEvent evt, DefaultTableModel model, JTable tbl) {
        String copy = "";
        for (int i = 0; i < tbl.getSelectedRows().length; i++) {
            copy += model.getDataVector().get(tbl.convertRowIndexToModel(tbl.getSelectedRows()[i])) + "\n";
        }
        if (!copy.equals("")) {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(copy);
            clipboard.setContents(stringSelection, null);
        } else {
            JOptionPane.showMessageDialog(null, "There is  nothing selected from table!", "Sorry", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // copy pop up menu button
    private void mbtn_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_copyActionPerformed
        btn_copyActionPerformed(evt, model, tbl_assets);
    }//GEN-LAST:event_mbtn_copyActionPerformed

    // delete pop up menu button
    private void mbtn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_deleteActionPerformed
        if (DatabaseManager.checkPermission()) {
            if (tbl_assets.getSelectedRows().length != 1) {
                JOptionPane.showMessageDialog(rootPane, "Please select exactly one row from the table.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (DatabaseManager.deleteAsset((int) (model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 0)))) {
                    JOptionPane.showMessageDialog(
                            rootPane,
                            model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 2) + " is deleted.",
                            "INFORMATION",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    DatabaseManager.showAssets(model);
                } else {
                    JOptionPane.showMessageDialog(
                            rootPane,
                            model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 2) + " cannot deleted.",
                            "WARNING",
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "You do not have permission to do this!", "Sorry", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mbtn_deleteActionPerformed

    // set the mini icon at top right corner to selected category
    private void setIcon(String category) {
        ImageIcon imageIcon = null;
        switch (category) {
            case "Buildings":
                imageIcon = new ImageIcon("src/assets/building64px.png");
                break;
            case "Electronics":
                imageIcon = new ImageIcon("src/assets/electronics64px.png");
                break;
            case "Land":
                imageIcon = new ImageIcon("src/assets/land64px.png");
                break;
            case "Office Furniture":
                imageIcon = new ImageIcon("src/assets/office64px.png");
                break;
            case "Vehicles":
                imageIcon = new ImageIcon("src/assets/vehicle64px.png");
                break;
        }
        icon.setIcon(imageIcon);
    }

    // change the icon
    private void tbl_assetsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_assetsMousePressed
        setIcon(model.getValueAt(tbl_assets.convertRowIndexToModel(tbl_assets.getSelectedRow()), 3).toString());
    }//GEN-LAST:event_tbl_assetsMousePressed

    // log out button
    private void mbtn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_logOutActionPerformed
        int input = JOptionPane.showConfirmDialog(rootPane, "Are you sure to log out?", "Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (input == JOptionPane.YES_OPTION) {
            new Page_Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_mbtn_logOutActionPerformed

    // exiting from application with the X icon on menu
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int input = JOptionPane.showConfirmDialog(rootPane, "Are you sure to exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (input == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    // export button
    private void mbtn_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtn_exportActionPerformed
        new Page_Export().setVisible(true);
    }//GEN-LAST:event_mbtn_exportActionPerformed


    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        mouseTrack(evt, tbl_assets);
    }//GEN-LAST:event_formMouseClicked

    // if user clicks somewhere that does not table it will clear the selection in table
    // a method to use here and export page
    public static void mouseTrack(java.awt.event.MouseEvent evt, JTable tbl) {
        if (evt.getComponent() != tbl) {
            tbl.clearSelection();
        }
    }

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
    private javax.swing.JLabel icon;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JLabel lbl_filter;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_welcomeBack;
    private javax.swing.JMenuItem mbtn_add;
    private javax.swing.JMenuItem mbtn_copy;
    private javax.swing.JMenuItem mbtn_delete;
    private javax.swing.JMenuItem mbtn_export;
    private javax.swing.JMenuItem mbtn_logOut;
    private javax.swing.JMenuItem mbtn_quit;
    private javax.swing.JMenuItem mbtn_showPersons;
    private javax.swing.JMenuItem mbtn_update;
    private javax.swing.JScrollPane pnl_down;
    private javax.swing.JPanel pnl_icon;
    private javax.swing.JPanel pnl_up;
    private javax.swing.JTable tbl_assets;
    // End of variables declaration//GEN-END:variables

}
