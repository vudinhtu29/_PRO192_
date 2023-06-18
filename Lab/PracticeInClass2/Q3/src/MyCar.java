
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
    public int f1(List<Car> t){
        int sum = 0;
        for (Car car : t) {
            sum+= car.getRate();
        }
        return sum / t.size();
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
        Collections.swap(t, maxIndex, minRate);
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t,Comparator.comparing(Car::getMaker));
        Collections.sort(t, (car1,car2) -> {
            if(car1.getMaker().equals(car2.getMaker())){
                return Integer.compare(car1.getRate(), car2.getRate());
            }
            return 0;
        });
        
    
        
    }
}
