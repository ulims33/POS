package posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import posproject.jspweb.dao.MenuDao;
import posproject.jspweb.entity.Menu;


public class JdbcMenuDao implements MenuDao {

	@Override
	public int insert(Menu menu) {
		 String sql = "INSERT INTO Menu (" + 
			 		"    id," + 
			 		"    Name," + 
			 		"    Price," +
			 		"    MenuId," + 
			 		"    DivisionId" + 
			 		
			 		") VALUES("
			 		+ "?,?,?,?,?)";
			 System.out.println("D");
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
					//st.setString(1, Menuis.getId());
					st.setString(1, menu.getId());
					st.setString(2, menu.getName());
					st.setString(3, menu.getPrice());
					st.setString(4, menu.getMenuId());
					st.setString(5, menu.getDivisionId());
									
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
		 String sql = "DELETE  Menu WHERE ID=?"; 
			
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
	public int update(Menu menu) {
		// TODO Auto-generated method stub
		 String sql = "UPEATE  menu SET password (" + 
				 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, menu.getId());
					st.setString(2, menu.getName());
					st.setString(3, menu.getPrice());
					st.setString(4, menu.getMenuId());
					st.setString(5, menu.getDivisionId());

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
	public Menu get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM Menu WHERE ID=?";
		 Menu menu = null;
			 
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
						menu = new Menu(
								rs.getString("id"),
								rs.getString("Name"),
								rs.getString("Price"),
								rs.getString("MenuId"),
								rs.getString("DivisionId")
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
			return menu;
	}

	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
	String sql = "SELECT * FROM Menu";
		
		
		//list에 Menuisview 값을 저장하기 위한 준비
		List<Menu> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//쿼리문을 물음표로 설정할시 preparedstatement 사용
			PreparedStatement st = con.prepareStatement(sql);
			 //자료형에 따라서 입력되는 형태가 달라짐
			
			
			ResultSet rs = st.executeQuery(); //prepared 사용시 resultset에서 sql 사용 x
			
			//자료형 일치시키기 
			Menu menu = null;
			
			while(rs.next())
			{
				menu = new Menu(
						rs.getString("id"),
						rs.getString("Name"),
						rs.getString("Price"),
						rs.getString("MenuId"),
						rs.getString("DivisionId")
						);
				
				//list에 가져온값 추가
				list.add(menu);
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