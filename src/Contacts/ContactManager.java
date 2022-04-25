package Contacts;

import java.util.HashMap;
import java.util.Scanner;

public class ContactManager {

    public static void main(String[] args) {
        // creates a new hashmap
        HashMap<String, Contact> contactsHashMap = Hashmap.createHashMap();

        // Makes a new menu
        Menu contactMenu = new Menu();

        // prints menu
        System.out.println(contactMenu.printMenu());
        // Creates new scanner object
        Scanner scanner = new Scanner(System.in);

//        Contact contact1 = new Contact("Roads", "Megan", (long) (932442343));
//        Contact contact2 = new Contact("Bullock", "Bob", (long) (345867530));
//        contactsHashmap.put(contact1.getLastName() + ", " + contact1.getFirstName(), contact1);
//        contactsHashmap.put(contact2.getLastName() + ", " + contact2.getFirstName(), contact2);

        System.out.println("Please select a number");
        int option = scanner.nextInt();
        ChoiceOptions userSelectsOption = new ChoiceOptions();
        userSelectsOption.selectOptions(option, contactsHashMap);

        for (Contact contact : contactsHashMap.values()) {
            System.out.println(contact.getFirstName());
            System.out.println(contact.getLastName());
            System.out.println(contact.getPhoneNum());
        }


//        String firstNameInput = scanner.next();

    }

//    public static String printMenu() {
//        String menu = "1. View contacts." +
//                "\n2. Add a new contact." +
//                "\n3. Search a contact by name." +
//                "\n4. Delete an existing contact." +
//                "\n5. Exit." +
//                "\nEnter an option (1, 2, 3, 4, 5,)";
//        return menu;
//    }

//    public static void selectOptions(int userChoice, HashMap<Integer, Contact> contacts) {
//        if (userChoice == 1) {
//            for (Contact contact : contacts.values()) {
//                System.out.println(contact.getName());
//                System.out.println(contact.getPhoneNum());
//            }
////            System.out.println("Name    | Phone number |\n" + "-----------------------\n");
//        } else if (userChoice == 2) {
//            System.out.println("\n You have chosen to add a new contact!\n");
//            System.out.println("\n Enter the name of the new contact\n");
//            System.out.println("\n Enter the phone number of your new contact\n");
//        }
//    }
}
