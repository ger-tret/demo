package com.user_service.service.mapper;

import com.user_service.dtos.UserDto;
import com.user_service.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    private final Mapper<User, UserDto> entityToDto =
            entity -> new UserDto(entity.getUserId(),
                    entity.getUsername(),
                    entity.getPassword(),
                    entity.getFirstName(),
                    entity.getLastName(),
                    entity.getEmail());

    private final Mapper<UserDto, User> dtoToEntity =
            dto -> new User(
                    dto.getId(),
                    dto.getUsername(),
                    dto.getPassword(),
                    dto.getEmail(),
                    dto.getFirstName(),
                    dto.getLastName());

    public Mapper<User, UserDto> mapperEntityToDto() {
        return entityToDto;
    }

    public Mapper<UserDto, User> mapperDtoToEntity() {
        return dtoToEntity;
    }
}