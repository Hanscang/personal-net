package org.example.service;

import org.example.entities.Biographic.BiographicalBasicInfo;
import org.example.entities.User;
import org.example.entities.dto.BiographicalNote;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.service
 * @date 2024/5/13 23:55
 */
public interface BiographicalService{
    BiographicalNote getByID(Integer id);
//    int addBiographicalNote(User user);
//    int modifyBiographicalNote(User user);
}
