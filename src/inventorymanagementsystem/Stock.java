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
public class Stock {
    private Carton carton;
    private int noOfCartons;
    private double costPrice;
    private double salePrice;

    public Stock(Carton carton, int noOfCartons) {
        this.carton = carton;
        this.noOfCartons = noOfCartons;
        this.costPrice = this.noOfCartons * this.carton.getCostPrice();
        this.salePrice = this.noOfCartons * this.carton.getSalePrice();
    }

    public Carton getCarton() {
        return carton;
    }

    public int getNoOfCartons() {
        return noOfCartons;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setCarton(Carton carton) {
        this.carton = carton;
        this.costPrice = this.noOfCartons * this.carton.getCostPrice();
        this.salePrice = this.noOfCartons * this.carton.getSalePrice();
    }
    
    public void addCartons(int noOfCartons) {
        this.noOfCartons += noOfCartons;
        this.costPrice = this.noOfCartons * this.carton.getCostPrice();
        this.salePrice = this.noOfCartons * this.carton.getSalePrice();
    }
    
    public void Show() {
        System.out.printf("%-27s\t%5d", carton.toString(), noOfCartons);
    }

    
    
    
}
