/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;


import com.hpe.work.po.ReturnProuct;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface ReturnBiz {
    	//1.增加退货
    public boolean add(ReturnProuct p);
    //4.根据编号查找商品
    public ReturnProuct findById(int proid);
    //5.查询所有商品
    public List<ReturnProuct> findAll();
     public boolean delete (int retid);
    //6.模糊查询
    public List<ReturnProuct> findByCondition(String condition);
    public boolean updateStoreCount(int returncount,int proid);
}
