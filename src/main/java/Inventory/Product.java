package Inventory;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("--------------------------");
        System.out.println("Product:");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price + " DH");
        System.out.println("Quantity: " + quantity);


    }

    public void updateQuantity(int newQuantity) {
        quantity = newQuantity;

    }

    public void updateQuantity(int addedQuantity, boolean addToExisting){
        if(addToExisting){
            quantity += addedQuantity;
        }
        else{
            quantity = addedQuantity;
        }

    }

    public double getPrice() {
        return price;
    }

    public static void welcomeMessage() {
        System.out.println("----Welcome to Inventory Management System!----");
    }

}
