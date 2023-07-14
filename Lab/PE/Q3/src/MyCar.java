
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        int sum = 0;
        for (Car car : t) {
            sum += car.getRate();
        }
        return sum/t.size();
    }

    @Override
    public void f2(List<Car> t) {
        if(t.size() < 2){
            return;
        }
        int maxIndex = 0;
        int maxRate = t.get(0).getRate();
        for (int i = 1; i < t.size(); i++) {
           if(t.get(i).getRate() > maxRate){
                maxRate = t.get(i).getRate();
                maxIndex = i;
           }
        }
        int minIndex = 0;
        int minRate = t.get(0).getRate();
        for (int i = 1; i < t.size(); i++) {
            if(t.get(i).getRate() < minRate){
                minRate = t.get(i).getRate();
                minIndex = i;
            }
        }
        Collections.swap(t, maxIndex, minIndex);
    }

    @Override
    public void f3(List<Car> t) {
       Comparator<Car> u =new Comparator<Car>() {
           @Override
           public int compare(Car x, Car y) {
               int r =x.getMaker().compareTo(y.getMaker());
               if(r!=0) return r;
               if(x.getRate() > y.getRate()){
                   return -1;
               }
               else if(x.getRate() == y.getRate())
                   return 0;
               else
                   return 1;
           }
       };
       Collections.sort(t,u);
    }
    
}
