package main;

import model.Student;
import service.StudentService;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        
        while (true)
        {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student student = new Student(id, name, age, course);
                    studentService.addStudent(student);
                    break;

                case 2:
                    studentService.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter the Student ID to delete: ");
                    int deleteId = sc.nextInt();
                    studentService.deleteStudent(deleteId);
                    break;

                case 4:
                    System.out.println("Exiting application...");
                    sc.close();

                default:
                    System.out.println("Invalid choice, Please try again.");
            }
        }
    }
}
