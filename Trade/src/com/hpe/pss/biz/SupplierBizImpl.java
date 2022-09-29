/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.pss.dao.supplierBao;

import com.hpe.work.po.Supplier;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class SupplierBizImpl implements SupplierBiz {
supplierBao pdao = new supplierBao();
    @Override
    public boolean add(Supplier p) {
       String sql = "insert into t_supplier values(?,?,?,?,?,?,?,?,?)";
		Object[] params = {null,p.getSupname(),p.getOwner(),p.getJob(),p.getSuptel(),
                                    p.getMobile(),p.getSupaddr(),p.getLastpurchase(),1};
		return pdao.update(sql, params);
    }

    @Override
    public boolean delete(int supid) {
       String sql = "update t_supplier set state = 0 where supid = ?";
		Object [] params = {supid};
		return pdao.update(sql, params);
    }

    @Override
    public boolean update(Supplier p) {
        String sql = "update t_supplier set supname =?,owner = ? ,job = ?,suptel=?,mobile=?,supaddr = ?,lastpurchase = ? where supid =?";
		Object [] params = {p.getSupname(),p.getOwner(),p.getJob(),p.getSuptel(),
                                    p.getMobile(),p.getSupaddr(),p.getLastpurchase(),p.getSupid()};
                   
		return pdao.update(sql, params);
    }

    @Override
    public Supplier findById(int supid) {
      String sql = "select * from t_supplier where supid =?";
		Object [] params = {supid};
		return (Supplier) pdao.get(sql, Supplier.class ,params);
    }

    @Override
    public List<Supplier> findAll() {
       String sql = "select * from t_supplier where state = 1";
		return pdao.query(sql, Supplier.class);
    }

    @Override
    public List<Supplier> findByCondition(String condition) {
        String sql = "select * from t_supplier where state = 1";
            if(condition.length()>0){
                sql += " and concat(supname,owner,supaddr) like '%" + condition + "%' ";
            }
		return pdao.query(sql, Supplier.class);
    }
	public boolean findProduct (String supname, String owner, String supaddr){
    String sql = "select * from t_supplier where supname = ? and owner = ? and supaddr = ? and state = 1";
    Object [] params = {supname ,owner, supaddr};
    Supplier p = (Supplier)pdao.get(sql, Supplier.class,params);
    if(p != null){
        return true;
    }else{
        return false;
    }
}

}