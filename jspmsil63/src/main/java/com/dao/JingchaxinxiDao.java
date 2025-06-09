package com.dao;

import com.entity.JingchaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingchaxinxiVO;
import com.entity.view.JingchaxinxiView;


/**
 * 警察信息
 * 
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public interface JingchaxinxiDao extends BaseMapper<JingchaxinxiEntity> {
	
	List<JingchaxinxiVO> selectListVO(@Param("ew") Wrapper<JingchaxinxiEntity> wrapper);
	
	JingchaxinxiVO selectVO(@Param("ew") Wrapper<JingchaxinxiEntity> wrapper);
	
	List<JingchaxinxiView> selectListView(@Param("ew") Wrapper<JingchaxinxiEntity> wrapper);

	List<JingchaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JingchaxinxiEntity> wrapper);
	
	JingchaxinxiView selectView(@Param("ew") Wrapper<JingchaxinxiEntity> wrapper);
	
}
