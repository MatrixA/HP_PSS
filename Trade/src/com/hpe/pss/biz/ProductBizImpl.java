/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.pss.dao.productDao;
import com.hpe.work.po.Product;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class ProductBizImpl implements ProductBiz {
    productDao pdao = new productDao();
	//@Override
	public boolean add(Product p) {
		String sql = "insert into t_product values(?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {null,p.getProname(),p.getType(),p.getSafeamount(),p.getSugpurchase(),
                    p.getSugsell(),p.getStorecount(),p.getLastpurchase(),p.getLastsale(),1};
		return pdao.update(sql, params);
	}

	//@Override
	public boolean delete(int proid) {
		//软删除操作
		String sql = "update t_product set state = 0 where proid = ?";
		Object [] params = {proid};
		return pdao.update(sql, params);
	}

	//@Override
	public boolean update(Product p) {
		String sql = "update t_product set proname =?,type=?,safeamount=?,sugpurchase = ?,sugsell = ?,"
                        + "storecount=?,lastpurchase=?,lastsale=? where proid =?";
		Object [] params = {p.getProname(),p.getType(),p.getSafeamount(),p.getSugpurchase(),
                    p.getSugsell(),p.getStorecount(),p.getLastpurchase(),p.getLastsale(),p.getProid()};
		return pdao.update(sql, params);
	
	}

	//@Override
	public Product findById(int proid) {
		String sql = "select * from t_product where proid =?";
		Object [] params = {proid};
		return (Product) pdao.get(sql, Product.class ,params);
	
	}

	//@Override
	public List<Product> findAll() {
		String sql = "select * from t_product where state = 1";
                //每次显示十行只需用limit 起点，终点
		return pdao.query(sql, Product.class);
	}

	//@Override
	public List<Product> findByCondition(String condition) {
            String sql = "select * from t_product where state = 1";
            if(condition.length()>0){
                sql += " and concat(proname,type) like '%" + condition + "%' ";
            }
		return pdao.query(sql, Product.class);
		
	}

public boolean findProduct (String proname , String type){
    String sql = "select * from t_product where proname = ? and type = ? and state = 1";
    Object [] params = {proname , type};
    Product p = (Product)pdao.get(sql, Product.class,params);
    if(p != null){
        return true;
    }else{
        return false;
    }
}
    
}
