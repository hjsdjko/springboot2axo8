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


import com.dao.MeishidianpuDao;
import com.entity.MeishidianpuEntity;
import com.service.MeishidianpuService;
import com.entity.vo.MeishidianpuVO;
import com.entity.view.MeishidianpuView;

@Service("meishidianpuService")
public class MeishidianpuServiceImpl extends ServiceImpl<MeishidianpuDao, MeishidianpuEntity> implements MeishidianpuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishidianpuEntity> page = this.selectPage(
                new Query<MeishidianpuEntity>(params).getPage(),
                new EntityWrapper<MeishidianpuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishidianpuEntity> wrapper) {
		  Page<MeishidianpuView> page =new Query<MeishidianpuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishidianpuVO> selectListVO(Wrapper<MeishidianpuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishidianpuVO selectVO(Wrapper<MeishidianpuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishidianpuView> selectListView(Wrapper<MeishidianpuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishidianpuView selectView(Wrapper<MeishidianpuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
