/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.biz;

import com.hpe.work.po.User;

/**
 *
 * @author Steve
 */
public interface UserBiz {
     public User useLogin(String username, String password) ;
}
