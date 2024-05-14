package org.example.service.impl;

import org.example.entities.Biographic.BiographicalBasicInfo;
import org.example.entities.Biographic.Experience;
import org.example.entities.dto.BiographicalNote;
import org.example.mapper.BiographicalBasicInfoMapper;
import org.example.mapper.ExperienceMapper;
import org.example.service.BiographicalService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.service.impl
 * @date 2024/5/13 23:49
 */
@Service
public class BiographicalServiceImpl implements BiographicalService {

    private final BiographicalBasicInfoMapper basicInfoMapper;
    private final ExperienceMapper experienceMapper;

    public BiographicalServiceImpl(BiographicalBasicInfoMapper basicInfoMapper, ExperienceMapper experienceMapper) {
        this.basicInfoMapper = basicInfoMapper;
        this.experienceMapper = experienceMapper;
    }

    @Override
    public BiographicalNote getByID(Integer id) {
        if (id == null) return null;
        BiographicalBasicInfo basicInfo = basicInfoMapper.getById(id);
        if (basicInfo == null) return null;
        List<Experience> exps = experienceMapper.getByBiographicId(basicInfo.getId());

        return new BiographicalNote(basicInfo, exps);
    }

//    @Override
//    public int addBiographicalNote(User user) {
//        return 0;
//    }
//
//    @Override
//    public int modifyBiographicalNote(User user) {
//        return 0;
//    }
}
