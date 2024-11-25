
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class KonversiSuhuView extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhuView
     */
    public KonversiSuhuView() {
        initComponents();
        
        
        
        setResizable(false); // Mengunci ukuran jendela agar tidak dapat diubah
        
        ButtonGroup buttonGroup = new ButtonGroup();
buttonGroup.add(RBCelcius);
buttonGroup.add(RBFahreinheit);
buttonGroup.add(RBReamur);
buttonGroup.add(RBKelvin);

        
       // Membatasi input hanya untuk angka dan satu titik desimal
        txtInput.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                // Hanya menerima angka dan satu titik desimal
                if (!Character.isDigit(c) && c != '.' || (c == '.' && txtInput.getText().contains("."))) {
                    evt.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                // Melakukan konversi otomatis saat input berubah
                if (!txtInput.getText().isEmpty()) {
                    btnKonversiActionPerformed(null);
                }
            }
        });

        // Menambahkan ItemListener pada jRadioButton
        RBCelcius.addItemListener(evt -> konversiAutomatis());
        RBFahreinheit.addItemListener(evt -> konversiAutomatis());
        RBReamur.addItemListener(evt -> konversiAutomatis());
        RBKelvin.addItemListener(evt -> konversiAutomatis());
    }

    private void konversiAutomatis() {
        // Memanggil aksi konversi otomatis ketika radio button dipilih
        if (!txtInput.getText().isEmpty()) {
            btnKonversiActionPerformed(null);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblInput = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        btnKonversi = new javax.swing.JButton();
        RBCelcius = new javax.swing.JRadioButton();
        lblHasil = new javax.swing.JLabel();
        RBFahreinheit = new javax.swing.JRadioButton();
        RBReamur = new javax.swing.JRadioButton();
        RBKelvin = new javax.swing.JRadioButton();
        lblKonversi = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jPanel3.setBackground(new java.awt.Color(0, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        lblInput.setFont(new java.awt.Font("Anton", 0, 18)); // NOI18N
        lblInput.setForeground(new java.awt.Color(255, 255, 255));
        lblInput.setText("Input Suhu          :");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        RBCelcius.setForeground(new java.awt.Color(255, 255, 255));
        RBCelcius.setText("Celcius");
        RBCelcius.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RBCelciusItemStateChanged(evt);
            }
        });

        lblHasil.setFont(new java.awt.Font("Anton", 0, 18)); // NOI18N
        lblHasil.setForeground(new java.awt.Color(255, 255, 255));
        lblHasil.setText("Hasil Konversi    :");

        RBFahreinheit.setForeground(new java.awt.Color(255, 255, 255));
        RBFahreinheit.setText("Fahrenheit");

        RBReamur.setForeground(new java.awt.Color(255, 255, 255));
        RBReamur.setText("Reamur");

        RBKelvin.setForeground(new java.awt.Color(255, 255, 255));
        RBKelvin.setText("Kelvin");

        lblKonversi.setFont(new java.awt.Font("Anton", 0, 18)); // NOI18N
        lblKonversi.setForeground(new java.awt.Color(255, 255, 255));
        lblKonversi.setText("Konversi Ke        :");

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInput, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKonversi))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RBKelvin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RBCelcius, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RBReamur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RBFahreinheit, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGap(337, 337, 337))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInput)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKonversi)
                    .addComponent(RBCelcius)
                    .addComponent(RBReamur))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBKelvin)
                    .addComponent(RBFahreinheit))
                .addGap(46, 46, 46)
                .addComponent(lblHasil)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKonversi)
                    .addComponent(btnKeluar))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void RBCelciusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RBCelciusItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_RBCelciusItemStateChanged

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        // TODO add your handling code here:
        try {
            // Periksa apakah input kosong
            if (txtInput.getText().isEmpty()) {
                lblHasil.setText("Masukkan suhu terlebih dahulu!");
                return;
            }

            // Membaca nilai input
            double inputSuhu = Double.parseDouble(txtInput.getText());
            String satuanAwal = (String) ComboBox.getSelectedItem();
            String hasilKonversi = "";

            // Menentukan konversi berdasarkan radio button yang dipilih
            if (RBCelcius.isSelected()) {
                hasilKonversi = konversiKeCelcius(inputSuhu, satuanAwal);
            } else if (RBFahreinheit.isSelected()) {
                hasilKonversi = konversiKeFahrenheit(inputSuhu, satuanAwal);
            } else if (RBReamur.isSelected()) {
                hasilKonversi = konversiKeReamur(inputSuhu, satuanAwal);
            } else if (RBKelvin.isSelected()) {
                hasilKonversi = konversiKeKelvin(inputSuhu, satuanAwal);
            } else {
                hasilKonversi = "Pilih satuan tujuan konversi!";
            }

            // Menampilkan hasil konversi di jLabelHasil
            lblHasil.setText("Hasil Konversi: " + hasilKonversi);
        } catch (NumberFormatException e) {
            lblHasil.setText("Input tidak valid! Masukkan angka.");
        }

    }//GEN-LAST:event_btnKonversiActionPerformed

// Fungsi konversi ke Celcius
private String konversiKeCelcius(double suhu, String satuan) {
    double hasil;
    switch (satuan) {
        case "Fahrenheit":
            hasil = (suhu - 32) * 5/9;
            break;
        case "Reamur":
            hasil = suhu * 5/4;
            break;
        case "Kelvin":
            hasil = suhu - 273.15;
            break;
        default:
            hasil = suhu;
    }
    return String.format("%.2f °C", hasil);
}

// Fungsi konversi ke Fahrenheit
private String konversiKeFahrenheit(double suhu, String satuan) {
    double hasil;
    switch (satuan) {
        case "Celcius":
            hasil = (suhu * 9/5) + 32;
            break;
        case "Reamur":
            hasil = (suhu * 9/4) + 32;
            break;
        case "Kelvin":
            hasil = (suhu - 273.15) * 9/5 + 32;
            break;
        default:
            hasil = suhu;
    }
    return String.format("%.2f °F", hasil);
}

// Fungsi konversi ke Reamur
private String konversiKeReamur(double suhu, String satuan) {
    double hasil;
    switch (satuan) {
        case "Celcius":
            hasil = suhu * 4/5;
            break;
        case "Fahrenheit":
            hasil = (suhu - 32) * 4/9;
            break;
        case "Kelvin":
            hasil = (suhu - 273.15) * 4/5;
            break;
        default:
            hasil = suhu;
    }
    return String.format("%.2f °Re", hasil);
}

// Fungsi konversi ke Kelvin
private String konversiKeKelvin(double suhu, String satuan) {
    double hasil;
    switch (satuan) {
        case "Celcius":
            hasil = suhu + 273.15;
            break;
        case "Fahrenheit":
            hasil = (suhu - 32) * 5/9 + 273.15;
            break;
        case "Reamur":
            hasil = suhu * 5/4 + 273.15;
            break;
        default:
            hasil = suhu;
    }
    return String.format("%.2f K", hasil);
}
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
            java.util.logging.Logger.getLogger(KonversiSuhuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JRadioButton RBCelcius;
    private javax.swing.JRadioButton RBFahreinheit;
    private javax.swing.JRadioButton RBKelvin;
    private javax.swing.JRadioButton RBReamur;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKonversi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblKonversi;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
