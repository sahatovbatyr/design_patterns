package com.patterns.prototype.objects;

import java.io.Serializable;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class StudentFactory  {

    Student student;

    public Student getStudentCopy() throws CloneNotSupportedException {
        return student.clone();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
