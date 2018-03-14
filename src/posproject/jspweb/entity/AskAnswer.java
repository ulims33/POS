package posproject.jspweb.entity;

public class AskAnswer {
	private String Id;

	//-------생성자
	
	//-------기본생성자
	public AskAnswer() {
		
	}
	
	//---------변수 들어간 생성자
	public AskAnswer(String Id ) {
		this.Id = Id;
	}
	
	
	//게터세터
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
		
}
