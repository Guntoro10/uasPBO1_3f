/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiPenjualan;

import static AplikasiPenjualan.ConnectionDb.pass;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUSA416J
 */
public final class DataPenjualan extends javax.swing.JInternalFrame {
    /**
     * Creates new form DataPenjualan
     */
    String sql = "select * from rumah";
    public DataPenjualan(){
        initComponents();
        showTable(sql);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        totalHouseTxt = new javax.swing.JTextField();
        totalIncomeTxt = new javax.swing.JTextField();
        toMenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        orderNameTxt = new javax.swing.JTextField();
        areaTxt = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("DATA PENJUALAN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Pesanan", "Nama Pemesan", "Area", "Tipe Rumah", "Luas Tanah", "Harga", "Lama Cicilan", "Cicilan/Bulan"
            }
        ));
        tableData.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tableData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 994, 311));

        totalHouseTxt.setEditable(false);
        totalHouseTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalHouseTxtActionPerformed(evt);
            }
        });
        getContentPane().add(totalHouseTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 389, 193, -1));

        totalIncomeTxt.setEditable(false);
        getContentPane().add(totalIncomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 424, 193, -1));

        toMenuButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        toMenuButton.setText("BACK");
        toMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(toMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel1.setText("Jumlah Rumah Terjual");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 389, 195, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel2.setText("Total Penjualan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 427, 141, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("CARI DATA PEMESAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 345, 203, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("NAMA PEMESAN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 398, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("AREA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 453, -1, -1));
        getContentPane().add(orderNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 392, 225, -1));
        getContentPane().add(areaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 445, 225, -1));

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 389, -1, -1));

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        deleteButton.setText("Reset");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 444, -1, -1));

        printButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        printButton.setText("PRINT");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        getContentPane().add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 110, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Splashscreen/imge/5.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 0, 1060, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMenuButtonActionPerformed
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.setVisible(true);
        this.getDesktopPane().add(optionMenu);
        this.dispose();
    }//GEN-LAST:event_toMenuButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if(orderNameTxt.getText().isEmpty() && areaTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, 
                    "Masukan Data Yang Ingin di cari","Error",
                    JOptionPane.ERROR_MESSAGE);
            showTable(sql);
        } else if(orderNameTxt.getText().isEmpty()){
            showTable("SELECT * FROM rumah WHERE area LIKE '%" 
                    + areaTxt.getText() + "%'");
        } else if(areaTxt.getText().isEmpty()){
            showTable("SELECT * FROM rumah WHERE name LIKE '%" 
                    + orderNameTxt.getText() + "%'");
        } else{
            showTable("SELECT * FROM rumah WHERE name LIKE '%" 
                    + orderNameTxt.getText() + "%' AND area LIKE '%" 
                    + areaTxt.getText() + "%'");
        }
    }//GEN-LAST:event_searchButtonActionPerformed
    
    public void showTable (String sql){
        try {
            Statement stat = (Statement)ConnectionDb.connectDatabase().createStatement();
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tableModel;
            tableModel = (DefaultTableModel)tableData.getModel();
            tableModel.getDataVector().removeAllElements();
            while (rs.next()){
                tableModel.addRow(new Object[]{ 
                    rs.getString(1), rs.getString(2), rs.getString(3), 
                    rs.getString(4),rs.getString(5),rs.getString(6),
                    rs.getString(7), rs.getString(8), 
                });
                long totalIncome = 0;
                int totalHouse;
                totalHouse = rs.getRow();
                for(int i= 0; i < totalHouse; i++){
                    long income = Long.parseLong((String) tableModel.getValueAt(i, 5));
                    totalIncome += income;
                }
                
                totalHouseTxt.setText("" + totalHouse);
                totalIncomeTxt.setText("" + totalIncome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        orderNameTxt.setText("");
        areaTxt.setText("");
        showTable(sql);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void totalHouseTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalHouseTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalHouseTxtActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        String jdbc_driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String url = "jdbc:mysql://localhost:3306/uaskelompok5";
        File reportFile = new File(".");
        String dirr = "";
        
        try {
            Class.forName(jdbc_driver);
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stat = conn.createStatement();
            dirr = reportFile.getCanonicalPath() + "/src/LaporanPenjualan/";
            JasperDesign design = JRXmlLoader.load(dirr + "report.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(design);
            ResultSet rs = stat.executeQuery(sql);
            JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap() {}, rsDataSource);
            JasperViewer.viewReport(jp);
        } catch (ClassNotFoundException | SQLException | IOException | 
                JRException ex) {
            JOptionPane.showMessageDialog(null, "\nGagal Mencetak\n" + ex, 
                    "kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_printButtonActionPerformed

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaTxt;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orderNameTxt;
    private javax.swing.JButton printButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable tableData;
    private javax.swing.JButton toMenuButton;
    private javax.swing.JTextField totalHouseTxt;
    private javax.swing.JTextField totalIncomeTxt;
    // End of variables declaration//GEN-END:variables


}
