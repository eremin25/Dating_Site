package com.eremin.project.webapp.controller.rest;

import com.eremin.project.converter.UserConverter;
import com.eremin.project.model.dto.UserDto;
import com.eremin.project.model.entity.User;
import com.eremin.project.service.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService userService;
    private final UserConverter userConverter;

    @Autowired
    public UserRestController(UserService userService, UserConverter userConverter) {
        this.userService = userService;
        this.userConverter = userConverter;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> user(@PathVariable Long id) {
        if (!userService.existsById(id)) {
            throw new RuntimeException();
        }
        User user = userService.findById(id);
        System.out.println(userConverter.userToDto(user));
        UserDto userDto = userConverter.userToDto(user);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @GetMapping("/admin")
    public ResponseEntity<List<UserDto>> allUsersAdmin() {
        List<User> userList = userService.findAll();
        List<UserDto> userDtoList = userConverter.userToDto(userList);
        return new ResponseEntity<>(userDtoList, HttpStatus.OK);
    }
}
