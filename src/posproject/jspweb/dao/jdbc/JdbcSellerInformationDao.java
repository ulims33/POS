package posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import posproject.jspweb.dao.SellerInformationDao;
import posproject.jspweb.entity.Answer;
import posproject.jspweb.entity.SellerInformation;

public class JdbcSellerInformationDao  implements SellerInformationDao {

	@Override
	public int insert(SellerInformation sellerInformation) {
		 String sql = "INSERT INTO sellerInformation (" + 
			 		"    id," + 
			 		"    Password," + 
			 		"    Period," +
			 		"    StoreName," + 
			 		"    AdminId" + 
			 		
			 		") VALUES("
			 		+ "?,?,?,?,?)";
		
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
					//st.setString(1, SellerInformationis.getId());
					st.setString(1, sellerInformation.getId());
					st.setString(2, sellerInformation.getPassword());
					st.setString(3, sellerInformation.getPeriod());
					st.setString(4, sellerInformation.getStoreName());
					st.setString(5, sellerInformation.getAdminId());
									
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
		// TODO Auto-generated method stub
		 String sql = "DELETE  sellerInformation WHERE ID=?"; 
			
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
	public int update(SellerInformation sellerInformation) {
		// TODO Auto-generated method stub
				 String sql = "UPEATE  SellerInformation SET password (" + 
						 	
					 		") VALUES ("
					 		+ "?)";
					 
					 int result = 0;
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
							
							String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
							Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
							PreparedStatement st = con.prepareStatement(sql);
							
						
							st.setString(1, sellerInformation.getId());
							st.setString(2, sellerInformation.getPassword());
							st.setString(3, sellerInformation.getPeriod());
							st.setString(4, sellerInformation.getStoreName());
							st.setString(5, sellerInformation.getAdminId());

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
	public SellerInformation get(String id) {
		// TODO Auto-generated method stub
				 String sql = "SELECT * FROM answer WHERE ID=?";
				 SellerInformation sellerInformation = null;
					 
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
								sellerInformation = new SellerInformation(
										rs.getString("id"),
										rs.getString("Password"),
										rs.getString("Period"),
										rs.getString("StoreName"),
										rs.getString("AdminId")
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
					return sellerInformation;
			}

	

	@Override
	public List<SellerInformation> getList() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM SellerInformation";
			
			
			//list에 answerisview 값을 저장하기 위한 준비
			List<SellerInformation> list = new ArrayList<>();
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
				//쿼리문을 물음표로 설정할시 preparedstatement 사용
				PreparedStatement st = con.prepareStatement(sql);
				 //자료형에 따라서 입력되는 형태가 달라짐
				
				
				ResultSet rs = st.executeQuery(); //prepared 사용시 resultset에서 sql 사용 x
				
				//자료형 일치시키기 
				SellerInformation sellerInformation = null;
				
				while(rs.next())
				{
					sellerInformation = new SellerInformation(
							rs.getString("id"),
							rs.getString("Password"),
							rs.getString("Period"),
							rs.getString("StoreName"),
							rs.getString("AdminId")
							);
					
					//list에 가져온값 추가
					list.add(sellerInformation);
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
