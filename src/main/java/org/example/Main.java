package org.example;


import Inventory.*;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Product.welcomeMessage();

        Electronics pc= new Electronics("Pc",4000,2,"Hp",1);
        Food obj = new Food("Sandwich",100,2,"15/10/2024");

        pc.displayInfo();
        obj.displayInfo();

        pc.updateQuantity(4);

        obj.updateQuantity(4,true);

        pc.displayInfo();
        obj.displayInfo();




    }
}