/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Muhammad Huzaifa
 */
public class InventoryManagementSystem {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("DISTRIBUTER'S INVENTORY MANAGEMENT SYSTEM\n-----------------------------------------");
        
        Inventory stockList = new Inventory(".\\data\\inventory.txt");
        stockList.Show();
        
//        String menu = "\n1. Take Order\n2. Add to Stock\n3. Exit";
//        int choice;
//        Scanner scanner = new Scanner(System.in);
//        
//        while ((choice = askForChoice(scanner, menu, 3)) != 3) {
//            
//            switch (choice) {
//                case 1:
//                    handleTakeOrder(scanner);
//            }
//        }

    }
    
    public static int askForChoice(Scanner scanner, String prompt, int maxValue) {
        System.out.print(prompt + "\nPlease select a menu item: ");
        
        int value = scanner.nextInt();
        
        while (value < 1 || value > maxValue) {
            System.out.println("Invalid choice. Please re-enter your choice: ");
            value = scanner.nextInt();
        }
        
        return value;
    }
    
    public static void handleTakeOrder(Scanner scanner) throws FileNotFoundException, IOException {
        CustomerListManager cM = new CustomerListManager(".\\data\\Customer Related\\customerList.txt");
        
        String menu1 = "\n1. New Customer\n2. Existing Customer";
        int choice1 = askForChoice(scanner, menu1, 2);
        
        switch (choice1) {
            case 1:
                String name, address;
                System.out.println("Customer Name ? ");
                name = scanner.nextLine();
                System.out.println("Customer Address ? ");
                address = scanner.nextLine();
                
        }
    }
}
