/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Class;

/**
 *
 * @author ADMIN
 */
public class Circle extends Shape{
    double r;
    public Circle ( double rr){
        r = rr;
    }
    public double circumstance(){
        return 2*Math.PI*r;
    }
    public double area(){
        return Math.PI*r*r;
    }
}
