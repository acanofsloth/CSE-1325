// Code by Ivan Martinez
package store;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Person {

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Person(BufferedReader in) throws IOException {
        this.name  = in.readLine();
        this.phone = in.readLine();
    }

    public void save(BufferedWriter out) throws IOException {
        out.write("" + name  + '\n');
        out.write("" + phone + '\n');
    }
    @Override
    public String toString() {
        String result = name + "  " + phone;
        return result;
    }

    protected String name;
    protected String phone;
}