package com.mossfon.dao;

import java.util.Date;
import java.util.List;

import com.mossfon.domain.Client;
import com.mossfon.domain.Follow;
import com.mossfon.domain.Manager;
import com.mossfon.domain.Promoter;



public interface FollowDao {
	Follow get(int id);

	int save(Follow follows);

	void update(Follow follows);

	void delete(Follow follows);

	void delete(int id);

	List<Follow> findAll();
	
	List<Follow> findByTime(Date date);
	
	List<Follow> findByPromoter(Promoter promoter);
	
	List<Follow> findByClient(Client client);
	
	List<Manager> findByManager(Manager manager);
	
}
