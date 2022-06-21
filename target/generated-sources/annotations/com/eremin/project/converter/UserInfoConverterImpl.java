package com.eremin.project.converter;

import com.eremin.project.model.dto.UserInfoDto;
import com.eremin.project.model.entity.UserInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T21:12:06+0300",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class UserInfoConverterImpl extends UserInfoConverter {

    @Override
    public UserInfoDto userInfoToDto(UserInfo userInfo) {
        if ( userInfo == null ) {
            return null;
        }

        UserInfoDto.UserInfoDtoBuilder userInfoDto = UserInfoDto.builder();

        userInfoDto.id( userInfo.getId() );
        userInfoDto.firstName( userInfo.getFirstName() );
        userInfoDto.lastName( userInfo.getLastName() );
        userInfoDto.age( userInfo.getAge() );

        return userInfoDto.build();
    }
}
