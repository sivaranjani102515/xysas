package com.example.demo.Service.User;

import com.example.demo.DTO.UserDto;
import com.example.demo.Model.login;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?> userSave(UserDto userDto);
    LoginResponse authenticate(login loginDetails);


    ResponseEntity<?> confirmEmail(String confirmationToken);
}
