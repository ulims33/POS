package posproject.jspweb.dao;

import java.util.List;

import posproject.jspweb.entity.Answer;

public interface AnswerDao {

	int insert(Answer answer);
	int delete(String id);
	int update(Answer answer);
	
	Answer get(String id);
	List<Answer> getList();
}
