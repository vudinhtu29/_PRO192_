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
public class Box extends Rectangle{
    protected int height = 0;
    public void set(int l , int w,int h){
        super.setValue(l, w);
        height = h > 0 ? 1 : 0;
    }
    @Override
    public String toString(){
        return super.toString() +  height + "]";
    }
}
