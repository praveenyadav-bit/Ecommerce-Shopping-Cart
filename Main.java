package com.shop;

public class Main {
    public static void main(String[] args) {

        // Create products
        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Phone", 20000);

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to cart
        cart.addProduct(p1, 1);
        cart.addProduct(p2, 2);

        // Display cart items
        cart.displayCart();

        // Display total price
        System.out.println("Total: " + cart.getTotalAmount());

        // Display final price after discount
        System.out.println("Final Amount (after discount): " + cart.getFinalAmount());
    }
}