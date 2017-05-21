package application.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import application.entity.User;

@Mapper
public interface UserMapper {
	
    @Select("SELECT * FROM users WHERE UPPER(name) LIKE #{filtro} OR UPPER(surname) LIKE #{filtro} OR UPPER(username) LIKE #{filtro} OR UPPER(email) LIKE #{filtro}")
    List<User> searchUser(@Param("filtro") String filtro);
    
    @Select("SELECT * FROM users")
    List<User> selectAll();
}
