package com.wanglu.bean;

/**
 * 
 * @author wanglu
 *
 */
public class Image {
	
	private String url;
	private String desc;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	public String toString() {
		return "Image [url=" + url + ", desc=" + desc + "]";
	}
	
	

}
