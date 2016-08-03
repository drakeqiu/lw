package com.jarvis.lw.persistence.jdbc;

import java.util.ArrayList;
import java.util.List;

import com.jarvis.lw.core.domain.User;
import com.jarvis.lw.persistence.IUserDao;

public class UserJDBCDaoImpl extends AbstractBaseJDBCDaoImpl<User> implements IUserDao {
	private static final String TABLENAME = "t_user";

	public void save(User user) {
		String sql = "insert into t_user(name,age,cell,address,birthday,description) values (?,?,?,?,?,?)";
		Object[] properties = new Object[] { user.getName(), user.getAge(), user.getCell(), user.getAddress(),
				user.getBirthday(), user.getDescription() };
		int[] types = new int[]{java.sql.Types.VARCHAR, java.sql.Types.INTEGER, java.sql.Types.VARCHAR, java.sql.Types.VARCHAR, java.sql.Types.INTEGER, java.sql.Types.VARCHAR};

		save(sql, properties, types);
	}

	public void delete(long id) {
		String sql = "delete from t_user where id = ?";
		delete(id, sql);
	}

	public void update(User object) {
	}

	public User findById(long id) {

		return null;
	}

	public User findByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
