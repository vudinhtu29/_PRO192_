/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderManager;

/**
 *
 * @author ADMIN
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Order extends Product {

    private String customerId;
    private String orderId;
    private String date;
    private String name;
    private String address;
    private String nameProduct;
    private String idProduct;
    private double price;
    private int quantity;

    List<Order> a = new ArrayList<>();

    Scanner in = new Scanner(System.in);

    public Order() {
    }

    public Order(String customerId, String orderId, String date, String name, String address, String nameProduct, String idProduct, double price) {
        super(nameProduct, idProduct, price);
        this.customerId = customerId;
        this.orderId = orderId;
        this.date = date;
        this.name = name;
        this.address = address;
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.price = price;
    }

    //Check customer id valid
    public boolean checkCustomerId(String customerId) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getcustomerId().equals(customerId)) {
                return true;
            }
        }
        return false;
    }

    //Input Order Id by Customer Id
    public void inputCustomerId() {
        do {
            System.out.print("Enter Customer Id: ");
            String checkCustomerId = in.nextLine();
            if (checkCustomerId(checkCustomerId) == false) {
                System.out.println("Not found Customer Id");
                continue;
            } else {
                printInformationCustomerId(checkCustomerId);
                break;
            }
        } while (true);
    }

    //Print date
    public void printDate(Order o2) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        o2.setDate(dtf.format(localDate));
        System.out.println("Order Date: " + dtf.format(localDate));
    }

    //Add an order
    public void addOrder(Order o) {
        a.add(o);
        System.out.println("Add order success!!!");
    }

    //Check order id valid
    public boolean checkOrderId(String orderId) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getorderId().equals(orderId)) {
                return true;
            }
        }
        return false;
    }

    //Input Order Id by Order Id
    public void inputOrderId() {
        do {
            System.out.print("Enter Order Id: ");
            String checkOrderId = in.nextLine();
            if (checkOrderId(checkOrderId) == false) {
                System.out.println("Not found Order Id");
                continue;
            } else {
                printInformationOrderId(checkOrderId);
                break;
            }
        } while (true);
    }

    //Print list order
    public void printOrder() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Order ID", "Customer ID", "Name Customer", "Product ID", "Product Name", "Date", "Address", "Quantity", "Price");
        for (int i = 0; i < a.size(); i++) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15.2f\n", a.get(i).orderId, a.get(i).customerId, a.get(i).name, a.get(i).idProduct, a.get(i).nameProduct, a.get(i).date, a.get(i).address, a.get(i).quantity, a.get(i).price * a.get(i).quantity);
        }
    }

    //Print information of an Order by Order Id
    public void printInformationOrderId(String checkOrderId) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Order ID", "Customer ID", "Name Customer", "Product ID", "Product Name", "Date", "Address", "Quantity", "Price");
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getorderId().equals(checkOrderId)) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15.2f\n", a.get(i).orderId, a.get(i).customerId, a.get(i).name, a.get(i).idProduct, a.get(i).nameProduct, a.get(i).date, a.get(i).address, a.get(i).quantity, a.get(i).price * a.get(i).quantity);
                return;
            }
        }
    }

    //Print information of an Order by Customer Id
    public void printInformationCustomerId(String checkCustomerId) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Customer ID", "Order ID", "Name Customer", "Product ID", "Product Name", "Date", "Address", "Quantity", "Price");
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getcustomerId().equals(checkCustomerId)) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15.2f\n", a.get(i).customerId, a.get(i).orderId, a.get(i).name, a.get(i).idProduct, a.get(i).nameProduct, a.get(i).date, a.get(i).address, a.get(i).quantity, a.get(i).price * a.get(i).quantity);
            }
        }
        return;
    }

    //Create a new order
    public void inputOrder(Order o2, Product p) {
        Random rand = new Random();
        do {
            String checkCustomerId = Integer.toString(rand.nextInt(10000) + 1);
            if (checkCustomerId(checkCustomerId) == true) {
                continue;
            } else {
                o2.setcustomerId("CTM" + checkCustomerId);
                System.out.println("Customer ID: " + o2.getcustomerId()
                );
                break;
            }
        } while (true);

        System.out.print("Enter customer name: ");
        o2.setName(in.nextLine());
        System.out.print("Enter customer address: ");
        o2.setAddress(in.nextLine());
        System.out.println("Add product to order by select a product form below list");
        p.printProduct();
        inputProductQuantity(o2, p);
    }

    //Input product and quantity
    public void inputProductQuantity(Order o2, Product p) {
        Random rand = new Random();
        do {
            String checkOrderId = Integer.toString(rand.nextInt(10000) + 1);
            if (checkOrderId(checkOrderId) == true) {
                continue;
            } else {
                o2.setorderId("OD" + checkOrderId);
                System.out.println("Order ID: " + o2.getorderId());
                break;
            }
        } while (true);
        do {
            System.out.print("Enter product ID: ");
            String idProduct = in.nextLine();
            if (p.checkProductId(idProduct) == false) {
                System.out.println("Not found product id");
                continue;
            } else {
                o2.setIdProduct(idProduct);
                o2.setNameProduct(p.getNameProduct(idProduct));
                o2.setPrice(p.getPriceProduct(idProduct));
            }
            System.out.print("Enter Quantity: ");
            o2.setQuantity(Integer.parseInt(in.nextLine()));
            break;
        } while (true);
    }

    public String getcustomerId() {
        return customerId;
    }

    public void setcustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getorderId() {
        return orderId;
    }

    public void setorderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Order> getA() {
        return a;
    }

    public void setA(List<Order> a) {
        this.a = a;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    
}