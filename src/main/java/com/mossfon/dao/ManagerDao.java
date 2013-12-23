package com.mossfon.dao;

import java.util.List;

import com.mossfon.domain.Manager;



public interface ManagerDao {
	
	Manager get(int id);
	
	int save(Manager manager);

	void update(Manager manager);

	void delete(Manager manager);

	void delete(int id);

	List<Manager> findAll();
	
	List<Manager> findByNameAndPassword(Manager manager);
	
	Manager findByName(String name);
	
}
