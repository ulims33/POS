package posproject.jspweb.dao;

import java.util.List;

import posproject.jspweb.entity.SellerInformation;

public interface SellerInformationDao {
	int insert (SellerInformation sellerInformation);
	int delete(String id);
	int update(SellerInformation sellerInformation);
	
	SellerInformation get(String id);
	List<SellerInformation> getList();
}
