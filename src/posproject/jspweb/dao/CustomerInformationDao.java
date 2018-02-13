package posproject.jspweb.dao;

import java.util.List;

import com.newlecture.jspweb.entity.Notice;

public interface CustomerInformationDao 
{
	List<CustomerInformation> getList();
	
	List<CustomerInformation> getList(String query);

	List<CustomerInformation> getList(int page); 

	List<CustomerInformation> getList(int page, String filed, String query) ;
	
	CustomerInformation get(String id);
	
	
	CustomerInformation getPrev(String id);
	CustomerInformation getNext(String id);
}