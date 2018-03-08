package posproject.jspweb.entity;

public class Member {
	private String id;
	private String name; 
	private String presentCoupon; 
	private String phoneNumber; 
	private String rankId; 
	private String memberId;
	
	
	//------------------------생성자
	
	
	// ----------기본 생성자
	public Member() {
		
	}
	
	//----------변수 들어간 생성자
	public Member( String id, String name, String presentCoupon, String phoneNumber, String rankId, String memberId ) {
		this.id = id;
		this.name = name;
		this.presentCoupon = presentCoupon;
		this.phoneNumber = phoneNumber;
		this.rankId = rankId;
		this.memberId = memberId;		
	}
	
	
	
	
	//--------------------------GETTER SETTER
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPresentCoupon() {
		return presentCoupon;
	}
	public void setPresentCoupon(String presentCoupon) {
		this.presentCoupon = presentCoupon;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRankId() {
		return rankId;
	}
	public void setRankId(String rankId) {
		this.rankId = rankId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	
	
	
}