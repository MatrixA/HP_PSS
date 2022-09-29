/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.work.po;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author lenovo
 */
public class Sell {

    private Integer selid;
    private Integer proid;
    private String proname;
    private Date seldate;
    private int selcount;
    private BigDecimal selprice;
    private BigDecimal totals;
    private String cusname;

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    
    public Sell() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Integer  getProid() {
        return proid;
    }

    public void setProid(Integer  proid) {
        this.proid = proid;
    }

    public BigDecimal getTotals() {
        return totals;
    }

    public void setTotals(BigDecimal totals) {
        this.totals = totals;
    }

    public Integer  getSelid() {
        return selid;
    }

    public void setSelid(Integer selid) {
        this.selid = selid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

   

    @Override
    public String toString() {
        return "Sell [selid=" + selid + "proid = "+ proid +" ,proname=" + proname+ ", date=" + seldate + ", selcount=" + selcount + ", selprice="
                + selprice + ", cusname =" + cusname + "]";
    }

    public Date getSeldate() {
        return seldate;
    }

    public void setSeldate(Date seldate) {
        this.seldate = seldate;
    }

    public int getSelcount() {
        return selcount;
    }

    public void setSelcount(int selcount) {
        this.selcount = selcount;
    }

    public BigDecimal getSelprice() {
        return selprice;
    }

    public void setSelprice(BigDecimal selprice) {
        this.selprice = selprice;
    }


    public Sell(Integer  selid, Integer  proid,String proname, Date date, int selcount, BigDecimal selprice,String cusname) {
        super();
        this.selid = selid;
        this.proid = proid;
        this.proname = proname;
        this.seldate = date;
        this.selcount = selcount;
        this.selprice = selprice;
        this.cusname = cusname;

    }
}
