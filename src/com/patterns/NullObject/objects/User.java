package com.patterns.NullObject.objects;

/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public class User extends AbstractUser {

    public   User( Long id, String username){
        this.id = id;
        this.username = username;

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
