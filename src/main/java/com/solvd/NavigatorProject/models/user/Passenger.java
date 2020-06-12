package com.solvd.NavigatorProject.models.user;

import com.solvd.NavigatorProject.models.Entity;

public class Passenger extends Entity{
	
	private Long userId;
	private User user; 
	
	public Passenger() {
		
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
