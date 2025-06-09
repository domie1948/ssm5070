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
 * 申诉信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
@TableName("shensuxinxi")
public class ShensuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShensuxinxiEntity() {
		
	}
	
	public ShensuxinxiEntity(T t) {
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
	 * 事故名称
	 */
					
	private String shigumingcheng;
	
	/**
	 * 事故类型
	 */
					
	private String shiguleixing;
	
	/**
	 * 车牌
	 */
					
	private String chepai;
	
	/**
	 * 申诉理由
	 */
					
	private String shensuliyou;
	
	/**
	 * 申诉材料
	 */
					
	private String shensucailiao;
	
	/**
	 * 申诉日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shensuriqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 车主姓名
	 */
					
	private String chezhuxingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：事故类型
	 */
	public void setShiguleixing(String shiguleixing) {
		this.shiguleixing = shiguleixing;
	}
	/**
	 * 获取：事故类型
	 */
	public String getShiguleixing() {
		return shiguleixing;
	}
	/**
	 * 设置：车牌
	 */
	public void setChepai(String chepai) {
		this.chepai = chepai;
	}
	/**
	 * 获取：车牌
	 */
	public String getChepai() {
		return chepai;
	}
	/**
	 * 设置：申诉理由
	 */
	public void setShensuliyou(String shensuliyou) {
		this.shensuliyou = shensuliyou;
	}
	/**
	 * 获取：申诉理由
	 */
	public String getShensuliyou() {
		return shensuliyou;
	}
	/**
	 * 设置：申诉材料
	 */
	public void setShensucailiao(String shensucailiao) {
		this.shensucailiao = shensucailiao;
	}
	/**
	 * 获取：申诉材料
	 */
	public String getShensucailiao() {
		return shensucailiao;
	}
	/**
	 * 设置：申诉日期
	 */
	public void setShensuriqi(Date shensuriqi) {
		this.shensuriqi = shensuriqi;
	}
	/**
	 * 获取：申诉日期
	 */
	public Date getShensuriqi() {
		return shensuriqi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：车主姓名
	 */
	public void setChezhuxingming(String chezhuxingming) {
		this.chezhuxingming = chezhuxingming;
	}
	/**
	 * 获取：车主姓名
	 */
	public String getChezhuxingming() {
		return chezhuxingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
