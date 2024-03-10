/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author dmkwe
 */
public class StudentService implements StudentInterface {
    
    
    @Override
    public void createStudent(){
        System.out.println("I'm a new Student");
    }
    
    @Override
    public String printStudent(){
        return "I'm A Student";
    }
}
