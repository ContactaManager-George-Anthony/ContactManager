package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteContact {
    public static void deleteContact(Path newPath, List<Contact> contactList) {
        System.out.println("4. Delete contacts by name and/or phone number. ");
        System.out.print(" Name or Number: ");
        Scanner myScanner = new Scanner(System.in);
        String searchedNameOrphNum = myScanner.nextLine();
        List<Contact> toRemove = new ArrayList<>();
        for (Contact currentContact : contactList) {
            String fullName = currentContact.getFirstName() + " " + currentContact.getLastName();
            if (searchedNameOrphNum.equalsIgnoreCase(fullName) || searchedNameOrphNum.equalsIgnoreCase(currentContact.getPhoneNum())) {
                toRemove.add(currentContact);
            }
        }
        contactList.removeAll(toRemove);

        System.out.println("Would you like to see the updated contact list?");
        String seeUpdatedList = myScanner.nextLine();
        if (seeUpdatedList.equalsIgnoreCase("yes")) {
            for (Contact contact : contactList) {
                System.out.println(
                        contact.getFirstName() + "" +
                                " " +
                                contact.getLastName() + " | " +
                                contact.getPhoneNum());
            }
        } else {
            ExitProgramandWrite.exitProgram(newPath, contactList);
        }
        ExitProgramandWrite.exitProgram(newPath, contactList);
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
