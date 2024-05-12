package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 美食店铺
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-26 16:41:57
 */
@TableName("meishidianpu")
public class MeishidianpuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MeishidianpuEntity() {
		
	}
	
	public MeishidianpuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 店铺名称
	 */
					
	private String dianpumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：店铺名称
	 */
	public void setDianpumingcheng(String dianpumingcheng) {
		this.dianpumingcheng = dianpumingcheng;
	}
	/**
	 * 获取：店铺名称
	 */
	public String getDianpumingcheng() {
		return dianpumingcheng;
	}
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
