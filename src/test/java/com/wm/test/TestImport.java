/**   
 * 
 * @Title: TestImport.java 
 * @Prject: ssm-wangming-week2
 * @Package: com.wm.test 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月8日 下午8:10:47 
 * @version: V1.0   
 */
package com.wm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.wangming.beans.Goods;
import com.wangming.mapper.GoodsMapper;
import com.wangming.service.GoodsService;
import com.wangming.utils.DateUtils;
import com.wangming.utils.EmailUtils;
import com.wangming.utils.UploadFileUtils;

/** 
 * @ClassName: TestImport 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月8日 下午8:10:47  
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class TestImport {

	@Autowired
	private GoodsService service;
	
	@Test
	public void fileTest() throws Exception{
		List<Goods> goods = UploadFileUtils.uploadFileUtils("C:\\Users\\wm\\Desktop\\测试商品.txt");
		/*goods.forEach(good->{System.out.println(good);});
		service.addGoods(goods);*/
		/*boolean email = EmailUtils.isEmail("asd");
		System.out.println(email);*/
	} 
}
