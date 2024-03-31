package controller;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product_Controller {
    List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addProduct(){
        System.out.print("Enter an ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.print("Enter a price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter a brand: ");
        String brand = scanner.nextLine();
        products.add(new Product(id, name, price, brand));
        System.out.println("YOU'VE ADDED SUCCESSFULLY!");
    }

    public void displayProducts(){
        System.out.println("DISPLAY ALL PRODUCTS: ");
        for (Product product:products){
            System.out.println(product);
        }
    }
    public void searchById(){
        System.out.print("Enter an Id: ");
        int id = scanner.nextInt();
        for (Product product:products){
            if (product.getId() == id){
                System.out.println(product.toString());
            } else {
                System.out.println("PRODUCT NOT FOUND.");
            }
        }
    }
}
