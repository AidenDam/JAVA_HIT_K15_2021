import javax.swing.plaf.IconUIResource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Account {
    static private long id;
    private String fullName;
    private String userName;
    private String password;
    private String email;
    private String phone;
    private String createAt;
    
    // Use for regex
    static Pattern pattern;
    static Matcher matcher;
    static final String REGEX_USERNAME = "^[a-zA-Z0-9]{6,}$";
    static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
    static final String REGEX_EMAIL = "^[\\w\\.]+@([a-zA-Z]+\\.)+[\\w]{2,4}$";
    static final String REGEX_PHONE = "^(84|0[3|5|7|8|9])([0-9]{8})$";

    static private String regex(String title, String str) {
        pattern = Pattern.compile(str);
        String x = "";
        do {
            System.out.print(title);
            x = Main.sc.nextLine();
            matcher = pattern.matcher(x);
        } while (!matcher.find());
        return x;
    }

    public Account() {
    }

    public Account(long id, String fullName, String userName, String password, String email, String phone, String createAt) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public void setId() {
        System.out.print("Enter id: ");
        this.id = Main.sc.nextLong();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName() {
        Main.sc.nextLine();
        System.out.print("Enter fullName: ");
        this.fullName = Main.sc.nextLine();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        this.userName = regex("Enter user name: ", REGEX_USERNAME);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        String password = regex("Enter password: ", REGEX_PASSWORD);
        do {
            System.out.print("Confirm password: ");
        } while(password.compareTo(Main.sc.nextLine()) != 0);

        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = regex("Enter email: ", REGEX_EMAIL);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        this.phone = regex("Enter phone number: ", REGEX_PHONE);
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String convertToFile() {
        return String.format("%d|%s|%s|%s|%s|%s|%s"
                , id, fullName, userName, password,
                email, phone, createAt);
    }

    public boolean canLogIn(String userName, String password) {
        return (this.userName.equals(userName)) && (this.password.equals(password));
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Account account = (Account) obj;
        return (account.getId() == this.id) && (account.userName.equals(this.userName));
    }
}   