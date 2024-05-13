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
    @Select("select * from t_user where id = #{id}")
    User getByID(@Param("id")int id);

    @Insert("insert into t_user values(default,#{name},#{phone},#{sex})")
    int addByUser(User user);
}
