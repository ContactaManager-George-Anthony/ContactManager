package Contacts;
import java.nio.file.Path;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class ChoiceOptions {
    public static void selectOptions() {
        // make new file path
        Path newPath = FileHelper.tryMakeFileDirectory();
        List<Contact> constactsList = new ArrayList<>(FileHelper.tryReadFile(newPath));

        // Makes a new menu
        Menu contactMenu = new Menu();

        // prints menu
        System.out.println(contactMenu.printMenu());
        // Creates new scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a number");
        int userChoice = scanner.nextInt();


        if (userChoice == 1) {

            System.out.println("Name         Phone#");
            System.out.println("-----------------------------------");
            for (Contact contact : constactsList) {
                System.out.println(
                        contact.getFirstName() + "" +
                                " " +
                                contact.getLastName() + " | " +
                                contact.getPhoneNum());
            }
            System.out.println("-----------------------------------");

            System.out.println("Would you like to do anything else (yes/no)?");
            String continueProgram = scanner.nextLine();
            if (continueProgram.equalsIgnoreCase("yes")) {
                ChoiceOptions.selectOptions();
            } else {
                FileHelper.tryWriteFile(newPath, constactsList);
                System. exit(0);
            }
            // choice 2 add contact
        } else if (userChoice == 2) {
            System.out.println("Please enter a first name: ");
            String firstName = scanner.next();
            System.out.println("Please enter a last name: ");
            String lastName = scanner.next();
            System.out.println("Please enter a phone number: ");
            String phoneNum = scanner.next();
            while (phoneNum.length() != 10) {
                System.out.println("Phone number must be 10 digits long");
                phoneNum = scanner.next();
            }
            Contact contact = new Contact(lastName, firstName, phoneNum);
            constactsList.add(contact);

            int lastContact = constactsList.size() - 1;

            System.out.println("The person you added is: ");
            System.out.println("Name         Phone#");
            System.out.println("-----------------------------------");
                System.out.println(
                        constactsList.get(lastContact).getFirstName() + "" +
                                " " +
                                constactsList.get(lastContact).getLastName() + " | " +
                                constactsList.get(lastContact).getPhoneNum());
            System.out.println("-----------------------------------");
            System.out.println("Would you like to do anything else?");
            String continueProgram = scanner.nextLine();
            if (continueProgram.equalsIgnoreCase("yes")) {
                ChoiceOptions.selectOptions();
            } else {
                FileHelper.tryWriteFile(newPath, constactsList);
                System. exit(0);
            }
//                FileHelper.tryWriteFile(newPath, constactsList);
            } else if (userChoice == 3) {
                addSearch.searchContacts(constactsList, newPath);

            } else if (userChoice == 4) {

            DeleteContact.deleteContact(constactsList);

            } else if (userChoice == 5) {
            FileHelper.tryWriteFile(newPath, constactsList);
            System. exit(0);

            }
        }
    }

