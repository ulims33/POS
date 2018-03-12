package posproject.jspweb.entity;

public class Rank {
	private String Id;
	private String RankRange;
	private String Benefit;
	private String Ranks;
	private String RankId;
	//생성자
	
	
	//변수 들어간 생성자
	public Rank() {
		
	}
	
	
	//기본 생성자
	public Rank(String Id,String RankRange,String Benefit,String Ranks,String RankId) {
		this.Id = Id;
		this.RankRange = RankRange;
		this.Benefit = Benefit;
		this.Ranks = Ranks;
		this.RankId = RankId;
	}
	//게터세터


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getRankRange() {
		return RankRange;
	}


	public void setRankRange(String rankRange) {
		RankRange = rankRange;
	}


	public String getBenefit() {
		return Benefit;
	}


	public void setBenefit(String benefit) {
		Benefit = benefit;
	}


	public String getRanks() {
		return Ranks;
	}


	public void setRanks(String ranks) {
		Ranks = ranks;
	}


	public String getRankId() {
		return RankId;
	}


	public void setRankId(String rankId) {
		RankId = rankId;
	}
	

}
