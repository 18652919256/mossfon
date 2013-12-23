package com.mossfon.domain;

import java.io.Serializable;
import java.util.Date;

public class Audit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 审计公司ID
	private int audit_id;
	// 审计公司信息
	private Incorp incorp;
	// 审计费用
	private double audit_fee;
	// 审计开始时间
	private Date audit_begin;
	// 审计结束时间
	private Date audit_end;
	// 备注
	private String audit_tips;

	// 无参数构造器
	public Audit() {

	}

	// 初始化全部属性的构造器
	public Audit(int audit_id, Incorp incorp, double audit_fee,
			Date audit_begin, Date audit_end, String audit_tips) {
		super();
		this.audit_id = audit_id;
		this.incorp = incorp;

		this.audit_fee = audit_fee;
		this.audit_begin = audit_begin;
		this.audit_end = audit_end;
		this.audit_tips = audit_tips;
	}

	// 所有属性的getter和setter方法
	public int getAudit_id() {
		return audit_id;
	}

	public void setAudit_id(int audit_id) {
		this.audit_id = audit_id;
	}

	public Incorp getIncorp() {
		return incorp;
	}

	public void setIncorp(Incorp incorp) {
		this.incorp = incorp;
	}

	public double getAudit_fee() {
		return audit_fee;
	}

	public void setAudit_fee(double audit_fee) {
		this.audit_fee = audit_fee;
	}

	public Date getAudit_begin() {
		return audit_begin;
	}

	public void setAudit_begin(Date audit_begin) {
		this.audit_begin = audit_begin;
	}

	public Date getAudit_end() {
		return audit_end;
	}

	public void setAudit_end(Date audit_end) {
		this.audit_end = audit_end;
	}

	public String getAudit_tips() {
		return audit_tips;
	}

	public void setAudit_tips(String audit_tips) {
		this.audit_tips = audit_tips;
	}

}
