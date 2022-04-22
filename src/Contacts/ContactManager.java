package Contacts;

import java.util.HashMap;
import java.util.Scanner;

public class ContactManager {

    public static void main(String[] args) {
        // create hashmap object
        HashMap<Integer, Contact> contacts = new HashMap<>();

        // prints menu
        System.out.println(printMenu());
        // makes new scanner
        Scanner scanner = new Scanner(System.in);

        Contact contact1 = new Contact("abby", (long) (932442343));
        Contact contact2 = new Contact("bob", (long) (345867530));
        contacts.put(1, contact1);
        contacts.put(2, contact2);


        System.out.println("Please select a number");
        int option = scanner.nextInt();
        selectOptions(option, contacts);
//        System.out.println(option);


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

    public static void selectOptions(int userChoice, HashMap<Integer, Contact> contacts) {
        if (userChoice == 1) {
            for (Contact contact : contacts.values()) {
                System.out.println(contact.getName());
                System.out.println(contact.getPhoneNum());
            }
//            System.out.println("Name    | Phone number |\n" + "-----------------------\n");
        } else if (userChoice == 2) {
            System.out.println("\n You have chosen to add a new contact!\n");
            System.out.println("\n Enter the name of the new contact\n");
            System.out.println("\n Enter the phone number of your new contact\n");
        }
    }
}
