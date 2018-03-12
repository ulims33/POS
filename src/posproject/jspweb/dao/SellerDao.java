package posproject.jspweb.dao;

import java.util.List;

import posproject.jspweb.entity.Seller;

public interface SellerDao {
	int insert (Seller seller);
	int delete(String id);
	int update(Seller seller);
	
	Seller get(String id);
	List<Seller> getList();
}
