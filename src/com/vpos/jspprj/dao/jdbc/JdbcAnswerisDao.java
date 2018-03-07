package com.vpos.jspprj.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.newlecture.jspprj.dao.AnswerisDao;
import com.newlecture.jspprj.entity.Answeris;
import com.newlecture.jspprj.entity.AnswerisView;

public class JdbcAnswerisDao implements AnswerisDao {
	
	@Override
	public int insert(Answeris answeris) 
	{
		String sql="SELECT * FROM MEMBER WHERE AGE <30";
		
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##sist","dclass");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			String name;
			String id;
						
				while(rs.next())
				{
					id = rs.getString("MID");
					name = rs.getString("NAME");
					
					System.out.printf("id: %s , name: %s\n", id, name);
				}	
				rs.close();
				st.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;		
	}
			
			
	@Override
	public int update(Answeris answeris) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AnswerisView> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnswerisView get(String id) {
		String sql="SELECT * FROM ANSWERIS WHERE ID=?";
		
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##sist","dclass");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,id);
			ResultSet rs = st.executeQuery();
			AnswerisView answeris = null;
			
			if(rs.next()) {
				answeris = new AnswerisView(
						rs.getString("ID"),
						rs.getString("LANGUAGE"),
						rs.getString("PLATFORM"),
						rs.getString("RUNTIME"),
						rs.getString("TITLE"),
						rs.getString("ERROR_CODE"),
						rs.getString("ERROR_MESSAGE"),
						rs.getString("SITUATION"),
						rs.getString("TRIED_TO_FIX"),
						rs.getString("REASON"),
						rs.getString("WRITER_ID"),
						rs.getString("HOW_TO_FIX"),
						rs.getDate("REG_DATE"),
						rs.getInt("HIT"),
						rs.getInt("COMMENT_COUNT")
						);
				
				//System.out.printf("id : %s, name: %s\n",id, name);
			}
				rs.close();
				st.close();
				con.close();
				
			} catch (SQLException e) {				
				e.printStackTrace();			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
