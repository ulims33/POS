package posproject.jspweb.entity;

public class Classs {
	private String Id;
	
	//생성자
	
	
		//기본  생성자
		public Classs(){
			
		}
		
		
		//변수 들어간 생성자
		public Classs(String Id) {
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
