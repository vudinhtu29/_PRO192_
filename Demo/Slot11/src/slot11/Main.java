/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot11;

import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) throws IOException{
        MyList u = new MyList();
        String fname = "emp.txt";
        u.loadFile(fname);
        System.out.println("Test");
        System.out.println("Before sorting : ");
        u.display();
        System.out.println("After sorting : ");
        u.sortByAgeName();
        u.display();
        System.out.println();
    }
}
