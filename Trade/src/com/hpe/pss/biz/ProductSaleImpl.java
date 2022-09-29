/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.pss.dao.ProductSaleDao;
import com.hpe.work.po.ProductSale;

import java.util.List;

/**
 *
 * @author lenovo
 */
public class ProductSaleImpl implements ProductSaleBiz{

   

      ProductSaleDao pdao = new ProductSaleDao();

   

   
   
    public List<ProductSale> findTotal() {
            String sql = "select selid,proname,sum(selcount)as totalcount,sum(selprice) as totalprice from t_sells group by proid";
           
            return pdao.query(sql,ProductSale.class);
       
    }

   
    
}
