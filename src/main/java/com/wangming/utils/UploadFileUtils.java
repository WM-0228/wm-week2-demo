/**   
 * 
 * @Title: uploadFileUtils.java 
 * @Prject: ssm-wangming-week2
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月8日 下午7:32:02 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.wangming.beans.Goods;

/** 
 * @ClassName: uploadFileUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月8日 下午7:32:02  
 */
public class UploadFileUtils {

	/**
	 * 
	 * @Title: uploadFileUtils 
	 * @Description: 根据文件路径读取文件内容并存入集合
	 * @param filePath
	 * @return
	 * @return: List<Goods>
	 * @throws Exception 
	 */
	public static List<Goods> uploadFileUtils(String filePath) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath)),"utf-8"));
		String str = "";
		List<Goods> goods = new ArrayList<Goods>();
		while((str = br.readLine()) != null){
			String[] split = str.trim().split("==¥|==|¥|%");
			goods.add(new Goods(Integer.parseInt(split[0]),
					split[1],new BigDecimal(split[2]),
					split.length == 4 ? Integer.parseInt(split[3]) : 0));
			/*for (String string : split) {
				System.out.println(string.hashCode() == 0 ? 0 : string);
			}
			System.out.println("=========================================");*/
		}
		return goods;
	}
}
