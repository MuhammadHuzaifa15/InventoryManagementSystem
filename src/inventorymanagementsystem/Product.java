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
public class Product implements Comparable{
    private final String name;
    private final String massOrVolume;

    public Product(String name, String massOrVolume) {
        this.name = name;
        this.massOrVolume = massOrVolume;
    }

    @Override
    public String toString() {
        return name + " " + massOrVolume;
    }

    public String getName() {
        return name;
    }

    public String getMassOrVolume() {
        return massOrVolume;
    }

    @Override
    public int compareTo(Object other) {
        Product that = (Product) other;
        return this.name.compareTo(that.name);
    }
}
