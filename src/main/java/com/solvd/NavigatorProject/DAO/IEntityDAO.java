package com.solvd.NavigatorProject.DAO;

import java.util.List;

public interface IEntityDAO<T> {

	public List<T> getEntities();
	public T getEntity(Long id);
	public void save(T entity);
	public void update(T entity);
	public void delete(Long id);
}
