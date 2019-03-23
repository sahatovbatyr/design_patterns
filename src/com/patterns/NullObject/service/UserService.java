package com.patterns.NullObject.goodCode.service;

import com.patterns.NullObject.goodCode.objects.AbstractUser;
import com.patterns.NullObject.goodCode.objects.NullUser;
import com.patterns.NullObject.goodCode.objects.User;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public class UserService {


    static List<User> userList ;
    static {
        userList = new ArrayList<>(3);
        User user1 = new User(1L, "User_1");
        User user2 = new User(2L, "User_2");
        User user3 = new User(3L, "User_3");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }



    public List<User> getUserList() {

        return userList;
    }

    public AbstractUser getOneById(Long id){

        for( User iUser : userList){
            if( iUser.getId() == id) {
                return  iUser;
            }
        }

        return new NullUser();
    }
}
