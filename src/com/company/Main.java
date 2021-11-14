package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        File listOfStudents = new File("C:\\Users\\sekul\\IdeaProjects\\Record Book Application 2\\src\\com\\company\\Text");
        Scanner scan = new Scanner(listOfStudents);
        RecordCatalogue catalogue = new RecordCatalogue();

        while(scan.hasNextLine()) {
            String studentName = scan.nextLine();
            String studentGradeString = scan.nextLine();
            String[] splitString = studentGradeString.split(":");
            RecordBook grades = new RecordBook(Integer.parseInt(splitString[0]), Integer.parseInt(splitString[1]), Integer.parseInt(splitString[2]));
            catalogue.addStudent(new Student(studentName, grades));
        }

        System.out.println("The list of students:");
        catalogue.printStudents();
        System.out.println("Choose a student?");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        Student currentStudent = catalogue.findStudent(inputName);
        if (currentStudent == null) {
            System.out.println("Given student name does not exist. ");
            System.out.println("Please try again ");
        } else {
            while(true) {
                while(true) {
                    System.out.println(currentStudent.getStudentName());
                    System.out.println(currentStudent.getStudentGrades().allGrades());
                    System.out.println("Choose an option: ");
                    System.out.println(" *************************** ");
                    System.out.println("1. Lowest Grade ");
                    System.out.println("2. Average Grade ");
                    System.out.println("3. Highest Grade ");
                    System.out.println("4. Exit ");
                    Scanner optionScanner = new Scanner(System.in);
                    String choice = optionScanner.nextLine();
                    if (choice.equals("1")) {
                        System.out.println(" *************************** ");
                        System.out.println("Lowest grade: " + currentStudent.getStudentGrades().lowestGrade());
                        System.out.println(" *************************** ");
                    } else if (choice.equals("2")) {
                        System.out.println(" *************************** ");
                        System.out.println("Average grade: " + currentStudent.getStudentGrades().averageGrade());
                        System.out.println(" *************************** ");
                    } else if (choice.equals("3")) {
                        System.out.println(" *************************** ");
                        System.out.println("Highest grade: " + currentStudent.getStudentGrades().highestGrade());
                        System.out.println(" *************************** ");
                    } else {
                        if (choice.equals("4")) {
                            System.out.println(" *************************** ");
                            System.out.println("Farewell");
                            System.out.println(" *************************** ");
                            return;
                        }

                        System.out.println("Option doesn't exist! Please choose a correct option. ");
                    }
                }
            }
        }
    }
}