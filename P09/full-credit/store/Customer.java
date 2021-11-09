// Code by Ivan Martinez
package store;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Customer extends Person {
    public static final String ID = "store.Person";
    public Customer(String name, String phone) {
        super(name, phone);
    }
    public Customer(BufferedReader in) throws IOException {
	super(in);
	this.name  = in.readLine();
	this.phone  = in.readLine();
    }
    @Override
    public void save(BufferedWriter out) throws IOException {
        super.save(out);
        out.write("" + name  + '\n');
        out.write("" + phone + '\n');
    }
}