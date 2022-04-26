package Contacts;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class addSearch {
    public static void searchContacts(Path newPath, List<Contact> contactList) {

        Scanner scanner = new Scanner(System.in);
        boolean isPresent = false;
        System.out.println("Search by name  example: \"Ray Finkle\" or phone#");
        String inputSearch = scanner.nextLine();

        for (Contact contactInfo : contactList) {
            String fullname = contactInfo.getFirstName() + " " + contactInfo.getLastName();
            while (inputSearch.equalsIgnoreCase(fullname) || inputSearch.equalsIgnoreCase(contactInfo.getPhoneNum())) {
                System.out.println(
                        contactInfo.getFirstName() + "" +
                                " " +
                                contactInfo.getLastName() + " | " +
                                contactInfo.getPhoneNum());
                isPresent = true;
                break;
            }
            if (!isPresent) {
                System.out.println("no contacts with that name found");
            }
        }
        ExitProgramandWrite.exitProgram(newPath, contactList);
    }
}
//        while (isPresent == true);
//        System.out.println("does not exist");
//        System.out.println(
//                contactInfo.getFirstName() + "" +
//                        " " +
//                        contactInfo.getLastName() + " | " +
//                        contactInfo.getPhoneNum());
//        System.out.println("yay they were found!");
//        if (isPresent == true) {
//            Contact personInfo = contactList.get(inputSearch);
//            System.out.println("Name         Phone#");
//            System.out.println("-----------------------------------");
//            System.out.println(
//                   personInfo.getFirstName() + "" +
//                            " " +
//                            personInfo.getLastName() + " | " +
//                            personInfo.getPhoneNum());
//        }


