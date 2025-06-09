package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiguleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiguleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiguleixingView;


/**
 * 事故类型
 *
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public interface ShiguleixingService extends IService<ShiguleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiguleixingVO> selectListVO(Wrapper<ShiguleixingEntity> wrapper);
   	
   	ShiguleixingVO selectVO(@Param("ew") Wrapper<ShiguleixingEntity> wrapper);
   	
   	List<ShiguleixingView> selectListView(Wrapper<ShiguleixingEntity> wrapper);
   	
   	ShiguleixingView selectView(@Param("ew") Wrapper<ShiguleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiguleixingEntity> wrapper);
   	
}

