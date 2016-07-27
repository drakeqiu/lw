package com.jarvis.lw.core.service.base;

public interface BaseService<T> {
	public BaseConstant.BaseStatus save(T object);
	public BaseConstant.BaseStatus delete(long id);
	public BaseConstant.BaseStatus update(T object);
	public T findById(long id);
}
