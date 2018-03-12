package posproject.jspweb.entity;

public class Class {
	private String Id;
	
	//생성자
	
	
		//기본  생성자
		public Class(){
			
		}
		
		
		//변수 들어간 생성자
		public Class(String Id) {
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
