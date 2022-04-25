package Contacts;

import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.Scanner;

public class addSearch {
    public static void searchContacts(HashMap<String, Contact> contacts) {
        Scanner scanner = new Scanner(System.in);
        boolean isPresent = false;
        System.out.println("Search by name example first and last name");
        String inputSearch = scanner.nextLine();
        for (String contactInfo : contacts.keySet()) {
            if (inputSearch.equalsIgnoreCase(contactInfo)) {
//              System.out.println(contactInfo.hashCode());
                isPresent = true;
            }
//            System.out.println(contactInfo.());
//            System.out.println(contactInfo.());
        }
        if (isPresent == true) {
            Contact personInfo = contacts.get(inputSearch);
            System.out.println("Name         Phone#");
            System.out.println("-----------------------------------");
            System.out.println(
                   personInfo.getFirstName() + "" +
                            " " +
                            personInfo.getLastName() + " | " +
                            personInfo.getPhoneNum());
        }
    }
}
