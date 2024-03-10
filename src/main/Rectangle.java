/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author dmkwe
 */
public class Rectangle extends Shapes {

    @Override
    public double area(double length, double width) {
        return length*width;
    }

    @Override
    public double perimeter(double length, double width) {
        return (length+width)*2;
    }
    
}
