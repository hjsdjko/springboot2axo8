package com.entity.vo;

import com.entity.MeishidianpuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美食店铺
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-26 16:41:57
 */
public class MeishidianpuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 店铺星级
	 */
	
	private String dianpuxingji;
		
	/**
	 * 店铺位置
	 */
	
	private String dianpuweizhi;
		
	/**
	 * 咨询热线
	 */
	
	private String zixunrexian;
		
	/**
	 * 店铺详情
	 */
	
	private String dianpuxiangqing;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：店铺星级
	 */
	 
	public void setDianpuxingji(String dianpuxingji) {
		this.dianpuxingji = dianpuxingji;
	}
	
	/**
	 * 获取：店铺星级
	 */
	public String getDianpuxingji() {
		return dianpuxingji;
	}
				
	
	/**
	 * 设置：店铺位置
	 */
	 
	public void setDianpuweizhi(String dianpuweizhi) {
		this.dianpuweizhi = dianpuweizhi;
	}
	
	/**
	 * 获取：店铺位置
	 */
	public String getDianpuweizhi() {
		return dianpuweizhi;
	}
				
	
	/**
	 * 设置：咨询热线
	 */
	 
	public void setZixunrexian(String zixunrexian) {
		this.zixunrexian = zixunrexian;
	}
	
	/**
	 * 获取：咨询热线
	 */
	public String getZixunrexian() {
		return zixunrexian;
	}
				
	
	/**
	 * 设置：店铺详情
	 */
	 
	public void setDianpuxiangqing(String dianpuxiangqing) {
		this.dianpuxiangqing = dianpuxiangqing;
	}
	
	/**
	 * 获取：店铺详情
	 */
	public String getDianpuxiangqing() {
		return dianpuxiangqing;
	}
			
}
