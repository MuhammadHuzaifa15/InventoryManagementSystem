/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Family
 */
public class CustomerListManager {
    List<Customer> customerList;
    long newCustomerId;

    public CustomerListManager(String path) throws IOException {
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
            
            this.customerList = new ArrayList<>();
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] split = line.split(", ");
                
                this.customerList.add(new Customer(Long.parseLong(split[0]), split[1], split[2]));
                this.newCustomerId = Long.parseLong(split[0]) + 1;
            }
        }
    }
    
    public long addNewCustomer(String name, String address) {
        this.customerList.add(new Customer(this.newCustomerId, name, address));
        return this.newCustomerId++;
    }
    
    public int searchCustomer(Long Id) {
        Comparator cmprtr = new CustCmpById();
        return Collections.binarySearch(customerList, Id, cmprtr);
    }
    
    public Customer getCustomer(int index) {
        return this.customerList.get(index);
    }

    @Override
    public void finalize() throws Throwable {
        
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
