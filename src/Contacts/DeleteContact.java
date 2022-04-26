package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteContact {
    public static void deleteContact(List<Contact> contactList) {
        System.out.println("4. Delete contacts by name and/or phone number. ");
        System.out.print(" Name or Number: ");
        Scanner myScanner = new Scanner(System.in);
        String searchedNameOrphNum = myScanner.nextLine();
        System.out.println("Name         Phone#");
        System.out.println("-----------------------------------");
        List<Contact> toRemove = new ArrayList<>();
        for (Contact currentContact : contactList) {
            String fullName = currentContact.getFirstName() + " " + currentContact.getLastName();
            if (searchedNameOrphNum.equalsIgnoreCase(fullName) || searchedNameOrphNum.equalsIgnoreCase(currentContact.getPhoneNum())) {
                toRemove.add(currentContact);
            }
        }
        contactList.removeAll(toRemove);


        for (Contact contact : contactList) {
            System.out.println(
                    contact.getFirstName() + "" +
                            " " +
                            contact.getLastName() + " | " +
                            contact.getPhoneNum());
        }
        System.out.println("Would you like to do anything else?");
        String continueProgram = myScanner.nextLine();
        if (continueProgram.equalsIgnoreCase("yes")) {
            ChoiceOptions.selectOptions();
        } else {
            System. exit(0);
        }
    }

}


//        Path ContactsPath = Paths.get("data", "contactsInfo.json");
//        List<String> Personlist;
//        try {
//            Personlist = Files.readAllLines(ContactsPath);
//            List<String> newList = new ArrayList<>();
//            for (String person : Personlist) {
//                if (person.toLowerCase().contains(searchedName)) {
//                    continue;
//                }
//                newList.add(person);
//            }
//            for (String name : newList) {
//                System.out.println(name);
//            }
//            Files.write(Paths.get("data", "contactsInfo.json"), newList);
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
//    }

//    public static void exit() {
//        System.out.println("Goodbye");
//        System.exit(0);
//
//    }
