package Contacts;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DeleteFile {
    public static void deleteContact(List<Contact> contactList) {
        Path ContactsPath = Paths.get("data", "contactsInfo.json");
        FileHelper.tryReadFile(ContactsPath);
        System.out.println("4. Delete contacts by name and/or phone number. ");
        System.out.print(" Name or Number: ");
        Scanner myScanner = new Scanner(System.in);
        String searchedName = myScanner.nextLine();
        for (Contact contact : contactList){
            if (searchedName.equalsIgnoreCase(contact.getFirstName() +" "+ contact.getLastName())) {
                contactList.remove(contact);
            }
        }
        System.out.println("Name         Phone#");
        System.out.println("-----------------------------------");
        for (Contact contact : contactList) {
            System.out.println(
                    contact.getFirstName() + "" +
                            " " +
                            contact.getLastName() + " | " +
                            contact.getPhoneNum());
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

    public static void exit() {
        System.out.println("Goodbye");
        System.exit(0);

    }
}