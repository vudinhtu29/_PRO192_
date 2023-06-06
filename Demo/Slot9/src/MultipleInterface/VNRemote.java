/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleInterface;

/**
 *
 * @author ADMIN
 */
public interface VNRemote {
    final int MAXofButtons = 20 ;
    int price = 10;
    public static void setTimer(int number){
        System.out.println("shut down after "+ number +" seconds");
    }
    public abstract void onDevice();
    public abstract void offDevice();
    default void setLock(){
        System.out.println("set lock in the default method");
    }
}
