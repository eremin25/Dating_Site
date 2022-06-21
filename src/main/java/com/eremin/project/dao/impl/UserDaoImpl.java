package com.eremin.project.dao.impl;

import com.eremin.project.dao.abstracts.UserDao;
import com.eremin.project.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends ReadWriteDaoImpl<User, Long> implements UserDao {

    @Override
    public List<User> findUsersByQuery(String query) {
        return
                em.createQuery("select u from User u where u.userInfo.firstName like :query or u.userInfo.lastName like :query", User.class)
                        .setParameter("query", "%" + query + "%")
                        .getResultList();
    }
}
