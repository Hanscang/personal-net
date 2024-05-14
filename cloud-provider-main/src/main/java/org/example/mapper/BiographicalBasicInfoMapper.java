package org.example.mapper;

import org.apache.ibatis.annotations.*;
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
    BiographicalBasicInfo getById(@Param("id")int id);

    @Insert("insert into t_biographical_notes values(default,#{name},#{birthday},#{email},#{university},#{graduation_date},#{sex},#{skill})")
    int add(BiographicalBasicInfo biographic);

    @Update({"<script>",
            "update t_biographical_notes",
            "  <set>",
            "    <if test='name != null'>username=#{name},</if>",
            "    <if test='birthday != null'>password=#{birthday},</if>",
            "    <if test='email != null'>email=#{email},</if>",
            "    <if test='university != null'>bio=#{university},</if>",
            "    <if test='graduationDate != null'>bio=#{graduationDate},</if>",
            "    <if test='sex != null'>bio=#{sex},</if>",
            "    <if test='sKill != null'>bio=#{sKill},</if>",
            "  </set>",
            "where id=#{id}",
            "</script>"})
    int updateAuthorValues(BiographicalBasicInfo author);

}
