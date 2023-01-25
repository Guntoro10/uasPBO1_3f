/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiPenjualan;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUSA416J
 */
public class PaymentForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form PaymentForm
     */
    public PaymentForm() {
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

        radioButton = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderNameTxt = new javax.swing.JTextField();
        priceLandTxt = new javax.swing.JTextField();
        areaCombobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t36Radiobutton = new javax.swing.JRadioButton();
        t45radiobutton = new javax.swing.JRadioButton();
        t54radiobutton = new javax.swing.JRadioButton();
        buildingpriceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        largeLandTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        availableLandTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalPriceTxt = new javax.swing.JTextField();
        DPTxt = new javax.swing.JTextField();
        installmentAmountTxt = new javax.swing.JTextField();
        ppnTxt = new javax.swing.JTextField();
        installmentMountTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        agreementCbx = new javax.swing.JCheckBox();
        prosesButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        delelteButton = new javax.swing.JButton();
        toMenuButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.MatteBorder(null));
        setTitle("FORM PENJUALAN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama Pemesan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 29, 148, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Harga Tanah");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 71, 148, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Area");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 111, 148, -1));
        getContentPane().add(orderNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 26, 226, -1));

        priceLandTxt.setEditable(false);
        priceLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(priceLandTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 68, 226, -1));

        areaCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- PILIH ---", "BUGENVILE", "MELATI", "FLAMBOYAN" }));
        areaCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(areaCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 108, 226, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AplikasiPenjualan/rumah.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 143, 239, 179));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga Bangunan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 29, 160, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipe Rumah");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 71, 160, -1));

        radioButton.add(t36Radiobutton);
        t36Radiobutton.setText("Tipe - 36");
        t36Radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t36RadiobuttonActionPerformed(evt);
            }
        });
        getContentPane().add(t36Radiobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 107, -1, -1));

        radioButton.add(t45radiobutton);
        t45radiobutton.setText("Tipe - 45");
        t45radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t45radiobuttonActionPerformed(evt);
            }
        });
        getContentPane().add(t45radiobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 151, -1, -1));

        radioButton.add(t54radiobutton);
        t54radiobutton.setText("Tipe - 54");
        t54radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t54radiobuttonActionPerformed(evt);
            }
        });
        getContentPane().add(t54radiobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 198, -1, -1));

        buildingpriceTxt.setEditable(false);
        buildingpriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(buildingpriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 26, 203, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Luas Tanah Asli");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 71, 203, -1));

        largeLandTxt.setEditable(false);
        largeLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(largeLandTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 108, 203, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Luas Tanah Tersedia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 155, 203, -1));

        availableLandTxt.setEditable(false);
        availableLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(availableLandTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 199, 203, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Harga");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 254, 160, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DP");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 296, 160, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Lama Cicilan");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 328, 160, -1));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PPn (10%)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 370, 160, -1));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cicilan/Bulan");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 415, 160, -1));

        totalPriceTxt.setEditable(false);
        totalPriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(totalPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 248, 209, -1));

        DPTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(DPTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 290, 211, -1));

        installmentAmountTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(installmentAmountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 325, 205, -1));

        ppnTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(ppnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 367, 205, -1));

        installmentMountTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(installmentMountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 412, 206, -1));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bulan");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 328, 49, -1));

        agreementCbx.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        agreementCbx.setText("Setuju");
        agreementCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreementCbxActionPerformed(evt);
            }
        });
        getContentPane().add(agreementCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 411, -1, -1));

        prosesButton.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        prosesButton.setText("PROSES");
        prosesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(prosesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 458, -1, 38));

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 458, 97, 38));

        delelteButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        delelteButton.setText("DELETE");
        delelteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delelteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(delelteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 458, -1, 38));

        toMenuButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        toMenuButton.setText("BACK");
        toMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(toMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 463, 118, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Splashscreen/imge/2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 930, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 550, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaComboboxActionPerformed
        switch(areaCombobox.getSelectedIndex()){
            case 0:
                priceLandTxt.setText("");
                buildingpriceTxt.setText("");
                radioButton.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                installmentAmountTxt.setText("");
                installmentMountTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
                
            case 1:
                priceLandTxt.setText("700000");
                buildingpriceTxt.setText("100000000");
                radioButton.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                installmentAmountTxt.setText("");
                installmentMountTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
                
            case 2:
                priceLandTxt.setText("1400000");
                buildingpriceTxt.setText("1200000000");
                radioButton.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                installmentAmountTxt.setText("");
                installmentMountTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
                
            case 3:
                priceLandTxt.setText("2100000");
                buildingpriceTxt.setText("15500000000");
                radioButton.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                installmentAmountTxt.setText("");
                installmentMountTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
        }
    }//GEN-LAST:event_areaComboboxActionPerformed

    private void t36RadiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t36RadiobuttonActionPerformed
        if(areaCombobox.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null,"Pilih are terlebih dahulu");
        radioButton.clearSelection();
    }else{
            largeLandTxt.setText("90");
            availableLandTxt.setText("54");
            long landPrice = Long.parseLong(priceLandTxt.getText()),
            buildingPrice = Long.parseLong(buildingpriceTxt.getText()),
            availableLand = Long.parseLong(availableLandTxt.getText()),
                    totalPrice;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            totalPriceTxt.setText("" + totalPrice);
            installmentAmountTxt.setText("");
            DPTxt.setText("");
            ppnTxt.setText("");
            installmentMountTxt.setText("");
        }
    }//GEN-LAST:event_t36RadiobuttonActionPerformed

    private void t45radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t45radiobuttonActionPerformed
        if(areaCombobox.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null,"Pilih are terlebih dahulu");
        radioButton.clearSelection();
    }else{
            largeLandTxt.setText("120");
            availableLandTxt.setText("75");
            long landPrice = Long.parseLong(priceLandTxt.getText()),
            buildingPrice = Long.parseLong(buildingpriceTxt.getText()),
            availableLand = Long.parseLong(availableLandTxt.getText()),
                    totalPrice;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            totalPriceTxt.setText("" + totalPrice);
            installmentAmountTxt.setText("");
            DPTxt.setText("");
            ppnTxt.setText("");
            installmentMountTxt.setText("");
        }
    }//GEN-LAST:event_t45radiobuttonActionPerformed

    private void t54radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t54radiobuttonActionPerformed
        if(areaCombobox.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null,"Pilih Area Terlebih Dahulu");
        radioButton.clearSelection();
    }else{
            largeLandTxt.setText("140");
            availableLandTxt.setText("86");
            long landPrice = Long.parseLong(priceLandTxt.getText()),
            buildingPrice = Long.parseLong(buildingpriceTxt.getText()),
            availableLand = Long.parseLong(availableLandTxt.getText()),
                    totalPrice;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            totalPriceTxt.setText("" + totalPrice);
            installmentAmountTxt.setText("");
            DPTxt.setText("");
            ppnTxt.setText("");
            installmentMountTxt.setText("");
        }
    }//GEN-LAST:event_t54radiobuttonActionPerformed

    private void delelteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delelteButtonActionPerformed
        orderNameTxt.setText("");
        priceLandTxt.setText("");
        buildingpriceTxt.setText("");
        largeLandTxt.setText("");
        availableLandTxt.setText("");
        totalPriceTxt.setText("");
        DPTxt.setText("");
        installmentAmountTxt.setText("");
        installmentMountTxt.setText("");
        ppnTxt.setText("");
        areaCombobox.setSelectedIndex(0);
        radioButton.clearSelection();
        agreementCbx.setSelected(false);
    }//GEN-LAST:event_delelteButtonActionPerformed

    private void prosesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesButtonActionPerformed
        if(totalPriceTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Pilihan Belum Lengkap");
        }else if(DPTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"DP Harus Diisi");
        }else if (installmentAmountTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Isi Jumlah Cicilan yang di inginkan");
        }else {
            long landPrice = Long.parseLong(priceLandTxt.getText()),
            buildingPrice = Long.parseLong(buildingpriceTxt.getText()),
            availableLand = Long.parseLong(availableLandTxt.getText()),
                    dp = Long.parseLong(DPTxt.getText()),
                    installmentAmount = Long.parseLong(installmentAmountTxt.getText()),
                    totalPrice, ppn, installmentMount;
            totalPrice = (availableLand * landPrice) + buildingPrice;
            ppn = totalPrice * 10 / 100;
            installmentMount = (totalPrice + ppn) / installmentAmount;
            ppnTxt.setText("" + ppn);
            installmentMountTxt.setText("" + installmentMount);
        }
    }//GEN-LAST:event_prosesButtonActionPerformed

    private void agreementCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreementCbxActionPerformed
        if(orderNameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Pemesan Harus Diisi");
            agreementCbx.setSelected(false);
        }else if (ppnTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Tekan Tombol Proses Terlebih Dahulu");
            agreementCbx.setSelected(false);
        }else if(agreementCbx.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Pemesan Menyetujui");
            agreementCbx.setSelected(true);
        }else {
            JOptionPane.showMessageDialog(null, "Pemesan Belum Di Setujui");
            agreementCbx.setSelected(false);
        }
    }//GEN-LAST:event_agreementCbxActionPerformed

    private void toMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMenuButtonActionPerformed
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.setVisible(true);
        this.getDesktopPane().add(optionMenu);
        this.dispose();
    }//GEN-LAST:event_toMenuButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(agreementCbx.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Klik Centang Terlebih Dahulu Untuk Menyimpan Data",
                    "Eror", JOptionPane.ERROR_MESSAGE);
        } else {
            String typeHouse;
            if(t36Radiobutton.isSelected()){
                typeHouse = "TYPE-36";
            } else if(t45radiobutton.isSelected()){
                typeHouse = "TYPE-45";
            } else {
                typeHouse = "TYPE-54";
            }
            
            try{
                String sql = "INSERT INTO rumah (name, area, type, luas, harga, jumlah_cicilan, cicilan_bulan) VALUES ('"
                        + orderNameTxt.getText() + "','"
                        + areaCombobox.getSelectedItem() + "','"
                        + typeHouse + "','"
                        + largeLandTxt.getText() + "','"
                        + totalPriceTxt.getText() + "','"
                        + installmentAmountTxt.getText() + "','"
                        + installmentMountTxt.getText() + "')";
                Connection conn = (Connection)ConnectionDb.connectDatabase();
                PreparedStatement pst = (PreparedStatement)conn.prepareStatement(sql);
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            OptionMenu optionMenu = new OptionMenu();
            optionMenu.setVisible(true);
            this.getDesktopPane().add(optionMenu);
            this.dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DPTxt;
    private javax.swing.JCheckBox agreementCbx;
    private javax.swing.JComboBox<String> areaCombobox;
    private javax.swing.JTextField availableLandTxt;
    private javax.swing.JTextField buildingpriceTxt;
    private javax.swing.JButton delelteButton;
    private javax.swing.JTextField installmentAmountTxt;
    private javax.swing.JTextField installmentMountTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField largeLandTxt;
    private javax.swing.JTextField orderNameTxt;
    private javax.swing.JTextField ppnTxt;
    private javax.swing.JTextField priceLandTxt;
    private javax.swing.JButton prosesButton;
    private javax.swing.ButtonGroup radioButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JRadioButton t36Radiobutton;
    private javax.swing.JRadioButton t45radiobutton;
    private javax.swing.JRadioButton t54radiobutton;
    private javax.swing.JButton toMenuButton;
    private javax.swing.JTextField totalPriceTxt;
    // End of variables declaration//GEN-END:variables
}
