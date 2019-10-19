/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

import java.io.IOException;

/**
 *
 * @author Family
 */
public class CustomerHandler {
    CustomerListManager clm;
    OrderList orderList;
    Stock[] menu;

    public CustomerHandler(Stock[] menu) throws IOException {
        this.menu = menu;
        this.clm = new CustomerListManager(".\\data\\customerList.txt");
        this.orderList = new OrderList();
    }
    
    public void displayMenu() {
        
    }
}
