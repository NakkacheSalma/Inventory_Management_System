package Inventory;

public class Electronics extends Product {

    String brand;
    int warranty;

    public Electronics(String name, double price, int quantity,String brand,int warranty) {
        super(name, price, quantity);
        this.brand = brand;
        this.warranty = warranty;

    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty+" years");
    }

}
