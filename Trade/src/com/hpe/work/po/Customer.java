package com.hpe.work.po;

public class Customer {
	private Integer cusid;
	private String cusname;
	private String custel;
        private String cusmobile;


	private String cusaddr;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCusid() {
		return cusid;
	}
	public void setCusid(Integer cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getCustel() {
		return custel;
	}
	public void setCustel(String custel) {
		this.custel = custel;
	}
	public String getCusaddr() {
		return cusaddr;
	}
	public void setCusaddr(String cusaddr) {
		this.cusaddr = cusaddr;
	}
        public String getCusmobile() {
        return cusmobile;
        }

        public void setCusmobile(String cusmobile) {
            this.cusmobile = cusmobile;
        }

	public Customer(Integer cusid, String cusname, String custel, String cusmobile,String cusaddr) {
		super();
		this.cusid = cusid;
		this.cusname = cusname;
		this.custel = custel;
		this.cusaddr = cusaddr;
                this.cusmobile = cusmobile;
	}
	@Override
	public String toString() {
		return "Custom [cusid=" + cusid + ", cusname=" + cusname + ", custel=" + custel + ", cusaddr=" + cusaddr + "]";
	}
}
