package posproject.jspweb.entity;

public class Sales {
	private String id;
	private String ProductName; 
	private String Price; 
	private String Time; 
	private String Payment; 
	private String PointCheck;
	private String TimeId;
	
	//------------------------생성자
	
	
		// ----------기본 생성자
		public Sales() {
			
		}
		
		//----------변수 들어간 생성자
		public Sales( String id, String ProductName, String Price, String Time, 
							String Payment, String PointCheck,String TimeId ) {
			this.id = id;
			this.ProductName = ProductName;
			this.Price = Price;
			this.Time = Time;
			this.Payment = Payment;
			this.PointCheck = PointCheck;
			this.TimeId = TimeId;
		}
		//게터세터

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProductName() {
			return ProductName;
		}

		public void setProductName(String productName) {
			ProductName = productName;
		}

		public String getPrice() {
			return Price;
		}

		public void setPrice(String price) {
			Price = price;
		}

		public String getTime() {
			return Time;
		}

		public void setTime(String time) {
			Time = time;
		}

		public String getPayment() {
			return Payment;
		}

		public void setPayment(String payment) {
			Payment = payment;
		}

		public String getPointCheck() {
			return PointCheck;
		}

		public void setPointCheck(String pointCheck) {
			PointCheck = pointCheck;
		}

		public String getTimeId() {
			return TimeId;
		}

		public void setTimeId(String timeId) {
			TimeId = timeId;
		}
		
	
}
