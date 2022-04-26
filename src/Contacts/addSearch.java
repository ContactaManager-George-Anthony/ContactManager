package Contacts;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class addSearch {
    public static void searchContacts(List<Contact> contactList) {
        Scanner scanner = new Scanner(System.in);
        boolean isPresent = false;
        System.out.println("Search by name  example: \"Ray Finkle\"");
        String inputSearch = scanner.nextLine();
        // THINK OF MAKING HELPER FUNCTION THAT RETURNS A BOOL TO STOP THIS LOOP IN CASE FOUND/NOT FOUND
//        do {
        for (Contact contactInfo : contactList) {
            String fullname = contactInfo.getFirstName() + " " + contactInfo.getLastName();
            if (!fullname.equalsIgnoreCase(inputSearch)) {
                break;
            }
        }
        System.out.println("not found");
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
}

