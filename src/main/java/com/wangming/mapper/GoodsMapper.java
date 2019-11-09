/**   
 * 
 * @Title: GoodsMapper.java 
 * @Prject: ssm-wangming-week2
 * @Package: com.wangming.mapper 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月9日 上午8:14:05 
 * @version: V1.0   
 */
package com.wangming.mapper;

import java.util.List;

import com.wangming.beans.Condition;
import com.wangming.beans.Goods;

/** 
 * @ClassName: GoodsMapper 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月9日 上午8:14:05  
 */
public interface GoodsMapper {

	List<Goods> getGoodsList(Condition con);
	
	int addGoods(List<Goods> goods);
}
