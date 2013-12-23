package com.mossfon.dao;

import java.util.Date;
import java.util.List;

import com.mossfon.domain.Client;
import com.mossfon.domain.Incorp;
import com.mossfon.domain.Law;



public interface LawDao {
	Law get(int id);

	int save(Law law);

	void update(Law law);

	void delete(Law law);

	void delete(int id);

	List<Law> findAll();
	
	List<Law> findByIncorp (Incorp incorp);
	
	List<Law> findByClient (Client client);
			
	List<Law> findByTime(Date begin);
	
}
