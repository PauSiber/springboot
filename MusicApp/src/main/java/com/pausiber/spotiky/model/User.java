package com.pausiber.spotiky.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String fullName;
    private Integer age;
    private String username;
    private String password;
    private List<Song> userSongs = new ArrayList<>();

    public User(Long id, String fullName, Integer age, String username, String password) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.username = username;
        this.password = password;
    }
}
