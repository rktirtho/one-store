package com.rktirthoh.onestore.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    @Size(min = 3, max = 15)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    @Size(min = 6, max = 18)
    private String password;

    @Column(scale = 1)
    private int active;

    private String roles;

    private String permissions;



    public User(String username, String password, String roles, String permissions) {
        this.username = username;
        this.password = password;
        this.email = "rktirtho@gmail.com";
        this.active = 1;
        this.roles = roles;
        this.permissions = permissions;

    }

    public List<String> getRolesList() {
        if (roles.length() > 0) {
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }

    public List<String> getPermissionList() {
        if (roles.length() > 0) {
            return Arrays.asList(this.permissions.split(","));
        }
        return new ArrayList<>();
    }
}
