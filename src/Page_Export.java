
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Page_Export extends javax.swing.JFrame {

    ArrayList<String> dataToWrite = new ArrayList<>();
    static DefaultTableModel model;

    public Page_Export() {
        initComponents();
        model = (DefaultTableModel) tbl_assets.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_down = new javax.swing.JScrollPane();
        tbl_assets = new javax.swing.JTable();
        txt_fileName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DESIGN");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        tbl_assets.getTableHeader().setReorderingAllowed(false);
        pnl_down.setViewportView(tbl_assets);
        if (tbl_assets.getColumnModel().getColumnCount() > 0) {
            tbl_assets.getColumnModel().getColumn(0).setResizable(false);
            tbl_assets.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbl_assets.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_assets.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Enter a name for File");

        btn_save.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_down)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_down, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txt_fileName)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DatabaseManager.showAssets(model);
    }//GEN-LAST:event_formWindowOpened

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if (tbl_assets.getSelectedRows().length == 0) {
            JOptionPane.showMessageDialog(rootPane, "Select data from table.");
            txt_fileName.setText("");
        } else {
            for (int i = 0; i < tbl_assets.getSelectedRows().length; i++) {
                dataToWrite
                        .add(
                                model.getDataVector().get(tbl_assets.getSelectedRows()[i]).toString()
                        );
            }
            if (txt_fileName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please enter a name for file!");
            } else {
                String fileName = txt_fileName.getText() + ".txt";
                String desktopPath = System.getProperty("user.home") + File.separator + "Desktop" + File.separator + fileName;
                File file = new File(desktopPath);
                if (file.exists()) {
                    int choice = JOptionPane.showConfirmDialog(rootPane, "The file already exists. Do you want to overwrite it?", "File Exists", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        file.delete(); 
                        try {
                            file.createNewFile();
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                        }
                    } else {
                        tbl_assets.clearSelection();
                        dataToWrite.clear();
                        txt_fileName.setText("");
                        return; 
                    }
                }
                else {
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    }
                }
                try {
                    FileWriter fileWriter = new FileWriter(file);
                    try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                        for (String line : dataToWrite) {
                            bufferedWriter.write(line);
                            bufferedWriter.newLine();
                        }
                    }
                    JOptionPane.showMessageDialog(rootPane, "The selected data has been successfully exported to " + desktopPath + ".");
                    this.dispose();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
            dataToWrite.clear();
            txt_fileName.setText("");
            tbl_assets.clearSelection();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getComponent() != tbl_assets) {
            tbl_assets.clearSelection();
        }
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(Page_Export.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_Export.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_Export.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_Export.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page_Export().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane pnl_down;
    private javax.swing.JTable tbl_assets;
    private javax.swing.JTextField txt_fileName;
    // End of variables declaration//GEN-END:variables

}
