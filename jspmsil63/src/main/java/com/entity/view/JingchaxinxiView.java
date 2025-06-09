package com.entity.view;

import com.entity.JingchaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 警察信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
@TableName("jingchaxinxi")
public class JingchaxinxiView  extends JingchaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingchaxinxiView(){
	}
 
 	public JingchaxinxiView(JingchaxinxiEntity jingchaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jingchaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
