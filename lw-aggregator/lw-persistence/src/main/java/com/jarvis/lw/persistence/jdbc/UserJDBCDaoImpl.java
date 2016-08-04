package com.jarvis.lw.persistence.jdbc;

import com.jarvis.lw.core.domain.User;
import com.jarvis.lw.persistence.IUserDao;

public class UserJDBCDaoImpl extends AbstractBaseJDBCDaoImpl<User> implements IUserDao {

	public void save(User user) {
		String sql = "insert into t_user(name,gender, age,cell,address,birthday,description) values (?,?,?,?,?,?,?)";
		Object[] properties = new Object[] { user.getName(), user.getGender(), user.getAge(), user.getCell(), user.getAddress(),
				new java.sql.Date(user.getBirthday().getTime()), user.getDescription() };
		int[] types = new int[] { java.sql.Types.VARCHAR, java.sql.Types.CHAR, java.sql.Types.INTEGER, java.sql.Types.VARCHAR,
				java.sql.Types.VARCHAR, java.sql.Types.DATE, java.sql.Types.VARCHAR };

		save(sql, properties, types);
	}

	public void delete(long id) {
		String sql = "delete from t_user where id = ?";
		delete(id, sql);
	}

	public void update(User user) {
		String sql = "update t_user set name = ?, gender = ?, age = ?, cell = ?, address = ?, birthday = ?, description = ? where id = ?";
		Object[] properties = new Object[] { user.getName(), user.getGender(), user.getAge(), user.getCell(), user.getAddress(),
				new java.sql.Date(user.getBirthday().getTime()), user.getDescription(), user.getId() };
		int[] types = new int[] { java.sql.Types.VARCHAR, java.sql.Types.CHAR, java.sql.Types.INTEGER, java.sql.Types.VARCHAR,
				java.sql.Types.VARCHAR, java.sql.Types.DATE, java.sql.Types.VARCHAR, java.sql.Types.BIGINT };

		update(sql, properties, types);
	}

	public User findByID(long id) {
	
		return null;
	}

}
