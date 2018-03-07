package com.vpos.jspprj.entity;


	public class Answeris 
	{
	   private String id;
	   private String storeName;
	   private String title;
	   private String contents;
	   private String errorMessage;
	   private String sellerId;
	
	
   public Answeris()
   {	   
   }


	public Answeris(String id, String storeName, String title, String contents, String errorMessage, String sellerId) {
		super();
		this.id = id;
		this.storeName = storeName;
		this.title = title;
		this.contents = contents;
		this.errorMessage = errorMessage;
		this.sellerId = sellerId;
	}
	
	
	//Getter & Setter
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getStoreName() {
		return storeName;
	}
	
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getContents() {
		return contents;
	}
	
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	public String getSellerId() {
		return sellerId;
	}
	
	
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
		
}
