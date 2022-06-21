package com.eremin.project.service.impl;

import com.eremin.project.dao.abstracts.ReadWriteDao;
import com.eremin.project.dao.abstracts.UserDao;
import com.eremin.project.model.entity.User;
import com.eremin.project.service.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ReadWriteServiceImpl<User, Long> implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(ReadWriteDao<User, Long> dao) {
        super(dao);
    }

    @Override
    public List<User> findUsersByQuery(String query) {
        return userDao.findUsersByQuery(query);
    }
}
