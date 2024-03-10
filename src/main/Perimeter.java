/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author dmkwe
 */
public class Perimeter {
    
    
    public double calculate(double l, double w){
        return l*w;
    }
    
    public double calculate(double r){
        return 22/7*(r*r);
    }
    
    public double calculate(double l, double w,double l2, double w2){
        return l+w+l2+w2;
    }
    
    public double calculate(int l){
        return l*4;
    }
}
