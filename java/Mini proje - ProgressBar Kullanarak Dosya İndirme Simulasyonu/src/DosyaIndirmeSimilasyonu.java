
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Veyse
 */
public class DosyaIndirmeSimilasyonu extends javax.swing.JFrame {
private int say;
    /**
     * Creates new form DosyaIndirmeSimilasyonu
     */
    public DosyaIndirmeSimilasyonu() {
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

        dosya_alani = new javax.swing.JButton();
        check_progress_bar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dosya İndime Similasyonu");

        dosya_alani.setText("Dosya İndir");
        dosya_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosya_alaniActionPerformed(evt);
            }
        });

        check_progress_bar.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(check_progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(dosya_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(check_progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(dosya_alani)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosya_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosya_alaniActionPerformed
        Timer timer = new Timer(30, null);  //bir timer olusturuyoruz 
        
        timer.addActionListener(new ActionListener() { //null yerine normalde action listener geliyor ancak baslangicta null olarak baslar 
            @Override
            public void actionPerformed(ActionEvent e) {
                say ++;
                
                check_progress_bar.setValue(say); //progress bardaki degeri alicak 
                
                if(check_progress_bar.getValue() == 100){  
            //   JOptionPane.showMessageDialog(DosyaIndirmeSimilasyonu.this," Dosya indirme islemi tamamlandi ");
                timer.stop();      // bu sekilde timer i kapatiriz bu yuzden ancak program tamamen kapand-madgi icin 
                setVisible(false); //dosyayi indire tikladigimiz da frame'i kapatir

                SonucSayfasi sonucsayfasi=new SonucSayfasi(); //sonuc sayfasın clasındaki frame'i alicaz

                sonucsayfasi.setVisible(true); //sonuc sayfasındaki frame i alcak 
               
                
                
            //    System.exit(0);    // System.exit(0) metodunu kullnacagiz.
                }
            }
        });
    
        
        timer.start();  
      
   
    }//GEN-LAST:event_dosya_alaniActionPerformed

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
            java.util.logging.Logger.getLogger(DosyaIndirmeSimilasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DosyaIndirmeSimilasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DosyaIndirmeSimilasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DosyaIndirmeSimilasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DosyaIndirmeSimilasyonu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar check_progress_bar;
    private javax.swing.JButton dosya_alani;
    // End of variables declaration//GEN-END:variables
}
