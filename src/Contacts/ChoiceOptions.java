package Contacts;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChoiceOptions {
    public static void selectOptions() {
        // make new file path
        Path newPath = FileHelper.tryMakeFileDirectory();
        List<Contact> constactsList = new ArrayList<>(FileHelper.tryReadFile(newPath));
//        Contact contact1 = new Contact("")
        // Makes a new menu
        Menu contactMenu = new Menu();

        // prints menu
        System.out.println("\n" +
                "███╗░░░███╗███████╗███╗░░██╗██╗░░░██╗\n" +
                "████╗░████║██╔════╝████╗░██║██║░░░██║\n" +
                "██╔████╔██║█████╗░░██╔██╗██║██║░░░██║\n" +
                "██║╚██╔╝██║██╔══╝░░██║╚████║██║░░░██║\n" +
                "██║░╚═╝░██║███████╗██║░╚███║╚██████╔╝\n" +
                "╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░╚═════╝░");

        System.out.println(contactMenu.printMenu());

        // Creates new scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a number");
        int userChoice = scanner.nextInt();



        if (userChoice == 1) {
            System.out.println("    _.-(_)._     .\"          \".      .--\"\"--.          _.-{__}-._\n" +
                    "   .'________'.   | .--------. |    .'        '.      .:-'`____`'-:.\n" +
                    "  [____________] /` |________| `\\  /   .'``'.   \\    /_.-\"`_  _`\"-._\\\n" +
                    "  /  / .\\/. \\  \\|  / / .\\/. \\ \\  ||  .'/.\\/.\\'.  |  /`   / .\\/. \\   `\\\n" +
                    "  |  \\__/\\__/  |\\_/  \\__/\\__/  \\_/|  : |_/\\_| ;  |  |    \\__/\\__/    |\n" +
                    "  \\            /  \\            /   \\ '.\\    /.' / .-\\                /-.\n" +
                    "  /'._  --  _.'\\  /'._  --  _.'\\   /'. `'--'` .'\\/   '._-.__--__.-_.'   \\\n" +
                    " /_   `\"\"\"\"`   _\\/_   `\"\"\"\"`   _\\ /_  `-./\\.-'  _\\'.    `\"\"\"\"\"\"\"\"`    .'`\\\n" +
                    "(__/    '|    \\ _)_|           |_)_/            \\__)|        '       |   |\n" +
                    "  |_____'|_____|   \\__________/   |              |;`_________'________`;-'\n" +
                    "jgs'----------'    '----------'   '--------------'`--------------------`\n" +
                    "     S T A N          K Y L E        K E N N Y         C A R T M A N");
            System.out.println("Name         Phone#");
            System.out.println("-----------------------------------");
            for (Contact contact : constactsList) {
                System.out.println(
                        contact.getFirstName() + "" +
                                " " +
                                contact.getLastName() + " | " +
                                contact.getPhoneNum());
            }
            System.out.println("-----------------------------------");

            ExitProgramandWrite.exitProgram(newPath, constactsList);

            // choice 2 add contact
        } else if (userChoice == 2) {
            System.out.println(". -------------------------------------------------------------------.        \n" +
                    "| [Esc] [F1][F2][F3][F4][F5][F6][F7][F8][F9][F0][F10][F11][F12] o o o|        \n" +
                    "|                                                                    |        \n" +
                    "| [`][1][2][3][4][5][6][7][8][9][0][-][=][_<_] [I][H][U] [N][/][*][-]|        \n" +
                    "| [|-][Q][W][E][R][T][Y][U][I][O][P][{][}] | | [D][E][D] [7][8][9]|+||        \n" +
                    "| [CAP][A][S][D][F][G][H][J][K][L][;]['][#]|_|           [4][5][6]|_||        \n" +
                    "| [^][\\][Z][X][C][V][B][N][M][,][.][/] [__^__]    [^]    [1][2][3]| ||        \n" +
                    "| [c]   [a][________________________][a]   [c] [<][V][>] [ 0  ][.]|_||        \n" +
                    "`--------------------------------------------------------------------'        \n" +
                    "                                                                       ");
            AddContact.AddContact(newPath, constactsList);

        } else if (userChoice == 3) {
            System.out.println("                              \\\\\\\\\\\\\\\n" +
                    "                            \\\\\\\\\\\\\\\\\\\\\\\\\n" +
                    "                          \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                    "  -----------,-|           |C>   // )\\\\\\\\|\n" +
                    "           ,','|          /    || ,'/////|\n" +
                    "---------,','  |         (,    ||   /////\n" +
                    "         ||    |          \\\\  ||||//''''|\n" +
                    "         ||    |           |||||||     _|\n" +
                    "         ||    |______      `````\\____/ \\\n" +
                    "         ||    |     ,|         _/_____/ \\\n" +
                    "         ||  ,'    ,' |        /          |\n" +
                    "         ||,'    ,'   |       |         \\  |\n" +
                    "_________|/    ,'     |      /           | |\n" +
                    "_____________,'      ,',_____|      |    | |\n" +
                    "             |     ,','      |      |    | |\n" +
                    "             |   ,','    ____|_____/    /  |\n" +
                    "             | ,','  __/ |             /   |\n" +
                    "_____________|','   ///_/-------------/   |\n" +
                    "              |===========,'");
            addSearch.searchContacts(newPath, constactsList);

        } else if (userChoice == 4) {
            System.out.println("        ____\n" +
                    "        / _\\ \\\n" +
                    "      .'\\/  \\ \\\n" +
                    "    ,'   \\   \\ \\\n" +
                    "     / /-'    \\ \\ .\n" +
                    "    / /       ,\\ '|\n" +
                    "   / /        '-._|\n" +
                    "  / /_.'|________\\_\\\n" +
                    "  \\/_<  ___________/\n" +
                    "jgs   '.|");
            DeleteContact.deleteContact(newPath, constactsList);

        } else if (userChoice == 5) {
            System.out.println("      _____|~~\\_____      _____________\n" +
                    "  _-~               \\    |    \\\n" +
                    "  _-    | )     \\    |__/   \\   \\\n" +
                    "  _-         )   |   |  |     \\  \\\n" +
                    "  _-    | )     /    |--|      |  |\n" +
                    " __-_______________ /__/_______|  |_________\n" +
                    "(                |----         |  |\n" +
                    " `---------------'--\\\\\\\\      .`--'\n" +
                    "                              `||||");
            FileHelper.tryWriteFile(newPath, constactsList);
            System.exit(0);
        }
    }
}