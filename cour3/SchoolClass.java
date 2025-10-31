package cour3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolClass {
    private double bestGrade = 0;
    private double worstGrade = 6;
    private double average = 0;
    private List<Student> students = new ArrayList<Student>();
    private Scanner scanner = new Scanner(System.in);

    public boolean askAddStudent() {
        System.out.print("Would you like to add a student ? Y/N : ");
        String response = this.scanner.next().toLowerCase();
        if (response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }

    public void addStudent() {
        double grade = 0;

        System.out.print("Quel est le nom de l'étudiant.e ? : ");
        String name = this.scanner.next();

        do {
            System.out.print("Quel est la moyenne de l'étudiant ? /6 : ");
            // Prevent from inserting an invalid value.
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid format !");
                scanner.next();
            }
            grade = scanner.nextDouble();
            scanner.nextLine(); // Prevent from left buffer values.

        } while (grade < 0 || grade > 6);

        this.students.add(new Student(name, grade));
    }

    private void calculateClassScore() {
        double sumNotes = 0;
        for (Student student : students) {
            double studentNote = student.getGrade();
            if (studentNote > this.bestGrade)
                this.bestGrade = studentNote;
            if (studentNote < this.worstGrade)
                this.worstGrade = studentNote;
            sumNotes += studentNote;
        }
        this.average = sumNotes / students.size();
    }

    public void showResume() {
        calculateClassScore();
        System.out.println("The class average is " + this.average);
        System.out.println("The best note is " + this.bestGrade);
        System.out.println("The worst note is " + this.worstGrade);
    }

    public void askSearchStudent() {
        System.out.print("Who do you whant to search ? : ");
        String name = this.scanner.next();
        List<Student> students = searchStudents(name);

        if (students.isEmpty()) {
            System.out.println("No students found with this name !");
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student n° "+ i+1 + " :" + students.get(i).getGrade());
        }
    }

    private List<Student> searchStudents(String studentName) {
        return students.stream()
        .filter(student -> student.getName().equalsIgnoreCase(studentName))
        .collect(Collectors.toList());
    }
}
