package com.eremin.project.converter;

import com.eremin.project.model.dto.UserDto;
import com.eremin.project.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class UserConverter {

    public abstract User dtoToUser(UserDto userDto);

    @Mapping(target = "userInfoId", expression = "java(user.getUserInfo().getId())")
    public abstract UserDto userToDto(User user);

//    public abstract List<User> dtoToUser(List<UserDto> userDtoList);

    public abstract List<UserDto> userToDto(List<User> userList);
}
