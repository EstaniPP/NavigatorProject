package com.solvd.NavigatorProject.DAO;

import java.util.List;

public interface IEntityDAO<T> {

	List<T> getEntities();
	
	T getEntity(Long id);
	
	void delete(Long id);
	
	void update(T entity);

	void save(T entity);
}
