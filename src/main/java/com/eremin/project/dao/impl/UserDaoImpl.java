package com.eremin.project.dao.impl;

import com.eremin.project.dao.abstracts.UserDao;
import com.eremin.project.model.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends ReadWriteDaoImpl<User, Long> implements UserDao {
}
