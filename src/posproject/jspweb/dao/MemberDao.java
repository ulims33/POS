package posproject.jspweb.dao;

import java.util.List;

import posproject.jspweb.entity.Member;

public interface MemberDao{
	int insert (Member member);
	int delete(String id);
	int update(Member member);
	
	Member get(String id);
	List<Member> getList();
}
