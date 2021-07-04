package yilanoyunu;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.*;

public class girisframe extends javax.swing.JFrame {
    public girisframe() {
        initComponents();
        ortadabasla();
    }
    public static String kadi;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Lkullaniciadi = new javax.swing.JLabel();
        Textadi = new javax.swing.JTextField();
        Boyna = new javax.swing.JButton();
        Bskor = new javax.swing.JButton();
        Boynanis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lkullaniciadi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lkullaniciadi.setText("Kullanıcı Adı:");

        Textadi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Textadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextadiActionPerformed(evt);
            }
        });

        Boyna.setText("OYNA");
        Boyna.setFocusable(false);
        Boyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoynaActionPerformed(evt);
            }
        });

        Bskor.setText("SKOR TABLOSU");
        Bskor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BskorActionPerformed(evt);
            }
        });

        Boynanis.setText("OYNANIŞ/HAKKIMIZDA");
        Boynanis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoynanisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("YILAN OYUNU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boyna, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lkullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Textadi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(213, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bskor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boynanis, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lkullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boyna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bskor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boynanis)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   Skorframe skorframe = new Skorframe();
   Oynanisframe oynanisframe = new Oynanisframe();
   Anaframe anaframe =  new Anaframe();
   public void ortadabasla() {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
    int y = (int) ((dimension.getHeight() -getHeight()) / 2);
    setLocation(x, y);
    }
    private void BskorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BskorActionPerformed
            skorframe.setVisible(true);
    }//GEN-LAST:event_BskorActionPerformed

    private void BoynanisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoynanisActionPerformed
            oynanisframe.setVisible(true);
    }//GEN-LAST:event_BoynanisActionPerformed

    private void BoynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoynaActionPerformed
        anaframe.kullaniciAdi.setText(Textadi.getText());
        anaframe.setVisible(true);
        
    }//GEN-LAST:event_BoynaActionPerformed

    private void TextadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextadiActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(girisframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new girisframe().setVisible(true);
               
            }
        });
        File skortablosu=new File("Skortablosu.txt");
        try {
            FileWriter yazici = new FileWriter(skortablosu, true);
            PrintWriter p = null;
            if (skortablosu.exists()) {
                skortablosu.createNewFile();
                p=new PrintWriter(new FileOutputStream(skortablosu,true));
                p.println();
            }
        }
            catch(Exception e){}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boyna;
    private javax.swing.JButton Boynanis;
    private javax.swing.JButton Bskor;
    private javax.swing.JLabel Lkullaniciadi;
    public javax.swing.JTextField Textadi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
