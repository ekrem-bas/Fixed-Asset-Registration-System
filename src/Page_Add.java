
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

public class Page_Add extends javax.swing.JFrame {

    // combo box model and arrayList 
    DefaultComboBoxModel<String> dcbm;
    ArrayList<JTextField> textFields = new ArrayList<>();

    public Page_Add() {
        initComponents();
        // adding users to combobox
        addUsersToCBox();
        // adding textfields to arraylist to check if they are empty or not
        addFieldstoArrayList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        pnl_left = new javax.swing.JPanel();
        txt_location = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_serialNumber = new javax.swing.JTextField();
        chcbox_status = new javax.swing.JCheckBox();
        txt_description = new javax.swing.JTextField();
        cbox_category = new javax.swing.JComboBox<>();
        txt_price = new javax.swing.JTextField();
        spinner_date = new javax.swing.JSpinner();
        btn_cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_apply = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbox_user = new javax.swing.JComboBox<>();
        pnl_right = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD");
        setPreferredSize(new java.awt.Dimension(1168, 676));

        txt_location.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel5.setText("PRICE");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("DESCRIPTION");

        txt_serialNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        chcbox_status.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        chcbox_status.setText("ACTIVE");

        txt_description.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        cbox_category.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cbox_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buildings", "Land", "Electronics", "Office Furniture", "Vehicles" }));
        cbox_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_categoryActionPerformed(evt);
            }
        });

        txt_price.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        spinner_date.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        spinner_date.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_MONTH));
        spinner_date.setEditor(new JSpinner.DateEditor(spinner_date, "dd.MM.yyyy"));

        btn_cancel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel2.setText("CATEGORY");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel4.setText("PURCHASE DATE");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setText("STATUS");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setText("LOCATION");
        jLabel6.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setText("SERIAL NUMBER");

        btn_apply.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btn_apply.setText("APPLY");
        btn_apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_applyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel8.setText("USER");
        jLabel8.setPreferredSize(new java.awt.Dimension(83, 20));

        cbox_user.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cbox_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "Company" }));

        javax.swing.GroupLayout pnl_leftLayout = new javax.swing.GroupLayout(pnl_left);
        pnl_left.setLayout(pnl_leftLayout);
        pnl_leftLayout.setHorizontalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_leftLayout.createSequentialGroup()
                        .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_description)
                            .addComponent(txt_serialNumber)
                            .addComponent(cbox_category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinner_date)
                            .addComponent(txt_price)
                            .addComponent(txt_location)
                            .addComponent(chcbox_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_user, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_leftLayout.createSequentialGroup()
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btn_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        pnl_leftLayout.setVerticalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_description, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbox_category, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_serialNumber)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinner_date)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_price)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_location)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chcbox_status, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbox_user, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lbl_icon)
                .addGap(50, 50, 50))
        );
        pnl_rightLayout.setVerticalGroup(
            pnl_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rightLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbl_icon)
                .addGap(50, 50, 50))
        );

        jSplitPane1.setRightComponent(pnl_right);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // add fields to arrayList to check them
    private void addFieldstoArrayList() {
        textFields.add(txt_description);
        textFields.add(txt_location);
        textFields.add(txt_serialNumber);
        textFields.add(txt_price);
    }

    // add persons from database to user list
    private void addUsersToCBox() {
        dcbm = (DefaultComboBoxModel<String>) cbox_user.getModel();
        DatabaseManager.CBOXaddPersons(dcbm);
    }

    // cancel button
    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    // check empty fields
    private boolean isEmptyField() {
        int empty_count = 0;
        for (JTextField text : this.textFields) {
            if (text.getText().trim().isEmpty()) {
                empty_count++;
            }
        }
        return empty_count > 0;
    }

    // get user
    private String getUserString() {
        return cbox_user.getSelectedItem().toString();
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
        // pattern for price (only integers and . ,)
        Pattern pattern = Pattern.compile("^[0-9.,]+");
        Matcher matcher = pattern.matcher(txt_price.getText());
        // if matcher matches it will return true
        if (matcher.matches()) {
            matches = true;
        } else {
            // else it will show an option pane to get correct value while user enters invalid value
            while (!matcher.matches()) {
                String input = JOptionPane.showInputDialog(rootPane, "Invalid Value! Please enter valid values!", "WARNING", JOptionPane.WARNING_MESSAGE);
                // if user selects cancel button it will return null and it will set the price field to empty string
                // i did this to check valid values if there is no valid value this method will set the field to empty
                // and it will return an error with isEmptyField
                if (input == null) {
                    matches = false;
                    txt_price.setText("");
                    break;
                } else {
                    // else it will take the input value and check it again
                    matcher = pattern.matcher(input);
                    matches = true;
                }
            }
        }
        // if the value is correct it will return price and set the field to it
        if (matches) {
            txt_price.setText(matcher.group());
            return txt_price.getText();
        } else {
            // else it will set the field to empty string
            return "";
        }
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

    private void btn_applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_applyActionPerformed
        // if there is something wrong it will show an info to user
        if (isEmptyField() || getPriceString().isEmpty() || cbox_user.getSelectedItem().toString().equals("<none>")) {
            JOptionPane.showMessageDialog(rootPane, "Please fill the empty areas!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // if there is no empty field, the price is not empty(incorrect) and the user selection is not <none>
            // it will add the asset with the given values to the database
            DatabaseManager.addAssets(new FixedAssets(getUserString(), getDescriptionString(), getCategoryString(), getSerialNumber(), getPurchaseDate(), getPriceString(), getLocationString(), getStatusString()));
            // give an information to the user
            JOptionPane.showMessageDialog(rootPane, getDescriptionString() + " is added to assets.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            // reset the table
            DatabaseManager.showAssets(Page_Home.model);
            this.dispose();
        }
    }//GEN-LAST:event_btn_applyActionPerformed

    private void cbox_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_categoryActionPerformed
        // this is icon in the left part of page
        // i added this to get a better design and i wantted to use Images in my project
        ImageIcon icon = null;
        // switch case to change icon with the selection from category
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
            java.util.logging.Logger.getLogger(Page_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apply;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JComboBox<String> cbox_category;
    private javax.swing.JComboBox<String> cbox_user;
    private javax.swing.JCheckBox chcbox_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JPanel pnl_left;
    private javax.swing.JPanel pnl_right;
    private javax.swing.JSpinner spinner_date;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_location;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_serialNumber;
    // End of variables declaration//GEN-END:variables

}
