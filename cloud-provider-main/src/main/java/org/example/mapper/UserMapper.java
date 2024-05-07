package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.entities.User;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.mapper
 * @date 2024/3/7 23:39
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User getByID(@Param("id")Integer id);

    @Insert("insert into user values(default,#{name},#{phone},#{sex})")
    int addByUser(User user);
}
