package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.entities.Biographic.BiographicalBasicInfo;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.mapper
 * @date 2024/5/14 0:01
 */

@Mapper
public interface BiographicalBasicInfoMapper {
    @Select("select * from t_biographical_notes where id = #{id}")
    BiographicalBasicInfo getByID(@Param("id")int id);

    @Insert("insert into t_biographical_notes values(default,#{name},#{birthday},#{email},#{university},#{graduation_date},#{sex},#{skill})")
    int addByUser(BiographicalBasicInfo user);

}
