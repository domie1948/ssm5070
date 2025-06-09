package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingchaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingchaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingchaxinxiView;


/**
 * 警察信息
 *
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public interface JingchaxinxiService extends IService<JingchaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingchaxinxiVO> selectListVO(Wrapper<JingchaxinxiEntity> wrapper);
   	
   	JingchaxinxiVO selectVO(@Param("ew") Wrapper<JingchaxinxiEntity> wrapper);
   	
   	List<JingchaxinxiView> selectListView(Wrapper<JingchaxinxiEntity> wrapper);
   	
   	JingchaxinxiView selectView(@Param("ew") Wrapper<JingchaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingchaxinxiEntity> wrapper);
   	
}

