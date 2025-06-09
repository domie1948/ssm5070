package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanganleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanganleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanganleixingView;


/**
 * 档案类型
 *
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public interface DanganleixingService extends IService<DanganleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanganleixingVO> selectListVO(Wrapper<DanganleixingEntity> wrapper);
   	
   	DanganleixingVO selectVO(@Param("ew") Wrapper<DanganleixingEntity> wrapper);
   	
   	List<DanganleixingView> selectListView(Wrapper<DanganleixingEntity> wrapper);
   	
   	DanganleixingView selectView(@Param("ew") Wrapper<DanganleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanganleixingEntity> wrapper);
   	
}

