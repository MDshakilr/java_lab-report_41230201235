class Result {
    int rollNo;
    String name;

    Result(int r, String n)
    {
        rollNo = r;
        name = n;
    }
    int calculateTotal(int m1, int m2, int m3)
    {
        return m1 + m2 + m3;
    }


    double calculateTotal(double m1, double m2, double m3)

    {
        return m1 + m2 + m3;
    }


    void displayGrade(double total)
    {
        double average = total / 3.0;

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);

        System.out.print("Grade   : ");
        if (average >= 80)
            System.out.println("A+");
        else if (average >= 70)
            System.out.println("A");
        else if (average >= 60)
            System.out.println("B");
        else if (average >= 50)
            System.out.println("C");
        else
            System.out.println("F");

    }
}

public class Student_Result_Management
{
    public static void main(String[] args) {

        Result s1 = new Result(101, "Shakil Rana");
        Result s2 = new Result(102, "Rafiul Islam");


        int total1 = s1.calculateTotal(78, 85, 90);
        s1.displayGrade(total1);


        double total2 = s2.calculateTotal(65.5, 72.0, 80.5);
        s2.displayGrade(total2);
    }
}
