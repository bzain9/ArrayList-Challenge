package com.zainbutt;

import java.util.ArrayList;

/**
 * Created by admin on 1/25/2016.
 */
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contacts> myContacts;

    // Constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    // Methods

    public boolean addNewContact(Contacts contacts) {
        if (findContract(contacts.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContacts, Contacts newContacts) {
        int findPosition = findContact(oldContacts);
        if (findPosition <0) {
            System.out.println(oldContacts.getName() + ", was not found");
            return false;
        }

        this.myContacts.set(findPosition, newContacts);
        System.out.println(oldContacts.getName() + " was replaced with " + newContacts.getName());
        return true;
    }


    public boolean removeContact(Contacts contacts) {
        int findPosition = findContact(contacts);
        if (findPosition <0) {
            System.out.println(contacts.getName() + ", does not exist");
            return false;
        }
        this.myContacts.remove(findPosition);
        System.out.println(contacts.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);  // Will return >=0 if exists and if not a negative number
    }

    private int findContract(String contractName) {
        for (int i=0; i<this.myContacts.size(); i++) {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contractName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contacts) {
        if (findContact(contacts) >=0) {
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContract(name);
        if (position >=0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i =0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}













