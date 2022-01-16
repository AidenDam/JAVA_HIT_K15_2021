package Build;

import java.util.List;

public class User extends Account
{
    public static void runMain(String username) {
        char choice;
        do {
            System.out.println();
            System.out.println("1. COURSES");
            System.out.println("2. MY CLASS");
            System.out.println("3. PROFILE");
            System.out.println("Other. LOGOUT");
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);
            sc.nextLine();

            switch (choice) {
                case '1':
                    course();
                    break;
                case '2':
                    myClass(username);
                    break;
                case '3':
                    profile(username);
                    break;
                default:
                    return;
            }
        } while(true);
    }

    private static void course() {
        List<String> S = Data.readCourse();

        if(S.size() == 0) {
            System.out.println("There are no courses available");
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
            System.out.println("3. CHOICE A COURSE");
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
                    System.out.print("Enter course name: ");
                    String cs = sc.nextLine();

                    String s = null;
                    for (String it : S) {
                        if (it.compareTo(cs) == 0) {
                            s = it;
                        }
                    }
                    if(s == null) {
                        System.out.println("Course does not exist");
                        break;
                    } else {
                        System.out.println();
                        System.out.println("Do you want download course?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        System.out.print("Enter your choice: ");
                        choice = sc.next().charAt(0);
                        sc.nextLine();
                        if (choice == '1') {
                            Data.openFileByCMD(Data.downCourse(s));
                        }
                    }
                    break;
                default:
                    return;
            }
        }
    }

    private static void myClass(String us) {
        List<String> S = Data.readClass(us);

        if(S.size() == 0) {
            System.out.println("There are no class available");

            char choice;
            System.out.println("Do you want create a course?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);
            sc.nextLine();
            if (choice == '1') {
                createNewClass(us);
            }

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
            System.out.println("3. CREATE A CLASS");
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
                    createNewClass(us);
                    break;
                default:
                    return;
            }
        }
    }

    private static void createNewClass(String us) {
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        System.out.print("Enter course directory link in your computer: ");
        String link = sc.nextLine();

        Data.upCourse(us, link, name);
    }
}
