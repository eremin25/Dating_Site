package com.eremin.project.service.impl;

import com.eremin.project.dao.abstracts.ReadWriteDao;
import com.eremin.project.model.entity.UserInfo;
import com.eremin.project.service.abstracts.UserInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ReadWriteServiceImpl<UserInfo, Long> implements UserInfoService {

    public UserInfoServiceImpl(ReadWriteDao<UserInfo, Long> dao) {
        super(dao);
    }
}
