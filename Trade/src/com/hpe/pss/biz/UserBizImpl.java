/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.pss.dao.UserDao;
import com.hpe.work.po.User;


public class UserBizImpl implements UserBiz {
    UserDao udao= new UserDao(); 
    @Override
    public User useLogin(String username, String password) {
        String sql = "select * from t_user where state = 1 and uname =? and password = ?" ;
        Object [] parma= {username ,password};
        return (User)udao.get(sql,User.class,parma);  
    }
    
}
