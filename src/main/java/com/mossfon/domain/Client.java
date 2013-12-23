package com.mossfon.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 客户编号
	private int client_id;
	// 客户姓名
	private String client_name;
	// 客户详细信息
	private Detail detail;
	// 客户所属业务员
	private Promoter promoter;
	// 客户注册的公司
	private Set<Incorp> incorps = new HashSet<Incorp>();
	// 客户的法律业务
	private Set<Law> laws = new HashSet<Law>();
	//客户的跟进信息
	private Set<Follow> follows = new HashSet<Follow>();
	
	// 无参数构造器
	public Client() {

	}

	// 初始化所有参数的构造器
	

	// 所有属性的getter和setter方法
	public int getClient_id() {
		return client_id;
	}

	public Client(int client_id, String client_name, Detail detail,
			Promoter promoter, Set<Incorp> incorps, Set<Law> laws,
			Set<Follow> follows) {
		super();
		this.client_id = client_id;
		this.client_name = client_name;
		this.detail = detail;
		this.promoter = promoter;
		this.incorps = incorps;
		this.laws = laws;
		this.follows = follows;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	

	public Promoter getPromoter() {
		return promoter;
	}

	public void setPromoter(Promoter promoter) {
		this.promoter = promoter;
	}

	public Set<Incorp> getIncorps() {
		return incorps;
	}

	public void setIncorps(Set<Incorp> incorps) {
		this.incorps = incorps;
	}

	public Set<Law> getLaws() {
		return laws;
	}

	public void setLaws(Set<Law> laws) {
		this.laws = laws;
	}

	public Set<Follow> getFollows() {
		return follows;
	}

	public void setFollows(Set<Follow> follows) {
		this.follows = follows;
	}
	
}
