package com.entity.vo;

import com.entity.DanganxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 档案信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-26 20:12:43
 */
public class DanganxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rudangshijian;
		
	/**
	 * 处理结果
	 */
	
	private String chulijieguo;
				
	
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
