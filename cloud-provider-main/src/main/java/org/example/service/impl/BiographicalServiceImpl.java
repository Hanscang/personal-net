package org.example.service.impl;

import org.example.entities.Biographic.BiographicalBasicInfo;
import org.example.entities.User;
import org.example.service.BiographicalService;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.service.impl
 * @date 2024/5/13 23:49
 */
public class BiographicalServiceImpl implements BiographicalService {
    @Override
    public BiographicalBasicInfo getByID(Integer id) {
        return null;
    }

    @Override
    public int addBiographicalNote(User user) {
        return 0;
    }

    @Override
    public int modifyBiographicalNote(User user) {
        return 0;
    }
}
