package com.jarvis.lw.persistence;

import javax.sql.DataSource;

public abstract class BaseDaoImpl<T> implements IBaseDao<T> {
	protected DataSource dataSource;
}
