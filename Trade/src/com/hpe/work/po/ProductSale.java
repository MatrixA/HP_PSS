/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.work.po;

import java.math.BigDecimal;



/**
 *
 * @author yhy
 */
public class ProductSale {
    private Integer selid;
    private String proname;
    private BigDecimal totalcount;
    private BigDecimal totalprice;

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }
    

		@Override
public String toString() {
    return "ProductSale [proid=" + selid  + ", totalcount=" + totalcount
    + ", totalprice=" + totalprice + "]";
		}
    public ProductSale() {
    }

    public Integer getSelid() {
        return selid;
    }

    public ProductSale(Integer selid, String proname,BigDecimal totalcount,BigDecimal totalprice) {
        this.selid = selid;
        this.proname =proname;
        this.totalcount = totalcount;
        this.totalprice = totalprice;
    }

    public void setSelid(Integer selid) {
        this.selid = selid;
    }
 


    public BigDecimal getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(BigDecimal totalcount) {
        this.totalcount = totalcount;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }
  


  

}