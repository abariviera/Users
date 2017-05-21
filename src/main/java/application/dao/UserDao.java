package application.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import application.entity.User;

@Component
public class UserDao {

	private final SqlSession sqlSession;

	public UserDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<User> selectAll() {
		return this.sqlSession.selectList("selectAll");
	}

	public List<User> findUser(String filtro) {
		return this.sqlSession.selectList("findUser", filtro);
	}
	
	public int insert(User user) {
		int id = this.sqlSession.insert("insert", user);
		return id;
	}
	
	public void delete(int id) {
		this.sqlSession.delete("delete", id);
	}

	public void update(User user) {
		this.sqlSession.update("update", user);
	}
}
