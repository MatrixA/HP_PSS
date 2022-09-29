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
 * @author Steve
 */
public interface RecycleBiz {
    public boolean recycle(int p);
    public List<Customer> findall();
}
