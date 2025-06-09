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


import com.dao.ShiguleixingDao;
import com.entity.ShiguleixingEntity;
import com.service.ShiguleixingService;
import com.entity.vo.ShiguleixingVO;
import com.entity.view.ShiguleixingView;

@Service("shiguleixingService")
public class ShiguleixingServiceImpl extends ServiceImpl<ShiguleixingDao, ShiguleixingEntity> implements ShiguleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiguleixingEntity> page = this.selectPage(
                new Query<ShiguleixingEntity>(params).getPage(),
                new EntityWrapper<ShiguleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiguleixingEntity> wrapper) {
		  Page<ShiguleixingView> page =new Query<ShiguleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiguleixingVO> selectListVO(Wrapper<ShiguleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiguleixingVO selectVO(Wrapper<ShiguleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiguleixingView> selectListView(Wrapper<ShiguleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiguleixingView selectView(Wrapper<ShiguleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
