/**   
 * 
 * @Title: GoodsController.java 
 * @Prject: ssm-wangming-week2
 * @Package: com.wangming.controller 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月9日 上午8:51:00 
 * @version: V1.0   
 */
package com.wangming.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wangming.beans.Condition;
import com.wangming.service.GoodsService;
import com.wangming.utils.PageUtil;

/** 
 * @ClassName: GoodsController 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月9日 上午8:51:00  
 */
@Controller
public class GoodsController {

	@Autowired
	private GoodsService service;
	
	@RequestMapping("goods_list.do")
	public String getGoodsList(Condition con,@RequestParam(defaultValue="1")int pageNum,HttpServletRequest request,Model m){
		PageInfo page = service.getGoodsList(con, pageNum, 3);
		PageUtil.page(request,"/goods_list.do?",3, page.getList(), (int)page.getTotal(), pageNum, con.getClass(),con);
		m.addAttribute("goods", page.getList());
		return "goods_list";
	}
}
