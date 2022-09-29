/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.work.po.Product;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface ProductBiz {

    //1.增加商品
		public boolean add(Product p);
	//2.删除商品
		public boolean delete(int proid);
		//3.删除商品
		public boolean update(Product p);
		//4.根据编号查找商品
		public Product findById(int proid);
		//5.查询所有商品
		public List<Product> findAll();
		//6.模糊查询
		public List<Product> findByCondition(String condition);
                public boolean findProduct (String proname , String type); 


}
