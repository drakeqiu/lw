package com.jarvis.lw.persistence;

import com.jarvis.lw.core.constants.BaseConstant;

public interface IBaseDao<T> {
	public BaseConstant save(T object);
	public BaseConstant delete(long id);
	public BaseConstant update(T object);
	public T findById(long id);
}
