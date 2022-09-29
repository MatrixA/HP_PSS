/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;


import com.hpe.work.po.SellManager;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface SellManagerBiz {
    	 public boolean add(SellManager p);
         public List<SellManager> findByCondition(String condition);  
         public List<SellManager> findAll();
	 public boolean delete (int selid);
         public boolean sellout(Object[][] sellManager,Object[][] product);
}
