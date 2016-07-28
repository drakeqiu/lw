package com.jarvis.lw.persistence.jdbc;

import java.util.Collection;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.jarvis.lw.core.constants.BaseConstant;
import com.jarvis.lw.core.constants.BaseStatus;
import com.jarvis.lw.persistence.IBaseDao;

public abstract class AbstractBaseJDBCDaoImpl<T> extends JdbcDaoSupport implements IBaseDao<T> {

	protected final BaseConstant delete(long id, String sql) {
		int count = getJdbcTemplate().update(sql, new Object[] { Long.valueOf(id) });
		return count == 1 ? BaseStatus.SUCCESS : BaseStatus.FAILURE;
	}

	protected final BaseConstant save(String sql, Object[] objects) {
		int count = getJdbcTemplate().update(sql, objects);
		return count == 1 ? BaseStatus.SUCCESS : BaseStatus.FAILURE;
	}
}
