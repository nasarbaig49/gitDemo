package com.java.learning.inheritence;

public class MainClass {

    public static void main(String[] args) {
        Person person=new Teacher();
        person.listening();
        person.speak();

        Teacher teacher=new Teacher();


        Person person2=new Person();
        person.x=10;
        teacher.x=20;
        person2.x=30;
        Person.y=10;

        person.met(8);
        Teacher.met(10);





    }
}
