package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishidianpuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishidianpuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishidianpuView;


/**
 * 美食店铺
 *
 * @author 
 * @email 
 * @date 2023-04-26 16:41:57
 */
public interface MeishidianpuService extends IService<MeishidianpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishidianpuVO> selectListVO(Wrapper<MeishidianpuEntity> wrapper);
   	
   	MeishidianpuVO selectVO(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
   	
   	List<MeishidianpuView> selectListView(Wrapper<MeishidianpuEntity> wrapper);
   	
   	MeishidianpuView selectView(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishidianpuEntity> wrapper);
   	

}

