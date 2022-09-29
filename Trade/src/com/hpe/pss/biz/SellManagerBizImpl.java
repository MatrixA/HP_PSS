/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.pss.dao.BaseDao;
import com.hpe.pss.dao.productDao;

import com.hpe.pss.dao.sellManagerDao;
import com.hpe.work.po.SellManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class SellManagerBizImpl implements SellManagerBiz {
    	sellManagerDao pdao = new sellManagerDao ();
       ///  ProductDao prodao = new ProductDao();
        productDao prodao = new productDao();
  
	public boolean add(SellManager p) {
		String sql = "insert into t_sellmanager values(?,?,?,?,?)";
		//参数是按照顺序逐个给？赋值，所以注意数据表中的数据顺序
		Object[] params = {p.getProid(),p.getProname(),p.getProcount(),
		p.getProprice(),p.getCusname()};
		return pdao.update(sql, params);
	}

	
	public boolean delete(int selid) {
		String sql = "update t_sellManager set state = 0 where selid =?";
		Object[] params = {selid};
		return pdao.update(sql, params);
		
	}
        public List<SellManager> findAll(){
            String sql = "select * from t_sellManager where state = 1";
            return pdao.query(sql,SellManager.class );
        }
        //    @Override
        public List<SellManager> findByCondition(String condition) {
	String sql = "select * from t_sellManager where state = 1";
        if(condition.length()>0){
            sql+= " and concat(proid,proname,selid,cusname,cusid) like '%"+condition+"%'";
        }
	
             return pdao.query(sql, SellManager.class);
	}
       public boolean sellout(Object[][] sellManager,Object[][]product) {
        boolean result = true;
        String sql1 = "insert into t_sellManager(proid,proname,procount,proprice,cusname) values(?,?,?,?,?)";
        String sql2 = "update t_product set storecount=storecount - ? where proid=?";//库存增加
        Connection conn = new BaseDao().getConnection();//获得连接
        
        try {
             conn.setAutoCommit(false);//设置不自动提交
             pdao.batchUpdate(conn, sql1, sellManager);//批量添加采购表
             prodao.batchUpdate(conn, sql2, product);//更新商品库存
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
        
        
        
}
