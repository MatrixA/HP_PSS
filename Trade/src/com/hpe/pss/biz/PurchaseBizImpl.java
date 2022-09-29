/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.pss.dao.BaseDao;
import com.hpe.pss.dao.PurchaseDao;


import com.hpe.pss.dao.productDao;

import com.hpe.pss.vo.View_Purchase_detail;
import com.hpe.pss.vo.View_Purchase_pro;
import com.hpe.pss.vo.View_Purchase_sup;
import com.hpe.work.po.Purchase;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;


public class PurchaseBizImpl implements PurchaseBiz {
    productDao prodao = new productDao();
    PurchaseDao purdao = new PurchaseDao();

   // @Override
    public boolean add(Purchase p) {
        String sql="insert into t_purchase values(?,?,?,?,?,?,?,?,?)";
	Object[] params ={p.getPurid(),p.getProid(),p.getPurcount(),p.getPurunitprice(),p.getSupid(),p.getPurdate(),p.getRetamount(),p.getRettime(),p.getRetreason()};
	return purdao.update(sql, params);
    }

    @Override
    public boolean delete(int Purid) {
        String sql="update t_purchase set state=0 where purid=?";
	Object[] params={Purid};
	return purdao.update(sql, params);
    }

   // @Override
    public boolean update(Purchase p) {
        String sql="update t_purchase set purid=?,proid=?,purcount=?,purunitprice=?,supid=?,purdate=?,retamount=?,rettime=?,retreason=? where purid=?";
	Object[] params={p.getProid(),p.getPurcount(),p.getPurunitprice(),p.getSupid(),p.getPurdate(),p.getRetamount(),p.getRettime(),p.getRetreason(),p.getPurid()};
	return purdao.update(sql, params);
    }

    @Override
    public Purchase findByID(int purid) {
        String sql="select *from t_purchase where purid=?";
        Object[] params={purid};
        return (Purchase)purdao.get(sql,Purchase.class,params);
    }

    @Override
    public List<Purchase> findAll() {
        String sql="select *from t_purchase";
        return purdao.query(sql, Purchase.class);
    }

    @Override
    public List<Purchase> findByCondition(String condition) {
        String sql="select * from t_purchase where concat(purid,proid,purdate,retdate) and state=1";
        Object[] params ={"%"+condition+"%"};
        return purdao.query(sql, Purchase.class,params);
    }
    @Override
    public boolean purchasein(Object[][] purchases,Object[][]stocks) {
        boolean result = true;
        String sql1 = "insert into t_purchase(proid,purdate,purcount,purunitprice,supid) values(?,?,?,?,?)";
        String sql2 = "update t_product set storecount=storecount+? where proid=?";//库存增加
        Connection conn = new BaseDao().getConnection();//获得连接
        try {
             conn.setAutoCommit(false);//设置不自动提交
             purdao.batchUpdate(conn, sql1, purchases);//批量添加采购表
             prodao.batchUpdate(conn, sql2, stocks);//更新商品库存
             conn.commit();     //提交事务
        } catch (Exception e) {
           try {
               result = false;
               conn.rollback(); //回滚事务
           } catch (SQLException ex) {
              ex.printStackTrace();
           }
            e.printStackTrace();
        }
       return result;
    }

    public boolean purchasereturn(int purid,int retamount,Date rettime,int proid,String retreason) {
        boolean result=true;
        String sql1 = "update t_purchase set proid=?,retamount=?,purcount=purcount-?,rettime=?,retreason=? where purid=?";
        String sql2 = "update t_product set storecount=storecount-?  where proid=?";
        Connection conn = new BaseDao().getConnection();//获得连接
        Object[] params1 ={proid,retamount,retamount,rettime,retreason,purid};
        Object[] params2 ={retamount,proid};
        try {
             conn.setAutoCommit(false);//设置不自动提交
             purdao.update(sql1, params1);//批量添加采购表
             prodao.update(sql2, params2);//更新商品库存
             conn.commit();     //提交事务
        } catch (Exception e) {
           try {
               result = false;
               conn.rollback(); //回滚事务
           } catch (SQLException ex) {
              ex.printStackTrace();
           }
            e.printStackTrace();
        }
       return result;
    }
    public boolean purchasereturn(Object[][] purchasereturn,Object[][] stocks) {
       boolean result = true;
        String sql1 = "insert into t_purchase(purid,proid,purcount,purchaseprice,purtotals,supid,purdate) values(?,?,?,?,?,?,?)";
        String sql2 = "update t_product set currentamount=currentamount-? where proid=?";//库存减少
        Connection conn = new BaseDao().getConnection();//获得连接
        
        try {
             conn.setAutoCommit(false);//设置不自动提交
             purdao.batchUpdate(conn, sql1, purchasereturn);//批量添加采购表
             prodao.batchUpdate(conn, sql2, stocks);//更新商品库存
             conn.commit();     //提交事务
        } catch (Exception e) {
           try {
               result = false;
               conn.rollback(); //回滚事务
           } catch (SQLException ex) {
              ex.printStackTrace();
           }
            e.printStackTrace();
        }
       return result;
    }
    
//    public List<View_Purchase_detail> findByConditionA(String start,String end,String conditions){
//        String sql = "select purid,proname,purcount,purunitprice,purdate from view_purchase_detail where purdate between '"+start+"' and '"+end+"' ";
//        if(conditions != null && conditions.length()>0){
//            sql +=" and concat(proname,supname) like '%"+conditions+"%'";
//        }
//        sql +=" and t_purchase.proid=t_product.proid and t_purchase.supid=t_supplier.supid";
//        return purdao.query(sql, Purchase.class);
//    }
    
    @Override
    public List<View_Purchase_detail> findByCondition(String start,String end,String conditions){
        String sql = "select * from view_purchase where purdate between '"+start+"' and '"+end+"' ";
        if(conditions != null && conditions.length()>0){
            sql +=" and concat(proname,supname) like '%"+conditions+"%'";
        }
        return purdao.query(sql, View_Purchase_detail.class);
    }
    public List<View_Purchase_pro> findByConditionPro(String start,String end){
        String sql = "select proid,proname,sum(purcount) as purtotamount,sum(purcount*purunitprice) as purtotmoney from view_purchase where purdate between '"+start+"' and '"+end+"' "
                + "group by proid\n" 
                + "order by proid";
        return purdao.query(sql, View_Purchase_pro.class);
    }
    public List<View_Purchase_sup> findByConditionSup(String start,String end){
        String sql = "select supname,proname,sum(purcount) as purtotamount,sum(purcount*purunitprice) as purtotmoney from view_purchase where purdate between '"+start+"' and '"+end+"' "
                + " group by supname,proname\n" 
                + " order by supname,purtotmoney";
        return purdao.query(sql, View_Purchase_sup.class);
    }



    
}
