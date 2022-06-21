package com.eremin.project.webapp.controller.rest;

import com.eremin.project.converter.UserConverter;
import com.eremin.project.model.dto.UserDto;
import com.eremin.project.service.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchRestController {

    private final UserService userService;
    private final UserConverter userConverter;

    @Autowired
    public SearchRestController(UserService userService, UserConverter userConverter) {
        this.userService = userService;
        this.userConverter = userConverter;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> searchUsers(@RequestParam String query) {
        List<UserDto> usersDto = userConverter.userToDto(userService.findUsersByQuery(query));
        return new ResponseEntity<>(usersDto, HttpStatus.OK);
    }
}
