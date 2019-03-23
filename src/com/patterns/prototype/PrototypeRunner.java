package com.patterns.prototype;

import com.patterns.prototype.objects.Student;
import com.patterns.prototype.objects.StudentFactory;


/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class PrototypeRunner {

    public static void main( String[] args) throws CloneNotSupportedException {

        StudentFactory studentFactory = new StudentFactory();
        Student student = new Student("David");
        studentFactory.setStudent( student );
        System.out.println(student);

        Student cloneStudent = studentFactory.getStudentCopy();
        System.out.println(cloneStudent);

        Student originalStudent = studentFactory.getStudent();
        System.out.println(originalStudent);

    }
}
