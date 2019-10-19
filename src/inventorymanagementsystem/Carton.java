/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

/**
 *
 * @author Family
 */
public class Carton implements Comparable{
    private Product product;
    private int quantityOfProduct;
    private double costPrice;
    private double salePrice;

    public Carton(Product product, int quantityOfProduct, double costPrice, double salePrice) {
        this.product = product;
        this.quantityOfProduct = quantityOfProduct;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    @Override
    public String toString() {
        return product.toString() + " x " + quantityOfProduct;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public int compareTo(Object other) {
        String temp1 = this.toString();
        String temp2 = ((Carton)other).toString();
        
        return temp1.compareTo(temp2);
    }
    
    
}
