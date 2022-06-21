package com.eremin.project.dao.impl;

import com.eremin.project.dao.abstracts.UserInfoDao;
import com.eremin.project.model.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDaoImpl extends ReadWriteDaoImpl<UserInfo, Long> implements UserInfoDao {
}
