import Build.*;

import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Data.init();

        char choice;
        do {
            System.out.println();
            System.out.println("||||||||||||||||||||||||||||||||");
            System.out.println("||||         WELCOME        ||||");
            System.out.println("||||||||||||||||||||||||||||||||");
            System.out.println("1. CREATE AN ACCOUNT");
            System.out.println("2. I ALREADY HAVE AN ACCOUNT");
            System.out.println("Other. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);
            sc.nextLine();

            switch (choice) {
                case '1':
                    Account.createNewAccount(1);
                    break;
                case '2':
                    login();
                    break;
                default:
                    System.out.println("SEE YOU");
                    return;
            }
        } while(true);
    }

    private static void login() {
        do {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password;
            if(System.console() == null) {
                password = sc.nextLine();
            } else {
                char[] ch = System.console().readPassword();
                password = String.valueOf(ch);
            }

            String[] s = Account.checkExistsAccount(username, password);
            if (s  == null) {
                System.out.println("Invalid username or password");
            } else {
                if (s[2].compareTo("0") == 0) {
                    Admin.runMain(username);
                } else if (s[2].compareTo("1") == 0) {
                    User.runMain(username);
                }
                return;
            }
        } while (true);
    }
}