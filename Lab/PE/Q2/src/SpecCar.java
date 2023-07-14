/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }
    public SpecCar(String maker, int price,int type) {
        super(maker, price);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return super.toString()+", " + getType();
    }
    
    public void setData(){
        setMaker("XZ"+getMaker());
        setPrice(getPrice()+20);
    }
    public int getValue(){
        int x;
        if(type < 7) 
            x = super.getPrice() + 10;
        else
            x = super.getPrice() + 15;
        return x;
    }
}
