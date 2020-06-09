package UI;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import java.text.*;

public class stok_masuk extends javax.swing.JFrame {
    private Connection conn=new koneksi().GetConnection();
    
    
    public stok_masuk() {
        initComponents();
        r30kg.setSelected(true);
    }

    protected void aktif(){
        tukuran.setEnabled(true);
        tjumlahdus.setEnabled(true);
    }
            
     protected void kosong(){
         cbnamabarang.setSelectedIndex(0);
         r30kg.setSelected(true);
         tukuran.setText("");
         tidbarang.setText("");
         tjumlahdus.setText("");


     }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgberat = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbnamabarang = new javax.swing.JComboBox<>();
        r30kg = new javax.swing.JRadioButton();
        r10kg = new javax.swing.JRadioButton();
        tjumlahdus = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bbersihkan = new javax.swing.JButton();
        bmenu = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        tukuran = new javax.swing.JTextField();
        bautofill = new javax.swing.JButton();
        ctglmasuk = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        tidbarang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Form Stok Masuk");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setText("Pastikan Data Yang Anda Masukan Benar");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Ukuran");

        jLabel5.setText("Berat (Kg per Dus)");

        jLabel6.setText("Tanggal Masuk");

        jLabel7.setText("Jumlah (Dus)");

        cbnamabarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paku 2 inch", "Paku 3 inch", "Paku 4 inch", "Paku 5 inch" }));

        bgberat.add(r30kg);
        r30kg.setText("30 Kg");

        bgberat.add(r10kg);
        r10kg.setText("10 Kg");

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bbersihkan.setText("Bersihkan");
        bbersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbersihkanActionPerformed(evt);
            }
        });

        bmenu.setText("Menu Utama");
        bmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmenuActionPerformed(evt);
            }
        });

        bkeluar.setText("Keluar");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        bautofill.setText("ISI OTOMATIS");
        bautofill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautofillActionPerformed(evt);
            }
        });

        ctglmasuk.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ctglmasukPropertyChange(evt);
            }
        });

        jLabel8.setText("ID Barang");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(139, 139, 139)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tukuran, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tjumlahdus, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(bbersihkan)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(r30kg)
                                .addGap(60, 60, 60)
                                .addComponent(r10kg))
                            .addComponent(cbnamabarang, javax.swing.GroupLayout.Alignment.LEADING, 0, 204, Short.MAX_VALUE)
                            .addComponent(bautofill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tidbarang))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(r30kg)
                            .addComponent(r10kg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bautofill)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(tidbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tukuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(ctglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(tjumlahdus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmenu)
                    .addComponent(bbersihkan)
                    .addComponent(bsimpan))
                .addGap(30, 30, 30)
                .addComponent(bkeluar)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
     this.dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmenuActionPerformed
        this.dispose();
        new menu().setVisible(true);
    }//GEN-LAST:event_bmenuActionPerformed

    private void bautofillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautofillActionPerformed
         String barang = cbnamabarang.getSelectedItem().toString();   
         String berat="";
         if(r30kg.isSelected()) berat="30";
         else berat="10";
         String sql = "select id_barang, ukuran from barang where nama_barang='"+barang+"' && berat='"+berat+"'";   
         try{
             
            java.sql.Statement stat=conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
              tidbarang.setText(hasil.getString("id_barang"));
              tukuran.setText(hasil.getString("ukuran"));
            }   
         }catch(Exception e){
         
         }

    }//GEN-LAST:event_bautofillActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        String tgl = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tgl);
        String tanggal = String.valueOf(fm.format(ctglmasuk.getDate()));
        try{
            String berat="";
                if(r30kg.isSelected()) berat="30";
                else berat="10";
            
            String sql="insert into barang_masuk (id_barang,nama_barang,berat,ukuran,tgl_masuk,jumlah)"
                +"values"+"('"+tidbarang.getText()+"','"+cbnamabarang.getSelectedItem().toString()+"','"+berat+"',"
                + "'"+tukuran.getText()+"','"+tanggal+"','"+tjumlahdus.getText()+"' )";
            
            PreparedStatement stat=conn.prepareStatement(sql);
            stat.executeUpdate();
            
            String sql2="UPDATE barang set jumlah=jumlah + '"+tjumlahdus.getText()+"' where id_barang='"+tidbarang.getText()+"'";
            PreparedStatement stat2= conn.prepareStatement(sql2);
            stat2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data BERHASIL disimpan");
            
            kosong();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data GAGAL disimpan");
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void ctglmasukPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ctglmasukPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_ctglmasukPropertyChange

    private void bbersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbersihkanActionPerformed
        kosong();
    }//GEN-LAST:event_bbersihkanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(stok_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stok_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stok_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stok_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stok_masuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bautofill;
    private javax.swing.JButton bbersihkan;
    private javax.swing.ButtonGroup bgberat;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bmenu;
    private javax.swing.JButton bsimpan;
    private javax.swing.JComboBox<String> cbnamabarang;
    private com.toedter.calendar.JDateChooser ctglmasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton r10kg;
    private javax.swing.JRadioButton r30kg;
    private javax.swing.JTextField tidbarang;
    private javax.swing.JTextField tjumlahdus;
    private javax.swing.JTextField tukuran;
    // End of variables declaration//GEN-END:variables
}