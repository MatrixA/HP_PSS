/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.vo;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author Steve
 */
public class View_Purchase_detail {
    int purid,proid,purcount,supid;
    String proname,supname;
    BigDecimal purunitprice;
    Date purdate;

    public View_Purchase_detail(int purid, int proid, int purcount, int supid, String proname, String supname, BigDecimal purunitprice, Date purdate) {
        this.purid = purid;
        this.proid = proid;
        this.purcount = purcount;
        this.supid = supid;
        this.proname = proname;
        this.supname = supname;
        this.purunitprice = purunitprice;
        this.purdate = purdate;
    }

    public View_Purchase_detail() {
    }

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

    public BigDecimal getPurunitprice() {
        return purunitprice;
    }

    public void setPurunitprice(BigDecimal purunitprice) {
        this.purunitprice = purunitprice;
    }

    public Date getPurdate() {
        return purdate;
    }

    public void setPurdate(Date purdate) {
        this.purdate = purdate;
    }
    
}
