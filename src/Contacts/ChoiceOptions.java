package Contacts;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;


public class ChoiceOptions {
    public static void selectOptions(int userChoice, List<Contact> contactList) {
        Path newPath = FileHelper.tryMakeFileDirectory();
//        FileHelper.tryWriteFile(newPath);
        Contact trickle = new Contact("Marsh", "Stan",  "932442343");
        Contact dallas = new Contact("Brovski", "Kyle",  "345867530");
        Contact focker = new Contact("McCormick", "Kenny", "7605407586");
        Contact zoolander = new Contact("Cartman", "Eric", "7604589740");
        contactList.add(trickle);
        contactList.add(dallas);
        contactList.add(focker);
        contactList.add(zoolander);
//        FileHelper.tryWriteFile(newPath, contactList);

        if (userChoice == 1) {

            System.out.println("Name         Phone#");
            System.out.println("-----------------------------------");
            for (Contact contact : FileHelper.tryReadFile(newPath)) {
                System.out.println(
                        contact.getFirstName() + "" +
                                " " +
                                contact.getLastName() + " | " +
                                contact.getPhoneNum());
            }
            System.out.println("-----------------------------------");

            // choice 2 add contact
        } else if (userChoice == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a first name: ");
            String firstName = scanner.next();
            System.out.println("Please enter a last name: ");
            String lastName = scanner.next();
            System.out.println("Please enter a phone number: ");
            String phoneNum = scanner.next();
            while (phoneNum.length() != 10) {
                System.out.println("Phone number must be 9 digits long");
                phoneNum = scanner.next();
            }
            Contact contact = new Contact(lastName, firstName, phoneNum);
            contactList.add(contactList.size(), contact);

            int lastContact = contactList.size() - 1;

            System.out.println("The person you added is: ");
            System.out.println("Name         Phone#");
            System.out.println("-----------------------------------");
                System.out.println(
                        contactList.get(lastContact).getFirstName() + "" +
                                " " +
                                contactList.get(lastContact).getLastName() + " | " +
                                contactList.get(lastContact).getPhoneNum());
            System.out.println("-----------------------------------");

                FileHelper.tryWriteFile(newPath, contactList);
            } else if (userChoice == 3) {
                addSearch.searchContacts(contactList);

            } else if (userChoice == 4) {
            DeleteFile.deleteContact(contactList);


            } else if (userChoice == 5) {
            DeleteFile.exit();
//                            System.out.println(selectOptions());
//
//            selectOptions(int userChoice, HashMap<String, Contact> contacts)
            }
        }
    }

