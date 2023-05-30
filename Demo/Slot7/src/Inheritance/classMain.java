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
public class classMain{
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        Rectangle re1 = new Rectangle(4, 5);
        re.setLength(5);
        re.setWidth(3);
        System.out.println("Area = "+re.area());
        System.out.println("===============");
        System.out.println("Area2 = "+re1.area());
    }
}
