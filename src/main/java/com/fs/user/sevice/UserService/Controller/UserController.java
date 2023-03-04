package com.fs.user.sevice.UserService.Controller;

import com.fs.user.sevice.UserService.Entity.User;
import com.fs.user.sevice.UserService.Services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController
{
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/create/user")
    public ResponseEntity<User> createUSer(@RequestBody User user)
    {
        User user1 = userService.createUser(user);

        return new ResponseEntity<>(user1 , HttpStatus.CREATED);
    }

    @GetMapping("get/user/{id}")
    public ResponseEntity<User> getUserWithId(@PathVariable String id)
    {
        User user = userService.getUser(id);

        return new ResponseEntity<>(user , HttpStatus.OK);

    }

    @GetMapping("/get/all/user")
    public ResponseEntity<List<User>> getAllUser()
    {
        List<User> allUsers = userService.getAllUsers();

        return new ResponseEntity<>(allUsers , HttpStatus.OK);

    }
}
