package com.eremin.project.service;

import com.eremin.project.model.entity.User;
import com.eremin.project.model.entity.UserInfo;
import com.eremin.project.service.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultEntity {

    @Autowired
    public DefaultEntity(UserService userService) {
        userService.persist(new User().toBuilder()
                .username("oleg22")
                .email("oleg22@gmail.com")
                .password("1L23E4")
                .userInfo(UserInfo.builder()
                        .firstName("Oleg")
                        .lastName("Smirnov")
                        .age((byte) 21)
                        .user(User.builder().id(1L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("roma48")
                .email("roman13@gmail1.com")
                .password("erbwe3213")
                .userInfo(UserInfo.builder()
                        .firstName("Roman")
                        .lastName("Ivanov")
                        .age((byte) 56)
                        .user(User.builder().id(2L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("lisichka41")
                .email("lisichka4@mail1.ru")
                .password("qwer324")
                .userInfo(UserInfo.builder()
                        .firstName("Sveta")
                        .lastName("Popova")
                        .age((byte) 22)
                        .user(User.builder().id(3L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("julianagibrid")
                .email("julana13@gmail.com")
                .password("erb3gwsr")
                .userInfo(UserInfo.builder()
                        .firstName("Juliana")
                        .lastName("Gibridova")
                        .age((byte) 16)
                        .user(User.builder().id(4L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("petrov33")
                .email("daniil.petrov@gmail.com")
                .password("1234dlfbn")
                .userInfo(UserInfo.builder()
                        .firstName("Daniil")
                        .lastName("Petrov")
                        .age((byte) 21)
                        .user(User.builder().id(5L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("dimon56")
                .email("dmitriy@gmail.com")
                .password("erb3")
                .userInfo(UserInfo.builder()
                        .firstName("Dmitry")
                        .lastName("Vasukin")
                        .age((byte) 38)
                        .user(User.builder().id(6L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("vika67")
                .email("viktoriay44@mail.ru")
                .password("qwerefvc3")
                .userInfo(UserInfo.builder()
                        .firstName("Viktoriya")
                        .lastName("Gulyakina")
                        .age((byte) 22)
                        .user(User.builder().id(7L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("valentina")
                .email("valentina@gmail.com")
                .password("erb3")
                .userInfo(UserInfo.builder()
                        .firstName("Valentina")
                        .lastName("Taiskaya")
                        .age((byte) 27)
                        .user(User.builder().id(8L).build())
                        .build())
                .build());
    }
}
