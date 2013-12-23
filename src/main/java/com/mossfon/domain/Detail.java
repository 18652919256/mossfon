package com.mossfon.domain;

import java.io.Serializable;

public class Detail extends Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//客户性别
	private String client_gender;
	//客户生日
	private String client_birthday;
	//客户币种
	private String client_currency;
	//客户来源
	private String client_from;
	//客户手机
	private String client_mobile;
	//客户电话
	private String client_telephone;
	//客户传真
	private	String client_fax;
	//客户邮件
	private String client_mail;
	//客户地址
	private String client_address;
	//客户国内公司名称
	private String client_company;
	//客户国内公司网址
	private String client_website;
	//客户从事的行业
	private String client_industry;
	//客户DB号
	private String client_db;
	//客户3P号
	private String client_3p;
	
	// 无参数构造器
	public Detail(){
		
	}
	
	// 初始化全部属性的构造器
	public Detail(String client_gender, String client_birthday,
			String client_currency, String client_from, String client_mobile,
			String client_telephone, String client_fax, String client_mail,
			String client_address, String client_company,
			String client_website, String client_industry, String client_db,
			String client_3p) {
		super();
		this.client_gender = client_gender;
		this.client_birthday = client_birthday;
		this.client_currency = client_currency;
		this.client_from = client_from;
		this.client_mobile = client_mobile;
		this.client_telephone = client_telephone;
		this.client_fax = client_fax;
		this.client_mail = client_mail;
		this.client_address = client_address;
		this.client_company = client_company;
		this.client_website = client_website;
		this.client_industry = client_industry;
		this.client_db = client_db;
		this.client_3p = client_3p;
	}

	// 所有属性的getter和setter方法
	public String getClient_gender() {
		return client_gender;
	}
	public void setClient_gender(String client_gender) {
		this.client_gender = client_gender;
	}
	public String getClient_birthday() {
		return client_birthday;
	}
	public void setClient_birthday(String client_birthday) {
		this.client_birthday = client_birthday;
	}
	public String getClient_currency() {
		return client_currency;
	}
	public void setClient_currency(String client_currency) {
		this.client_currency = client_currency;
	}
	public String getClient_from() {
		return client_from;
	}
	public void setClient_from(String client_from) {
		this.client_from = client_from;
	}
	public String getClient_mobile() {
		return client_mobile;
	}
	public void setClient_mobile(String client_mobile) {
		this.client_mobile = client_mobile;
	}
	public String getClient_telephone() {
		return client_telephone;
	}
	public void setClient_telephone(String client_telephone) {
		this.client_telephone = client_telephone;
	}
	public String getClient_fax() {
		return client_fax;
	}
	public void setClient_fax(String client_fax) {
		this.client_fax = client_fax;
	}
	public String getClient_mail() {
		return client_mail;
	}
	public void setClient_mail(String client_mail) {
		this.client_mail = client_mail;
	}
	public String getClient_address() {
		return client_address;
	}
	public void setClient_address(String client_address) {
		this.client_address = client_address;
	}
	public String getClient_company() {
		return client_company;
	}
	public void setClient_company(String client_company) {
		this.client_company = client_company;
	}
	public String getClient_website() {
		return client_website;
	}
	public void setClient_website(String client_website) {
		this.client_website = client_website;
	}
	public String getClient_industry() {
		return client_industry;
	}
	public void setClient_industry(String client_industry) {
		this.client_industry = client_industry;
	}
	public String getClient_db() {
		return client_db;
	}
	public void setClient_db(String client_db) {
		this.client_db = client_db;
	}
	public String getClient_3p() {
		return client_3p;
	}
	public void setClient_3p(String client_3p) {
		this.client_3p = client_3p;
	}
	
}
