package posproject.jspweb.entity;

public class Ask {
	private String Id;
	private String Title;
	private String Contents;
	private String SellerId;
	
	//생성자
	
	
	//변수 들어간 생성자
	public Ask() {
		
	}
	
	
	//기본 생성자
	public Ask(String Id,String Title,String Contents,String SellerId) {
		this.Id = Id;
		this.Title = Title;
		this.Contents = Contents;
		this.SellerId = SellerId;
	}
	
	
	
	//게터세터
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
	public String getSellerId() {
		return SellerId;
	}
	public void setSeller_Id(String sellerId) {
		SellerId = sellerId;
	}
	
	

}
