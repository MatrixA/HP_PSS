/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.pss.dao.CustradeDao;
import com.hpe.pss.vo.View_Custrade;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class CustradeBizImpl implements CustradeBiz{
    CustradeDao cdao = new CustradeDao();
    @Override
 public List<View_Custrade> findAll() {
       String sql = "select * from t_custrade3";
      return cdao.query(sql,View_Custrade.class); 
    }


    @Override
    public List<View_Custrade> findCondition(String start, String end) {
       String sql = "select * from t_custrade3 where seldate between '"+start+"' and '"+end+"'";
      
        return cdao.query(sql, View_Custrade.class);
    }
    
}
