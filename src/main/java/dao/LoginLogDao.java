package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import domain.LoginLog;

@Repository
public class LoginLogDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertLoginLog(LoginLog loginlog) {
		String sqlStr = "INSERT INTO t_login_log(user_id,ip,login_datetime) VALUES(?,?,?)";

		Object[] args = { loginlog.getUserId(), loginlog.getIp(), loginlog.getLoginDate() };

		jdbcTemplate.update(sqlStr, args);
	}
	

}
