/**   
 * 
 * @Title: GoodsService.java 
 * @Prject: ssm-wangming-week2
 * @Package: com.wangming.service 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月9日 上午8:32:19 
 * @version: V1.0   
 */
package com.wangming.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wangming.beans.Condition;
import com.wangming.beans.Goods;

/** 
 * @ClassName: GoodsService 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月9日 上午8:32:19  
 */
public interface GoodsService {

	PageInfo getGoodsList(Condition con,int pageNum,int pageSize);
	
	boolean addGoods(List<Goods> goods);
}
