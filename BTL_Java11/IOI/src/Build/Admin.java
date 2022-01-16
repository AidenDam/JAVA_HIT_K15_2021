package Build;

import java.util.List;

public class Admin extends Account
{
    public static void runMain(String ussername) {
        char choice;
        do {
            System.out.println();
            System.out.println("1. CREATE ACCOUNT");
            System.out.println("2. MANAGE ACCOUNTS");
            System.out.println("3. PROFILE");
            System.out.println("Other. LOGOUT");
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);
            sc.nextLine();

            switch (choice) {
                case '1':
                    createAccount();
                    break;
                case '2':
                    manageAccount();
                    break;
                case '3':
                    profile(ussername);
                    break;
                default:
                    return;
            }
        } while(true);
    }

    private static void createAccount() {
        char choice;
        do {
            System.out.println();
            System.out.println("1. CREATE FROM FILE");
            System.out.println("2. CREATE A ACCOUNT FOR USER");
            System.out.println("3. CREATE A ACCOUNT FOR ADMIN");
            System.out.println("Other. BACK");
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);
            sc.nextLine();

            switch (choice) {
                case '1':
                    System.out.print("Format: \'username:password:level\'(0: admin, 1: user)");
                    System.out.print("Enter link file: ");
                    createAccountFromFile(sc.nextLine());
                    break;
                case '2':
                    createNewAccount(0);
                    break;
                case '3':
                    createNewAccount(1);
                    break;
                default:
                    return;
            }
        } while(true);
    }

    private static void createAccountFromFile(String link) {
        List<String> S = Data.readFile(link);

        for (String it : S) {
            String[] s = it.split(";");
            if(!checkExistsUsername(s[0])) {
                Data.writeAccountFromFile(new Account(s[0], s[1], new Person()), Integer.parseInt(s[2]));
            }
        }
    }

    private static void manageAccount() {
        List<String> S = Data.readAccount();

        if(S.size() == 0) {
            System.out.println("There are no account available");
            return;
        }

        for (int i = 0; i < S.size(); i++) {
            int j = 5;
            System.out.println("\n\t\t\tLIST");
            while(j != 0 && i < S.size()) {
                System.out.println(S.get(i).replace(";", " | "));
                i++;
                j--;
            }

            char choice;
            System.out.println();
            System.out.println("1. LAST");
            System.out.println("2. NEXT");
            System.out.println("3. CHOICE A COUNT");
            System.out.println("Other. BACK");
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);
            sc.nextLine();

            switch (choice) {
                case '1':
                    i -= (5 - j + 1);
                    break;
                case '2':
                    if(i == S.size()) {
                        i -= (5 - j + 1);
                    }
                    break;
                case '3':
                    System.out.print("Enter username: ");
                    String us = sc.nextLine();

                    Account ac = null;
                    String[] s = null;
                    for (String it : S) {
                        s = it.split(";");
                        if (s[0].compareTo(us) == 0) {
                            ac = new Account(s[0], s[1], Data.readInfo(us), s[3]);
                        }
                    }
                    if(ac == null) {
                        System.out.println("Username does not exist");
                        break;
                    }
                    System.out.println();
                    System.out.println("Username: " + ac.getUsername());
                    System.out.println("Password: " + ac.getPassword());
                    System.out.println("Level: " + s[2]);
                    System.out.println("Create at: " + ac.getCreateAt());
                    System.out.println(ac.getInformation());
                    break;
                default:
                        return;
                }
        }
    }
}
