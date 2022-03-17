package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        fillContacts(phoneBook);
        MissedCalls missedCalls = new MissedCalls();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите пропущенный или end");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            missedCalls.addNew(input);
        }

        System.out.println(missedCalls.toString(phoneBook));

    }

    private static void fillContacts(PhoneBook phoneBook) {
        phoneBook.addContact(new Contact("Боря", "+7 912"));
        phoneBook.addContact(new Contact("Вася", "+7 904"));
        phoneBook.addContact(new Contact("Галя", "+7 922"));
    }
}