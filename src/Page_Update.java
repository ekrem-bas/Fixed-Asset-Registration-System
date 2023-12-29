
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Page_Update extends javax.swing.JFrame {

    ArrayList<JTextField> textFields = new ArrayList<>();
    int selected_id;
    DefaultComboBoxModel<String> dcbm;

    public Page_Update(int id, FixedAssets asset) {
        initComponents();
        dcbm = (DefaultComboBoxModel<String>) cbox_user.getModel();
        DatabaseManager.CBOXaddPersons(dcbm);
        setComponents(id, asset);
    }

    public Page_Update() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        pnl_left = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_description = new javax.swing.JTextField();
        spinner_date = new javax.swing.JSpinner();
        txt_serialNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbox_category = new javax.swing.JComboBox<>();
        txt_price = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_location = new javax.swing.JTextField();
        chcbox_status = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbox_user = new javax.swing.JComboBox<>();
        pnl_right = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UPDATE");

        jSplitPane1.setDividerLocation(584);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel9.setText("LOCATION");

        btn_cancel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel10.setText("STATUS");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel11.setText("DESCRIPTION");

        btn_update.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel12.setText("CATEGORY");

        txt_description.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        spinner_date.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        spinner_date.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_MONTH));
        spinner_date.setEditor(new JSpinner.DateEditor(spinner_date, "dd.MM.yyyy"));

        txt_serialNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel13.setText("SERIAL NUMBER");

        cbox_category.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cbox_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buildings", "Land", "Electronics", "Office Furniture", "Vehicles" }));
        cbox_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_categoryActionPerformed(evt);
            }
        });

        txt_price.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel14.setText("ID");

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel15.setText("PURCHASE DATE");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txt_id.setFocusable(false);

        txt_location.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        chcbox_status.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        chcbox_status.setText("ACTIVE");

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel16.setText("PRICE");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel8.setText("USER");
        jLabel8.setPreferredSize(new java.awt.Dimension(83, 20));

        cbox_user.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cbox_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Company" }));

        javax.swing.GroupLayout pnl_leftLayout = new javax.swing.GroupLayout(pnl_left);
        pnl_left.setLayout(pnl_leftLayout);
        pnl_leftLayout.setHorizontalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_leftLayout.createSequentialGroup()
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_leftLayout.createSequentialGroup()
                        .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_description)
                            .addComponent(txt_serialNumber)
                            .addComponent(cbox_category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinner_date, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txt_price)
                            .addComponent(txt_location)
                            .addComponent(txt_id)
                            .addComponent(chcbox_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_user, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        pnl_leftLayout.setVerticalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_description, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbox_category, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_serialNumber)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinner_date)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_price)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_location)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chcbox_status, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbox_user, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jSplitPane1.setLeftComponent(pnl_left);

        pnl_right.setMaximumSize(new java.awt.Dimension(512, 616));

        lbl_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/building.png"))); // NOI18N

        javax.swing.GroupLayout pnl_rightLayout = new javax.swing.GroupLayout(pnl_right);
        pnl_right.setLayout(pnl_rightLayout);
        pnl_rightLayout.setHorizontalGroup(
            pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rightLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lbl_icon)
                .addGap(50, 50, 50))
        );
        pnl_rightLayout.setVerticalGroup(
            pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rightLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jSplitPane1.setRightComponent(pnl_right);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // prepare components to be ready
    private void setComponents(int id, FixedAssets asset) {
        selected_id = id;
        txt_id.setText(Integer.toString(selected_id));
        txt_description.setText(asset.getProductDescription());
        cbox_category.setSelectedItem(asset.getProductCategory());
        txt_serialNumber.setText(asset.getProductSerialNumber());
        txt_price.setText(asset.getProductPrice());
        txt_location.setText(asset.getProductLocation());
        spinner_date.setValue(setSpinnerDate(asset));
        dcbm.setSelectedItem(asset.getProductUser());
        setStatus(asset);
    }

    // chcbox_status set value
    private void setStatus(FixedAssets asset) {
        if (asset.getProductStatus().equals("Active")) {
            chcbox_status.setSelected(true);
        } else {
            chcbox_status.setSelected(false);
        }
    }

    // spinner set value
    private Date setSpinnerDate(FixedAssets asset) {
        String assetDate = asset.getProductPurchaseDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date purchaseDate = null;
        try {
            purchaseDate = sdf.parse(assetDate);
        } catch (Exception e) {
            e.toString();
        }
        return purchaseDate;
    }

    // check empty fields
    private boolean isEmptyField() {
        textFields.add(txt_description);
        textFields.add(txt_location);
        textFields.add(txt_serialNumber);
        textFields.add(txt_price);
        int empty_count = 0;
        for (JTextField test : this.textFields) {
            if (test.getText().trim().isEmpty()) {
                empty_count++;
            }
        }
        return empty_count > 0;
    }

    // get description
    private String getDescriptionString() {
        return txt_description.getText();
    }

    // get category
    private String getCategoryString() {
        return cbox_category.getSelectedItem().toString();
    }

    // get serial number
    private String getSerialNumber() {
        return txt_serialNumber.getText();
    }

    // get purchase date
    private String getPurchaseDate() {
        Date date = (Date) spinner_date.getValue();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(date);
    }

    // get price with regex
    private String getPriceString() {
        boolean matches = false;
        Pattern pattern = Pattern.compile("^[0-9.,]+");
        Matcher matcher = pattern.matcher(txt_price.getText());
        if (matcher.matches()) {
            matches = true;
        } else {
            while (!matcher.matches()) {
                String input = JOptionPane.showInputDialog(rootPane, "Invalid Value! Please enter valid values!", "WARNING", JOptionPane.WARNING_MESSAGE);
                if (input == null) {
                    matches = false;
                    txt_price.setText("");
                    break;
                } else {
                    matcher = pattern.matcher(input);
                    matches = true;
                }
            }
        }
        if (matches) {
            txt_price.setText(matcher.group());
            return txt_price.getText();
        } else {
            return "";
        }
    }

    // get user
    private String getUserString() {
        return cbox_user.getSelectedItem().toString();
    }

    // get location
    private String getLocationString() {
        return txt_location.getText();
    }

    // get status
    private String getStatusString() {
        if (chcbox_status.isSelected()) {
            return "Active";
        } else {
            return "Inactive";
        }
    }
    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if (isEmptyField() || getPriceString().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please fill the empty areas!", "Empty Fields", JOptionPane.INFORMATION_MESSAGE);
        } else {
            FixedAssets asset = new FixedAssets(getUserString(), getDescriptionString(), getCategoryString(), getSerialNumber(), getPurchaseDate(), getPriceString(), getLocationString(), getStatusString());
            if (DatabaseManager.updateAsset(selected_id, asset)) {
                JOptionPane.showMessageDialog(rootPane, asset.getProductDescription() + " is updated!", "Update", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                DatabaseManager.showAssets(Page_Home.model);
            } else {
                JOptionPane.showMessageDialog(rootPane, asset.getProductDescription() + " is not updated!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void cbox_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_categoryActionPerformed
        ImageIcon icon = null;
        switch (cbox_category.getSelectedIndex()) {
            case 0:
                icon = new ImageIcon("src/assets/building.png");
                break;
            case 1:
                icon = new ImageIcon("src/assets/land.png");
                break;
            case 2:
                icon = new ImageIcon("src/assets/electronics.png");
                break;
            case 3:
                icon = new ImageIcon("src/assets/office.png");
                break;
            case 4:
                icon = new ImageIcon("src/assets/vehicle.png");
                break;
        }
        lbl_icon.setIcon(icon);
    }//GEN-LAST:event_cbox_categoryActionPerformed

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
            java.util.logging.Logger.getLogger(Page_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbox_category;
    private javax.swing.JComboBox<String> cbox_user;
    private javax.swing.JCheckBox chcbox_status;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JPanel pnl_left;
    private javax.swing.JPanel pnl_right;
    private javax.swing.JSpinner spinner_date;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_location;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_serialNumber;
    // End of variables declaration//GEN-END:variables

}
