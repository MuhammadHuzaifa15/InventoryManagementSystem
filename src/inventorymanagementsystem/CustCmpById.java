/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

import java.util.Comparator;

/**
 *
 * @author Family
 */
public class CustCmpById implements Comparator<Customer>{

    @Override
    public int compare(Customer t1, Customer t2) {
        return (int) (t1.getId() - t2.getId());
    }
    
}
