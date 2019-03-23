package com.patterns.NullObject.goodCode.objects;

/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public abstract class AbstractUser {
    protected  Long id;
    protected  String username;

    public abstract boolean isNull();
    public abstract Long getId();
    public abstract String getUsername();

    @Override
    public String toString() {
        return "AbstractUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
