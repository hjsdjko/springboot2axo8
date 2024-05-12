package com.entity.view;

import com.entity.MeishidianpuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食店铺
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-26 16:41:57
 */
@TableName("meishidianpu")
public class MeishidianpuView  extends MeishidianpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeishidianpuView(){
	}
 
 	public MeishidianpuView(MeishidianpuEntity meishidianpuEntity){
 	try {
			BeanUtils.copyProperties(this, meishidianpuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
