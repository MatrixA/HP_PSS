/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.vo;

/**
 *
 * @author Steve
 */
public class View_Purchase_sup {
    String proname,supname;
    int purtotamount,purtotmoney;

    public View_Purchase_sup() {
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
    }

    public int getPurtotamount() {
        return purtotamount;
    }

    public void setPurtotamount(int purtotamount) {
        this.purtotamount = purtotamount;
    }

    public int getPurtotmoney() {
        return purtotmoney;
    }

    public void setPurtotmoney(int purtotmoney) {
        this.purtotmoney = purtotmoney;
    }
    
}
