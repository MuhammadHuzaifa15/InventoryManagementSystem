/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Muhammad Huzaifa
 */
public class Inventory {
    
    private Stock[] inventory;
    static int counter = 0;

    public Inventory(String path) throws IOException {
        
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
            
            this.inventory = new Stock[5];
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] specs = line.split(", ");
                
                Product product = new Product(specs[0], specs[1]);
                Carton carton = new Carton(product, Integer.parseInt(specs[2]), Integer.parseInt(specs[3]), Integer.parseInt(specs[4]));
                Stock stock = new Stock(carton, Integer.parseInt(specs[5]));
                
                if (counter < this.inventory.length)
                    this.inventory[counter++] = stock;
                else {
                    increaseSize();
                    this.inventory[counter++] = stock;
                }
            }  
        }
    }
    
    public Stock[] getInventory() {
        return inventory;
    }
    
    public void add(Stock stock) {
        if (counter < this.inventory.length) 
            this.inventory[counter++] = stock;
        else {
            increaseSize();
            this.inventory[counter++] = stock;
        }
    }
    
    public void Show() {
        System.out.printf("S.No.\t\t%-23s%-13s%-27s%s", "Product Specs", "Quantity", "Cost Price per Carton", "Sell Price per Carton");
        
        for (int i = 0; i < counter; i++) {
            System.out.printf("\n%3d\t", i + 1);
            inventory[i].Show();
            System.out.printf("\t%19.2f%27.2f", inventory[i].getCarton().getCostPrice(), inventory[i].getCarton().getSalePrice());
        }
    }
    
    private void increaseSize() {
        Stock[] temp = new Stock[counter + 10];
        System.arraycopy(this.inventory, 0, temp, 0, counter);
        this.inventory = temp;
    }

}
