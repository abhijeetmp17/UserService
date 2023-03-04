package com.fs.user.sevice.UserService.Services.impl;

import com.fs.user.sevice.UserService.Entity.User;

import java.util.List;

public interface UserService
{
    public User createUser(User user);

    public User getUser(String id);

    public List<User> getAllUsers();

    public User updateUser(String id , User user);

    public void deleteUser(String id);
}
