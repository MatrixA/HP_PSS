/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.work.po;

import java.util.Date;

/**
 *
 * @author lenovo
 */
public class ReturnProuct {
     private Integer proid;
     private String proname;
     private Integer returnamount;
     private Date returndate;
     private String cusname;
     private Integer retid;
    
       
   
     public Integer getRetid(){
         return retid;
     }
     public void setRetid(Integer retid){
         this.retid = retid;
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
	public Integer getReturnamount() {
		return returnamount;
	}
	public void setReturnamount(Integer returnamount) {
		this.returnamount = returnamount;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public ReturnProuct(Integer proid, String proname, Integer returnamount, Date returndate, String cusname,Integer retid) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.returnamount = returnamount;
		this.returndate = returndate;
		this.cusname = cusname;
                this.retid = retid;
           
	}
	public ReturnProuct() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "returnProuct [proid=" + proid + ", proname=" + proname + ", returnamount=" + returnamount
				+ ", returndate=" + returndate + ", cusname=" + cusname + "]";
	}
}
