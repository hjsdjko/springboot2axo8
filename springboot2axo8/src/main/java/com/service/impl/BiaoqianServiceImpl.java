package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BiaoqianDao;
import com.entity.BiaoqianEntity;
import com.service.BiaoqianService;
import com.entity.vo.BiaoqianVO;
import com.entity.view.BiaoqianView;

@Service("biaoqianService")
public class BiaoqianServiceImpl extends ServiceImpl<BiaoqianDao, BiaoqianEntity> implements BiaoqianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiaoqianEntity> page = this.selectPage(
                new Query<BiaoqianEntity>(params).getPage(),
                new EntityWrapper<BiaoqianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiaoqianEntity> wrapper) {
		  Page<BiaoqianView> page =new Query<BiaoqianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiaoqianVO> selectListVO(Wrapper<BiaoqianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiaoqianVO selectVO(Wrapper<BiaoqianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiaoqianView> selectListView(Wrapper<BiaoqianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiaoqianView selectView(Wrapper<BiaoqianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
