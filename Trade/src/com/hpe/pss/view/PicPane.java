/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author lenovo
 */
public class PicPane extends javax.swing.JPanel {
 private Image img;
    /**
     * Creates new form PicPane
     */
    public PicPane() {
        initComponents();
        this.setImgURL(this.getClass().getResource("/com/hpe/pass/img/imgs/百里挑一.jpg"));
    }
public void setImgURL(URL imgURL){
    img = Toolkit.getDefaultToolkit().createImage(imgURL);
}
public void paintComponent(Graphics g ){
    if(this.img == null) return;
    g.drawImage(img,0,0,this.getParent().getWidth(),
            this.getParent().getHeight(),this);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
