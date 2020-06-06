package com.solvd.NavigatorProject.models.user;

public class Passenger {
	private Long id;
	private Long userId;
	private User user; 
	
	public Passenger() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
