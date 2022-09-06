package com.pausiber.spotiky.service;

import com.pausiber.spotiky.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    static List<User> users = new ArrayList<>();

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        UserService.users = users;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByUsername(String username) {
        return users.stream().filter(user -> user.getUsername().equals(username)).findAny().orElseThrow();
    }

    public String updateUser(Long id, User newUser) {
        User foundUser = users.stream().filter(u -> u.getId() == id).findFirst().orElseThrow();

        if(foundUser.getAge() != null) foundUser.setAge(newUser.getAge());
        if(foundUser.getUsername() != null) foundUser.setUsername(newUser.getUsername());
        if(foundUser.getPassword() != null) foundUser.setPassword(newUser.getPassword());

        return foundUser.getId() + " id'li kullanıcı güncellenmiştir";


    }

    public String deleteUser(Long id) {

        User foundUser = users.stream().filter(u -> u.getId() == id).findFirst().orElseThrow();

        users.remove(foundUser);

        return foundUser.getId() + " id'li kullanıcı silindi";
    }
}
