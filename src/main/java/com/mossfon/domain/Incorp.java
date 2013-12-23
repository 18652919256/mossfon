package com.mossfon.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Incorp implements Serializable {
	/**
	 * @author Henry
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 注册公司编号
	private int incorporaton_id;
	// 所属客户
	private Client Client;
	// 注册公司名称
	private String incorporation_name;
	// 注册地
	private String incorporation_destination;
	// 注册公司时间
	private Date incorporation_registerdate;
	// 公司年费
	private double incorporation_registerfee;
	// 注册费
	private double incorporation_annualfee;
	// 注册公司股东
	private String[] incorporation_shareholder;
	// 注册公司董事
	private String[] incorporation_director;
	// 联系人
	private String incorporation_contacts;
	// 联系人手机
	private String incorporation_telephone;
	// 联系人电话
	private String incorporation_mobile;
	// 联系人传真
	private String incorporation_fax;
	// 联系人邮件
	private String incorporation_mail;
	// 联系人地址
	private String incorporation_address;
	// 公司审计
	private Set<Audit> audits = new HashSet<Audit>();
	// 公司法务服务
	private Set<Law> laws = new HashSet<Law>();

	// 无参数构造器
	public Incorp() {

	}

	// 初始化全部属性的构造器
	

	// 所有属性的getter和setter方法
	public int getIncorporaton_id() {
		return incorporaton_id;
	}

	public Incorp(int incorporaton_id, com.mossfon.domain.Client client,
			String incorporation_name, String incorporation_destination,
			Date incorporation_registerdate, double incorporation_registerfee,
			double incorporation_annualfee, String[] incorporation_shareholder,
			String[] incorporation_director, String incorporation_contacts,
			String incorporation_telephone, String incorporation_mobile,
			String incorporation_fax, String incorporation_mail,
			String incorporation_address, Set<Audit> audits, Set<Law> laws) {
		super();
		this.incorporaton_id = incorporaton_id;
		Client = client;
		this.incorporation_name = incorporation_name;
		this.incorporation_destination = incorporation_destination;
		this.incorporation_registerdate = incorporation_registerdate;
		this.incorporation_registerfee = incorporation_registerfee;
		this.incorporation_annualfee = incorporation_annualfee;
		this.incorporation_shareholder = incorporation_shareholder;
		this.incorporation_director = incorporation_director;
		this.incorporation_contacts = incorporation_contacts;
		this.incorporation_telephone = incorporation_telephone;
		this.incorporation_mobile = incorporation_mobile;
		this.incorporation_fax = incorporation_fax;
		this.incorporation_mail = incorporation_mail;
		this.incorporation_address = incorporation_address;
		this.audits = audits;
		this.laws = laws;
	}

	public void setIncorporaton_id(int incorporaton_id) {
		this.incorporaton_id = incorporaton_id;
	}

	public Client getClient() {
		return Client;
	}

	public void setClient(Client client) {
		Client = client;
	}

	public String getIncorporation_name() {
		return incorporation_name;
	}

	public void setIncorporation_name(String incorporation_name) {
		this.incorporation_name = incorporation_name;
	}

	public String getIncorporation_destination() {
		return incorporation_destination;
	}

	public void setIncorporation_destination(String incorporation_destination) {
		this.incorporation_destination = incorporation_destination;
	}

	public Date getIncorporation_registerdate() {
		return incorporation_registerdate;
	}

	public void setIncorporation_registerdate(Date incorporation_registerdate) {
		this.incorporation_registerdate = incorporation_registerdate;
	}

	public double getIncorporation_registerfee() {
		return incorporation_registerfee;
	}

	public void setIncorporation_registerfee(double incorporation_registerfee) {
		this.incorporation_registerfee = incorporation_registerfee;
	}

	public double getIncorporation_annualfee() {
		return incorporation_annualfee;
	}

	public void setIncorporation_annualfee(double incorporation_annualfee) {
		this.incorporation_annualfee = incorporation_annualfee;
	}

	
	public String[] getIncorporation_shareholder() {
		return incorporation_shareholder;
	}

	public void setIncorporation_shareholder(String[] incorporation_shareholder) {
		this.incorporation_shareholder = incorporation_shareholder;
	}

	public String[] getIncorporation_director() {
		return incorporation_director;
	}

	public void setIncorporation_director(String[] incorporation_director) {
		this.incorporation_director = incorporation_director;
	}

	public String getIncorporation_contacts() {
		return incorporation_contacts;
	}

	public void setIncorporation_contacts(String incorporation_contacts) {
		this.incorporation_contacts = incorporation_contacts;
	}

	public String getIncorporation_telephone() {
		return incorporation_telephone;
	}

	public void setIncorporation_telephone(String incorporation_telephone) {
		this.incorporation_telephone = incorporation_telephone;
	}

	public String getIncorporation_mobile() {
		return incorporation_mobile;
	}

	public void setIncorporation_mobile(String incorporation_mobile) {
		this.incorporation_mobile = incorporation_mobile;
	}

	public String getIncorporation_fax() {
		return incorporation_fax;
	}

	public void setIncorporation_fax(String incorporation_fax) {
		this.incorporation_fax = incorporation_fax;
	}

	public String getIncorporation_mail() {
		return incorporation_mail;
	}

	public void setIncorporation_mail(String incorporation_mail) {
		this.incorporation_mail = incorporation_mail;
	}

	public String getIncorporation_address() {
		return incorporation_address;
	}

	public void setIncorporation_address(String incorporation_address) {
		this.incorporation_address = incorporation_address;
	}

	public Set<Audit> getAudits() {
		return audits;
	}

	public void setAudits(Set<Audit> audits) {
		this.audits = audits;
	}

	public Set<Law> getLaws() {
		return laws;
	}

	public void setLaws(Set<Law> laws) {
		this.laws = laws;
	}
	
}
