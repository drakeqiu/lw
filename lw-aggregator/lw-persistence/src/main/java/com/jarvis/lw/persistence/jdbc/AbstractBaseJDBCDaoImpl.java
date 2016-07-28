package com.jarvis.lw.persistence.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jarvis.lw.core.constants.BaseConstant;
import com.jarvis.lw.core.constants.BaseStatus;
import com.jarvis.lw.persistence.AbstractBaseDaoImpl;

public abstract class AbstractBaseJDBCDaoImpl<T> extends AbstractBaseDaoImpl<T> {
	protected JdbcTemplate jdbcTemplate;
	
	public final BaseConstant delete(long id, String tablename) {
		int count = 0;
		String sql = "delete from " + tablename + " where id = ?";
		count = jdbcTemplate.update(sql,new Object[]{Long.valueOf(id)});
		return count == 1 ? BaseStatus.SUCCESS:BaseStatus.FAILURE;
	}
}
