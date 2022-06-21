package com.eremin.project.webapp.controller.rest;

import com.eremin.project.converter.UserInfoConverter;
import com.eremin.project.model.dto.UserInfoDto;
import com.eremin.project.model.entity.UserInfo;
import com.eremin.project.service.abstracts.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/userInfo")
public class UserInfoRestController {

    private final UserInfoService userInfoService;
    private final UserInfoConverter userInfoConverter;

    @Autowired
    public UserInfoRestController(UserInfoService userInfoService, UserInfoConverter userInfoConverter) {
        this.userInfoService = userInfoService;
        this.userInfoConverter = userInfoConverter;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserInfoDto> userInfoById(@PathVariable Long id) {
        UserInfo userInfo = userInfoService.findById(id);
        UserInfoDto userInfoDto = userInfoConverter.userInfoToDto(userInfo);
        return new ResponseEntity<>(userInfoDto, HttpStatus.OK);
    }
}
