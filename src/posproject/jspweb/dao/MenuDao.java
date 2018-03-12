package posproject.jspweb.dao;

import java.util.List;

import posproject.jspweb.entity.Menu;

public interface MenuDao {
	int insert (Menu menu);
	int delete(String id);
	int update(Menu menu);
	
	Menu get(String id);
	List<Menu> getList();
}
