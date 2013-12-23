package com.mossfon.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Manager extends Promoter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<Promoter> promoters=new HashSet<Promoter>();
	public Manager(){
		
	}
	public Manager(Set<Promoter> promoters) {
		super();
		this.promoters = promoters;
	}
	public Set<Promoter> getPromoters() {
		return promoters;
	}
	public void setPromoters(Set<Promoter> promoters) {
		this.promoters = promoters;
	}
	
}
