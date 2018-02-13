package posproject.jspweb.dao;


public interface AdminDao 
{
	 Admin getList();
	   
	 Admin getList(String id);
	
	 Admin getList(String password); 
	
	 Admin getList(String id, String password);
	  
}



public interface MenuDao 
{
	 Menu getMenu();
	   
	 Menu getMenu(String id);
	   
	 Menu getMenu(String type_id); 

	 Menu getMenu(String price); 

	 Menu getMenu(String menu_id); 
	
	 Menu getMenu(String id, String type_id, String price, String menu_id) ;
	  
}



public interface SellerDao 
{
	 Seller getSeller();
	   
	 Seller getSeller(String id);
	
	 Seller getSeller(String Seller_id); 
	
	 Seller getSeller(String id, String Seller_id) ;
	  
}