/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Book {
    
    public String title;
    public int price;

    public Book() {
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
    }


}
