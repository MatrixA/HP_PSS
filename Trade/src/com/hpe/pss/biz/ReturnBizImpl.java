/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;



import com.hpe.pss.dao.returnDao;
import com.hpe.work.po.ReturnProuct;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class ReturnBizImpl implements ReturnBiz {

    returnDao pdao = new returnDao();
    public boolean add(ReturnProuct p) {
        String sql = "insert into t_return values(?,?,?,?,?,?,?)";
		//参数是按照顺序逐个给？赋值，所以注意数据表中的数据顺序
        
		Object[] params = {null,p.getProid(),p.getProname(),p.getReturnamount(),p.getReturndate(),
		p.getCusname(),1};
              
		return pdao.update(sql, params);
    }

    @Override
    public ReturnProuct findById(int proid) {
        String sql = "select * from t_return where state =1 and retid = ?";
		Object[] params = {proid};
		return (ReturnProuct) pdao.get(sql, ReturnProuct.class,params);
    }

    @Override
    public List<ReturnProuct> findAll() {
  	String sql = "select * from t_return where state = 1";
        return pdao.query(sql, ReturnProuct.class);
    }

    public List<ReturnProuct> findByCondition(String condition) {
  String sql = "select * from t_return where state = 1 ";
        if(condition.length()>0){
            sql+= " and concat(retid,proid,proname,cusname) like '%"+condition+"%'";
        }
	
        return pdao.query(sql, ReturnProuct.class);
}
    
    public boolean delete(int retid) {
	String sql = "update t_return set state = 0 where retid =?";
	Object[] params = {retid};
	return pdao.update(sql, params);
    }

    public boolean updateStoreCount (int returncount,int proid){
      String sql = "update t_product set storecount = storecount+?  where proid = ?";
     Object[]params = {returncount,proid};
     return pdao.update(sql,params);
    }
}
