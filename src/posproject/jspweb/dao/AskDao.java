package posproject.jspweb.dao;

import java.util.List;

import posproject.jspweb.entity.Admin;

public interface AskDao {
	
	int insert (Admin admin);
	int delete(String id);
	int update(Admin admin);
	
	Admin get(String id);
	List<Admin> getList();
}
