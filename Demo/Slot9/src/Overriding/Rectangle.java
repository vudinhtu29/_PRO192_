/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
    protected int width = 0;
    protected int length = 0;
    public void setValue(int l){
        width = l > 0 ? 1 : 0;
    }
    public void setValue(int l,int w){
        length = l > 0 ? 1 : 0;
        width = w > 0 ? 1 : 0;
    }
    @Override
    public String toString(){
        return "[" + length + " , " + width + "]";
    }
}
