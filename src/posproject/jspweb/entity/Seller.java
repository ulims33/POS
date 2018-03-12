package posproject.jspweb.entity;

public class Seller {
	private String id;
	private String SellerId;
	
	//------------생성자
	
	
	// ----------기본 생성자
	public Seller() {
		
	}

	//----------변수 들어간 생성자
	
	public Seller(String id,String SellerId) {
		this.id = id;
		this.SellerId = SellerId;
	}
	//게터세터

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSellerId() {
		return SellerId;
	}

	public void setSellerId(String sellerId) {
		SellerId = sellerId;
	}
	

}
