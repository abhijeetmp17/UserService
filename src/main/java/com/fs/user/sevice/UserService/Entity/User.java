package com.fs.user.sevice.UserService.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
