package posproject.jspweb.dao;

import java.util.List;

import posproject.jspweb.entity.Ask;

public interface AskDao {
	
	int insert (Ask ask);
	int delete(String id);
	int update(Ask ask);
	
	Ask get(String id);
	List<Ask> getList();
}
