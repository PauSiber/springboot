package com.pausiber.spotiky;

import com.pausiber.spotiky.model.User;
import com.pausiber.spotiky.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpotikyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpotikyApplication.class, args);

        /*User user1 = new User(1L,"Onur",24,"ozzie","21345");
        User user2 = new User(1L,"Enes",24,"eneskaya","21345");
        User user3 = new User(1L,"Onur",24,"ozzie","21345");
        User user4 = new User(1L,"Onur",24,"ozzie","21345");

        UserService userService = new UserService();

        UserService.getUsers().add(user1);
        UserService.getUsers().add(user2);
        UserService.getUsers().add(user3);
        UserService.getUsers().add(user4);


        List<User> userListesi = userService.getAllUsers();

        userListesi.stream().map(User::getUsername).forEach(System.out::println);*/




    }

}
