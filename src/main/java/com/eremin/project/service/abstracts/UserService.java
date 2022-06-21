package com.eremin.project.service.abstracts;

import com.eremin.project.model.entity.User;

import java.util.List;

public interface UserService extends ReadWriteService<User, Long> {

    List<User> findUsersByQuery(String query);
}
