package com.hpe.pss.biz;


import com.hpe.pss.vo.View_Purchase_detail;
import com.hpe.pss.vo.View_Purchase_pro;
import com.hpe.pss.vo.View_Purchase_sup;
import com.hpe.work.po.Purchase;
import java.sql.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steve
 */
public interface PurchaseBiz {
    public boolean add(Purchase p);
    public boolean delete(int Proid);
    public boolean update(Purchase p);
    public Purchase findByID(int proid);
    public List<Purchase> findAll();
    public List<Purchase> findByCondition(String condition);
    public boolean purchasein(Object[][] purchases,Object[][] stocks);
    public boolean purchasereturn(Object[][] purchasereturn,Object[][] stocks);
    public boolean purchasereturn(int purid,int purcount,Date rettime,int proid,String retreason);
    public List<View_Purchase_detail> findByCondition(String start,String end,String conditions); 
//    public List<Purchase> findByConditionA(String start,String end,String conditions);
    public List<View_Purchase_pro> findByConditionPro(String start,String end);
    public List<View_Purchase_sup> findByConditionSup(String start,String end);
}   
