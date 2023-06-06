/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoException;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Testter {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a :");
            a = sc.nextInt();
            System.out.println("Enter b :");
            b = sc.nextInt();
            System.out.println("Enter c :");
            c = sc.nextInt();
            try{
                RightTriagle rt = new RightTriagle(a, b, c);
                System.out.println("This is a right triagle !");
            }catch(IllegalTriangleException e1){
                System.out.println("This is not a triagle");
            }catch(IllegalRightTriagleException e2){
                System.out.println("This is not a right triagle");
            }
            System.out.println("Continue?(Y/N:");
            char chon = sc.next().charAt(0);
            if(chon != 'Y')
                break;
        }
            
            
            
    } 
}
