/**   
 * 
 * @Title: Goods.java 
 * @Prject: ssm-wangming-week2
 * @Package: com.wangming.beans 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月8日 下午7:29:46 
 * @version: V1.0   
 */
package com.wangming.beans;

import java.math.BigDecimal;

/** 
 * @ClassName: Goods 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月8日 下午7:29:46  
 */
public class Goods {

	private Integer gid;
	
	private String gname;
	
	private BigDecimal  price;
	
	private Integer sales;

	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price
				+ ", sales=" + sales + "]";
	}

	/**
	 * @return the gid
	 */
	public Integer getGid() {
		return gid;
	}

	/**
	 * @param gid the gid to set
	 */
	public void setGid(Integer gid) {
		this.gid = gid;
	}

	/**
	 * @return the gname
	 */
	public String getGname() {
		return gname;
	}

	/**
	 * @param gname the gname to set
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the sales
	 */
	public Integer getSales() {
		return sales;
	}

	/**
	 * @param sales the sales to set
	 */
	public void setSales(Integer sales) {
		this.sales = sales;
	}

	/** 
	 * @Title:Goods
	 * @Description:TODO 
	 * @param gid
	 * @param gname
	 * @param price
	 * @param sales 
	 */
	public Goods(Integer gid, String gname, BigDecimal price, Integer sales) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.sales = sales;
	}

	/** 
	 * @Title:Goods
	 * @Description:TODO  
	 */
	public Goods() {
		super();
	}

	
	
}
