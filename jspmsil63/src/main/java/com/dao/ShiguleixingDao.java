package com.dao;

import com.entity.ShiguleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiguleixingVO;
import com.entity.view.ShiguleixingView;


/**
 * 事故类型
 * 
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public interface ShiguleixingDao extends BaseMapper<ShiguleixingEntity> {
	
	List<ShiguleixingVO> selectListVO(@Param("ew") Wrapper<ShiguleixingEntity> wrapper);
	
	ShiguleixingVO selectVO(@Param("ew") Wrapper<ShiguleixingEntity> wrapper);
	
	List<ShiguleixingView> selectListView(@Param("ew") Wrapper<ShiguleixingEntity> wrapper);

	List<ShiguleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShiguleixingEntity> wrapper);
	
	ShiguleixingView selectView(@Param("ew") Wrapper<ShiguleixingEntity> wrapper);
	
}
