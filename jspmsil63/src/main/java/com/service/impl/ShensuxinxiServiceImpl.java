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


import com.dao.ShensuxinxiDao;
import com.entity.ShensuxinxiEntity;
import com.service.ShensuxinxiService;
import com.entity.vo.ShensuxinxiVO;
import com.entity.view.ShensuxinxiView;

@Service("shensuxinxiService")
public class ShensuxinxiServiceImpl extends ServiceImpl<ShensuxinxiDao, ShensuxinxiEntity> implements ShensuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShensuxinxiEntity> page = this.selectPage(
                new Query<ShensuxinxiEntity>(params).getPage(),
                new EntityWrapper<ShensuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShensuxinxiEntity> wrapper) {
		  Page<ShensuxinxiView> page =new Query<ShensuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShensuxinxiVO> selectListVO(Wrapper<ShensuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShensuxinxiVO selectVO(Wrapper<ShensuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShensuxinxiView> selectListView(Wrapper<ShensuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShensuxinxiView selectView(Wrapper<ShensuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
