/**   
 * 
 * @Title: Condition.java 
 * @Prject: ssm-wangming-week2
 * @Package: com.wangming.beans 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月9日 上午8:14:54 
 * @version: V1.0   
 */
package com.wangming.beans;

/** 
 * @ClassName: Condition 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月9日 上午8:14:54  
 */
public class Condition {

	private Integer minPrice;
	
	private Integer maxPrice;
	
	private Integer minSales;
	
	private Integer maxSales;
	
	private String name;
	
	private String order;

	/** 
	 * @Title:Condition
	 * @Description:TODO 
	 * @param minPrice
	 * @param maxPrice
	 * @param minSales
	 * @param maxSales
	 * @param name
	 * @param order 
	 */
	public Condition(Integer minPrice, Integer maxPrice, Integer minSales,
			Integer maxSales, String name, String order) {
		super();
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.minSales = minSales;
		this.maxSales = maxSales;
		this.name = name;
		this.order = order;
	}

	/** 
	 * @Title:Condition
	 * @Description:TODO  
	 */
	public Condition() {
		super();
	}

	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Condition [minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", minSales=" + minSales + ", maxSales=" + maxSales
				+ ", name=" + name + ", order=" + order + "]";
	}

	/**
	 * @return the minPrice
	 */
	public Integer getMinPrice() {
		return minPrice;
	}

	/**
	 * @param minPrice the minPrice to set
	 */
	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}

	/**
	 * @return the maxPrice
	 */
	public Integer getMaxPrice() {
		return maxPrice;
	}

	/**
	 * @param maxPrice the maxPrice to set
	 */
	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}

	/**
	 * @return the minSales
	 */
	public Integer getMinSales() {
		return minSales;
	}

	/**
	 * @param minSales the minSales to set
	 */
	public void setMinSales(Integer minSales) {
		this.minSales = minSales;
	}

	/**
	 * @return the maxSales
	 */
	public Integer getMaxSales() {
		return maxSales;
	}

	/**
	 * @param maxSales the maxSales to set
	 */
	public void setMaxSales(Integer maxSales) {
		this.maxSales = maxSales;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the order
	 */
	public String getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(String order) {
		this.order = order;
	}
	
	
	
}
