/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.view;




import com.hpe.pass.util.ChartBuilder;
import com.hpe.pass.util.ExportExcel;
import com.hpe.pass.util.LocationUtil;
import com.hpe.pss.biz.ProductSaleBiz;
import com.hpe.pss.biz.ProductSaleImpl;
import com.hpe.pss.biz.SellBiz1;
import com.hpe.pss.biz.SellBizImpl;
import com.hpe.work.po.ProductSale;
import com.hpe.work.po.Sell;
import java.io.File;


import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class SellSearchIFrame extends javax.swing.JInternalFrame {
 public static LocationUtil local;
    /**
     * Creates new form SellSearchIFrame
     */ 
    ProductSaleBiz pbiz1 = new ProductSaleImpl();
    SellBiz1 pbiz = new SellBizImpl();
    public SellSearchIFrame() {
        initComponents();
        local.setScreenCenter(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSell = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnlogin = new javax.swing.JToggleButton();
        txtcondition = new javax.swing.JTextField();
        btnsearch = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTotal = new javax.swing.JTable();
        btnlog = new javax.swing.JButton();
        btnexit1 = new javax.swing.JButton();
        btnchart = new javax.swing.JButton();
        dateStart = new com.hpe.pass.util.DateChooserJButton();
        dateEnd = new com.hpe.pass.util.DateChooserJButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("??????");

        setClosable(true);
        setResizable(true);
        setTitle("????????????");
        setMinimumSize(new java.awt.Dimension(1100, 816));
        setPreferredSize(new java.awt.Dimension(1100, 816));

        tblSell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "????????????", "????????????", "????????????", "????????????", "????????????", "????????????", "????????????", "????????????"
            }
        ));
        jScrollPane1.setViewportView(tblSell);

        jToggleButton1.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        jToggleButton1.setText("????????????");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        btnlogin.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        btnlogin.setText("??????");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        txtcondition.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N

        btnsearch.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        btnsearch.setText("??????");
        btnsearch.setToolTipText("???????????????????????????");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        tblTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "????????????", "????????????", "????????????", "????????????"
            }
        ));
        jScrollPane2.setViewportView(tblTotal);

        btnlog.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        btnlog.setText("??????");
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });

        btnexit1.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        btnexit1.setText("??????");
        btnexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit1ActionPerformed(evt);
            }
        });

        btnchart.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        btnchart.setText("??????");
        btnchart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchartActionPerformed(evt);
            }
        });

        dateStart.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N

        dateEnd.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("??????", 1, 24)); // NOI18N
        jLabel1.setText("???????????????");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(txtcondition, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnsearch)
                .addGap(180, 180, 180))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogin)
                .addGap(26, 26, 26)
                .addComponent(jToggleButton1)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlog)
                .addGap(34, 34, 34)
                .addComponent(btnchart)
                .addGap(27, 27, 27)
                .addComponent(btnexit1)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcondition))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlog)
                    .addComponent(btnchart)
                    .addComponent(btnexit1))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
         List<Sell> list = pbiz.findAll();
         showOnTable(list);
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
          String condition = this.txtcondition.getText().trim();
          String start = this.dateStart.getText();
          String end = this.dateEnd.getText();
          List<Sell> list = pbiz.findByCondition(start,condition,end);
          showOnTable(list);
    }//GEN-LAST:event_btnsearchActionPerformed

    private void datestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datestartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datestartActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    
        List<Sell> sellList =  pbiz.findAll();  
        JFileChooser savefile = new JFileChooser();//?????????????????????
        FileFilter filter = new FileNameExtensionFilter("Excel??????(*.xls)", "xls");
        savefile.addChoosableFileFilter(filter);//???????????????
        savefile.setFileFilter(filter);

        int flag = savefile.showSaveDialog(this);//??????????????????????????????
        File file = null;
        if (flag == JFileChooser.APPROVE_OPTION) {
        //???????????????????????????
        file = savefile.getSelectedFile();//??????????????????????????????????????????
        System.out.println("????????????" + file.getAbsolutePath());
        String filename = file.getAbsolutePath();
        //??????????????????????????????????????????4??????
        String ftype = filename.substring(filename.length()-4);
        if(!ftype.equals(".xls")){
            //?????????????????????????????????????????????????????????.xls
            file = new File(filename+".xls");
        }
        //????????????????????????????????????
        ExportExcel.printSell(sellList, file);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogActionPerformed
            List<ProductSale> list = pbiz1.findTotal();
            showOnTable1(list);
    }//GEN-LAST:event_btnlogActionPerformed

    private void btnexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnexit1ActionPerformed

    private void btnchartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchartActionPerformed
        List<ProductSale> sellList = pbiz1.findTotal();
        String charttitle= "??????????????????";
        String[] proid = {"1","2","3","4","5","6","7","8","9","10"};
       
        ChartBuilder chart = new ChartBuilder(charttitle,sellList,"ProductSale");
        chart.pack();
        chart.setVisible(true);
       
    }//GEN-LAST:event_btnchartActionPerformed
    private void showOnTable1(List<ProductSale> list) {
        DefaultTableModel dtm = (DefaultTableModel) this.tblTotal.getModel();
        //2.??????????????????
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
            //3.????????????
            for(ProductSale p:list){
                Vector vt = new Vector();
                vt.add(p.getSelid());
                vt.add(p.getProname());
                vt.add(p.getTotalcount());
                vt.add(p.getTotalprice());
             
                dtm.addRow(vt);
                
            }
    }
    private void showOnTable(List<Sell> list) {
        DefaultTableModel dtm = (DefaultTableModel) this.tblSell.getModel();
        //2.??????????????????
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
            //3.????????????
            for(Sell p:list){
                Vector vt = new Vector();
                vt.add(p.getSelid());
                vt.add(p.getProid());
                vt.add(p.getProname());
                vt.add(p.getSeldate());
                vt.add(p.getSelcount());
                vt.add(p.getSelprice());
                vt.add(p.getTotals());
                vt.add(p.getCusname());
                dtm.addRow(vt);
                
            }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchart;
    private javax.swing.JButton btnexit1;
    private javax.swing.JButton btnlog;
    private javax.swing.JToggleButton btnlogin;
    private javax.swing.JToggleButton btnsearch;
    private com.hpe.pass.util.DateChooserJButton dateEnd;
    private com.hpe.pass.util.DateChooserJButton dateStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblSell;
    private javax.swing.JTable tblTotal;
    private javax.swing.JTextField txtcondition;
    // End of variables declaration//GEN-END:variables
}
