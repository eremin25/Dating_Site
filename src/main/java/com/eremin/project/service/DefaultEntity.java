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
                .username("Daniil1")
                .email("daniil1@gmail.com")
                .password("1234")
                .userInfo(UserInfo.builder()
                        .firstName("Daniil")
                        .lastName("Eremin")
                        .age((byte) 21)
                        .user(User.builder().id(1L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("Roman1")
                .email("roman@gmail1.com")
                .password("erb3")
                .userInfo(UserInfo.builder()
                        .firstName("Roman")
                        .lastName("Eremin")
                        .age((byte) 3)
                        .user(User.builder().id(2L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("Angelina1")
                .email("angelina@mail1.ru")
                .password("qwer")
                .userInfo(UserInfo.builder()
                        .firstName("Angelina")
                        .lastName("Eremina")
                        .age((byte) 22)
                        .user(User.builder().id(3L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("Juliana1")
                .email("julana1@gmail.com")
                .password("erb3")
                .userInfo(UserInfo.builder()
                        .firstName("Juliana")
                        .lastName("Eremina")
                        .age((byte) 4)
                        .user(User.builder().id(4L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("Daniil")
                .email("daniil@gmail.com")
                .password("1234")
                .userInfo(UserInfo.builder()
                        .firstName("Daniil")
                        .lastName("Eremin")
                        .age((byte) 21)
                        .user(User.builder().id(5L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("Roman")
                .email("roman@gmail.com")
                .password("erb3")
                .userInfo(UserInfo.builder()
                        .firstName("Roman")
                        .lastName("Eremin")
                        .age((byte) 3)
                        .user(User.builder().id(6L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("Angelina")
                .email("angelina@mail.ru")
                .password("qwer")
                .userInfo(UserInfo.builder()
                        .firstName("Angelina")
                        .lastName("Eremina")
                        .age((byte) 22)
                        .user(User.builder().id(7L).build())
                        .build())
                .build());

        userService.persist(new User().toBuilder()
                .username("Juliana")
                .email("julana@gmail.com")
                .password("erb3")
                .userInfo(UserInfo.builder()
                        .firstName("Juliana")
                        .lastName("Eremina")
                        .age((byte) 4)
                        .user(User.builder().id(8L).build())
                        .build())
                .build());
    }
}
