
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Page_Register extends javax.swing.JFrame {

    public Page_Register() {
        initComponents();
        textFields.add(txt_name);
        textFields.add(txt_surname);
        textFields.add(txt_phone);
        textFields.add(txt_mail);
        textFields.add(txt_password);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroup_gender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        btn_register = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_agreement = new javax.swing.JCheckBox();
        lbl_termsOfService = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        lbl_position = new javax.swing.JLabel();
        cbox_position = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FARS - REGISTER");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("NAME");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel2.setText("SURNAME");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setText("PHONE");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel4.setText("MAIL");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel5.setText("PASSWORD");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setText("GENDER");

        txt_name.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txt_name.setToolTipText("Please just start with capital letter.");

        txt_surname.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txt_surname.setToolTipText("Please just start with capital letter.");

        txt_phone.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txt_phone.setToolTipText("Please just enter 10 numbers.");

        txt_mail.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        bgroup_gender.add(rbtn_male);
        rbtn_male.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        rbtn_male.setText("MALE");

        bgroup_gender.add(rbtn_female);
        rbtn_female.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        rbtn_female.setText("FEMALE");

        btn_register.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        btn_register.setText("REGISTER");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_agreement.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btn_agreement.setText("I agree all statements in");
        btn_agreement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agreementActionPerformed(evt);
            }
        });

        lbl_termsOfService.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lbl_termsOfService.setForeground(new java.awt.Color(0, 102, 255));
        lbl_termsOfService.setLabelFor(btn_agreement);
        lbl_termsOfService.setText("Terms of service");
        lbl_termsOfService.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 255)));
        lbl_termsOfService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_termsOfService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_termsOfServiceMouseClicked(evt);
            }
        });

        txt_password.setToolTipText("Please enter a password consisting of at least eight characters.");

        lbl_position.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lbl_position.setText("POSITION");

        cbox_position.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        cbox_position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Manager", "Finance Manager", "Office Manager", "Product Manager", "Project Manager", "Team Leader", "Supervisor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_agreement)
                        .addGap(4, 4, 4)
                        .addComponent(lbl_termsOfService))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_position, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(rbtn_male)
                                    .addGap(50, 50, 50)
                                    .addComponent(rbtn_female))
                                .addComponent(txt_surname, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                .addComponent(txt_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                .addComponent(txt_mail)
                                .addComponent(txt_name)
                                .addComponent(txt_password)
                                .addComponent(cbox_position, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_surname))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_mail, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtn_male)
                        .addComponent(rbtn_female))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_position, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_position, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_termsOfService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agreement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<JTextField> textFields = new ArrayList<>();

    // Check empty fields
    private boolean isEmptyField() {
        boolean checkTextFields = false;
        boolean genderButtons = false;
        boolean termsButton = false;
        for (JTextField text : this.textFields) {
            checkTextFields = text.getText().trim().isEmpty();
        }
        if (!rbtn_female.isSelected() && !rbtn_male.isSelected()) {
            genderButtons = true;
        }
        if (!btn_agreement.isSelected()) {
            termsButton = true;
        }

        if (termsButton || genderButtons || checkTextFields) {
            return true;
        } else {
            return false;
        }
    }

    // checker for text areas that returns true or false
    private boolean checker(String regex, String insideMatcher, String fieldName, JTextField field) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(insideMatcher);

        if (!m.matches()) {
            while (!m.matches()) {
                String input = JOptionPane.showInputDialog(rootPane,
                        "Invalid " + fieldName + "! Please Try Again!",
                        "ERROR",
                        JOptionPane.WARNING_MESSAGE);
                if (input == null) {
                    return false;
                } else {
                    m = p.matcher(input);
                }
            }
            if (m.matches()) {
                System.out.println(fieldName + ": " + m.group());
                field.setText(m.group());
                return true;
            }
        } else {
            System.out.println(fieldName + ": " + m.group());
            return true;
        }
        return false;
    }

    // check name and get name string from text field
    private String getNameString() {
        if (checker("^[A-Z][a-z]+$", txt_name.getText(), "Name", txt_name)) {
            return txt_name.getText();
        } else {
            return "";
        }
    }

    // check surname and get surname from text field
    private String getSurnameString() {
        if (checker("^[A-Z][a-z]+$", txt_surname.getText(), "Surname", txt_surname)) {
            return txt_surname.getText();
        } else {
            return "";
        }
    }

    // check phone and get phone from text field
    private String getPhoneString() {
        if (checker("^[1-9][0-9]{9}$", txt_phone.getText(), "Phone", txt_phone)) {
            return txt_phone.getText();
        } else {
            return "";
        }
    }

    // check and get mail string from text field
    private String getMailString() {
        if (checker("^[a-z][a-z.-_0-9]+@[a-zA-Z-]+(.com|.org|.net)$",
                txt_mail.getText(),
                "Mail",
                txt_mail)) {
            return txt_mail.getText();
        } else {
            return "";
        }
    }

    // check and get password string from text field
    private String getPasswordString() {
        String passwordString = "";
        for (int i = 0; i < txt_password.getPassword().length; i++) {
            passwordString += txt_password.getPassword()[i];
        }
        if (checker("[A-Za-z0-9*_?#&$]{8,}",
                passwordString,
                "Passowrd",
                txt_password)) {
            String password = "";
            for (int i = 0; i < txt_password.getPassword().length; i++) {
                password += txt_password.getPassword()[i];
            }
            return password;
        } else {
            return "";
        }
    }

    // get gender from radiobuttons
    private String getGenderChar() {
        if (rbtn_male.isSelected()) {
            return "Male";
        } else {
            return "Female";
        }
    }

    // get position from combobox
    private String getPositionString() {
        return cbox_position.getSelectedItem().toString();
    }
    
    private boolean isEmptyCheck(){
        if(getNameString().isEmpty() || getSurnameString().isEmpty() || getPhoneString().isEmpty() || getMailString().isEmpty() || getPasswordString().isEmpty()){
            return false;
        } else {
            return true;
        }
    }


    private void lbl_termsOfServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_termsOfServiceMouseClicked
        new SubPage_TermsOfService().setVisible(true);
    }//GEN-LAST:event_lbl_termsOfServiceMouseClicked

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        new Page_Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_agreementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agreementActionPerformed
        if (btn_agreement.isSelected() && !SubPage_TermsOfService.clickedCloseButton) {
            new SubPage_TermsOfService().setVisible(true);
            if (SubPage_TermsOfService.clickedCloseButton) {
                btn_agreement.setSelected(btn_agreement.isSelected());
                SubPage_TermsOfService.clickedCloseButton = false;
            } else {
                btn_agreement.setSelected(false);
            }
        }
    }//GEN-LAST:event_btn_agreementActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        if (isEmptyField()) {
            JOptionPane.showMessageDialog(rootPane, "Please fill the empty areas!", "Empty Areas", JOptionPane.WARNING_MESSAGE);
        } else if(!isEmptyCheck()){
            JOptionPane.showMessageDialog(rootPane, "Invalid Values Please Try Again!");
        } 
        else {
            Person person = new Person(
                    getNameString(),
                    getSurnameString(),
                    getPhoneString(),
                    getMailString(),
                    getPasswordString(),
                    getGenderChar(),
                    getPositionString()
            );
            if (new DatabaseManager().register(person, person.getMail())) {
                JOptionPane.showMessageDialog(rootPane, "Kullanıcı bulunmakta.", "UYARI", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Kullanıcı başarıyla eklendi.", "BİLGİ", JOptionPane.INFORMATION_MESSAGE);
            }
            this.dispose();
            new Page_Login().setVisible(true);
        }
    }//GEN-LAST:event_btn_registerActionPerformed

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
            java.util.logging.Logger.getLogger(Page_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Page_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgroup_gender;
    private javax.swing.JCheckBox btn_agreement;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_register;
    private javax.swing.JComboBox<String> cbox_position;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_position;
    private javax.swing.JLabel lbl_termsOfService;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables

}
