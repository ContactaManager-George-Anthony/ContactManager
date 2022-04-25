package Contacts;

import java.util.HashMap;
import java.util.Scanner;

public class ChoiceOptions {
    public static void selectOptions(int userChoice, HashMap<String, Contact> contacts) {
        Contact contact1 = new Contact("Roads", "Megan",  "932442343");
        Contact contact2 = new Contact("Bullock", "Bob",  "345867530");
        contacts.put("roads", contact1);
        contacts.put("bob", contact2);
//        Scanner scanner = new Scanner(System.in);
        if (userChoice == 1) {
            System.out.println("Name         Phone#");
            System.out.println("-----------------------------------");
            for (Contact contact : contacts.values()) {
                System.out.println(
                        contact.getFirstName() + "" +
                                " " +
                                contact.getLastName() + " | " +
                                contact.getPhoneNum());
            }
            System.out.println("-----------------------------------");
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

            for (Contact contactInfo : contacts.values()) {
                System.out.println(contactInfo.getFirstName());
                System.out.println(contactInfo.getLastName());
                System.out.println(contactInfo.getPhoneNum());
            }
        }else if (userChoice == 3){
            addSearch.searchContacts(contacts);

        } else if (userChoice == 4) {
            System.out.println("Delete an existing contact.\n");

        } else if (userChoice == 5) {
//                            System.out.println(selectOptions());
//
//            selectOptions(int userChoice, HashMap<String, Contact> contacts)
            }
        }
    }

