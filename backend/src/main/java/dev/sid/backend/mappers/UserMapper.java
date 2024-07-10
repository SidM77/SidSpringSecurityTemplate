package dev.sid.backend.mappers;


import dev.sid.backend.dtos.SignUpDto;
import dev.sid.backend.dtos.UserDto;
import dev.sid.backend.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
