package com.solvd.NavigatorProject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Entity {
	@JsonIgnore
	private Long id;
	
	public Entity() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
