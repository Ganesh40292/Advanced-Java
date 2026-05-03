package com.assignment;

import java.util.*;

// Student class
class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

// Comparator for sorting by name
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Assignment2Collections {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Insertion (user input)
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Marks: ");
            int marks = sc.nextInt();

            list.add(new Student(id, name, marks));
        }

        // Traversal
        System.out.println("\nBefore Sorting:");
        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }

        // Sorting
        Collections.sort(list, new NameComparator());

        // After sorting
        System.out.println("\nAfter Sorting (by Name):");
        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }

        sc.close();
    }
}
