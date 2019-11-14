/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM;

/**
 *
 * @author PC
 */
public class main {
    public static void main(String[] args){
        Rect z = new Rect(1,1,4,4);
        int a = z.x1;
        int b = z.y1;
        int c = z.x2;
        int d = z.y2;
        Rect y = new Rect(5,6);
        z.move(1,2);
        System.out.println("<"+z.x1+","+z.y1+"> is inside the union");
        System.out.println("["+a+","+b+";"+c+","+d+"] union ["+z.x1+","+z.y1+"; "+y.x2+","+y.y2+"] = ["+a+","+b+"; "+y.x2+","+y.y2+"]");
        System.out.println("["+a+","+b+";"+c+","+d+"] union ["+z.x1+","+z.y1+"; "+y.x2+","+y.y2+"] = ["+z.x1+","+z.y1+"; "+c+","+d+"]");
        
    }
    
}
