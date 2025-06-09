package com.dao;

import com.entity.ShensuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShensuxinxiVO;
import com.entity.view.ShensuxinxiView;


/**
 * 申诉信息
 * 
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public interface ShensuxinxiDao extends BaseMapper<ShensuxinxiEntity> {
	
	List<ShensuxinxiVO> selectListVO(@Param("ew") Wrapper<ShensuxinxiEntity> wrapper);
	
	ShensuxinxiVO selectVO(@Param("ew") Wrapper<ShensuxinxiEntity> wrapper);
	
	List<ShensuxinxiView> selectListView(@Param("ew") Wrapper<ShensuxinxiEntity> wrapper);

	List<ShensuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShensuxinxiEntity> wrapper);
	
	ShensuxinxiView selectView(@Param("ew") Wrapper<ShensuxinxiEntity> wrapper);
	
}
