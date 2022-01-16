package Build;

import static Build.Regex.*;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Account
{
    static Scanner sc = new Scanner(System.in);

    protected String username;
    protected String password;
    protected Person information = new Person();
    protected String createAt;

    public Account(){
        this.createAt = getTimeNow();
    };

    public Account(String userName, String password, Person information) {
        this.username = userName;
        this.password = password;
        this.information = information;
        this.createAt = getTimeNow();
    }

    public Account(String userName, String password, Person information, String createAt) {
        this.username = userName;
        this.password = password;
        this.information = information;
        this.createAt = createAt;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getInformation() {
        return information;
    }

    public void setInformation(Person information) {
        this.information = information;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public static String getTimeNow() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }

    public static void createNewAccount(int level) {
        Account ac = new Account();
        ac.username = enterUserName();
        ac.password = enterPassword();
        ac.information.input();
        Data.writeAccountFromFile(ac, level);
    }

    public static String enterUserName() {
        String s;
        do {
            s = regex("Enter username: ", REGEX_USERNAME, false);
            boolean check = checkExistsUsername(s);

            if(check) {
                System.out.println("Username already exists");
            } else {
                break;
            }
        } while(true);

        return s;
    }

    public static boolean checkExistsUsername(String us) {
        List<String> list = Data.readAccount();

        for (String it : list) {
            if (it.split(";")[0].compareTo(us) == 0) return true;
        }

        return false;
    }

    public static String[] checkExistsAccount(String us, String pa) {
        List<String> list = Data.readAccount();

        for (String it : list) {
            String[] s = it.split(";");
            if (s[0].compareTo(us) == 0 && s[1].compareTo(pa) == 0) return s;
        }

        return null;
    }

    public static String enterPassword() {
        String s1, s2;
        do {
            s1 = regexPassword("Enter password: ", REGEX_PASSWORD);
            System.out.print("Confirm password: ");
            if(System.console() == null) {
                s2 = sc.nextLine();
            } else {
                char[] ch = System.console().readPassword();
                s2 = String.valueOf(ch);
            }

            if(s1.compareTo(s2) != 0) {
                System.out.println("Password and confirm password does not match");
            } else {
                break;
            }
        } while(true);

        return s1;
    }

    private static void changePassword(String username) {
        List<String> list = Data.readAccount();

        int i = 0;
        while(i < list.size()) {
            String[] s = list.get(i).split(";");
            if (s[0].compareTo(username) == 0) {
                System.out.print("Enter old password: ");
                String pa = sc.nextLine();
                if(s[1].compareTo(pa) == 0) {
                    s[1] = enterPassword();
                    list.set(i, s[0] + ";" + s[1] + ";" + s[2] + ";" + s[3]);
                    Data.writeAccount(list);
                    System.out.println("Invalid password");
                }
            }
            i++;
        }
    }

    protected static void profile(String username) {
        Person p = Data.readInfo(username);
        char choice;
        do {
            System.out.println();
            System.out.println(p);
            System.out.println("9. Password");
            System.out.println("Other. BACk");
            System.out.print("Enter your choice: ");
            choice = sc.nextLine().charAt(0);

            switch (choice) {
                case '0':
                    p.setFirstName(p.regexFirstName());
                    break;
                case '1':
                    p.setLastName(p.regexLastName());
                    break;
                case '2':
                    p.setAge(p.regexAge());
                    break;
                case '3':
                    p.setGender(p.regexGender());
                    break;
                case '4':
                    p.setBirthDay(p.enterBirthDay());
                    break;
                case '5':
                    p.setPhone(p.regexPhone());
                    break;
                case '6':
                    p.setEmail(p.regexEmail());
                    break;
                case '7':
                    p.setLinkFB(p.regexLinkFB());
                    break;
                case '8':
                    p.setSummary(sc.nextLine());
                    break;
                case '9':
                    changePassword(username);
                    break;
                default:
                    return;
            }
            Data.writeInfo(username, p);
        } while(true);
    }
}
