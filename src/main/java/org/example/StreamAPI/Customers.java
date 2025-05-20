package org.example.StreamAPI;

import java.util.List;

public class Customers {

    private int id;
    private  String name;
    private  String  email;
    private List<String> phoneNumbers;

    public Customers(int id, String name, String email, List<String>phoneNumbers){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumbers=phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
