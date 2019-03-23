package com.patterns.NullObject.objects;

/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public class NullUser extends  AbstractUser {

    public NullUser() {
        this.id = -1L;
        this.username = "Guest";
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getUsername() {
        return this.username;
    }
}
