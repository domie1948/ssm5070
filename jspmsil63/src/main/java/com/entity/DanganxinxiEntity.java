package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 档案信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
@TableName("danganxinxi")
public class DanganxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DanganxinxiEntity() {
		
	}
	
	public DanganxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 档案编号
	 */
					
	private String danganbianhao;
	
	/**
	 * 档案名称
	 */
					
	private String danganmingcheng;
	
	/**
	 * 事故名称
	 */
					
	private String shigumingcheng;
	
	/**
	 * 档案类型
	 */
					
	private String danganleixing;
	
	/**
	 * 档案图片
	 */
					
	private String dangantupian;
	
	/**
	 * 档案内容
	 */
					
	private String danganneirong;
	
	/**
	 * 入档时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date rudangshijian;
	
	/**
	 * 处理结果
	 */
					
	private String chulijieguo;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：档案编号
	 */
	public void setDanganbianhao(String danganbianhao) {
		this.danganbianhao = danganbianhao;
	}
	/**
	 * 获取：档案编号
	 */
	public String getDanganbianhao() {
		return danganbianhao;
	}
	/**
	 * 设置：档案名称
	 */
	public void setDanganmingcheng(String danganmingcheng) {
		this.danganmingcheng = danganmingcheng;
	}
	/**
	 * 获取：档案名称
	 */
	public String getDanganmingcheng() {
		return danganmingcheng;
	}
	/**
	 * 设置：事故名称
	 */
	public void setShigumingcheng(String shigumingcheng) {
		this.shigumingcheng = shigumingcheng;
	}
	/**
	 * 获取：事故名称
	 */
	public String getShigumingcheng() {
		return shigumingcheng;
	}
	/**
	 * 设置：档案类型
	 */
	public void setDanganleixing(String danganleixing) {
		this.danganleixing = danganleixing;
	}
	/**
	 * 获取：档案类型
	 */
	public String getDanganleixing() {
		return danganleixing;
	}
	/**
	 * 设置：档案图片
	 */
	public void setDangantupian(String dangantupian) {
		this.dangantupian = dangantupian;
	}
	/**
	 * 获取：档案图片
	 */
	public String getDangantupian() {
		return dangantupian;
	}
	/**
	 * 设置：档案内容
	 */
	public void setDanganneirong(String danganneirong) {
		this.danganneirong = danganneirong;
	}
	/**
	 * 获取：档案内容
	 */
	public String getDanganneirong() {
		return danganneirong;
	}
	/**
	 * 设置：入档时间
	 */
	public void setRudangshijian(Date rudangshijian) {
		this.rudangshijian = rudangshijian;
	}
	/**
	 * 获取：入档时间
	 */
	public Date getRudangshijian() {
		return rudangshijian;
	}
	/**
	 * 设置：处理结果
	 */
	public void setChulijieguo(String chulijieguo) {
		this.chulijieguo = chulijieguo;
	}
	/**
	 * 获取：处理结果
	 */
	public String getChulijieguo() {
		return chulijieguo;
	}

}
