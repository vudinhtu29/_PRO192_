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
public class Rect extends Shape{
    double l,w;
    public Rect(double ll, double ww){
        l = ll;
        w = ww;
    }
    public double circumstance(){
        return 2*(l+w);
    }
    public double area(){
        return l*w;
    }
}
