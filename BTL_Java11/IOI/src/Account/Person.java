package Account;

import static Account.Regex.*;

public class Person
{
    private static final String[] Gender = {"", "Male", "Female", "Other"};

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String birthDay;
    private String phone;
    private String email;
    private String linkFB;
    private String summary;

    public Person() {
    };

    public Person(String[] s) {
        this.firstName = s[0];
        this.lastName = s[1];
        this.age = Integer.parseInt(s[2]);
        this.gender = s[3];
        this.birthDay = s[4];
        this.phone = s[5];
        this.email = s[6];
        this.linkFB = s[7];
        this.summary = s[8];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String regexFirstName() {
        return regex("Enter first name: ", REGEX_NAME, true);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String regexLastName() {
        return regex("Enter last name: ", REGEX_NAME, true);
    }

    public String getFullName() {
        return firstName + lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int regexAge() {
        String s = regex("Enter age: ", REGEX_AGE, true);
        if (s != null) {
            return Integer.parseInt(s);
        }
        return -1;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = Gender[gender];
    }

    public int regexGender() {
        String s = regex("Enter gender (1. Male, 2. Female, 3. Other): ", REGEX_GENDER, true);
        if (s != null) {
            return Integer.parseInt(s);
        }
        return 0;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String enterBirthDay() {
        return regex("Enter Birth Day: ", REGEX_DATE, true);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String regexPhone() {
        return regex("Enter phone: ", REGEX_PHONE, true);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String regexEmail() {
        return regex("Enter email: ", REGEX_EMAIL, true);
    }

    public String getLinkFB() {
        return linkFB;
    }

    public void setLinkFB(String linkFB) {
        this.linkFB = linkFB;
    }

    public String regexLinkFB() {
        return regex("Enter facebook: ", REGEX_FB, true);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void input() {
        firstName = regexFirstName();
        lastName = regexLastName();
        age = regexAge();
        gender = Gender[regexGender()];
        birthDay = enterBirthDay();
        phone = regexPhone();
        email = regexEmail();
        linkFB = regexLinkFB();
        System.out.print("Enter summary: ");
        summary = sc.nextLine();
        if(summary.compareTo("") == 0) {
            summary = null;
        }
    }

    @Override
    public String toString() {
        return "0. First Name: " + firstName +
                "\n1. Last Name: " + lastName +
                "\n2. Age: " + age +
                "\n3. Gender: " + gender +
                "\n4. BirthDay: " + birthDay +
                "\n5. Phone: " + phone +
                "\n6. Email: " + email +
                "\n7. LinkFB: " + linkFB +
                "\n8. Summary: " + summary;
    }
}
