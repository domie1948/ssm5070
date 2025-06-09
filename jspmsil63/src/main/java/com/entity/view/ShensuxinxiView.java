package com.entity.view;

import com.entity.ShensuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申诉信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
@TableName("shensuxinxi")
public class ShensuxinxiView  extends ShensuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShensuxinxiView(){
	}
 
 	public ShensuxinxiView(ShensuxinxiEntity shensuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shensuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
