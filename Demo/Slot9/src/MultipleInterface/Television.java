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
public class Television implements VNRemote,ChinaRemote{

    @Override
    public void onDevice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("on TV");
    }

    @Override
    public void offDevice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("off TV");
    }

    @Override
    public void increaseVolumn() {
        System.out.println("increase volumn"); 
        //throw new UnsupportedOperationException("insrease volumn"); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void descVolumn() {
        System.out.println("decrease volumn");
        //throw new UnsupportedOperationException("decresase volumn."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        VNRemote remote = new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        VNRemote.setTimer(10000);
        System.out.println("Tv remote's price:"+VNRemote.price);
        System.out.println("TV Remote has : "+VNRemote.MAXofButtons+"buttons");
        ChinaRemote remote2 = new Television();
        remote2.increaseVolumn();
    }   
    
  
}
