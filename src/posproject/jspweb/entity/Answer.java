package posproject.jspweb.entity;

public class Answer {
	private String id;
	private String Store_Name; 
	private String Title; 
	private String Contents; 
	private String Seller_Id;
	
	//------------생성자
	
	
	// ----------기본 생성자
	public Answer() {
		
	}

	//----------변수 들어간 생성자
	
	public Answer(String id,String Store_Name,String Title,String Contents,String Seller_Id) {
		this.id = id;
		this.Store_Name = Store_Name;
		this.Title = Title;
		this.Contents = Contents;
		this.Seller_Id = Seller_Id;
	}
	
	
	//게터세터
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStore_Name() {
		return Store_Name;
	}
	public void setStore_Name(String store_Name) {
		Store_Name = store_Name;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContents() {
		return Contents;
	}
	public void setContents(String contents) {
		Contents = contents;
	}
	public String getSeller_Id() {
		return Seller_Id;
	}
	public void setSeller_Id(String seller_Id) {
		Seller_Id = seller_Id;
	} 
	
}
