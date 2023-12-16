
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Page_Add extends javax.swing.JFrame {


    public Page_Add() {
        initComponents();
        textFields.add(txt_description);
        textFields.add(txt_location);
        textFields.add(txt_serialNumber);
        textFields.add(txt_price);
    }
    
    
    ArrayList<JTextField> textFields = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_description = new javax.swing.JTextField();
        txt_serialNumber = new javax.swing.JTextField();
        cbox_category = new javax.swing.JComboBox<>();
        spinner_date = new javax.swing.JSpinner();
        txt_price = new javax.swing.JTextField();
        txt_location = new javax.swing.JTextField();
        btn_cancel = new javax.swing.JButton();
        btn_apply = new javax.swing.JButton();
        chcbox_status = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("DESCRIPTION");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel2.setText("CATEGORY");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setText("SERIAL NUMBER");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel4.setText("PURCHASE DATE");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel5.setText("PRICE");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setText("LOCATION");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setText("STATUS");

        txt_description.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        txt_serialNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        cbox_category.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cbox_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buildings", "Land", "Electronics", "Office Furniture", "Vehicles" }));

        spinner_date.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        spinner_date.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(946677600000L), new java.util.Date(2553454800000L), java.util.Calendar.ERA));

        txt_price.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        txt_location.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        btn_cancel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_apply.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btn_apply.setText("APPLY");
        btn_apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_applyActionPerformed(evt);
            }
        });

        chcbox_status.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        chcbox_status.setText("ACTIVE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_description)
                            .addComponent(txt_serialNumber)
                            .addComponent(cbox_category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinner_date, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txt_price)
                            .addComponent(txt_location)
                            .addComponent(chcbox_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btn_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_description, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbox_category, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_serialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinner_date, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_price, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_location, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(chcbox_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_apply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed
    
    // check empty fields
    private boolean isEmptyField(){
        boolean textFields = false;
        for(JTextField test : this.textFields) {
            textFields = test.getText().trim().isEmpty();
        }
        return textFields;
    }
    // get description
    private String getDescriptionString(){
        return txt_description.getText();
    }
    
    // get category
    private String getCategoryString(){
        return cbox_category.getSelectedItem().toString();
    }
    
    // get serial number
    private String getSerialNumber(){
        return txt_serialNumber.getText();
    }
    
    // get purchase date
    private String getPurchaseDate(){
        return spinner_date.getValue().toString();
    }
    
    // get price with regex
    private String getPriceString(){
        boolean matches = false;
        Pattern pattern = Pattern.compile("^[0-9]+");
        Matcher matcher = pattern.matcher(txt_price.getText());
        if(matcher.matches()) {
            matches = true;
        } else {
            while(!matcher.matches()) {
                String input = JOptionPane.showInputDialog(rootPane, "Invalid Value! Please enter integers!", "WARNING", JOptionPane.WARNING_MESSAGE);
                if (input == null) {
                    matches = false;
                } else {
                    matcher = pattern.matcher(input);
                    txt_price.setText(matcher.group());
                    matches = true;
                }
            }
        }
        if(matches) {
            return txt_price.getText();
        } else {
            return "";
        }
    }
    
    // get location
    private String getLocationString(){
        return txt_location.getText();
    }
    
    // get status
    private String getStatusString(){
        if(chcbox_status.isSelected()) {
            return "Active";
        }
        else {
            return "Inactive";
        }
    }
    private void btn_applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_applyActionPerformed
        if(isEmptyField() || getPriceString().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please fill the empty areas!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else {
//            DefaultTableModel model = (DefaultTableModel) new Page_Home().get_tbl().getModel();
            new DatabaseManager().addAssets(new FixedAssets(getDescriptionString(), getCategoryString(), getSerialNumber(), getPurchaseDate(), getPriceString(), getLocationString(), getStatusString()));
            JOptionPane.showMessageDialog(rootPane, getDescriptionString() + " is added to assets.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
//            model.fireTableDataChanged();
            new Page_Home(DatabaseManager.loggedPerson).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_applyActionPerformed

    
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
    private javax.swing.JCheckBox chcbox_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner spinner_date;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_location;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_serialNumber;
    // End of variables declaration//GEN-END:variables

}
