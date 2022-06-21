package com.eremin.project.dao.abstracts;

import com.eremin.project.model.entity.User;

import java.util.List;

public interface UserDao extends ReadWriteDao<User, Long> {

    List<User> findUsersByQuery(String query);
}
