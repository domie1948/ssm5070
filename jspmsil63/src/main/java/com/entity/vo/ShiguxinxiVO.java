package com.entity.vo;

import com.entity.ShiguxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 事故信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public class ShiguxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 事故类型
	 */
	
	private String shiguleixing;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 车主姓名
	 */
	
	private String chezhuxingming;
		
	/**
	 * 车牌
	 */
	
	private String chepai;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 发生原因
	 */
	
	private String fashengyuanyin;
		
	/**
	 * 处理结果
	 */
	
	private String chulijieguo;
		
	/**
	 * 事故时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shigushijian;
		
	/**
	 * 处理警察
	 */
	
	private String chulijingcha;
		
	/**
	 * 天气
	 */
	
	private String tianqi;
		
	/**
	 * 处罚金额
	 */
	
	private Integer chufajine;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：发生原因
	 */
	 
	public void setFashengyuanyin(String fashengyuanyin) {
		this.fashengyuanyin = fashengyuanyin;
	}
	
	/**
	 * 获取：发生原因
	 */
	public String getFashengyuanyin() {
		return fashengyuanyin;
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
				
	
	/**
	 * 设置：事故时间
	 */
	 
	public void setShigushijian(Date shigushijian) {
		this.shigushijian = shigushijian;
	}
	
	/**
	 * 获取：事故时间
	 */
	public Date getShigushijian() {
		return shigushijian;
	}
				
	
	/**
	 * 设置：处理警察
	 */
	 
	public void setChulijingcha(String chulijingcha) {
		this.chulijingcha = chulijingcha;
	}
	
	/**
	 * 获取：处理警察
	 */
	public String getChulijingcha() {
		return chulijingcha;
	}
				
	
	/**
	 * 设置：天气
	 */
	 
	public void setTianqi(String tianqi) {
		this.tianqi = tianqi;
	}
	
	/**
	 * 获取：天气
	 */
	public String getTianqi() {
		return tianqi;
	}
				
	
	/**
	 * 设置：处罚金额
	 */
	 
	public void setChufajine(Integer chufajine) {
		this.chufajine = chufajine;
	}
	
	/**
	 * 获取：处罚金额
	 */
	public Integer getChufajine() {
		return chufajine;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
