package com.jarvis.lw.persistence;


public interface IBaseDao<T> {
	public void save(T object);
	public void delete(long id);
	public void update(T object);
	public T findByID(long id);
}
