package com.zainbutt;

/**
 * Created by admin on 1/25/2016.
 */
public class Contacts {

    // Fields
    private String name;
    private String phoneNumber;

    // Constructor
    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    // Methods

    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }
}
