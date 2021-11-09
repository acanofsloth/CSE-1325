// Code by Ivan Martinez
package store;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Person {
    public static final String ID = "store.Customer";
    public Person(String name, String phone) {
        super(name, phone);
        this.name = name;
        this.phone = phone;
    }

    public void addShot(Shot shot) {
        shots.add(shot);
    }

    @Override
    public String toString() {
        String result = name + phone;
        return result;
    }

    String name;
    String phone;
}