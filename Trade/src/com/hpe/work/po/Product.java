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
public class Product {
     	private Integer proid;
	private String proname;
	private String type;
	private Integer safeamount;
	private BigDecimal sugpurchase;
	private BigDecimal sugsell ;
	private Integer storecount;
	private Date lastpurchase ;
	private Date lastsale;
	private Integer state;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getSafeamount() {
		return safeamount;
	}
	public void setSafeamount(Integer safeamount) {
		this.safeamount = safeamount;
	}
	public BigDecimal getSugpurchase() {
		return sugpurchase;
	}
	public void setSugpurchase(BigDecimal sugpurchase) {
		this.sugpurchase = sugpurchase;
	}
	public BigDecimal getSugsell() {
		return sugsell;
	}
	public void setSugsell(BigDecimal sugsell) {
		this.sugsell = sugsell;
	}
	public Integer getStorecount() {
		return storecount;
	}
	public void setStorecount(Integer storecount) {
		this.storecount = storecount;
	}
	public Date getLastpurchase() {
		return lastpurchase;
	}
	public void setLastpurchase(Date lastpurchase) {
		this.lastpurchase = lastpurchase;
	}
	public Date getLastsale() {
		return lastsale;
	}
	public void setLastsale(Date lastsale) {
		this.lastsale = lastsale;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer proid, String proname, String type, Integer safeamount, BigDecimal sugpurchase,
			BigDecimal sugsell, Integer storecount, Date lastpurchase, Date lastsale) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.type = type;
		this.safeamount = safeamount;
		this.sugpurchase = sugpurchase;
		this.sugsell = sugsell;
		this.storecount = storecount;
		this.lastpurchase = lastpurchase;
		this.lastsale = lastsale;
		
	}
	@Override
	public String toString() {
		return "Supplier [proid=" + proid + ", proname=" + proname + ", type=" + type + ", safeamount=" + safeamount
				+ ", sugpurchase=" + sugpurchase + ", sugsell=" + sugsell + ", storescount=" + storecount
				+ ", lastpurchase=" + lastpurchase + ", lastsale=" + lastsale + ", state=" + state + "]";
	}
	
	
}
