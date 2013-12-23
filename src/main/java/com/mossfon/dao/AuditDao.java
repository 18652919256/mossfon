package com.mossfon.dao;

import java.util.Date;
import java.util.List;

import com.mossfon.domain.Audit;
import com.mossfon.domain.Incorp;


public interface AuditDao {
	Audit get(int id);

	int save(Audit audit);

	void update(Audit audit);

	void delete(Audit audit);

	void delete(int id);

	List<Audit> findAll();
	
	List<Audit> findByTime(Date begin);
	
	List<Audit> findByIncorp(Incorp incorp);
}
