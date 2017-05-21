package application.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import application.dao.UserMapper;
import application.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectAll() {
		return this.userMapper.selectAll();
	}

	@Override
	public List<User> searchUser(String filtro) {
		if (StringUtils.isEmpty(filtro)) { 
			return this.userMapper.selectAll();
		}
		
		return this.userMapper.searchUser(filtro);
	}
}
