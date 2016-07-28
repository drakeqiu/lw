package com.jarvis.lw.core.service.base;

import com.jarvis.lw.core.constants.BaseStatus;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

	public BaseStatus save(T object) {
		return null;
	}

	public BaseStatus delete(long id) {
		return null;
	}

	public BaseStatus update(T object) {
		return null;
	}

	public T findById(long id) {
		return null;
	}

}
