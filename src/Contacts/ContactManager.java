package Contacts;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        System.out.println(printMenu());
        Scanner scanner = new Scanner(System.in);
        System.out.println("entername");
        String userinput = scanner.nextLine();
        System.out.println(userinput);
        Contact contact1 = new Contact("abby", (long) (932442343));
        System.out.println(contact1.getPhoneNum());

    }

        public static String printMenu () {
            String menu = "1. View contacts." +
                    "\n2. Add a new contact." +
                    "\n3. Search a contact by name." +
                    "\n4. Delete an existing contact." +
                    "\n5. Exit." +
                    "\nEnter an option (1, 2, 3, 4, 5,)";
            return menu;
        }
}
