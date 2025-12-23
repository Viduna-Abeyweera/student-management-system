package service;

import model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService
{
    private List<Student> students;

    // Constructor
    public StudentService()
    {
        students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(Student student)
    {
        students.add(student);
        System.out.println("Student added successfully...");
    }

    // Viewing all students
    public void viewAllStudents()
    {
        // No students checking
        if(students.isEmpty())
        {
            System.out.println("No students are found...");
            return;
        }

        // Viewing students
        for (Student student : students)
        {
            System.out.println(student);    
        }
    }

    // Find student by ID
    public Student findStudentById(int id)
    {
        for (Student student : students)
        {
            if (student.getId() == id)
            {
                return student;
            }    
        }
        return null;
    }

    // Delete student by ID
    public boolean deleteStudent(int id)
    {
        Student student = findStudentById(id);
        if (student == null)
        {
            System.out.println("Student not found");
            return false;
        }
        students.remove(student);
        System.out.println("Student deleted successfully");
        return true;   
    }
}