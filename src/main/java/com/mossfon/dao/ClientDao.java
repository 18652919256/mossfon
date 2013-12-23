package com.mossfon.dao;

import java.util.List;

import com.mossfon.domain.Client;
import com.mossfon.domain.Follow;
import com.mossfon.domain.Incorp;
import com.mossfon.domain.Law;
import com.mossfon.domain.Promoter;


public interface ClientDao {
	Client get(int id);

	int save(Client client);

	void update(Client client);

	void delete(Client client);

	void delete(int id);

	List<Client> findAll();
	
	List<Client> findByName(String name);
	
	Client findByLaw(Law law);
	
	Client findByFollow(Follow follow);
	
	Client findByIncorp(Incorp incorp);
	
	List<Client> findByPromoter(Promoter promoter);
	
	
}
