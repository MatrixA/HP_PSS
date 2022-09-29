/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;


import com.hpe.work.po.Customer;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface CustomerBiz {
    //1.增加商品
		public boolean add(Customer p) ;
	//2.删除商品
		public boolean delete(int cusid);
		//3.删除商品
		public boolean update(Customer p);
		//4.根据编号查找商品
		public Customer findById(int cusid);
		//5.查询所有商品
		public List<Customer> findAll();
		//6.模糊查询
		public List<Customer> findByCondition(String condition);
}
