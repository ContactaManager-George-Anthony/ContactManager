package Contacts;

import java.util.Scanner;


public class ContactManager {
    public static void main(String[] args) {
        System.out.println(printMenu());

    }

    public static String printMenu() {
        String menu = "1. View contacts." +
                "\n2. Add a new contact." +
                "\n3. Search a contact by name." +
                "\n4. Delete an existing contact." +
                "\n5. Exit." +
                "\nEnter an option (1, 2, 3, 4, 5,)";
        return menu;
    }
}
