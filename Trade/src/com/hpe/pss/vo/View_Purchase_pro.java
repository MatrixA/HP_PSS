/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.vo;

import java.math.BigDecimal;

/**
 *
 * @author Steve
 */
public class View_Purchase_pro {
    int proid;
    String proname;
    BigDecimal purtotmoney;
    int purtotamount;

    public View_Purchase_pro() {
        
        
    }

    
    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }


    public BigDecimal getPurtotmoney() {
        return purtotmoney;
    }

    public void setPurtotmoney(BigDecimal purtotmoney) {
        this.purtotmoney = purtotmoney;
    }

    public int getPurtotamount() {
        return purtotamount;
    }

    public void setPurtotamount(int purtotamount) {
        this.purtotamount = purtotamount;
    }
    
}
