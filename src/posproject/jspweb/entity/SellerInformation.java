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
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPeriod() {
		return Period;
	}

	public void setPeriod(String period) {
		Period = period;
	}

	public String getStoreName() {
		return StoreName;
	}

	public void setStoreName(String storeName) {
		StoreName = storeName;
	}

	public String getAdminId() {
		return AdminId;
	}

	public void setAdminId(String adminId) {
		AdminId = adminId;
	}

	public SellerInformation(String id,String Password,String Period,String StoreName,String AdminId) {
		this.id = id;
		this.Password = Password;
		this.Period = Period;
		this.StoreName = StoreName;
		this.AdminId = AdminId;
	}

}
