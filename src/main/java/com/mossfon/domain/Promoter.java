package com.mossfon.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Promoter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 业务员编号
	private int promoter_id;
	// 业务员姓名
	private String promoter_cname;
	// 业务员英文名
	private String promoter_name;
	//	业务员密码
	private String promoter_password;
	// 业务员性别
	private String promoter_gender;
	// 业务员Skype
	private String promoter_skype;
	// 业务员邮箱
	private String promoter_mail;
	// 业务员手机
	private String promoter_mobile;
	// 业务员电话
	private String promoter_telephone;
	// 业务员所属经理
	private Manager manager;
	// 业务员的客户
	private Set<Client> cliets = new HashSet<Client>();
	// 业务员的跟进信息
	private Set<Follow> follows = new HashSet<Follow>();
	

	// 无参数构造器
	public Promoter() {

	}

	// 初始化全部属性的构造器
	

	// 所有属性的getter和setter方法
	

	public String getPromoter_cname() {
		return promoter_cname;
	}

	public Promoter(int promoter_id, String promoter_cname,
			String promoter_name, String promoter_password,
			String promoter_gender, String promoter_skype,
			String promoter_mail, String promoter_mobile,
			String promoter_telephone, Manager manager, Set<Client> cliets,
			Set<Follow> follows) {
		super();
		this.promoter_id = promoter_id;
		this.promoter_cname = promoter_cname;
		this.promoter_name = promoter_name;
		this.promoter_password = promoter_password;
		this.promoter_gender = promoter_gender;
		this.promoter_skype = promoter_skype;
		this.promoter_mail = promoter_mail;
		this.promoter_mobile = promoter_mobile;
		this.promoter_telephone = promoter_telephone;
		this.manager = manager;
		this.cliets = cliets;
		this.follows = follows;
	}

	public int getPromoter_id() {
		return promoter_id;
	}

	public void setPromoter_id(int promoter_id) {
		this.promoter_id = promoter_id;
	}

	public void setPromoter_cname(String promoter_cname) {
		this.promoter_cname = promoter_cname;
	}

	public String getPromoter_name() {
		return promoter_name;
	}

	public void setPromoter_name(String promoter_name) {
		this.promoter_name = promoter_name;
	}

	public String getPromoter_gender() {
		return promoter_gender;
	}

	public void setPromoter_gender(String promoter_gender) {
		this.promoter_gender = promoter_gender;
	}

	public String getPromoter_skype() {
		return promoter_skype;
	}

	public void setPromoter_skype(String promoter_skype) {
		this.promoter_skype = promoter_skype;
	}

	public String getPromoter_mail() {
		return promoter_mail;
	}

	public void setPromoter_mail(String promoter_mail) {
		this.promoter_mail = promoter_mail;
	}

	public String getPromoter_mobile() {
		return promoter_mobile;
	}

	public void setPromoter_mobile(String promoter_mobile) {
		this.promoter_mobile = promoter_mobile;
	}

	public String getPromoter_telephone() {
		return promoter_telephone;
	}

	public void setPromoter_telephone(String promoter_telephone) {
		this.promoter_telephone = promoter_telephone;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Set<Client> getCliets() {
		return cliets;
	}

	public void setCliets(Set<Client> cliets) {
		this.cliets = cliets;
	}


	public Set<Follow> getFollows() {
		return follows;
	}

	public void setFollows(Set<Follow> follows) {
		this.follows = follows;
	}


	public String getPromoter_password() {
		return promoter_password;
	}

	public void setPromoter_password(String promoter_password) {
		this.promoter_password = promoter_password;
	}
	
}
