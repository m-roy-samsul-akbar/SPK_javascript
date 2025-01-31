/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class updateAlternatif extends javax.swing.JDialog {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlternatif() {
        return alternatif;
    }

    public void setAlternatif(String alternatif) {
        this.alternatif = alternatif;
    }

    public String getIpk() {
        return ipk;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    public String getPengalaman_kerja() {
        return pengalaman_kerja;
    }

    public void setPengalaman_kerja(String pengalaman_kerja) {
        this.pengalaman_kerja = pengalaman_kerja;
    }

    public String getJumlah_bahasa() {
        return jumlah_bahasa;
    }

    public void setJumlah_bahasa(String jumlah_bahasa) {
        this.jumlah_bahasa = jumlah_bahasa;
    }

    public String getJumlah_sertifikat() {
        return jumlah_sertifikat;
    }

    public void setJumlah_sertifikat(String jumlah_sertifikat) {
        this.jumlah_sertifikat = jumlah_sertifikat;
    }

    public String getJumlah_project_terselesaikan() {
        return jumlah_project_terselesaikan;
    }

    /**
     * Creates new form updateAlternatif
     */
    public void setJumlah_project_terselesaikan(String jumlah_project_terselesaikan) {
        this.jumlah_project_terselesaikan = jumlah_project_terselesaikan;
    }

    int id;
    String alternatif;
    String ipk;
    String pengalaman_kerja;
    String jumlah_bahasa;
    String jumlah_sertifikat;
    String jumlah_project_terselesaikan;
    
    public updateAlternatif(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        setTitle("Update Data Alternatif");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        txtNamaAlternatif = new javax.swing.JTextField();
        txtIPK = new javax.swing.JTextField();
        txtPengalamanKerja = new javax.swing.JTextField();
        txtJumlahBahasa = new javax.swing.JTextField();
        txtJumlahSertifikat = new javax.swing.JTextField();
        txtJumlahProjectTerselesaikan = new javax.swing.JTextField();
        btnUpdateAlternatif = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nama alternatif");

        jLabel2.setText("Jumlah Project Terselesaikan");

        jLabel3.setText("IPK");

        jLabel4.setText("Pengalaman Kerja");

        jLabel5.setText("Jumlah Bahasa");

        jLabel6.setText("Jumlah Sertifikat");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("UPDATE DATA ALTERNATIF");

        btnUpdateAlternatif.setText("Update");
        btnUpdateAlternatif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAlternatifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(txtNamaAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(txtIPK, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(txtPengalamanKerja, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(txtJumlahBahasa, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(txtJumlahSertifikat, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(txtJumlahProjectTerselesaikan, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(btnUpdateAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNamaAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtIPK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPengalamanKerja, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtJumlahBahasa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtJumlahSertifikat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtJumlahProjectTerselesaikan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btnUpdateAlternatif, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateAlternatifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAlternatifActionPerformed
        // TODO add your handling code here:
        try {
            
            String alternatif = txtNamaAlternatif.getText();
            String ipk = txtIPK.getText();
            double ipk_ = Double.parseDouble(ipk);
            String pengalaman_kerja = txtPengalamanKerja.getText();
            double pengalaman_kera_ = Double.parseDouble(pengalaman_kerja);
            String jumlah_bahasa = txtJumlahBahasa.getText();
            double jumlah_bahasa_ = Double.parseDouble(jumlah_bahasa);
            String jumlah_sertifikat = txtJumlahSertifikat.getText();
            double jumlah_sertifikat_ = Double.parseDouble(jumlah_sertifikat);
            String jumlah_project_terselesaikan = txtJumlahProjectTerselesaikan.getText();
            double jumlah_project_terselesaikan_ = Double.parseDouble(jumlah_project_terselesaikan);
            String q = "UPDATE alternatif "
                    + "set alternatif='"+alternatif+"', "
                    + "ipk="+ipk_+", "
                    + "pengalaman_kerja="+pengalaman_kera_+","
                    + "jml_bahasa="+jumlah_bahasa_+","
                    + "jml_sertifikat="+jumlah_sertifikat_+","
                    + "jml_project="+jumlah_project_terselesaikan_+" "
                    + "WHERE id="+getId()+"";//query = ready
            Connection koneksi = Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            st.executeUpdate(q);
            Main.loadDataAlternatif();
//            String kriteria_ = txtNamaKriteria.getText();
//            String bobot_ = txtBobot.getText();
//            double d = Double.parseDouble(bobot_);
//            Object label_ = cmbLabel.getSelectedItem();
//            String L = String.valueOf(label_);
//            String q = "UPDATE kriteria "
//                    + "set kriteria='"+kriteria_+"', "
//                    + "bobot="+d+", "
//                    + "label='"+L+"' "
//                    + "WHERE id="+getId()+"";//query = ready
//            Connection koneksi = Koneksi.konekKeDB();
//            Statement st = koneksi.createStatement();
//            st.executeUpdate(q);
//            Main.loadDataKriteria();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUpdateAlternatifActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtNamaAlternatif.setText(getAlternatif());
        txtIPK.setText(getIpk());
        txtPengalamanKerja.setText(getPengalaman_kerja());
        txtJumlahBahasa.setText(getJumlah_bahasa());
        txtJumlahSertifikat.setText(getJumlah_sertifikat());
        txtJumlahProjectTerselesaikan.setText(getJumlah_project_terselesaikan());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(updateAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateAlternatif dialog = new updateAlternatif(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateAlternatif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtIPK;
    private javax.swing.JTextField txtJumlahBahasa;
    private javax.swing.JTextField txtJumlahProjectTerselesaikan;
    private javax.swing.JTextField txtJumlahSertifikat;
    private javax.swing.JTextField txtNamaAlternatif;
    private javax.swing.JTextField txtPengalamanKerja;
    // End of variables declaration//GEN-END:variables
}
