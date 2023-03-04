package com.fs.user.sevice.UserService.Repository;

import com.fs.user.sevice.UserService.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String>
{

}
