package view;
import model.*;
import controller.Product_Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product_Controller productController = new Product_Controller();
        while (true){
            System.out.println("CHOOSE FROM MENU");
            System.out.println("1. Display products");
            System.out.println("2. Add products");
            System.out.println("3. Look up products by ID");
            System.out.println("4. Exit");
            System.out.print("-------> Your choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    productController.displayProducts();
                    break;
                case 2:
                    productController.addProduct();
                    break;
                case 3:
                    productController.searchById();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("INVALID! Enter another number.");

            }
        }

    }
}
