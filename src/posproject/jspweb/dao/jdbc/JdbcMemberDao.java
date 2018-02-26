package posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import posproject.jspweb.dao.MemberDao;
import posproject.jspweb.entity.Member;

public class JdbcMemberDao implements MemberDao{

	@Override
	public int insert(Member member) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO MEMBER(고치고) VALUES(?,?,?,?,?,?)";
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
			PreparedStatement st = con.prepareStatement(sql);
			//Statement st = con.createStatement();
				    
			//st.setString(1, answeris.getId());
			st.setString(1, member.getId());
			st.setString(2, member.getLanguage());
			st.setString(3, member.getPlatform());
			st.setString(4, member.getRuntime());
			st.setString(5, member.getErrorCode());
			st.setString(6, member.getErrorMessage());
			st.setString(7, member.getSituation());
			st.setString(8, member.getTriedToFix());
			st.setString(9, member.getReason());
			st.setString(10, member.getHowToFix());
			st.setString(11, member.getWriterId());

			result = st.executeUpdate(); //결과 반환

			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
