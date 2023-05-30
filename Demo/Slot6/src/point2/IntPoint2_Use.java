/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point2;

/**
 *
 * @author ADMIN
 */
public class IntPoint2_Use {
    public static void main(String[] args) {
        IntPoint2 ip = new IntPoint2();
        IntPoint2 ip2 = new IntPoint2(5, 2);
        
        ip.setX(4);
        ip.setY(4);
        System.out.println("X+Y = "+(ip.getX()+ip.getY()));
        System.out.println("================");
        System.out.println(ip2.getX()+ip2.getY());
    }
}
