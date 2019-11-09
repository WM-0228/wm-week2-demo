/**   
 * 
 * @Title: GoodsServiceImpl.java 
 * @Prject: ssm-wangming-week2
 * @Package: com.wangming.service.impl 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月9日 上午8:33:50 
 * @version: V1.0   
 */
package com.wangming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangming.beans.Condition;
import com.wangming.beans.Goods;
import com.wangming.mapper.GoodsMapper;
import com.wangming.service.GoodsService;

/** 
 * @ClassName: GoodsServiceImpl 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月9日 上午8:33:50  
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper mapper;
	
	@Override
	public PageInfo getGoodsList(Condition con, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Goods> goodsList = mapper.getGoodsList(con);
		return new PageInfo(goodsList);
	}

	@Override
	public boolean addGoods(List<Goods> goods) {
		// TODO Auto-generated method stub
		return mapper.addGoods(goods) > 0;
	}

}
