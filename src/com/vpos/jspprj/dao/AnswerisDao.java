package com.vpos.jspprj.dao;

import java.util.List;

import com.newlecture.jspprj.entity.Answeris;
import com.newlecture.jspprj.entity.AnswerisView;

//JdbcAnswerisDao /MyBatisAnswerisDao / SpringAnswerisDao
public interface AnswerisDao {
	public int insert(Answeris answeris);
	public int update(Answeris answeris);
	public int delete(String id);
	
	public List<AnswerisView> getList();
	public AnswerisView get(String id);
}