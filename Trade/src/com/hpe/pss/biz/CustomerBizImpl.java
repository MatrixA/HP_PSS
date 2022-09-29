/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;


import com.hpe.pss.dao.CustomerDao;
import com.hpe.work.po.Customer;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class CustomerBizImpl implements CustomerBiz{
//引入Dao
	CustomerDao pdao = new CustomerDao();
	//@Override
	public boolean add(Customer p) {
		String sql = "insert into t_customer values(?,?,?,?,?,1)";
		Object[] params = {null,p.getCusname(),p.getCustel(),p.getCusmobile(),p.getCusaddr()};
		return pdao.update(sql, params);
		
	}

	//@Override
	public boolean delete(int cusid) {
		//软删除操作
		String sql = "update t_customer set state=0 where cusid = ?";
		Object [] params = {cusid};
		return pdao.update(sql, params);
	}

	//@Override
	public boolean update(Customer p) {
		String sql = "update t_customer set cusname=?,custel = ? ,cusmoblie =? ,cusaddr = ? where cusid =?";
		Object [] params = {p.getCusname(),p.getCustel(),p.getCusmobile(),p.getCusaddr(),p.getCusid()};
		return pdao.update(sql, params);
	
	}

	@Override
	public Customer findById(int cusid) {
		String sql = "select * from t_customer where cusid =?";
		Object [] params = {cusid};
		return (Customer) pdao.get(sql, Customer.class ,params);
	
	}

	//@Override
	public List<Customer> findAll() {
		String sql = "select * from t_customer where state=1 ";
		return pdao.query(sql, Customer.class);
	}

	//@Override
	public List<Customer> findByCondition(String condition) {
            String sql = "select * from t_customer ";
            if(condition.length()>0){
                sql += " and concat(Cusname,Cusaddr) like '%" + condition + "%' and state=1 ";
            }
		return pdao.query(sql, Customer.class);
		
	}


    
}
