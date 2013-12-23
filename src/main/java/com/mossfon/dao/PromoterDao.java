package com.mossfon.dao;

import java.util.List;


import com.mossfon.domain.Audit;
import com.mossfon.domain.Client;
import com.mossfon.domain.Follow;
import com.mossfon.domain.Incorp;
import com.mossfon.domain.Law;
import com.mossfon.domain.Manager;
import com.mossfon.domain.Promoter;


public interface PromoterDao {
	Promoter get(int id);
	
	int save(Promoter promoter);

	void update(Promoter promoter);

	void delete(Promoter promoter);

	void delete(int id);

	List<Promoter> findAll();
	
	List<Promoter> findByNameAndPassword(Promoter promoter);
	
	Promoter findByName(String name);
	
	List<Promoter> findByManager(Manager manager);
	
	Promoter findByLaw(Law law);
	
	Promoter findByFollow(Follow follow);
	
	Promoter findByIncorp(Incorp incorp);
	
	Promoter findByAudit(Audit audit);
	
	Promoter findByClient(Client client);
}
