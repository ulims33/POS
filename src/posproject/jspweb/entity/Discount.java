package posproject.jspweb.entity;

public class Discount {
	private String Id;
	private String Type;
	private String DiscountPrice;
	private String DiscountId;
	
	//생성자
	
	
	//변수 들어간 생성자
	public Discount() {
		
	}
	
	
	//기본 생성자
	public Discount(String Id,String Type,String DiscountPrice,String DiscountId) {
		this.Id = Id;
		this.Type = Type;
		this.DiscountPrice = DiscountPrice;
		this.DiscountId = DiscountId;
	}

	//게터세터
	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getDiscountPrice() {
		return DiscountPrice;
	}


	public void setDiscountPrice(String discountPrice) {
		DiscountPrice = discountPrice;
	}


	public String getDiscountId() {
		return DiscountId;
	}


	public void setDiscountId(String discountId) {
		DiscountId = discountId;
	}
	
	
	

	
}
