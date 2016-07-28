package com.jarvis.lw.persistence.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.jarvis.lw.core.constants.BaseConstant;
import com.jarvis.lw.core.constants.BaseStatus;
import com.jarvis.lw.core.domain.User;
import com.jarvis.lw.persistence.IUserDao;

public class UserJDBCDaoImpl extends JdbcDaoSupport implements IUserDao {

	private static final String TABLENAME = "t_user";
	
	public BaseConstant save(User object) {
		BaseStatus status;
		String sql = "insert into t_user(name) values";
		return null;
	}

	public BaseConstant delete(long id) {
		String sql = "delete from " + TABLENAME + " where id = ?";
		int count = this.getJdbcTemplate().update(sql,new Object[]{Long.valueOf(id)});
		return count == 1 ? BaseStatus.SUCCESS:BaseStatus.FAILURE;
	}

	public BaseConstant update(User object) {
		return null;
	}

	public User findById(long id) {
		
		return null;
	}

	

}
