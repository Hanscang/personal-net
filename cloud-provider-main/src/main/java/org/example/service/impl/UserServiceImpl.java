package org.example.service.impl;

import org.example.entities.User;
import org.example.mapper.UserMapper;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.service.impl
 * @date 2024/3/8 0:55
 */

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper usermapper;

    public UserServiceImpl(UserMapper usermapper) {
        this.usermapper = usermapper;
    }

    @Override
    public User getByID(int id) {
        return usermapper.getByID(id);
    }

    @Override
    public boolean addByUser(User user) {
        int i = usermapper.addByUser(user);
        if(i > 0)
            return true;
        return false;
    }
}
