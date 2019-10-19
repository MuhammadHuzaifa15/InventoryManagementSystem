/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

/**
 *
 * @author Muhammad Huzaifa
 */
public class Customer implements Comparable<Customer>{
    private final String name;
    private final String address;
    private final long id;

    public Customer(long id, String name, String address) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(Customer t) {
        return (int) (this.id - t.id);
    }
    
}