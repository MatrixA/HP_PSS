/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.pss.vo.View_Custrade;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface CustradeBiz {
     public List<View_Custrade> findAll();
    
    public List<View_Custrade> findCondition(String start, String end);
}
