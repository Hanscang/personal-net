package org.example.service;

import org.example.entities.User;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.service
 * @date 2024/3/7 23:48
 */

public interface UserService {
    User getByID(int id);

    boolean addByUser(User user);
}
