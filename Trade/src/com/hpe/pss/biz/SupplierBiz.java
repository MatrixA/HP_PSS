/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.work.po.Supplier;
import java.util.List;


/**
 *
 * @author lenovo
 */
public interface SupplierBiz {
    	//1.增加商品
	public boolean add(Supplier p) ;
//2.删除商品
	public boolean delete(int supid);
	//3.删除商品
	public boolean update(Supplier p);
	//4.根据编号查找商品
	public Supplier findById(int supid);
	//5.查询所有商品
	public List<Supplier> findAll();
	//6.模糊查询
	public List<Supplier> findByCondition(String condition);
        public boolean findProduct (String supname ,String owner, String supaddr);
}
