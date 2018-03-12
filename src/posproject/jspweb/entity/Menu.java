package posproject.jspweb.entity;


	public class Menu {
		private String id;
		private String Name; 
		private String Price; 
		private String MenuId; 
		private String DivisionId;
		
		//------------생성자
		
		
		// ----------기본 생성자
		public Menu() {
			
		}

		//----------변수 들어간 생성자
		
		public Menu(String id,String Name,String Price,String MenuId,String DivisionId) {
			this.id = id;
			this.Name = Name;
			this.Price = Price;
			this.MenuId = MenuId;
			this.DivisionId = DivisionId;
		}
		//게터세터

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getPrice() {
			return Price;
		}

		public void setPrice(String price) {
			Price = price;
		}

		public String getMenuId() {
			return MenuId;
		}

		public void setMenuId(String menuId) {
			MenuId = menuId;
		}

		public String getDivisionId() {
			return DivisionId;
		}

		public void setDivisionId(String divisionId) {
			DivisionId = divisionId;
		}
		
}
