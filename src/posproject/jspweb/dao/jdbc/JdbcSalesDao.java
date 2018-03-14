package posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import posproject.jspweb.dao.SalesDao;
import posproject.jspweb.entity.Sales;



public class JdbcSalesDao implements SalesDao{

	@Override
	public int insert(Sales sales) {
		 String sql = "INSERT INTO Sales (" + 
			 		"    id," + 
			 		"    ProductName," + 
			 		"    Price," +
			 		"    Time," + 
			 		"    Payment," + 
			 		"    PointCheck" +
			 		"    TimeId" +
			 		
			 		") VALUES("
			 		+ "?,?,?,?,?,?,?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
					//st.setString(1, Salesis.getId());
					st.setString(1, sales.getId());
					st.setString(2, sales.getProductName());
					st.setString(3, sales.getPrice());
					st.setString(4, sales.getTime());
					st.setString(5, sales.getPayment());
					st.setString(6, sales.getPointCheck());
					st.setString(7, sales.getTimeId());
									
					result = st.executeUpdate();
					
					st.close();
					con.close(); 
					
				} catch (ClassNotFoundException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			return result;
	}


	@Override
	public int delete(String id) {
		 String sql = "DELETE  Sales WHERE ID=?"; 
			
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
				PreparedStatement st = con.prepareStatement(sql);
				
			
				st.setString(1, id);
				

				result = st.executeUpdate();
				
				st.close();
				con.close(); 
				
			} catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

		return result;
	}

	@Override
	public int update(Sales sales) {
		// TODO Auto-generated method stub
		 String sql = "UPEATE  Sales SET password (" + 
				 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, sales.getId());
					st.setString(2, sales.getProductName());
					st.setString(3, sales.getPrice());
					st.setString(4, sales.getTime());
					st.setString(5, sales.getPayment());
					st.setString(6, sales.getPointCheck());
					st.setString(7, sales.getTimeId());

					result = st.executeUpdate();
					
					st.close();
					con.close(); 
					
				} catch (ClassNotFoundException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 

			return result;
	}

	@Override
	public Sales get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM Sales WHERE ID=?";
		 Sales sales = null;
			 
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					//쿼리문을 물음표로 설정할시 preparedstatement 사용
					PreparedStatement st = con.prepareStatement(sql);
					st.setString(1, id); //자료형에 따라서 입력되는 형태가 달라짐
					
					ResultSet rs = st.executeQuery(); //prepared 사용시 resultset에서 sql 사용 x
					
					
					
					if(rs.next())
					{
						sales = new Sales(
								rs.getString("id"),
								rs.getString("ProductName"),
								rs.getString("Price"),
								rs.getString("Time"),
								rs.getString("Payment"),
								rs.getString("PointCheck"),
								rs.getString("TimeId")
								);
					}
					
					rs.close();
					st.close();
					con.close(); 
					
				} catch (ClassNotFoundException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			return sales;
	}

	@Override
	public List<Sales> getList() {
		// TODO Auto-generated method stub
	String sql = "SELECT * FROM Sales";
		
		
		//list에 Salesisview 값을 저장하기 위한 준비
		List<Sales> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//쿼리문을 물음표로 설정할시 preparedstatement 사용
			PreparedStatement st = con.prepareStatement(sql);
			 //자료형에 따라서 입력되는 형태가 달라짐
			
			
			ResultSet rs = st.executeQuery(); //prepared 사용시 resultset에서 sql 사용 x
			
			//자료형 일치시키기 
			Sales sales = null;
			
			while(rs.next())
			{
				sales = new Sales(
						rs.getString("id"),
						rs.getString("ProductName"),
						rs.getString("Price"),
						rs.getString("Time"),
						rs.getString("Payment"),
						rs.getString("PointCheck"),
						rs.getString("TimeId")
						);
				
				//list에 가져온값 추가
				list.add(sales);
			}
		
			
		
			rs.close();
			st.close();
			con.close(); 
			
		} catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//list에 반환
		return list;
	}

}