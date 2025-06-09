package com.entity.view;

import com.entity.DanganleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 档案类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
@TableName("danganleixing")
public class DanganleixingView  extends DanganleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DanganleixingView(){
	}
 
 	public DanganleixingView(DanganleixingEntity danganleixingEntity){
 	try {
			BeanUtils.copyProperties(this, danganleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
