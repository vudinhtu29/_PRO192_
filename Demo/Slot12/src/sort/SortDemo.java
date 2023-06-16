/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class SortDemo {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("ID004", "Michel", 400));
        list.add(new Employee("ID001", "Helen", 200));
        list.add(new Employee("ID003", "Heming", 400));
        System.out.println("Sorting on IDs ascending");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Sorting on descending salary then asceding IDs");
        Collections.sort(list, Employee.compareObj);
        System.out.println(list);
     }
}
