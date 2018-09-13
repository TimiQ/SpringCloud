/**
 * 
 */
package com.pcd.springcloud.model;

/**
 * @author TimiQ
 *
 */
public class User {
	private Integer id;
	private String name;
	private String password;
	private int phone;
	private String city;
	private String ip;
	private String img;
	private String wechat;
	private String sina;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}
	
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
	
	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}
	
	/**
	 * @return the wechat
	 */
	public String getWechat() {
		return wechat;
	}
	
	/**
	 * @param wechat the wechat to set
	 */
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	
	/**
	 * @return the sina
	 */
	public String getSina() {
		return sina;
	}
	
	/**
	 * @param sina the sina to set
	 */
	public void setSina(String sina) {
		this.sina = sina;
	}
	
}
