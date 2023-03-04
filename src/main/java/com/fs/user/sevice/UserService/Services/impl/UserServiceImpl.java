package com.fs.user.sevice.UserService.Services.impl;

import com.fs.user.sevice.UserService.Entity.User;
import com.fs.user.sevice.UserService.Exception.ResourceNotFoundException;
import com.fs.user.sevice.UserService.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepo userRepo;


    //create user
    public User createUser(User user)
    {
        String id = UUID.randomUUID().toString();
        user.setUserId(id);
        User save = userRepo.save(user);

        return save;
    }
    //get one user
    @Override
    public User getUser(String id) {

        User user = userRepo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Resource not found bu ID :"+id));
        return user;
    }
    //get all user
    @Override
    public List<User> getAllUsers() {
        List<User> all = userRepo.findAll();
        return all;
    }

    //update user
    @Override
    public User updateUser() {
        return null;
    }

    //delete user
    @Override
    public User deleteUser() {
        return null;
    }



}
