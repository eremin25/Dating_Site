package com.eremin.project.service.impl;

import com.eremin.project.dao.abstracts.ReadWriteDao;
import com.eremin.project.model.entity.User;
import com.eremin.project.service.abstracts.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ReadWriteServiceImpl<User, Long> implements UserService {

    public UserServiceImpl(ReadWriteDao<User, Long> dao) {
        super(dao);
    }
}
