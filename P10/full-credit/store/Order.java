package store;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;

public class Order {
    public Order(Customer customer, Server server) {
        this.customer  = customer;
        this.server = server;
    }
    public int getID() {return id;}
    public Order(BufferedReader in) throws IOException {
        //this.customer  = in.readLine();
	//this.server = in.readLine();
    }
    public void save(BufferedWriter out) throws IOException {
        out.write("" + customer  + '\n');
        out.write("" + server  + '\n');
    }
    @Override
    public String toString() {
        return " " + ", ";
    }

    private int id;
    private Customer customer;
    private Server server;
    private HashMap<Product, Integer> products;
}
