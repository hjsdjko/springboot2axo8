package com.dao;

import com.entity.MeishidianpuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishidianpuVO;
import com.entity.view.MeishidianpuView;


/**
 * 美食店铺
 * 
 * @author 
 * @email 
 * @date 2023-04-26 16:41:57
 */
public interface MeishidianpuDao extends BaseMapper<MeishidianpuEntity> {
	
	List<MeishidianpuVO> selectListVO(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
	
	MeishidianpuVO selectVO(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
	
	List<MeishidianpuView> selectListView(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);

	List<MeishidianpuView> selectListView(Pagination page,@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
	
	MeishidianpuView selectView(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
	

}
