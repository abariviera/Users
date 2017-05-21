package application.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import application.entity.User;

@Mapper
public interface UserMapper {
	
    @Select("SELECT * FROM users WHERE UPPER(name) LIKE #{filtro} OR UPPER(surname) LIKE #{filtro} OR UPPER(username) LIKE #{filtro} OR UPPER(email) LIKE #{filtro}")
    List<User> searchUser(@Param("filtro") String filtro);
    
    @Insert("INSERT INTO users (name, surname, username, password, register_date, email, phone, is_enabled) VALUES (#{user.name}, #{user.surname}, #{user.username}, #{user.password}, #{user.registerDate}, #{user.email}, #{user.phone}, #{user.isEnabled})")
    int insert(@Param("user") User user);

    @Select("SELECT * FROM users")
    List<User> selectAll();

    @Select("DELETE FROM users WHERE id=#{id}")
	int delete(int id);

	int update(User user);
}
