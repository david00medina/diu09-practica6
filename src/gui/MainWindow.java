/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Entrar
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        redMinValue = new javax.swing.JTextField();
        greenMinValue = new javax.swing.JTextField();
        blueMinValue = new javax.swing.JTextField();
        imageButton = new javax.swing.JButton();
        scrollPane = new gui.ScrollPane();
        redMeanValue = new javax.swing.JTextField();
        redMaxValue = new javax.swing.JTextField();
        greenMeanValue = new javax.swing.JTextField();
        greenMaxValue = new javax.swing.JTextField();
        blueMaxValue = new javax.swing.JTextField();
        blueMeanValue = new javax.swing.JTextField();
        redLabel = new javax.swing.JLabel();
        redMinLabel = new javax.swing.JLabel();
        redMaxLabel = new javax.swing.JLabel();
        redMeanLabel = new javax.swing.JLabel();
        greenLabel = new javax.swing.JLabel();
        greenMinLabel = new javax.swing.JLabel();
        greenMaxLabel = new javax.swing.JLabel();
        greenMeanLabel = new javax.swing.JLabel();
        blueLabel = new javax.swing.JLabel();
        blueMinLabel = new javax.swing.JLabel();
        blueMaxLabel = new javax.swing.JLabel();
        blueMeanLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Stats");

        redMinValue.setEditable(false);
        redMinValue.setEnabled(false);
        redMinValue.setName("redMinValue"); // NOI18N

        greenMinValue.setEditable(false);
        greenMinValue.setEnabled(false);
        greenMinValue.setName("greenMinValue"); // NOI18N

        blueMinValue.setEditable(false);
        blueMinValue.setEnabled(false);
        blueMinValue.setName("blueMinValue"); // NOI18N

        imageButton.setText("Select picture");
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });

        redMeanValue.setEditable(false);
        redMeanValue.setEnabled(false);
        redMeanValue.setName("redMeanValue"); // NOI18N

        redMaxValue.setEditable(false);
        redMaxValue.setEnabled(false);
        redMaxValue.setName("redMaxValue"); // NOI18N

        greenMeanValue.setEditable(false);
        greenMeanValue.setEnabled(false);
        greenMeanValue.setName("greenMeanValue"); // NOI18N

        greenMaxValue.setEditable(false);
        greenMaxValue.setEnabled(false);
        greenMaxValue.setName("greenMaxValue"); // NOI18N

        blueMaxValue.setEditable(false);
        blueMaxValue.setEnabled(false);
        blueMaxValue.setName("blueMaxValue"); // NOI18N

        blueMeanValue.setEditable(false);
        blueMeanValue.setEnabled(false);
        blueMeanValue.setName("blueMeanValue"); // NOI18N

        redLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        redLabel.setText("Red : ");

        redMinLabel.setText("Min");

        redMaxLabel.setText("Max");

        redMeanLabel.setText("Avarage");

        greenLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        greenLabel.setText("Green : ");

        greenMinLabel.setText("Min");

        greenMaxLabel.setText("Max");

        greenMeanLabel.setText("Avarage");

        blueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        blueLabel.setText("Blue : ");

        blueMinLabel.setText("Min");

        blueMaxLabel.setText("Max");

        blueMeanLabel.setText("Avarage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(redLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(greenLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(blueLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(redMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redMinLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(redMaxLabel)
                                    .addComponent(redMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(redMeanLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(greenMeanLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(redMeanValue, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(greenMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(greenMinLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(greenMaxLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(greenMaxValue)
                                        .addGap(24, 24, 24)
                                        .addComponent(greenMeanValue))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(blueMinLabel)
                                    .addComponent(blueMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(blueMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueMaxLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(blueMeanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(blueMeanValue))))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imageButton)
                        .addGap(70, 70, 70)))
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(redLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redMinLabel)
                    .addComponent(redMaxLabel)
                    .addComponent(redMeanLabel))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redMeanValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(greenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greenMinLabel)
                    .addComponent(greenMaxLabel)
                    .addComponent(greenMeanLabel))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greenMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenMeanValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(blueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueMinLabel)
                    .addComponent(blueMeanLabel)
                    .addComponent(blueMaxLabel))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueMeanValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(imageButton)
                .addGap(32, 32, 32))
        );

        scrollPane.setMain(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButtonActionPerformed
        JFileChooser fc = new JFileChooser(System.getProperty("user.home"));
        
        setFilter(fc);
        
        int res = fc.showOpenDialog(null);
        
        if(res == JFileChooser.APPROVE_OPTION) {
            ImagePanel imagePanel = new ImagePanel();
            if(imagePanel.setImage(fc.getSelectedFile()) != ImagePanel.FAILURE) {
                scrollPane.setPanel(imagePanel);
                imagePanel.repaint();
                scrollPane.repaint();
            }
        }
    }//GEN-LAST:event_imageButtonActionPerformed
    
    private void setFilter(JFileChooser fc) {
        FileFilter filter = new FileNameExtensionFilter(
                "JPEG [*.jpg, *.jpeg, *.jpe, *.jfif]", 
                "jpg", 
                "jpeg", 
                "jpe",
                "jfif");
        fc.addChoosableFileFilter(filter);
        filter = new FileNameExtensionFilter(
                "Mapa de bits [*.bmp, *.dib]", 
                "bmp",
                "dib");
        fc.addChoosableFileFilter(filter);
        filter = new FileNameExtensionFilter(
                "GIF [*.gif]", 
                "gif");
        fc.addChoosableFileFilter(filter);
        filter = new FileNameExtensionFilter(
                "TIFF [*.tif, *.tiff]", 
                "tif", 
                "tiff");
        fc.addChoosableFileFilter(filter);
        filter = new FileNameExtensionFilter(
                "PNG [*.png]", 
                "png");
        fc.addChoosableFileFilter(filter);
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueLabel;
    private javax.swing.JLabel blueMaxLabel;
    private javax.swing.JTextField blueMaxValue;
    private javax.swing.JLabel blueMeanLabel;
    private javax.swing.JTextField blueMeanValue;
    private javax.swing.JLabel blueMinLabel;
    private javax.swing.JTextField blueMinValue;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JLabel greenMaxLabel;
    private javax.swing.JTextField greenMaxValue;
    private javax.swing.JLabel greenMeanLabel;
    private javax.swing.JTextField greenMeanValue;
    private javax.swing.JLabel greenMinLabel;
    private javax.swing.JTextField greenMinValue;
    private javax.swing.JButton imageButton;
    private javax.swing.JLabel redLabel;
    private javax.swing.JLabel redMaxLabel;
    private javax.swing.JTextField redMaxValue;
    private javax.swing.JLabel redMeanLabel;
    private javax.swing.JTextField redMeanValue;
    private javax.swing.JLabel redMinLabel;
    private javax.swing.JTextField redMinValue;
    private gui.ScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
