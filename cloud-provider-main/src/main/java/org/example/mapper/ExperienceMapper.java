package org.example.mapper;

import org.apache.ibatis.annotations.*;
import org.example.entities.Biographic.BiographicalBasicInfo;
import org.example.entities.Biographic.Experience;

import java.util.List;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.mapper
 * @date 2024/5/15 0:04
 */

@Mapper
public interface ExperienceMapper {

    @Select("select * from t_experience where biographicId = #{id} order by ord asc")
    List<Experience> getByBiographicId(@Param("id")int id);

    @Insert("insert into t_experience values(default,#{name},#{birthday},#{email},#{university},#{graduation_date},#{sex},#{skill})")
    int add(Experience biographic);

    @Update({"<script>",
            "update t_experience",
            "  <set>",
            "    <if test='biographicId != null'>username=#{biographicId},</if>",
            "    <if test='title != null'>password=#{title},</if>",
            "    <if test='exp != null'>email=#{exp},</if>",
            "  </set>",
            "where id=#{id}",
            "</script>"})
    int updateAuthorValues(Experience experience);

}
