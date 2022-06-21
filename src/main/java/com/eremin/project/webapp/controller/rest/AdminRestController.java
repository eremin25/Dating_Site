package com.eremin.project.webapp.controller.rest;

import com.eremin.project.converter.UserConverter;
import com.eremin.project.model.dto.UserDto;
import com.eremin.project.model.entity.User;
import com.eremin.project.service.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {

    private final UserService userService;
    private final UserConverter userConverter;

    @Autowired
    public AdminRestController(UserService userService, UserConverter userConverter) {
        this.userService = userService;
        this.userConverter = userConverter;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> showAllUsers() {
        List<User> users = userService.findAll();
        List<UserDto> userDtoList = userConverter.userToDto(users);
        return new ResponseEntity<>(userDtoList, HttpStatus.OK);
    }
}
