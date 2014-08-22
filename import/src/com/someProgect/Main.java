package com.someProgect;
import com.someProgect.Course;

public class Main {

    public static void main(String[] args){

        Student firstStudent = new Student();
        firstStudent.course = new Course();
        firstStudent.course.name = "Some course";
        firstStudent.name = "Igor";
        firstStudent.sayHello();

        Student secondStudent = new Student();
        secondStudent.name = "Ivan";
        secondStudent.course = new Course();
        secondStudent.course.name = "another course";
        secondStudent.sayHello();

    }

}
