package com.mossfon.dao;

import java.util.Date;
import java.util.List;


import com.mossfon.domain.Audit;
import com.mossfon.domain.Client;
import com.mossfon.domain.Incorp;
import com.mossfon.domain.Law;


public interface IncorpDao {
	
	Incorp get(int id);

	int save(Incorp incorp);

	void update(Incorp incorp);

	void delete(Incorp incorp);

	void delete(int id);

	List<Incorp> findAll();
	
	Incorp findByName(String name);
	
	List<Incorp> findByDestination(String destination);
	
	List<Incorp> findByTime(Date registerdate);
	
	Incorp findByAudit(Audit audit);
	
	Incorp findByLaw(Law law);
	
	List<Incorp> findByClient(Client client);
}
