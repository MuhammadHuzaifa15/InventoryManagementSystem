/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Family
 */
public class OrderList {
    ArrayList<Stock> orderList;
    double netBill;

    public OrderList() {
        this.orderList = new ArrayList<>();
        this.netBill = 0;
    }
    
    public void add(Stock stock) {
        this.orderList.add(stock);
        this.netBill += stock.getSalePrice();
    }
    
    public void add(Carton carton, int noOfCartons) {
        this.orderList.add(new Stock(carton, noOfCartons));
        this.netBill += carton.getSalePrice() * noOfCartons;
    }
    
    public void remove(Stock stock) {
        this.orderList.remove(stock);
        this.netBill -= stock.getSalePrice();
    }
    
    public int search(Carton carton) {
        Comparator cmprtr = new StockCmpByCarton();
        return Collections.binarySearch(orderList, carton, cmprtr);
    }

    public void Show() {
        Iterator itr = this.orderList.iterator();
        
        while (itr.hasNext()) {
            
            System.out.printf("\n%3d\t", itr);
            
            Stock stock = (Stock) itr.next();
            stock.Show();
            System.out.printf("\t%19.2f",  stock.getCarton().getSalePrice());
        }
        
        System.out.printf("\n%50s", "Net Bill = PKR. ");
        System.out.println(this.netBill);
    }
}
