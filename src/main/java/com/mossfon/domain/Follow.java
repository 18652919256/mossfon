package com.mossfon.domain;

import java.io.Serializable;
import java.util.Date;

public class Follow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 跟进编号
	private int follow_id;
	// 被跟进的客户
	private Client client;
	// 跟进客户的业务员
	private Promoter promoter;
	// 跟进时间
	private Date follow_date;
	// 下次跟进提醒时间
	private Date follow_nextdate;
	// 跟进内容
	private String follow_context;
	// 经理批复
	private Manager manager;

	// 无参数构造器
	public Follow() {

	}
	
	// 初始化全部属性的构造器
	public Follow(int follow_id, Client client, Promoter promoter,
			Date follow_date, Date follow_nextdate, String follow_context,
			Manager manager) {
		super();
		this.follow_id = follow_id;
		this.client = client;
		this.promoter = promoter;
		this.follow_date = follow_date;
		this.follow_nextdate = follow_nextdate;
		this.follow_context = follow_context;
		this.manager = manager;
	}

	// 所有属性的getter和setter方法
	public int getFollow_id() {
		return follow_id;
	}

	public void setFollow_id(int follow_id) {
		this.follow_id = follow_id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Promoter getPromoter() {
		return promoter;
	}

	public void setPromoter(Promoter promoter) {
		this.promoter = promoter;
	}

	public Date getFollow_date() {
		return follow_date;
	}

	public void setFollow_date(Date follow_date) {
		this.follow_date = follow_date;
	}

	public Date getFollow_nextdate() {
		return follow_nextdate;
	}

	public void setFollow_nextdate(Date follow_nextdate) {
		this.follow_nextdate = follow_nextdate;
	}

	public String getFollow_context() {
		return follow_context;
	}

	public void setFollow_context(String follow_context) {
		this.follow_context = follow_context;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

}
