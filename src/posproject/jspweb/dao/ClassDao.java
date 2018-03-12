package posproject.jspweb.dao;

import java.util.List;

import posproject.jspweb.entity.Class;

public interface ClassDao {
	int insert(Class Class);
	int delete(String id);
	int update(Class Class);
	
	Class get(String id);
	List<Class> getList();
}
