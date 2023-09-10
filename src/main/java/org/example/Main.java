package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("student1", 6, 29);
        Student student2 = new Student("student2", -10, 29);

//        List<Student> list = new ArrayList<>();
//        list.add(student1);
//        list.add(student2);
//        System.out.println(list);
//        list.sort(new StudentComporator());
//        System.out.println(list);

//        List<User> userList = new ArrayList<>();
//        Teacher teacher1 = new Teacher("Teacher1", "Math", 5);
//        Teacher teacher2 = new Teacher("Teacher1", "Math", 6);
//        Teacher teacher3 = new Teacher("Teacher1", "Math",10);
//
//
//        Student student3 = new Student("Teacher1", 6, 50);
//
//
//        userList.add(student3);
//        userList.add(student2);
//        userList.add(student1);
//        userList.add(teacher1);
//        userList.add(teacher2);
//        userList.add(teacher3);

//        System.out.println(userList);
//        System.out.println(" ");
//        userList.sort(new UserComporator<User>());
//        System.out.println(userList);

        List<Teacher> teacherList = new ArrayList<>();
        Teacher teacher1 = new Teacher("Teacher1", "Math", 55);
        Teacher teacher2 = new Teacher("Teacher2", "biology", 60);
        Teacher teacher3 = new Teacher("Teacher3", "History",10);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        System.out.println(teacherList);
        System.out.println(" ");
        teacherList.sort(new TeacherComporator<Teacher>());
        System.out.println(teacherList);

    }
}