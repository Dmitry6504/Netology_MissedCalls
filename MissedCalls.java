package com.company;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> storage = new TreeMap<>();

    public void addNew(String phone) {
        storage.put(LocalDateTime.now(), phone);
    }

    public String toString(PhoneBook phoneBook) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<LocalDateTime, String> mCall : storage.entrySet()) {
            Contact contact = phoneBook.find(mCall.getValue());
            sb
                    .append(mCall.getKey())
                    .append("\t")
                    .append(
                            contact == null ? mCall.getValue() : contact.getName())
                    .append("\n");
        }
        return sb.toString();
    }
}