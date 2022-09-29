/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import java.util.List;
import com.hpe.pss.dao.SellDao;
import com.hpe.work.po.Sell;
/**
 *
 * @author lenovo
 */
public class SellBizImpl implements SellBiz1 {
    	SellDao pdao = new SellDao();
	public boolean add(Sell p) {
		String sql = "insert into t_sells values(?,?,?,?,?,?,?,?)";
		//参数是按照顺序逐个给？赋值，所以注意数据表中的数据顺序
		Object[] params = {null,p.getProid(),p.getProname(),p.getSeldate(),p.getSelcount(),
		p.getSelprice(),p.getCusname(),1};
		return pdao.update(sql, params);
	}

	public boolean delete(int selid) {
		String sql = "update t_sells set state = 0 where selid =?";
		Object[] params = {selid};
		return pdao.update(sql, params);
	}

	public boolean update(Sell p) {
	    String sql = "update  t_sells set  proid = ?,seldate = ?,selcount = ?,selprice = ?,cusname = ? ,state = ? where selid = ?";
            Object[] params = {p.getProname(),p.getSeldate(),p.getSelcount(),p.getSelprice(),p.getCusname(),1,p.getSelid()};
            return pdao.update(sql, params);
	}



	public List<Sell> findAll() {
	    String sql = "select selid,proid,proname,seldate,selcount,selprice,selcount*selprice as totals,cusname from t_sells where state = 1";
            return pdao.query(sql, Sell.class);
	}

	public List<Sell> findByCondition(String start,String condition,String end) {
            String sql = "select selid,proid,proname,seldate,selcount,selprice,selcount*selprice as totals,cusname from t_sells where state = 1 and seldate between '"+start+"' and '"+end+"'";
            if(condition != null&&condition.length()>0){
                sql+= " and concat(proname,selid) like '%"+condition+"%'";
            }
            return pdao.query(sql, Sell.class);
	}
}
