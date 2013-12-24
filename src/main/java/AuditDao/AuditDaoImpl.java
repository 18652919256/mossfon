package AuditDao;

import java.util.Date;
import java.util.List;

import com.mossfon.dao.AuditDao;
import com.mossfon.domain.Audit;
import com.mossfon.domain.Incorp;

public class AuditDaoImpl implements AuditDao{

	@Override
	public Audit get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Audit audit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Audit audit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Audit audit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Audit> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Audit> findByTime(Date begin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Audit> findByIncorp(Incorp incorp) {
		// TODO Auto-generated method stub
		return null;
	}

}
