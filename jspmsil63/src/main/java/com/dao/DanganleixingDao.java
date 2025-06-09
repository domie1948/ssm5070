package com.dao;

import com.entity.DanganleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DanganleixingVO;
import com.entity.view.DanganleixingView;


/**
 * 档案类型
 * 
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public interface DanganleixingDao extends BaseMapper<DanganleixingEntity> {
	
	List<DanganleixingVO> selectListVO(@Param("ew") Wrapper<DanganleixingEntity> wrapper);
	
	DanganleixingVO selectVO(@Param("ew") Wrapper<DanganleixingEntity> wrapper);
	
	List<DanganleixingView> selectListView(@Param("ew") Wrapper<DanganleixingEntity> wrapper);

	List<DanganleixingView> selectListView(Pagination page,@Param("ew") Wrapper<DanganleixingEntity> wrapper);
	
	DanganleixingView selectView(@Param("ew") Wrapper<DanganleixingEntity> wrapper);
	
}
