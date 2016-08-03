package com.jarvis.lw.persistence.jdbc;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.jarvis.lw.persistence.IBaseDao;

public abstract class AbstractBaseJDBCDaoImpl<T> extends JdbcDaoSupport implements IBaseDao<T> {

	protected final void delete(long id, String sql) {
		getJdbcTemplate().update(sql, new Object[] { Long.valueOf(id) });
	}

	protected final void save(String sql, Object[] objects, int[] types) {
		getJdbcTemplate().update(sql, objects, types);
	}
	
	protected final void update(String sql, Object[] objects) {
		getJdbcTemplate().update(sql, objects);
	}
	
	protected final T findById(String sql, Object[] objects, RowMapper<T> rowMapper) {
		List<T> list = getJdbcTemplate().query(sql, objects, rowMapper);
		return list.size() > 0 ? list.get(0) : null;
	}
}
