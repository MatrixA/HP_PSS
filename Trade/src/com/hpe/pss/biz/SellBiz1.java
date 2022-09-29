/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;


import com.hpe.work.po.Sell;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface SellBiz1 {
    	//1.销售增加
    public boolean add(Sell p);
    //2.退回商品
    public boolean delete (int selid);
    //3.修改销售信息
    public  boolean update (Sell p);
    //public List<Sell> findTotal();
    //4.查询所有销售商品
    public List<Sell> findAll();
    //5.模糊查询
    public List<Sell> findByCondition(String start,String condition,String end);
}
