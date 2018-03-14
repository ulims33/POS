package posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import posproject.jspweb.dao.ClasssDao;
import posproject.jspweb.entity.Admin;
import posproject.jspweb.entity.Classs;

public class JdbcClasssDao implements ClasssDao {

	@Override
	public int insert(Classs classs) {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO Class (" + 
			 		"    id," + 
				 
			 		") VALUES("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, classs.getId());
				

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
		 String sql = "DELETE  Classs WHERE ID=?"; 
		
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
	public int update(Classs classs) {
		// TODO Auto-generated method stub
		 String sql = "UPEATE  admin SET password (" + 
				 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, classs.getId());
				

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
	public Classs get(String id) {
		// TODO Auto-generated method stub
				 String sql = "SELECT * FROM classs WHERE ID=?";
				 Classs classs = null;
				 
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
							classs = new Classs(
									rs.getString("id")
				
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
				return classs;
			}
	

	@Override
	public List<Classs> getList() {
		// TODO Auto-generated method stub
String sql = "SELECT * FROM Classs";
		
		
		//list에 answerisview 값을 저장하기 위한 준비
		List<Classs> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//쿼리문을 물음표로 설정할시 preparedstatement 사용
			PreparedStatement st = con.prepareStatement(sql);
			 //자료형에 따라서 입력되는 형태가 달라짐
			
			
			ResultSet rs = st.executeQuery(); //prepared 사용시 resultset에서 sql 사용 x
			
			//자료형 일치시키기 
			Classs classs = null;
			
			while(rs.next())
			{
				classs = new Classs(
						rs.getString("id")
						
						);
				
				//list에 가져온값 추가
				list.add(classs);
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