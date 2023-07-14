
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Product implements Comparable<Product> {

    private String name;
    private String id;
    private double price;
    List<Product> a = new ArrayList<>();

    Scanner in = new Scanner(System.in);

    public Product() {
    }

    public Product(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    //Add new product in store
    public void addProduct(Product p) {
        a.add(p);
        System.out.println("Add a product success!!!");
    }

    //Check product id valid
    public boolean checkProductId(String productId) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getId().equals(productId)) {
                return true;
            }
        }
        return false;
    }

    //Print product id
    public void printProductId(Product p2) {
        Random rand = new Random();
        do {
            String checkProductId = Integer.toString(rand.nextInt(1000) + 1);
            if (checkProductId(checkProductId) == true) {
                continue;
            } else {
                p2.setId(checkProductId);
                System.out.println("Product ID: " + checkProductId);
                break;
            }
        } while (true);
    }

    //Input information of product
    public void inputProduct(Product p2) {
        Random rand = new Random();
        System.out.print("Enter name: ");
        p2.setName(in.nextLine());
        System.out.print("Enter price: ");
        p2.setPrice(Double.parseDouble(in.nextLine()));
    }

    //Input update price for product
    public void inputProductId(Product p) {
        System.out.print("Enter product id: ");
        String productId = in.nextLine();
        if (p.checkProductId(productId) == false) {//check product id
            System.out.println("Not found product id");
            return;
        }
        System.out.print("Enter new price: ");
        double newPrice = Double.parseDouble(in.nextLine());
        p.updatePrice(productId, newPrice);
    }

    //Get name id to print in order
    public String getNameProduct(String productId) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getId().equals(productId)) {
                return a.get(i).name;
            }
        }
        return null;
    }

    //Get price id to print in order
    public double getPriceProduct(String productId) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getId().equals(productId)) {
                return a.get(i).price;
            }
        }
        return 0;
    }

    //Update price of product
    public void updatePrice(String productId, double newPrice) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getId().equals(productId)) {
                a.get(i).setPrice(newPrice);
                System.out.println("Update success!!!");
                return;
            }
        }
    }

    //Print product
    public void printProduct() {
        System.out.printf("%-15s%-15s%-15s\n", "Product ID", "Product Name", "Product Price");
        for (int i = 0; i < a.size(); i++) {
            System.out.printf("%-15s%-15s%-15.2f\n", a.get(i).getId(), a.get(i).getName(), a.get(i).getPrice());
        }
    }

    //Sort all products by Price
    public void sortByPrice() {
        Collections.sort(a);
    }

    @Override
    public int compareTo(Product o) {
        return Double.toString(this.price).compareTo(Double.toString(o.price));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
