package posproject.jspweb.dao.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import posproject.jspweb.dao.MemberDao;
import posproject.jspweb.entity.Member;
import posproject.jspweb.entity.Member;


public class JdbcMemberDao implements MemberDao{

	@Override
	public int insert(Member member) {
		 String sql = "INSERT INTO Member (" + 
			 		"    id," + 
			 		"    Name," + 
			 		"    NumberOfCoupon," +
			 		"    Tel," + 
			 		"    RankId," + 
			 		"    MemberId" +
			 		
			 		") VALUES("
			 		+ "?,?,?,?,?,?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
					//st.setString(1, Memberis.getId());
					st.setString(1, member.getId());
					st.setString(2, member.getName());
					st.setString(3, member.getNumberOfCoupon());
					st.setString(4, member.getTel());
					st.setString(5, member.getRankId());
					st.setString(6, member.getMemberId());
									
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
		 String sql = "DELETE  member WHERE ID=?"; 
			
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
	public int update(Member Member) {
		// TODO Auto-generated method stub
		 String sql = "UPEATE  Member SET password (" + 
				 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, Member.getId());
					st.setString(2, Member.getName());
					st.setString(3, Member.getNumberOfCoupon());
					st.setString(4, Member.getTel());
					st.setString(5, Member.getRankId());
					st.setString(6, Member.getMemberId());

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
	public Member get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM Member WHERE ID=?";
		 Member member = null;
			 
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
						member = new Member(
								rs.getString("id"),
								rs.getString("Name"),
								rs.getString("NumberOfCoupon"),
								rs.getString("Tel"),
								rs.getString("RankId"),
								rs.getString("MemberId")
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
			return member;
	}

	@Override
	public List<Member> getList() {
		// TODO Auto-generated method stub
	String sql = "SELECT * FROM Member";
		
		
		//list에 Memberisview 값을 저장하기 위한 준비
		List<Member> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//쿼리문을 물음표로 설정할시 preparedstatement 사용
			PreparedStatement st = con.prepareStatement(sql);
			 //자료형에 따라서 입력되는 형태가 달라짐
			
			
			ResultSet rs = st.executeQuery(); //prepared 사용시 resultset에서 sql 사용 x
			
			//자료형 일치시키기 
			Member member = null;
			
			while(rs.next())
			{
				member = new Member(
						rs.getString("id"),
						rs.getString("Name"),
						rs.getString("NumberOfCoupon"),
						rs.getString("Tel"),
						rs.getString("RankId"),
						rs.getString("MemberId")
						);
				
				//list에 가져온값 추가
				list.add(member);
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