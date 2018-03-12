package posproject.jspweb.dao;

import java.util.List;

import posproject.jspweb.entity.AskAnswer;

public interface AskAnswerDao {
	
	int insert(AskAnswer askAnswer);
	int delete(String id);
	int update(AskAnswer askAnswer);
	
	AskAnswer get(String id);
	List<AskAnswer> getList();
}
