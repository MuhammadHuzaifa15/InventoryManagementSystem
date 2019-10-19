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
public class StockCmpByCarton implements Comparator<Stock>{

    @Override
    public int compare(Stock t1, Stock t2) {
        return t1.getCarton().compareTo(t2.getCarton());
    }
    
}
