package Build;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static final String REGEX_NAME = "^[a-zA-Z]+$";
    static final String REGEX_AGE = "\\d";
    static final String REGEX_GENDER = "[123]";
    static final String REGEX_PHONE = "^[0-9\\-\\+]{9,15}$";
    static final String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    static final String REGEX_FB = "(?:https?:\\/\\/)?(?:www\\.)?facebook\\.com\\/(?:(?:\\w)*#!\\/)?(?:pages\\/)?(?:[\\w\\-]*\\/)*?(\\/)?([\\w\\-\\.]{5,})";
    static final String REGEX_DATE = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
    static final String REGEX_USERNAME = "^[a-zA-Z0-9]{6,}$";
    static final String REGEX_PASSWORD = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$";

    static Scanner sc = new Scanner(System.in);
    static Pattern pattern;
    static Matcher matcher;

    static protected String regex(String title, String regexStr, boolean empty) {
        pattern = Pattern.compile(regexStr);
        String s = "";
        do {
            System.out.print(title);
            s = sc.nextLine();
            if(s.compareTo("") == 0 && empty) {
                return null;
            }
            matcher = pattern.matcher(s);
        } while (!matcher.find());
        return s;
    }

    static protected String regexPassword(String title, String regexStr) {
        pattern = Pattern.compile(regexStr);
        String s = "";
        do {
            System.out.print(title);
            if(System.console() == null) {
                s = sc.nextLine();
            } else {
                char[] ch = System.console().readPassword();
                s = String.valueOf(ch);
            }
            matcher = pattern.matcher(s);
        } while (!matcher.find());
        return s;
    }
}
