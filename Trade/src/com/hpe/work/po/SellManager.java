/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.work.po;

import java.math.BigDecimal;

/**
 *
 * @author lenovo
 */
public class SellManager {
   private Integer proid;
   private String proname;
   private Integer procount;
   private BigDecimal proprice;
   private String cusname;
   

public String toString(){
    return this.cusname;
}

public String getCusname() {
        return cusname;
 }
 public void setCusname(String cusname) {
        this.cusname = cusname;
    }

public Integer getProid() {
	return proid;
}
public void setProid(Integer proid) {
	this.proid = proid;
}
public String getProname() {
	return proname;
}
public void setProname(String proname) {
	this.proname = proname;
}
public Integer getProcount() {
	return procount;
}
public void setProcount(Integer procount) {
	this.procount = procount;
}
public BigDecimal getProprice() {
	return proprice;
}
public void setProprice(BigDecimal proprice) {
	this.proprice = proprice;
}

public SellManager( Integer proid,String proname, Integer procount,BigDecimal  proprice, String cusname) {
	super();
	
	this.proid = proid;
	this.proname = proname;
        this.procount = procount;
	this.proprice = proprice;
	this.cusname = cusname;
}
public SellManager() {
	super();

}
}
