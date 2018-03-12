package posproject.jspweb.entity;

public class Division {
	private String id;
	
	
	//------------생성자
	
	
	// ----------기본 생성자
	public Division() {
		
	}

	//----------변수 들어간 생성자
	
	public Division(String id) {
		this.id = id;	
	}
	//게터세터

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
