/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.work.po;

import java.sql.Date;

/**
 *
 * @author lenovo
 */
public class Supplier {
    	private Integer supid;
	private String supname; 
        private String owner;
        private String job;
	private String suptel;
        private String mobile;
	private String supaddr;
        private Date lastpurchase;
        	public Integer getSupid() {
			return supid;
		}
		public void setSupid(Integer supid) {
			this.supid = supid;
		}
		public String getSupname() {
			return supname;
		}
		public void setSupname(String supname) {
			this.supname = supname;
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public String getSuptel() {
			return suptel;
		}
		public void setSuptel(String suptel) {
			this.suptel = suptel;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getSupaddr() {
			return supaddr;
		}
		public void setSupaddr(String supaddr) {
			this.supaddr = supaddr;
		}
		public Date getLastpurchase() {
			return lastpurchase;
		}
		public void setLastpurchase(Date lastpurchase) {
			this.lastpurchase = lastpurchase;
		}
		public Supplier() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Supplier(Integer supid, String supname, String owner, String job, String suptel, String mobile,
				 String supaddr,Date lastpurchase) {
			super();
			this.supid = supid;
			this.supname = supname;
			this.owner = owner;
			this.job = job;
			this.suptel = suptel;
			this.mobile = mobile;
			this.supaddr = supaddr;
			this.lastpurchase = lastpurchase;
		}
		@Override
		public String toString() {
			return "Supplier [supid=" + supid + ", supname=" + supname + ", owner=" + owner + ", job=" + job
					+ ", suptel=" + suptel + ", moblie=" + mobile +  ",supaddr=" + supaddr+",lastpurchase "+lastpurchase+"]";
		}

//        public String toString(){
//            return this.supname; //提供供应商名
//         }


	

}
