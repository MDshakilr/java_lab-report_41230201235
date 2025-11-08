//Q1. Student Information System
class Student {
    int rollNo;
    String name;
    String department;
    double cgpa;
    Student(int rollNo, String name, String department, double cgpa)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }
    Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.department = "Not Assigned";
        this.cgpa = 0.0;
    }
    void display()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);

    }
}
public class Student_Information_System

{
    public static void main(String[] args)

    {
        Student s1 = new Student(101, "Shakil Rana", "Computer Science", 3.95);
        Student s2 = new Student(102, "Rafiul Islam");
        s1.display();
        s2.display();
    }
}
