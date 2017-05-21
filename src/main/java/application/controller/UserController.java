package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.entity.User;
import application.service.user.UserService;
import application.utils.SQLUtils;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
    @RequestMapping(value="/list", method = RequestMethod.GET)
    public List<User> selectAll() {
        return this.userService.selectAll();
    }
    
    @RequestMapping(value="/search", method = RequestMethod.GET)
    public List<User> searchUser(String filtro) {
        List<User> searchUser = this.userService.searchUser(SQLUtils.prepareLikeValue(filtro));
		return searchUser;
    }
}