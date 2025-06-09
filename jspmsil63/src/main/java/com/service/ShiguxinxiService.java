package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiguxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiguxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiguxinxiView;


/**
 * 事故信息
 *
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public interface ShiguxinxiService extends IService<ShiguxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiguxinxiVO> selectListVO(Wrapper<ShiguxinxiEntity> wrapper);
   	
   	ShiguxinxiVO selectVO(@Param("ew") Wrapper<ShiguxinxiEntity> wrapper);
   	
   	List<ShiguxinxiView> selectListView(Wrapper<ShiguxinxiEntity> wrapper);
   	
   	ShiguxinxiView selectView(@Param("ew") Wrapper<ShiguxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiguxinxiEntity> wrapper);
   	
}

