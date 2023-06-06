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
public class Demo_1 {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        re.setValue(5);
        System.out.println(re.toString());
        re.setValue(2, 5);
        System.out.println(re.toString());
        Box b = new Box();
        b.set(6, 1, 5);
        System.out.println(b.toString());
    }
}
