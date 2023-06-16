/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class ArraysDemo {
    public static void main(String[] args) {
        
        int ar1[] = {5,3,7,3,7,3,2,5,7};
        int ar2[] = {5,6,7,8,9};
        int ar3[] = {5,6,7,8,9};
        System.out.println("ar1 = "+Arrays.toString(ar1));
        System.out.println("ar2 = "+Arrays.toString(ar2));
        System.out.println("ar3 = "+Arrays.toString(ar3));
        boolean eq = Arrays.equals(ar1, ar2);
        System.out.println("ar1=ar2:" + eq);
        eq = Arrays.equals(ar2, ar3);
        System.out.println("ar2 = ar3" + eq);
        int numOfElements = 3,from = 2, before = 6;
        int ar4[] = Arrays.copyOf(ar1, numOfElements);
        System.out.println("ar4=" + Arrays.toString(ar4) );
        int ar5[] = Arrays.copyOfRange(ar1, from, before);
        System.out.println("ar5=" + Arrays.toString(ar5));
        Arrays.sort(ar1);
        System.out.println("after sorting, ar1=" + Arrays.toString(ar1));
        int pos = Arrays.binarySearch(ar1, 7);
        System.out.println("Binary search 7,pos=" + pos);
    }
}
