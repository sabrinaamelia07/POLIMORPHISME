/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism2;

/**
 * The Rectangle class,subclass of shape
 * @author PC
 */
public class Rectangle extends Shape {
    //private member variabels
    private int length;
    private int width;
    //constructor
    public Rectangle(String color, int length, int widht){
        super(color);
        this.length = length;
        this.width = width;
        
    }
    @Override
    public String toString(){
        return "Rectangle[length=" + length + ",width=" + width +"," + super.toString() +"]";
    }
    //Override the inherited getArea()to provide the proper implementation
    @Override
    public double getArea(){
        return length*width;
    
        
    }
    
    
    
    
}
