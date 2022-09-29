/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.pss.dao.RecycleDao;
import com.hpe.work.po.Customer;
import java.util.List;


public class RecycleBizImpl implements RecycleBiz {
    RecycleDao rdao=new RecycleDao();

    public boolean recycle(int p) {
        String sql="update t_customer set state=1 where cusid=?";
	Object[] params={p};
	return rdao.update(sql, params);
    }

    @Override
    public List<Customer> findall() {
        String sql = "select * from t_customer where state =0 ";
        return rdao.query(sql, Customer.class);
    }
    
}
