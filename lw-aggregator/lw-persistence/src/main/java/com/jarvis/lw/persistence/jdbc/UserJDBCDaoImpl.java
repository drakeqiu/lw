package com.jarvis.lw.persistence.jdbc;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.jarvis.lw.core.constants.BaseConstant;
import com.jarvis.lw.core.constants.BaseStatus;
import com.jarvis.lw.core.domain.User;
import com.jarvis.lw.persistence.IUserDao;

public class UserJDBCDaoImpl extends AbstractBaseJDBCDaoImpl<User> implements IUserDao {
	private static final String TABLENAME = "t_user";

	public void save(User user) {
		String sql = "insert into t_user(name,age,cell,address,birthday,description) values (?,?,?,?,?,?)";
		Object[] properties = new Object[] { user.getName(), user.getAge(), user.getCell(), user.getAddress(),
				user.getBirthday(), user.getDescription() };
		int[] types = new int[]{java.sql.Types.VARCHAR, java.sql.Types.INTEGER, java.sql.Types.VARCHAR, java.sql.Types.VARCHAR, java.sql.Types.INTEGER, java.sql.Types.VARCHAR};

		StringBuilder colunmBuilder = new StringBuilder();
		StringBuilder paramBuilder = new StringBuilder();
		List objList = new ArrayList();

		if (user.getName() != null && !"".equals(user.getName())) {
			if (colunmBuilder.toString().length() != 0) {
				colunmBuilder.append(',');
				paramBuilder.append(',');
			}
			colunmBuilder.append("name");
			paramBuilder.append('?');
			objList.add(user.getName());
		}

		if (user.getAge() != null) {
			if (colunmBuilder.toString().length() != 0) {
				colunmBuilder.append(',');
				paramBuilder.append('?');
			}
			colunmBuilder.append("age");
			paramBuilder.append('?');
			objList.add(user.getAge());
		}

		if (user.getCell() != null && !"".equals(user.getCell())) {
			if (colunmBuilder.toString().length() != 0) {
				colunmBuilder.append(',');
				paramBuilder.append('?');
			}
			colunmBuilder.append("cell");
			paramBuilder.append('?');
			objList.add(user.getCell());
		}

		if (user.getAddress() != null && !"".equals(user.getAddress())) {
			if (colunmBuilder.toString().length() != 0) {
				colunmBuilder.append(',');
				paramBuilder.append(',');
			}
			colunmBuilder.append("address");
			paramBuilder.append('?');
			objList.add(user.getAddress());
		}

		if (user.getBirthday() != null && user.getBirthday() != 0) {
			if (colunmBuilder.toString().length() != 0) {
				colunmBuilder.append(',');
				paramBuilder.append(',');
			}
			colunmBuilder.append("birthday");
			paramBuilder.append('?');
			objList.add(user.getBirthday());
		}

		if (user.getDescription() != null && !"".equals(user.getDescription())) {
			if (colunmBuilder.toString().length() != 0) {
				colunmBuilder.append(',');
				paramBuilder.append(',');
			}
			colunmBuilder.append("description");
			paramBuilder.append('?');
			objList.add(user.getDescription());
		}
		sql = sql + "(" + colunmBuilder.toString() + ") values (" + paramBuilder.toString() + ")";

		save(sql, objList.toArray());
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
