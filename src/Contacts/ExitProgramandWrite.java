package Contacts;

import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ExitProgramandWrite {
    public static void exitProgram (Path newPath, List<Contact> constactsList) {
        System.out.println("Would you like to do anything else (yes/no)?");
        Scanner scanner = new Scanner(System.in);
        String continueProgram = scanner.nextLine();
        if (continueProgram.equalsIgnoreCase("yes")) {
            FileHelper.tryWriteFile(newPath, constactsList);
            ChoiceOptions.selectOptions();
        } else {
            FileHelper.tryWriteFile(newPath, constactsList);
            System.exit(0);
        }
    }

}
