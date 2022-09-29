/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pss.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Steve
 */
public class View_Custrade {
     public View_Custrade(Integer cusid, String cusname, BigDecimal sellmon, Date seldate) {
        this.cusid = cusid;
        this.cusname = cusname;
        this.sellmon = sellmon;
        this.seldate = seldate;
    }
    public View_Custrade(){}
    private Integer cusid;
    private String cusname;
    private BigDecimal sellmon;
    private Date seldate;

    public Date getSeldate() {
        return seldate;
    }

    public void setSeldate(Date seldate) {
        this.seldate = seldate;
    }
    public Integer getCusid() {
        return cusid;
    }

    public String getCusname() {
        return cusname;
    }

    public BigDecimal getSellmon() {
        return sellmon;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public void setSellmon(BigDecimal sellmon) {
        this.sellmon = sellmon;
    }


    @Override
    public String toString() {
        return "custrade{" + "cusid=" + cusid + ", cusname=" + cusname + ", sellmon=" + sellmon + ", seldate=" + seldate + "}";
    }
}
