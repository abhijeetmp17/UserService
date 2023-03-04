package com.fs.user.sevice.UserService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "micro_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
{
    @Id
    @Column(name = "ID")
    private String userId;

    @Column(name = "NAME")

    private String userName;

    @Column(name = "EMAIL")
    private String userEmail;

    @Column(name = "ABOUT")
    private String userAbout;

    @Transient
    private List<Rating> rating = new ArrayList<>(); 

}
