/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author dmkwe
 */
public class Student implements StudentInterface {
    private String name;
    private int age;
    
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    Student(){}
    
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void changeAge() {
        age = 10;
    }
    
}
