// Code Originally by Prof Rice
// https://github.com/prof-rice/cse1325-prof/tree/main/P07/full_credit
// Modified by Ivan Martinez
package store;

public class Product {
    public Product(String name, double price, double cost) {
        this.name  = name;
        this.price = price;
        this.cost  = cost;
    }
    public String name() {return name;}
    @Override
    public String toString() {
        return name + " ($" + price + ", ";
    }

    protected String name;
    protected double cost;
    protected double price;
}
