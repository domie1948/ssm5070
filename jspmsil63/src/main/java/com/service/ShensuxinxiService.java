package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShensuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShensuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShensuxinxiView;


/**
 * 申诉信息
 *
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public interface ShensuxinxiService extends IService<ShensuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShensuxinxiVO> selectListVO(Wrapper<ShensuxinxiEntity> wrapper);
   	
   	ShensuxinxiVO selectVO(@Param("ew") Wrapper<ShensuxinxiEntity> wrapper);
   	
   	List<ShensuxinxiView> selectListView(Wrapper<ShensuxinxiEntity> wrapper);
   	
   	ShensuxinxiView selectView(@Param("ew") Wrapper<ShensuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShensuxinxiEntity> wrapper);
   	
}

