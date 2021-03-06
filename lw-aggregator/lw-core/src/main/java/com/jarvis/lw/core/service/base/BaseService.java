package com.jarvis.lw.core.service.base;

import com.jarvis.lw.core.constants.BaseConstant;

public interface BaseService<T> {
	public BaseConstant save(T object);
	public BaseConstant delete(long id);
	public BaseConstant update(T object);
	public T findById(long id);
}
