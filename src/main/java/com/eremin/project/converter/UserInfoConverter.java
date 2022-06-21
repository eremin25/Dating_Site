package com.eremin.project.converter;

import com.eremin.project.model.dto.UserInfoDto;
import com.eremin.project.model.entity.UserInfo;
import com.eremin.project.service.abstracts.UserInfoService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class UserInfoConverter {

    @Autowired
    protected UserInfoService userInfoService;

    public abstract UserInfoDto userInfoToDto(UserInfo userInfo);
}
