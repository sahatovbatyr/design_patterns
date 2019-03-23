package com.patterns.prototype.objects;

import java.io.ObjectStreamClass;
import java.io.Serializable;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class Student implements Serializable, Cloneable {


    private static final long serialVersionUID = -2604732055154643886L;



    private String name ;

    public Student( String  name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }



    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
