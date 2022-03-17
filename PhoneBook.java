package com.company;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, Contact> storage = new HashMap<>();

    public Contact find(String value) {
        return storage.get(value);
    }

    public void addContact(Contact contact) {
        storage.put(contact.getPhone(), contact);
    }
}