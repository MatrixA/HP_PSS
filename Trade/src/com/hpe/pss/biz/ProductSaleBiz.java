/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;


import com.hpe.work.po.ProductSale;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface ProductSaleBiz {
    public List<ProductSale> findTotal();
}
