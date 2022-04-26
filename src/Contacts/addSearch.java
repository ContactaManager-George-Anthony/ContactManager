package Contacts;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class addSearch {
    public static void searchContacts(List<Contact> contactList, Path newPath) {

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
        System.out.println("Would you like to do anything else?");
        String continueProgram = scanner.nextLine();
        if (continueProgram.equalsIgnoreCase("yes")) {
            ChoiceOptions.selectOptions();
        } else {
            FileHelper.tryWriteFile(newPath, contactList);
            System. exit(0);
        }
//        System.out.println("not found");
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


