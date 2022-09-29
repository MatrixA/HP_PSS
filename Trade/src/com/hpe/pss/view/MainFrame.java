/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.view;


import com.hpe.pass.util.LocationUtil;
import com.hpe.pass.util.frameUtil;
import com.hpe.work.po.User;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/**
 *
 * @author lenovo
 */
public class MainFrame extends javax.swing.JFrame {

    private Timer mytimer;
   
    public static User user;

    public MainFrame() {
        initComponents();
        txtDate.setText(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
        int delay = 1000; //延时  
        mytimer = new Timer(delay, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());  
                txtTime.setText(t);
            }
        });
        mytimer.start(); 
        if(user.getRole().equals("顾客")){
            this.mnuSell.setEnabled(false);
            this.mnuSearch.setEnabled(false);
            this.mnuPurchase.setEnabled(false);
            this.setTitle("手机进销存管理系统4.0（普通账户）");

        }
        if(user.getRole().equals("供应商")){
            this.mnuPurchase.setEnabled(false);
            this.setTitle("手机进销存管理系统4.0（供应商账户）");
        }
        else{
             this.setTitle("手机进销存管理系统4.0（管理员账户）");
        };
        LocationUtil.setFullScreen(this);
        //将多文档容器设置为主窗体的内容面板
        //this.setContentPane(mainDeskJPanel1);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        btnProduct = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnPurchaseIn = new javax.swing.JButton();
        btnPurchaseOut = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnTradeGather = new javax.swing.JButton();
        btnStockGather = new javax.swing.JButton();
        btnPurchaseGather = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        mainPhonePane1 = new com.hpe.pss.view.mainPhonePane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuManager = new javax.swing.JMenu();
        itemProduct = new javax.swing.JMenuItem();
        itemSupplier = new javax.swing.JMenuItem();
        itemCustomer = new javax.swing.JMenuItem();
        mnuPurchase = new javax.swing.JMenu();
        munpurchaseMan = new javax.swing.JMenuItem();
        munIN = new javax.swing.JMenuItem();
        munOut = new javax.swing.JMenuItem();
        mnuSell = new javax.swing.JMenu();
        mensellsearch = new javax.swing.JMenuItem();
        mensellmanager = new javax.swing.JMenuItem();
        mensellreturn = new javax.swing.JMenuItem();
        mnuSearch = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        munTotal = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar2.setRollover(true);

        btnProduct.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/product.gif"))); // NOI18N
        btnProduct.setToolTipText("商品信息");
        btnProduct.setFocusable(false);
        btnProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductMouseEntered(evt);
            }
        });
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        jToolBar2.add(btnProduct);

        btnSupplier.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N
        btnSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/supplier.gif"))); // NOI18N
        btnSupplier.setToolTipText("供应商信息");
        btnSupplier.setFocusable(false);
        btnSupplier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSupplier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });
        jToolBar2.add(btnSupplier);

        btnCustomer.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N
        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/customer.gif"))); // NOI18N
        btnCustomer.setToolTipText("客户信息");
        btnCustomer.setFocusable(false);
        btnCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        jToolBar2.add(btnCustomer);

        btnPurchaseIn.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N
        btnPurchaseIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/purchase.gif"))); // NOI18N
        btnPurchaseIn.setToolTipText("采购入库");
        btnPurchaseIn.setFocusable(false);
        btnPurchaseIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPurchaseIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPurchaseIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseInActionPerformed(evt);
            }
        });
        jToolBar2.add(btnPurchaseIn);

        btnPurchaseOut.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N
        btnPurchaseOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/retpurchase.gif"))); // NOI18N
        btnPurchaseOut.setToolTipText("采购退货");
        btnPurchaseOut.setFocusable(false);
        btnPurchaseOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPurchaseOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPurchaseOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseOutActionPerformed(evt);
            }
        });
        jToolBar2.add(btnPurchaseOut);

        jButton7.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/sell.gif"))); // NOI18N
        jButton7.setToolTipText("销售管理");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton7);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/suppbusirec.gif"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton1);

        btnTradeGather.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N
        btnTradeGather.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/custbusirec.gif"))); // NOI18N
        btnTradeGather.setToolTipText("客户交易统计");
        btnTradeGather.setFocusable(false);
        btnTradeGather.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTradeGather.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTradeGather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTradeGatherActionPerformed(evt);
            }
        });
        jToolBar2.add(btnTradeGather);

        btnStockGather.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/stockquery.gif"))); // NOI18N
        btnStockGather.setToolTipText("商品统计");
        btnStockGather.setFocusable(false);
        btnStockGather.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStockGather.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStockGather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockGatherActionPerformed(evt);
            }
        });
        jToolBar2.add(btnStockGather);

        btnPurchaseGather.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/purchasegather.gif"))); // NOI18N
        btnPurchaseGather.setToolTipText("采购统计");
        btnPurchaseGather.setFocusable(false);
        btnPurchaseGather.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPurchaseGather.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPurchaseGather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseGatherActionPerformed(evt);
            }
        });
        jToolBar2.add(btnPurchaseGather);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/Recycle.jpg"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("系统时间：");
        jToolBar2.add(jLabel1);

        txtDate.setEditable(false);
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDate.setMargin(new java.awt.Insets(3, 3, 3, 3));
        txtDate.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jToolBar2.add(txtDate);

        txtTime.setEditable(false);
        txtTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTime.setText("                       ");
        txtTime.setMargin(new java.awt.Insets(3, 3, 3, 3));
        txtTime.setVerifyInputWhenFocusTarget(false);
        jToolBar2.add(txtTime);

        getContentPane().add(jToolBar2, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout mainPhonePane1Layout = new javax.swing.GroupLayout(mainPhonePane1);
        mainPhonePane1.setLayout(mainPhonePane1Layout);
        mainPhonePane1Layout.setHorizontalGroup(
            mainPhonePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
        );
        mainPhonePane1Layout.setVerticalGroup(
            mainPhonePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        getContentPane().add(mainPhonePane1, java.awt.BorderLayout.CENTER);

        mnuManager.setText("基本资料管理");
        mnuManager.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N

        itemProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        itemProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/productmnu.gif"))); // NOI18N
        itemProduct.setText("商品管理");
        itemProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductActionPerformed(evt);
            }
        });
        mnuManager.add(itemProduct);

        itemSupplier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/suppliernum.gif"))); // NOI18N
        itemSupplier.setText("供应商管理");
        itemSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSupplierActionPerformed(evt);
            }
        });
        mnuManager.add(itemSupplier);

        itemCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/customermnu.gif"))); // NOI18N
        itemCustomer.setText("客户管理");
        itemCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCustomerActionPerformed(evt);
            }
        });
        mnuManager.add(itemCustomer);

        jMenuBar1.add(mnuManager);

        mnuPurchase.setText("采购管理");
        mnuPurchase.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N

        munpurchaseMan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        munpurchaseMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/purchasedetail.gif"))); // NOI18N
        munpurchaseMan.setText("采购查询");
        munpurchaseMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                munpurchaseManActionPerformed(evt);
            }
        });
        mnuPurchase.add(munpurchaseMan);

        munIN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        munIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/purchasemnu.gif"))); // NOI18N
        munIN.setText("采购入库");
        munIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                munINActionPerformed(evt);
            }
        });
        mnuPurchase.add(munIN);

        munOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        munOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/retpurchasemnu.gif"))); // NOI18N
        munOut.setText("采购退货");
        munOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                munOutActionPerformed(evt);
            }
        });
        mnuPurchase.add(munOut);

        jMenuBar1.add(mnuPurchase);

        mnuSell.setText("销售管理");
        mnuSell.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N

        mensellsearch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mensellsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/salesmanmnu.gif"))); // NOI18N
        mensellsearch.setText("销售查询");
        mensellsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensellsearchActionPerformed(evt);
            }
        });
        mnuSell.add(mensellsearch);

        mensellmanager.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mensellmanager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/retsellmnu.gif"))); // NOI18N
        mensellmanager.setText("销售出库");
        mensellmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensellmanagerActionPerformed(evt);
            }
        });
        mnuSell.add(mensellmanager);

        mensellreturn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mensellreturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/sellframe.gif"))); // NOI18N
        mensellreturn.setText("销售退货");
        mensellreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensellreturnActionPerformed(evt);
            }
        });
        mnuSell.add(mensellreturn);

        jMenuBar1.add(mnuSell);

        mnuSearch.setForeground(new java.awt.Color(0, 51, 51));
        mnuSearch.setText("统计查询 ");
        mnuSearch.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/stockquerymnu.gif"))); // NOI18N
        jMenuItem3.setText("商品汇总");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuSearch.add(jMenuItem3);

        munTotal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        munTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/purchasegathermnu.gif"))); // NOI18N
        munTotal.setText("采购汇总");
        munTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                munTotalActionPerformed(evt);
            }
        });
        mnuSearch.add(munTotal);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/suppbusirecmnu.gif"))); // NOI18N
        jMenuItem1.setText("供应商交易汇总");
        mnuSearch.add(jMenuItem1);

        jMenuBar1.add(mnuSearch);

        jMenu1.setText("帮助");
        jMenu1.setFont(new java.awt.Font("幼圆", 1, 24)); // NOI18N

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/aboutnum.gif"))); // NOI18N
        jMenuItem7.setText("帮助文件");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hpe/pass/img/imgs/aboutframe.gif"))); // NOI18N
        jMenuItem8.setText("关于");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCustomerActionPerformed
        showFrame(CustomerIFrame.class);
    }//GEN-LAST:event_itemCustomerActionPerformed

    private void itemProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductActionPerformed
        showFrame(ProductIFrame.class);  
    }//GEN-LAST:event_itemProductActionPerformed

    private void itemSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSupplierActionPerformed
        showFrame(SupplierIFrame.class);       
    }//GEN-LAST:event_itemSupplierActionPerformed

    private void munpurchaseManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munpurchaseManActionPerformed
       showFrame(PurchaseIFrame.class);
    }//GEN-LAST:event_munpurchaseManActionPerformed

    private void mensellmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensellmanagerActionPerformed
        showFrame(SellManagerIFrame.class);
    }//GEN-LAST:event_mensellmanagerActionPerformed

    private void mensellreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensellreturnActionPerformed
        showFrame(ReturnSellIFrame.class);
    }//GEN-LAST:event_mensellreturnActionPerformed

    private void mensellsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensellsearchActionPerformed
        showFrame(SellSearchIFrame.class);
    }//GEN-LAST:event_mensellsearchActionPerformed

    private void munOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munOutActionPerformed
        showFrame(PurchaseOutIFrame.class);
    }//GEN-LAST:event_munOutActionPerformed

    private void munTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munTotalActionPerformed
        showFrame(PurchaseGatherIFrame.class);
    }//GEN-LAST:event_munTotalActionPerformed

    private void munINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munINActionPerformed
        showFrame(PurchaseInIFrame.class);
    }//GEN-LAST:event_munINActionPerformed

    private void btnPurchaseOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseOutActionPerformed
        showFrame(PurchaseOutIFrame.class);
    }//GEN-LAST:event_btnPurchaseOutActionPerformed

    private void btnPurchaseInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseInActionPerformed
        showFrame(PurchaseInIFrame.class);
    }//GEN-LAST:event_btnPurchaseInActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        showFrame(SupplierIFrame.class);
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        showFrame(ProductIFrame.class);
    }//GEN-LAST:event_btnProductActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        showFrame(HelpIFrame.class);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JOptionPane.showMessageDialog(this, "手机商场进销存管理系统。\n版本：4.0\n开发人员：周福南、李楚娇、王柳迪、王晓宇\n", "关于", 1);
        return;
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        showFrame(CustomerIFrame.class);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        showFrame(SellSearchIFrame.class);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnPurchaseGatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseGatherActionPerformed
        showFrame(PurchaseGatherIFrame.class);
    }//GEN-LAST:event_btnPurchaseGatherActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        showFrame(ProductIFrame.class);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnStockGatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockGatherActionPerformed
        showFrame(ProductIFrame.class);
    }//GEN-LAST:event_btnStockGatherActionPerformed

    private void btnTradeGatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTradeGatherActionPerformed
        showFrame(CustradeFrame.class);
    }//GEN-LAST:event_btnTradeGatherActionPerformed

    private void btnProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseEntered
//        JOptionPane.showInputDialog("Bad");
    }//GEN-LAST:event_btnProductMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showFrame(RecycleIFrame.class);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
public void showFrame(Class clazz){
      try {
            JInternalFrame frame = frameUtil.buildFrame(clazz);
            this.mainPhonePane1.remove(frame);
            this.mainPhonePane1.add(frame);
            frame.setVisible(true);
            frame.toFront();
            frame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnPurchaseGather;
    private javax.swing.JButton btnPurchaseIn;
    private javax.swing.JButton btnPurchaseOut;
    private javax.swing.JButton btnStockGather;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnTradeGather;
    private javax.swing.JMenuItem itemCustomer;
    private javax.swing.JMenuItem itemProduct;
    private javax.swing.JMenuItem itemSupplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JToolBar jToolBar2;
    private com.hpe.pss.view.mainPhonePane mainPhonePane1;
    private javax.swing.JMenuItem mensellmanager;
    private javax.swing.JMenuItem mensellreturn;
    private javax.swing.JMenuItem mensellsearch;
    private javax.swing.JMenu mnuManager;
    private javax.swing.JMenu mnuPurchase;
    private javax.swing.JMenu mnuSearch;
    private javax.swing.JMenu mnuSell;
    private javax.swing.JMenuItem munIN;
    private javax.swing.JMenuItem munOut;
    private javax.swing.JMenuItem munTotal;
    private javax.swing.JMenuItem munpurchaseMan;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables


}
