package Bai_1;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> Persons = new ArrayList<>();

        try {
            int n;
            System.out.print("Enter n: "); n = sc.nextInt();

            for(int i=0; i<n; i++) {
                System.out.println("Enter person" + (i+1));
                Person person = new Person();

                person.input();
                Persons.add(person);
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }

        System.out.println("SORT BY ID");
        Collections.sort(Persons);
        for (Person person : Persons) {
            System.out.println(person.toString());
        }

        System.out.println("SORT BY NAME");
        Collections.sort(Persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.getName().compareTo(p2.getName()) == 0) {
                    return p2.getAddress().compareTo(p1.getAddress());
                }
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Person person : Persons) {
            System.out.println(person.toString());
        }
    }
}