package com.mossfon.domain;

import java.io.Serializable;
import java.util.Date;

public class Law implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 法务服务编号
	private int law_id;
	// 法务服务的对象客户
	private Client client;
	// 法务服务的公司
	private Incorp incorp;
	// 法务服务名称
	private String law_name;
	// 法务服务费用
	private double law_fee;
	// 法务服务要求
	private String law_requirements;
	// 法务服务开始时间
	private Date law_begin;
	// 法务服务结束时间
	private Date law_end;
	// 法务服务备注
	private String law_tips;

	// 无参数构造器
	public Law() {

	}

	// 初始化全部属性的构造器
	

	// 所有属性的getter和setter方法
	public int getLaw_id() {
		return law_id;
	}

	public Law(int law_id, Client client, Incorp incorp, String law_name,
			double law_fee, String law_requirements, Date law_begin,
			Date law_end, String law_tips) {
		super();
		this.law_id = law_id;
		this.client = client;
		this.incorp = incorp;
		this.law_name = law_name;
		this.law_fee = law_fee;
		this.law_requirements = law_requirements;
		this.law_begin = law_begin;
		this.law_end = law_end;
		this.law_tips = law_tips;
	}

	public void setLaw_id(int law_id) {
		this.law_id = law_id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getLaw_name() {
		return law_name;
	}

	public void setLaw_name(String law_name) {
		this.law_name = law_name;
	}

	public double getLaw_fee() {
		return law_fee;
	}

	public void setLaw_fee(double law_fee) {
		this.law_fee = law_fee;
	}

	public String getLaw_requirements() {
		return law_requirements;
	}

	public void setLaw_requirements(String law_requirements) {
		this.law_requirements = law_requirements;
	}

	public Date getLaw_begin() {
		return law_begin;
	}

	public void setLaw_begin(Date law_begin) {
		this.law_begin = law_begin;
	}

	public Date getLaw_end() {
		return law_end;
	}

	public void setLaw_end(Date law_end) {
		this.law_end = law_end;
	}

	public String getLaw_tips() {
		return law_tips;
	}

	public void setLaw_tips(String law_tips) {
		this.law_tips = law_tips;
	}

	public Incorp getIncorp() {
		return incorp;
	}

	public void setIncorp(Incorp incorp) {
		this.incorp = incorp;
	}
	
}
