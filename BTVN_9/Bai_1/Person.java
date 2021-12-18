package Bai_1;

import java.util.Scanner;

public class Person implements Comparable<Person> {
    static Scanner sc = new Scanner(System.in);
    private String id, name, address;

    Person() {
        id = name = address = "";
    }

    public Person(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void input() {
        System.out.print("Enter id of person: "); this.id = sc.nextLine();
        System.out.print("Enter name of person: "); this.name = sc.nextLine();
        System.out.print("Enter address of person: "); this.address = sc.nextLine();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person p) {
        return this.id.compareTo(p.id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}