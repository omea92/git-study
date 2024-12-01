package com.example.gitstudy.java;

public class FastCampusClass {
    public static void main(String[] args) {
//        Student stu = new Student();
//        stu.setName("mother"); //상속받아서 사용가능
//        System.out.println(stu.name);
//        stu.studyPhysics();

        JavaProgrammer j = new JavaProgrammer();
        CProgrammer c = new CProgrammer();
        write(j);
        write(c);

    }

    public static void write(Programmer programmer) {
        programmer.writeCode();
    }
}
