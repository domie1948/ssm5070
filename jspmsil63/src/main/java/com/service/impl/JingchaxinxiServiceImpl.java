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


import com.dao.JingchaxinxiDao;
import com.entity.JingchaxinxiEntity;
import com.service.JingchaxinxiService;
import com.entity.vo.JingchaxinxiVO;
import com.entity.view.JingchaxinxiView;

@Service("jingchaxinxiService")
public class JingchaxinxiServiceImpl extends ServiceImpl<JingchaxinxiDao, JingchaxinxiEntity> implements JingchaxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingchaxinxiEntity> page = this.selectPage(
                new Query<JingchaxinxiEntity>(params).getPage(),
                new EntityWrapper<JingchaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingchaxinxiEntity> wrapper) {
		  Page<JingchaxinxiView> page =new Query<JingchaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingchaxinxiVO> selectListVO(Wrapper<JingchaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingchaxinxiVO selectVO(Wrapper<JingchaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingchaxinxiView> selectListView(Wrapper<JingchaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingchaxinxiView selectView(Wrapper<JingchaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
