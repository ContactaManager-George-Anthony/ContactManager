package Contacts;

import java.util.HashMap;
import java.util.Scanner;

public class ChoiceOptions {
    public static void selectOptions(int userChoice, HashMap<String, Contact> contacts) {
//        Scanner scanner = new Scanner(System.in);
        if (userChoice == 1) {
            System.out.println("Name         Phone#");
            for (Contact contact : contacts.values()) {
                System.out.println(
                        contact.getFirstName() + "" +
                                " " +
                                contact.getLastName() + "  " +
                                contact.getPhoneNum());
            }
//            System.out.println("Name    | Phone number |\n" + "-----------------------\n");
        } else if (userChoice == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a first name: ");
            String firstName = scanner.next();
            System.out.println("Please enter a last name: ");
            String lastName = scanner.next();
            System.out.println("Please enter a phone number: ");
            String phoneNum = scanner.next();
            Contact contact = new Contact(lastName, firstName, phoneNum);
            contacts.put(contact.getLastName(), contact);
        }
    }
}
