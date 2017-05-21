package application.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import application.entity.User;

@Service
public interface UserService {
	
	int insert(User user);
	
	List<User> selectAll();
	
	List<User> searchUser(String filtro);
	
	int delete(int id);

	int update(User user);

}
