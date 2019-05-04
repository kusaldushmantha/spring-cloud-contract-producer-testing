package com.cloud.contract.example.springcloudcontract;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users;
    private int counter;

    public UserService() {
        users = new ArrayList<>();
        users.add(new User(1,"Jack","Jonas","1994-08-07"));
        users.add(new User(2,"John","Doe","1990-01-01"));
        this.counter = users.size();
    }


    public User findById(int id){
        for (User user: users) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User createUser(User user){
        if(user.getId() == null){
            user.setId(++counter);
        }
        users.add(user);
        return user;
    }

}
