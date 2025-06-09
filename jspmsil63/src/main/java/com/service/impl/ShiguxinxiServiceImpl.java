package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiguxinxiDao;
import com.entity.ShiguxinxiEntity;
import com.service.ShiguxinxiService;
import com.entity.vo.ShiguxinxiVO;
import com.entity.view.ShiguxinxiView;

@Service("shiguxinxiService")
public class ShiguxinxiServiceImpl extends ServiceImpl<ShiguxinxiDao, ShiguxinxiEntity> implements ShiguxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiguxinxiEntity> page = this.selectPage(
                new Query<ShiguxinxiEntity>(params).getPage(),
                new EntityWrapper<ShiguxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiguxinxiEntity> wrapper) {
		  Page<ShiguxinxiView> page =new Query<ShiguxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiguxinxiVO> selectListVO(Wrapper<ShiguxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiguxinxiVO selectVO(Wrapper<ShiguxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiguxinxiView> selectListView(Wrapper<ShiguxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiguxinxiView selectView(Wrapper<ShiguxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
