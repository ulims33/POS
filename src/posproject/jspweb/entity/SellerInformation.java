package posproject.jspweb.entity;

public class SellerInformation {
	private String id;
	private String Password; 
	private String Period; 
	private String StoreName; 
	private String AdminId;
	
	//------------생성자
	
	
	// ----------기본 생성자
	public SellerInformation() {
		
	}

	//----------변수 들어간 생성자
	
	public SellerInformation(String id,String Password,String Period,String StoreName,String AdminId) {
		this.id = id;
		this.Password = Password;
		this.Period = Period;
		this.StoreName = StoreName;
		this.AdminId = AdminId;
	}

}
