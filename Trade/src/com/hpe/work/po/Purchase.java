/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.work.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Steve
 */
public class Purchase {
    int purid,proid,purcount,supid,retamount;
    Date purdate,rettime;
    BigDecimal purunitprice;
    String retreason;

    public int getPurid() {
        return purid;
    }

    public void setPurid(int purid) {
        this.purid = purid;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public int getPurcount() {
        return purcount;
    }

    public void setPurcount(int purcount) {
        this.purcount = purcount;
    }

    public int getSupid() {
        return supid;
    }

    public void setSupid(int supid) {
        this.supid = supid;
    }

    public int getRetamount() {
        return retamount;
    }

    public void setRetamount(int retamount) {
        this.retamount = retamount;
    }

    public Date getPurdate() {
        return purdate;
    }

    public void setPurdate(Date purdate) {
        this.purdate = purdate;
    }

    public Date getRettime() {
        return rettime;
    }

    public void setRettime(Date rettime) {
        this.rettime = rettime;
    }

    public BigDecimal getPurunitprice() {
        return purunitprice;
    }

    public void setPurunitprice(BigDecimal purunitprice) {
        this.purunitprice = purunitprice;
    }

    public String getRetreason() {
        return retreason;
    }

    public void setRetreason(String retreason) {
        this.retreason = retreason;
    }
    
}
