package com.shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<CartItem> cart = new ArrayList<>();

    // Add product
    public void addProduct(Product product, int quantity) {
        for (CartItem item : cart) {
            if (item.product.id == product.id) {
                item.quantity += quantity;
                return;
            }
        }
        cart.add(new CartItem(product, quantity));
    }

    // Remove product
    public void removeProduct(int productId) {
        cart.removeIf(item -> item.product.id == productId);
    }

    // Display cart
    public void displayCart() {
        System.out.println("----- CART DETAILS -----");
        for (CartItem item : cart) {
            System.out.println(item.product.name +
                    " x " + item.quantity +
                    " = " + item.getTotalPrice());
        }
        System.out.println("------------------------");
    }

    // Total amount
    public double getTotalAmount() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Final amount after discount
    public double getFinalAmount() {
        double total = getTotalAmount();

        if (total > 50000) {
            total = total * 0.9; // 10% discount
        }

        return total;
    }
}