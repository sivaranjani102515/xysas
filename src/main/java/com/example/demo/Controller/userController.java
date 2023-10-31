package com.example.demo.Controller;


import com.example.demo.DTO.UserDto;
import com.example.demo.Service.User.LoginResponse;
import com.example.demo.Service.User.UserService;
import com.example.demo.Model.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class userController {
    @Autowired
    private UserService userService;

@PostMapping("save")
    public ResponseEntity<?> userDetails (@RequestBody UserDto userDto){
        System.out.println("register");
       return userService.userSave(userDto);
    }
    @PostMapping("login")
    public LoginResponse login (@RequestBody login Login){
       return userService.authenticate(Login);
    }
    @RequestMapping(value="confirm-account", method= {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<?> confirmUserAccount(@RequestParam("token")String confirmationToken) {
       System.out.println("Confirmation");
        return userService.confirmEmail(confirmationToken);
    }


}
