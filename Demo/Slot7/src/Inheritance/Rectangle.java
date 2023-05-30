/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
    private int length = 0;
    private int width = 0;
    public Rectangle(){
        
    }
    public Rectangle(int l,int w){
        length = l > 0 ? 1 : 0;
        width = w > 0 ? 1 : 0;
    }
    public String toString(){
        return "[" + getLength()+","+getWidth()+"]";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int area(){
        return length*width;
    }
}
